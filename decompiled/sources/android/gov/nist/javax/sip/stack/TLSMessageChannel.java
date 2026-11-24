package android.gov.nist.javax.sip.stack;

import a.b1j;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.javax.sip.ListeningPoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class TLSMessageChannel extends ConnectionOrientedMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(TLSMessageChannel.class);
    private boolean handshakeCompleted;
    private HandshakeCompletedListener handshakeCompletedListener;

    public TLSMessageChannel(Socket socket, SIPTransactionStack sIPTransactionStack, TLSMessageProcessor tLSMessageProcessor, String str) {
        super(sIPTransactionStack);
        this.handshakeCompleted = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TLSMessageChannel (incoming)");
            logger.logStackTrace();
        }
        this.mySock = (SSLSocket) socket;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (sIPTransactionStack.getClientAuth() != ClientAuthType.Want && sIPTransactionStack.getClientAuth() != ClientAuthType.Disabled && sIPTransactionStack.getClientAuth() != ClientAuthType.DisabledAll) {
                sSLSocket.setNeedClientAuth(true);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SSLServerSocket need client auth " + sSLSocket.getNeedClientAuth());
            }
        }
        this.peerAddress = this.mySock.getInetAddress();
        this.myAddress = tLSMessageProcessor.getIpAddress().getHostAddress();
        this.myClientInputStream = this.mySock.getInputStream();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.setName(str);
        this.myPort = tLSMessageProcessor.getPort();
        int port = this.mySock.getPort();
        this.peerPort = port;
        this.key = MessageChannel.getKey(this.peerAddress, port, ListeningPoint.TLS);
        this.messageProcessor = tLSMessageProcessor;
        this.mythread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void close(boolean z, boolean z2) {
        this.isRunning = false;
        if (this.mySock != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing socket " + this.key);
            }
            try {
                this.mySock.close();
            } catch (IOException e) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Error closing socket " + e);
                }
            }
        }
        if (this.myParser != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing my parser " + this.myParser);
            }
            this.myParser.close();
        }
        if (z) {
            String strSubstring = this.key.substring(4);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing TLS socket ".concat(strSubstring));
            }
            this.sipStack.ioHandler.removeSocket(strSubstring);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing message Channel (key = " + this.key + Separators.RPAREN + this);
            }
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("not removing socket key from the cached map since it has already been updated by the iohandler.sendBytes ".concat(this.key.substring(4)));
        }
        if (z2) {
            cancelPingKeepAliveTimeoutTaskIfStarted();
        }
    }

    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.mySock == ((TLSMessageChannel) obj).mySock;
    }

    public HandshakeCompletedListenerImpl getHandshakeCompletedListener() {
        return (HandshakeCompletedListenerImpl) this.handshakeCompletedListener;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return ListeningPoint.TLS;
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) throws ParseException {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Parsing Exception: ", parseException);
        }
        if (cls == null || !(cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            sIPMessage.addUnparsed(str);
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            b1j.x("Encountered bad message \n", str2, logger);
        }
        String string = sIPMessage.toString();
        if (string.startsWith("SIP/") || string.startsWith("ACK ")) {
            throw parseException;
        }
        String strCreateBadReqRes = createBadReqRes(string, parseException);
        if (strCreateBadReqRes == null) {
            if (!logger.isLoggingEnabled(32)) {
                throw parseException;
            }
            logger.logDebug("Could not formulate automatic 400 Bad Request");
            throw parseException;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Sending automatic 400 Bad Request:");
            logger.logDebug(strCreateBadReqRes);
        }
        try {
            sendMessage(strCreateBadReqRes.getBytes(), getPeerInetAddress(), getPeerPort(), false);
            throw parseException;
        } catch (IOException e) {
            logger.logException(e);
            throw parseException;
        }
    }

    public boolean isHandshakeCompleted() {
        return this.handshakeCompleted;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel, java.lang.Runnable
    public void run() {
        Socket socket = this.mySock;
        if (socket != null && (socket instanceof SSLSocket) && !this.handshakeCompleted) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl(this, sSLSocket);
            this.handshakeCompletedListener = handshakeCompletedListenerImpl;
            sSLSocket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
            handshakeCompletedListenerImpl.startHandshakeWatchdog();
            try {
                sSLSocket.startHandshake();
                this.handshakeCompleted = true;
                if (!getSIPStack().isSslRenegotiationEnabled()) {
                    sSLSocket.getSession().invalidate();
                    sSLSocket.setEnableSessionCreation(false);
                }
            } catch (IOException e) {
                logger.logError("A problem occured while Accepting connection", e);
                sSLSocket.removeHandshakeCompletedListener(this.handshakeCompletedListener);
                this.handshakeCompletedListener = null;
                try {
                    this.myClientInputStream.close();
                } catch (IOException unused) {
                } finally {
                    this.myClientInputStream = null;
                }
                try {
                    this.mySock.close();
                } catch (IOException unused2) {
                } finally {
                    this.mySock = null;
                }
                return;
            }
        }
        super.run();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public synchronized void sendMessage(byte[] bArr, InetAddress inetAddress, int i, boolean z) throws IOException {
        String str;
        String str2;
        String str3;
        InetAddress inetAddress2;
        IOException iOException;
        try {
            if (bArr == null || inetAddress == null) {
                throw new IllegalArgumentException("Null argument");
            }
            if (this.peerPortAdvertisedInHeaders <= 0) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("receiver port = " + i + " for this channel " + this + " key " + this.key);
                }
                if (i <= 0) {
                    this.peerPortAdvertisedInHeaders = 5060;
                } else {
                    this.peerPortAdvertisedInHeaders = i;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("2.Storing peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " for this channel " + this + " key " + this.key);
                }
            }
            Socket socketSendBytes = null;
            try {
                str = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                str2 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                str3 = "Couldn't connect to receiverAddress = ";
                try {
                    inetAddress2 = inetAddress;
                    iOException = null;
                    socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i, ListeningPoint.TLS, bArr, z, this);
                } catch (IOException e) {
                    e = e;
                    inetAddress2 = inetAddress;
                    logger.logWarning("Failed to connect " + this.peerAddress + Separators.COLON + i + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on, rcv addr=" + inetAddress2 + ", port=" + i);
                    logger.logError("Error is ", e);
                    iOException = e;
                }
            } catch (IOException e2) {
                e = e2;
                str = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                str2 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                str3 = "Couldn't connect to receiverAddress = ";
                inetAddress2 = inetAddress;
            }
            if (socketSendBytes == null) {
                if (this.peerAddressAdvertisedInHeaders == null || this.peerPortAdvertisedInHeaders <= 0) {
                    throw iOException;
                }
                logger.logWarning(str3 + inetAddress2 + " receiverPort = " + i + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, ListeningPoint.TLS, bArr, z, this);
                int i2 = this.peerPortAdvertisedInHeaders;
                this.peerPort = i2;
                this.peerAddress = byName;
                this.key = MessageChannel.getKey(byName, i2, ListeningPoint.TLS);
                logger.logWarning("retry suceeded to receiverAddress = " + inetAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
            }
            Socket socket = socketSendBytes;
            Socket socket2 = this.mySock;
            if (socket != socket2 && socket != null) {
                if (socket2 != null) {
                    if (logger.isLoggingEnabled(8)) {
                        logger.logWarning("Old socket different than new socket on channel " + this.key);
                        logger.logStackTrace();
                        logger.logWarning("Old socket local ip address " + this.mySock.getLocalSocketAddress());
                        logger.logWarning("Old socket remote ip address " + this.mySock.getRemoteSocketAddress());
                        logger.logWarning("New socket local ip address " + socket.getLocalSocketAddress());
                        logger.logWarning("New socket remote ip address " + socket.getRemoteSocketAddress());
                    }
                    close(false, false);
                }
                if (iOException == null) {
                    if (this.mySock != null && logger.isLoggingEnabled(8)) {
                        logger.logWarning(str2 + this.key);
                    }
                    this.mySock = socket;
                    this.myClientInputStream = socket.getInputStream();
                    Thread thread = new Thread(this);
                    thread.setDaemon(true);
                    thread.setName("TCPMessageChannelThread");
                    thread.start();
                } else {
                    if (logger.isLoggingEnabled(8)) {
                        logger.logWarning(str + this.key);
                    }
                    this.mySock = socket;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setHandshakeCompleted(boolean z) {
        this.handshakeCompleted = z;
    }

    public void setHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.handshakeCompletedListener = handshakeCompletedListener;
    }

    public TLSMessageChannel(InetAddress inetAddress, int i, SIPTransactionStack sIPTransactionStack, TLSMessageProcessor tLSMessageProcessor) {
        super(sIPTransactionStack);
        this.handshakeCompleted = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TLSMessageChannel (outgoing)");
            logger.logStackTrace();
        }
        this.peerAddress = inetAddress;
        this.peerPort = i;
        this.myPort = tLSMessageProcessor.getPort();
        this.peerProtocol = ListeningPoint.TLS;
        this.sipStack = sIPTransactionStack;
        this.myAddress = tLSMessageProcessor.getIpAddress().getHostAddress();
        this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, ListeningPoint.TLS);
        this.messageProcessor = tLSMessageProcessor;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[Catch: all -> 0x0037, TryCatch #3 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x004b, B:16:0x004f, B:18:0x0053, B:20:0x0060, B:35:0x00c2, B:37:0x00c6, B:39:0x00ca, B:41:0x014f, B:42:0x0150, B:47:0x015a, B:49:0x0162, B:50:0x01d2, B:52:0x01d8, B:54:0x01dc, B:56:0x01e4, B:57:0x01f9, B:58:0x0213, B:60:0x021b, B:61:0x0230, B:33:0x008c), top: B:72:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x015a A[Catch: all -> 0x0037, TryCatch #3 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x004b, B:16:0x004f, B:18:0x0053, B:20:0x0060, B:35:0x00c2, B:37:0x00c6, B:39:0x00ca, B:41:0x014f, B:42:0x0150, B:47:0x015a, B:49:0x0162, B:50:0x01d2, B:52:0x01d8, B:54:0x01dc, B:56:0x01e4, B:57:0x01f9, B:58:0x0213, B:60:0x021b, B:61:0x0230, B:33:0x008c), top: B:72:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0162 A[Catch: all -> 0x0037, TryCatch #3 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x004b, B:16:0x004f, B:18:0x0053, B:20:0x0060, B:35:0x00c2, B:37:0x00c6, B:39:0x00ca, B:41:0x014f, B:42:0x0150, B:47:0x015a, B:49:0x0162, B:50:0x01d2, B:52:0x01d8, B:54:0x01dc, B:56:0x01e4, B:57:0x01f9, B:58:0x0213, B:60:0x021b, B:61:0x0230, B:33:0x008c), top: B:72:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d8 A[Catch: all -> 0x0037, TryCatch #3 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x004b, B:16:0x004f, B:18:0x0053, B:20:0x0060, B:35:0x00c2, B:37:0x00c6, B:39:0x00ca, B:41:0x014f, B:42:0x0150, B:47:0x015a, B:49:0x0162, B:50:0x01d2, B:52:0x01d8, B:54:0x01dc, B:56:0x01e4, B:57:0x01f9, B:58:0x0213, B:60:0x021b, B:61:0x0230, B:33:0x008c), top: B:72:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0213 A[Catch: all -> 0x0037, TryCatch #3 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x004b, B:16:0x004f, B:18:0x0053, B:20:0x0060, B:35:0x00c2, B:37:0x00c6, B:39:0x00ca, B:41:0x014f, B:42:0x0150, B:47:0x015a, B:49:0x0162, B:50:0x01d2, B:52:0x01d8, B:54:0x01dc, B:56:0x01e4, B:57:0x01f9, B:58:0x0213, B:60:0x021b, B:61:0x0230, B:33:0x008c), top: B:72:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x021b A[Catch: all -> 0x0037, TryCatch #3 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x004b, B:16:0x004f, B:18:0x0053, B:20:0x0060, B:35:0x00c2, B:37:0x00c6, B:39:0x00ca, B:41:0x014f, B:42:0x0150, B:47:0x015a, B:49:0x0162, B:50:0x01d2, B:52:0x01d8, B:54:0x01dc, B:56:0x01e4, B:57:0x01f9, B:58:0x0213, B:60:0x021b, B:61:0x0230, B:33:0x008c), top: B:72:0x0019 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0162, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x021b, please report this as an issue */
    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public synchronized void sendMessage(byte[] bArr, boolean z) throws IOException {
        boolean z2;
        String str;
        String str2;
        IOException iOException;
        Socket socket;
        Socket socket2;
        String str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
        String str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
        synchronized (this) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                StringBuilder sb = new StringBuilder("sendMessage isClient  = ");
                z2 = z;
                sb.append(z2);
                stackLogger.logDebug(sb.toString());
            } else {
                z2 = z;
            }
            Socket socketSendBytes = null;
            try {
                try {
                    try {
                        try {
                            str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                            str2 = "Failed to connect ";
                            str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                            str = "Couldn't connect to peerAddress = ";
                            try {
                                iOException = null;
                                socketSendBytes = this.sipStack.ioHandler.sendBytes(getMessageProcessor().getIpAddress(), this.peerAddress, this.peerPort, this.peerProtocol, bArr, z2, this);
                            } catch (IOException e) {
                                e = e;
                                logger.logWarning(str2 + this.peerAddress + Separators.COLON + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                                logger.logError("Error is ", e);
                                iOException = e;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            str2 = "Failed to connect ";
                            str = "Couldn't connect to peerAddress = ";
                            logger.logWarning(str2 + this.peerAddress + Separators.COLON + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                            logger.logError("Error is ", e);
                            iOException = e;
                            if (socketSendBytes == null) {
                                if (this.peerAddressAdvertisedInHeaders == null) {
                                    throw iOException;
                                }
                                throw iOException;
                            }
                            socket = socketSendBytes;
                            socket2 = this.mySock;
                            if (socket != socket2) {
                                if (socket2 != null) {
                                    if (logger.isLoggingEnabled(8)) {
                                        logger.logWarning("Old socket different than new socket on channel " + this.key);
                                        logger.logStackTrace();
                                        logger.logWarning("Old socket local ip address " + this.mySock.getLocalSocketAddress());
                                        logger.logWarning("Old socket remote ip address " + this.mySock.getRemoteSocketAddress());
                                        logger.logWarning("New socket local ip address " + socket.getLocalSocketAddress());
                                        logger.logWarning("New socket remote ip address " + socket.getRemoteSocketAddress());
                                    }
                                    close(false, false);
                                }
                                if (iOException == null) {
                                    if (this.mySock != null) {
                                        logger.logWarning(str4 + this.key);
                                    }
                                    this.mySock = socket;
                                    this.myClientInputStream = socket.getInputStream();
                                    Thread thread = new Thread(this);
                                    thread.setDaemon(true);
                                    thread.setName("TCPMessageChannelThread");
                                    thread.start();
                                } else {
                                    if (logger.isLoggingEnabled(8)) {
                                        logger.logWarning(str3 + this.key);
                                    }
                                    this.mySock = socket;
                                }
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str2 = "Failed to connect ";
                    }
                } catch (IOException e4) {
                    e = e4;
                    str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                    str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                    str = "Couldn't connect to peerAddress = ";
                    str2 = "Failed to connect ";
                }
            } catch (IOException e5) {
                e = e5;
                str3 = "There was an exception for the retry mechanism so not creating a new thread based on the new socket for incoming ";
                str4 = "There was no exception for the retry mechanism so creating a new thread based on the new socket for incoming ";
                str = "Couldn't connect to peerAddress = ";
                str2 = "Failed to connect ";
            }
            if (socketSendBytes == null) {
                if (this.peerAddressAdvertisedInHeaders == null && this.peerPortAdvertisedInHeaders > 0) {
                    logger.logWarning(str + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                    InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                    socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, this.peerProtocol, bArr, z, this);
                    int i = this.peerPortAdvertisedInHeaders;
                    this.peerPort = i;
                    this.peerAddress = byName;
                    this.key = MessageChannel.getKey(byName, i, ListeningPoint.TLS);
                    logger.logWarning("retry suceeded to peerAddress = " + this.peerAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
                } else {
                    throw iOException;
                }
            }
            socket = socketSendBytes;
            socket2 = this.mySock;
            if (socket != socket2 && socket != null) {
                if (socket2 != null) {
                    if (logger.isLoggingEnabled(8)) {
                        logger.logWarning("Old socket different than new socket on channel " + this.key);
                        logger.logStackTrace();
                        logger.logWarning("Old socket local ip address " + this.mySock.getLocalSocketAddress());
                        logger.logWarning("Old socket remote ip address " + this.mySock.getRemoteSocketAddress());
                        logger.logWarning("New socket local ip address " + socket.getLocalSocketAddress());
                        logger.logWarning("New socket remote ip address " + socket.getRemoteSocketAddress());
                    }
                    close(false, false);
                }
                if (iOException == null) {
                    if (this.mySock != null && logger.isLoggingEnabled(8)) {
                        logger.logWarning(str4 + this.key);
                    }
                    this.mySock = socket;
                    this.myClientInputStream = socket.getInputStream();
                    Thread thread2 = new Thread(this);
                    thread2.setDaemon(true);
                    thread2.setName("TCPMessageChannelThread");
                    thread2.start();
                } else {
                    if (logger.isLoggingEnabled(8)) {
                        logger.logWarning(str3 + this.key);
                    }
                    this.mySock = socket;
                }
            }
        }
    }
}
