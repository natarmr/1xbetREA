package android.gov.nist.javax.sip.stack;

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
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class TCPMessageChannel extends ConnectionOrientedMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(TCPMessageChannel.class);
    protected OutputStream myClientOutputStream;

    public TCPMessageChannel(Socket socket, SIPTransactionStack sIPTransactionStack, TCPMessageProcessor tCPMessageProcessor, String str) {
        super(sIPTransactionStack);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TCPMessageChannel ");
            logger.logStackTrace();
        }
        this.mySock = socket;
        this.peerAddress = socket.getInetAddress();
        this.myAddress = tCPMessageProcessor.getIpAddress().getHostAddress();
        this.myClientInputStream = this.mySock.getInputStream();
        this.myClientOutputStream = this.mySock.getOutputStream();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.setName(str);
        int port = this.mySock.getPort();
        this.peerPort = port;
        this.key = MessageChannel.getKey(this.peerAddress, port, ListeningPoint.TCP);
        this.myPort = tCPMessageProcessor.getPort();
        this.messageProcessor = tCPMessageProcessor;
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
                this.mySock = null;
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
        if (this.myClientOutputStream != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing client output stream " + this.myClientOutputStream);
            }
            try {
                this.myClientOutputStream.close();
            } catch (IOException e2) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Error closing client output stream" + e2);
                }
            }
        }
        if (z) {
            String strSubstring = this.key.substring(4);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Closing TCP socket ".concat(strSubstring));
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
        return getClass().equals(obj.getClass()) && this.mySock == ((TCPMessageChannel) obj).mySock;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return ListeningPoint.TCP;
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
            logger.logDebug("Encountered Bad Message \n" + sIPMessage.toString());
        }
        String string = sIPMessage.toString();
        if (string.startsWith("SIP/") || string.startsWith("ACK ") || this.mySock == null) {
            throw parseException;
        }
        if (logger.isLoggingEnabled(4)) {
            logger.logError("Malformed mandatory headers: closing socket! :" + this.mySock.toString());
        }
        try {
            this.mySock.close();
            throw parseException;
        } catch (IOException e) {
            if (!logger.isLoggingEnabled(4)) {
                throw parseException;
            }
            logger.logError("Exception while closing socket! :" + this.mySock.toString() + Separators.COLON + e.toString());
            throw parseException;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public synchronized void sendMessage(byte[] bArr, InetAddress inetAddress, int i, boolean z) throws IOException {
        String str;
        String str2;
        String str3;
        InetAddress inetAddress2;
        IOException iOException;
        int i2;
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
                inetAddress2 = inetAddress;
                try {
                    iOException = null;
                    socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress2, i, ListeningPoint.TCP, bArr, z, this);
                } catch (IOException e) {
                    e = e;
                    logger.logWarning("Failed to connect " + this.peerAddress + Separators.COLON + i + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
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
            if (socketSendBytes != null) {
                i2 = 8;
            } else {
                if (this.peerAddressAdvertisedInHeaders == null || this.peerPortAdvertisedInHeaders <= 0) {
                    throw iOException;
                }
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str3 + inetAddress2 + " receiverPort = " + i + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                }
                InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                i2 = 8;
                socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, ListeningPoint.TCP, bArr, z, this);
                int i3 = this.peerPortAdvertisedInHeaders;
                this.peerPort = i3;
                this.peerAddress = byName;
                this.key = MessageChannel.getKey(byName, i3, ListeningPoint.TCP);
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning("retry suceeded to peerAddress = " + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key);
                }
            }
            Socket socket = socketSendBytes;
            Socket socket2 = this.mySock;
            if (socket != socket2 && socket != null) {
                if (socket2 != null) {
                    if (logger.isLoggingEnabled(i2)) {
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
                    if (this.mySock != null && logger.isLoggingEnabled(i2)) {
                        logger.logWarning(str2 + this.key);
                    }
                    this.mySock = socket;
                    this.myClientInputStream = socket.getInputStream();
                    this.myClientOutputStream = this.mySock.getOutputStream();
                    Thread thread = new Thread(this);
                    thread.setDaemon(true);
                    thread.setName("TCPMessageChannelThread");
                    thread.start();
                } else {
                    if (logger.isLoggingEnabled(i2)) {
                        logger.logWarning(str + this.key);
                    }
                    this.mySock = socket;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public TCPMessageChannel(SIPTransactionStack sIPTransactionStack) {
        super(sIPTransactionStack);
    }

    public TCPMessageChannel(InetAddress inetAddress, int i, SIPTransactionStack sIPTransactionStack, TCPMessageProcessor tCPMessageProcessor) {
        super(sIPTransactionStack);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("creating new TCPMessageChannel ");
            logger.logStackTrace();
        }
        this.peerAddress = inetAddress;
        this.peerPort = i;
        this.myPort = tCPMessageProcessor.getPort();
        this.peerProtocol = ListeningPoint.TCP;
        this.myAddress = tCPMessageProcessor.getIpAddress().getHostAddress();
        this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, ListeningPoint.TCP);
        this.messageProcessor = tCPMessageProcessor;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x0049, B:16:0x004d, B:18:0x0051, B:20:0x005e, B:36:0x00bb, B:38:0x00bf, B:40:0x00c3, B:42:0x00cb, B:43:0x00fc, B:45:0x0133, B:49:0x0160, B:53:0x0168, B:55:0x0170, B:56:0x01e0, B:58:0x01e6, B:60:0x01ea, B:62:0x01f2, B:63:0x0207, B:64:0x0229, B:66:0x0231, B:67:0x0246, B:47:0x015d, B:33:0x008a), top: B:80:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168 A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x0049, B:16:0x004d, B:18:0x0051, B:20:0x005e, B:36:0x00bb, B:38:0x00bf, B:40:0x00c3, B:42:0x00cb, B:43:0x00fc, B:45:0x0133, B:49:0x0160, B:53:0x0168, B:55:0x0170, B:56:0x01e0, B:58:0x01e6, B:60:0x01ea, B:62:0x01f2, B:63:0x0207, B:64:0x0229, B:66:0x0231, B:67:0x0246, B:47:0x015d, B:33:0x008a), top: B:80:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0170 A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x0049, B:16:0x004d, B:18:0x0051, B:20:0x005e, B:36:0x00bb, B:38:0x00bf, B:40:0x00c3, B:42:0x00cb, B:43:0x00fc, B:45:0x0133, B:49:0x0160, B:53:0x0168, B:55:0x0170, B:56:0x01e0, B:58:0x01e6, B:60:0x01ea, B:62:0x01f2, B:63:0x0207, B:64:0x0229, B:66:0x0231, B:67:0x0246, B:47:0x015d, B:33:0x008a), top: B:80:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01e6 A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x0049, B:16:0x004d, B:18:0x0051, B:20:0x005e, B:36:0x00bb, B:38:0x00bf, B:40:0x00c3, B:42:0x00cb, B:43:0x00fc, B:45:0x0133, B:49:0x0160, B:53:0x0168, B:55:0x0170, B:56:0x01e0, B:58:0x01e6, B:60:0x01ea, B:62:0x01f2, B:63:0x0207, B:64:0x0229, B:66:0x0231, B:67:0x0246, B:47:0x015d, B:33:0x008a), top: B:80:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0229 A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x0049, B:16:0x004d, B:18:0x0051, B:20:0x005e, B:36:0x00bb, B:38:0x00bf, B:40:0x00c3, B:42:0x00cb, B:43:0x00fc, B:45:0x0133, B:49:0x0160, B:53:0x0168, B:55:0x0170, B:56:0x01e0, B:58:0x01e6, B:60:0x01ea, B:62:0x01f2, B:63:0x0207, B:64:0x0229, B:66:0x0231, B:67:0x0246, B:47:0x015d, B:33:0x008a), top: B:80:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0231 A[Catch: all -> 0x0037, TryCatch #4 {, blocks: (B:4:0x0019, B:6:0x0023, B:12:0x003e, B:14:0x0049, B:16:0x004d, B:18:0x0051, B:20:0x005e, B:36:0x00bb, B:38:0x00bf, B:40:0x00c3, B:42:0x00cb, B:43:0x00fc, B:45:0x0133, B:49:0x0160, B:53:0x0168, B:55:0x0170, B:56:0x01e0, B:58:0x01e6, B:60:0x01ea, B:62:0x01f2, B:63:0x0207, B:64:0x0229, B:66:0x0231, B:67:0x0246, B:47:0x015d, B:33:0x008a), top: B:80:0x0019 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0170, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0231, please report this as an issue */
    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public synchronized void sendMessage(byte[] bArr, boolean z) throws IOException {
        boolean z2;
        String str;
        String str2;
        IOException iOException;
        int i;
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
                                socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), this.peerAddress, this.peerPort, this.peerProtocol, bArr, z2, this);
                            } catch (IOException e) {
                                e = e;
                                logger.logWarning(str2 + this.peerAddress + Separators.COLON + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                                iOException = e;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            str2 = "Failed to connect ";
                            str = "Couldn't connect to peerAddress = ";
                            logger.logWarning(str2 + this.peerAddress + Separators.COLON + this.peerPort + " but trying the advertised port=" + this.peerPortAdvertisedInHeaders + " if it's different than the port we just failed on");
                            iOException = e;
                            if (socketSendBytes != null) {
                                if (this.peerAddressAdvertisedInHeaders == null) {
                                    throw iOException;
                                }
                                throw iOException;
                            }
                            i = 8;
                            socket = socketSendBytes;
                            socket2 = this.mySock;
                            if (socket != socket2) {
                                if (socket2 != null) {
                                    if (logger.isLoggingEnabled(i)) {
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
                                    this.myClientOutputStream = this.mySock.getOutputStream();
                                    Thread thread = new Thread(this);
                                    thread.setDaemon(true);
                                    thread.setName("TCPMessageChannelThread");
                                    thread.start();
                                } else {
                                    if (logger.isLoggingEnabled(i)) {
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
            if (socketSendBytes != null) {
                i = 8;
            } else if (this.peerAddressAdvertisedInHeaders == null && this.peerPortAdvertisedInHeaders > 0) {
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning(str + this.peerAddress + " peerPort = " + this.peerPort + " key = " + this.key + " retrying on peerPortAdvertisedInHeaders " + this.peerPortAdvertisedInHeaders);
                }
                InetAddress byName = InetAddress.getByName(this.peerAddressAdvertisedInHeaders);
                i = 8;
                socketSendBytes = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), byName, this.peerPortAdvertisedInHeaders, this.peerProtocol, bArr, z, this);
                int i2 = this.peerPortAdvertisedInHeaders;
                this.peerPort = i2;
                this.peerAddress = byName;
                this.key = MessageChannel.getKey(byName, i2, ListeningPoint.TCP);
                if (logger.isLoggingEnabled(8)) {
                    logger.logWarning("retry suceeded to peerAddress = " + this.peerAddress + " peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " key = " + this.key);
                }
            } else {
                throw iOException;
            }
            socket = socketSendBytes;
            socket2 = this.mySock;
            if (socket != socket2 && socket != null) {
                if (socket2 != null) {
                    if (logger.isLoggingEnabled(i)) {
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
                    if (this.mySock != null && logger.isLoggingEnabled(i)) {
                        logger.logWarning(str4 + this.key);
                    }
                    this.mySock = socket;
                    this.myClientInputStream = socket.getInputStream();
                    this.myClientOutputStream = this.mySock.getOutputStream();
                    Thread thread2 = new Thread(this);
                    thread2.setDaemon(true);
                    thread2.setName("TCPMessageChannelThread");
                    thread2.start();
                } else {
                    if (logger.isLoggingEnabled(i)) {
                        logger.logWarning(str3 + this.key);
                    }
                    this.mySock = socket;
                }
            }
        }
    }
}
