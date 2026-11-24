package android.gov.nist.javax.sip.stack;

import a.axq;
import a.b1j;
import a.kng0;
import a.ohq;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SipStackImpl;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class IOHandler {
    private static final String TCP = "tcp";
    private static final String TLS = "tls";
    private static StackLogger logger = CommonLogger.getLogger(IOHandler.class);
    private SipStackImpl sipStack;
    private final ConcurrentHashMap<String, Socket> socketTable = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Semaphore> socketCreationMap = new ConcurrentHashMap<>();

    public IOHandler(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = (SipStackImpl) sIPTransactionStack;
    }

    private void enterIOCriticalSection(String str) throws IOException {
        Semaphore semaphore = this.socketCreationMap.get(str);
        if (semaphore == null) {
            semaphore = new Semaphore(1, true);
            Semaphore semaphorePutIfAbsent = this.socketCreationMap.putIfAbsent(str, semaphore);
            if (semaphorePutIfAbsent != null) {
                semaphore = semaphorePutIfAbsent;
            } else if (logger.isLoggingEnabled(32)) {
                b1j.x("new Semaphore added for key ", str, logger);
            }
        }
        try {
            if (semaphore.tryAcquire(10L, TimeUnit.SECONDS)) {
                return;
            }
            throw new IOException("Could not acquire IO Semaphore'" + str + "' after 10 seconds -- giving up ");
        } catch (InterruptedException unused) {
            ohq.l("exception in acquiring sem");
        }
    }

    private void leaveIOCriticalSection(String str) {
        Semaphore semaphore = this.socketCreationMap.get(str);
        if (semaphore != null) {
            semaphore.release();
        }
    }

    public static String makeKey(InetAddress inetAddress, int i) {
        return inetAddress.getHostAddress() + Separators.COLON + i;
    }

    private void writeChunks(OutputStream outputStream, byte[] bArr, int i) throws IOException {
        synchronized (outputStream) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 8192;
                try {
                    outputStream.write(bArr, i2, i3 < i ? 8192 : i - i2);
                    i2 = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        outputStream.flush();
    }

    public void closeAll() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Closing " + this.socketTable.size() + " sockets from IOHandler");
        }
        Enumeration<Socket> enumerationElements = this.socketTable.elements();
        while (enumerationElements.hasMoreElements()) {
            try {
                enumerationElements.nextElement().close();
            } catch (IOException unused) {
            }
        }
    }

    public SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        String strMakeKey = makeKey(inetAddress, i);
        Socket socket = getSocket(strMakeKey);
        if (socket == null) {
            socket = this.sipStack.getNetworkLayer().createSocket(inetAddress, i, inetAddress2, i2);
            putSocket(strMakeKey, socket);
        }
        return socket.getLocalSocketAddress();
    }

    public SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i, InetAddress inetAddress2, TLSMessageChannel tLSMessageChannel) throws IOException {
        String strMakeKey = makeKey(inetAddress, i);
        Socket socket = getSocket(strMakeKey);
        Socket socket2 = socket;
        if (socket == null) {
            SSLSocket sSLSocketCreateSSLSocket = this.sipStack.getNetworkLayer().createSSLSocket(inetAddress, i, inetAddress2);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("inaddr = " + inetAddress);
                logger.logDebug("port = " + i);
            }
            HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl(tLSMessageChannel, sSLSocketCreateSSLSocket);
            tLSMessageChannel.setHandshakeCompletedListener(handshakeCompletedListenerImpl);
            sSLSocketCreateSSLSocket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
            sSLSocketCreateSSLSocket.setEnabledProtocols(this.sipStack.getEnabledProtocols());
            sSLSocketCreateSSLSocket.setEnabledCipherSuites(this.sipStack.getEnabledCipherSuites());
            handshakeCompletedListenerImpl.startHandshakeWatchdog();
            sSLSocketCreateSSLSocket.startHandshake();
            tLSMessageChannel.setHandshakeCompleted(true);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Handshake passed");
            }
            try {
                this.sipStack.getTlsSecurityPolicy().enforceTlsPolicy(tLSMessageChannel.getEncapsulatedClientTransaction());
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("TLS Security policy passed");
                }
                putSocket(strMakeKey, sSLSocketCreateSSLSocket);
                socket2 = sSLSocketCreateSSLSocket;
            } catch (SecurityException e) {
                ohq.l(e.getMessage());
                return null;
            }
        }
        return socket2.getLocalSocketAddress();
    }

    public Socket getSocket(String str) {
        return this.socketTable.get(str);
    }

    public void putSocket(String str, Socket socket) {
        if (logger.isLoggingEnabled(32)) {
            b1j.x("adding socket for key ", str, logger);
        }
        this.socketTable.put(str, socket);
    }

    public void removeSocket(String str) {
        this.socketTable.remove(str);
        Semaphore semaphoreRemove = this.socketCreationMap.remove(str);
        if (semaphoreRemove != null) {
            semaphoreRemove.release();
        }
        if (logger.isLoggingEnabled(32)) {
            b1j.x("removed Socket and Semaphore for key ", str, logger);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0397 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0398  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f8 A[Catch: all -> 0x00d4, TryCatch #10 {all -> 0x00d4, blocks: (B:18:0x0095, B:22:0x00a1, B:24:0x00ab, B:28:0x00d7, B:29:0x00e1, B:31:0x00eb, B:33:0x010e, B:36:0x011d, B:37:0x0197, B:38:0x0198, B:58:0x01ef, B:60:0x01f8, B:61:0x024e, B:42:0x01a3, B:44:0x01af, B:47:0x01ca, B:51:0x01d3, B:53:0x01da, B:55:0x01e7, B:56:0x01ea), top: B:127:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0254  */
    /* JADX WARN: Code duplicated, block: B:66:0x025d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0284  */
    /* JADX WARN: Code duplicated, block: B:70:0x028c A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01f8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.gov.nist.javax.sip.stack.IOHandler] */
    public Socket sendBytes(InetAddress inetAddress, InetAddress inetAddress2, int i, String str, byte[] bArr, boolean z, MessageChannel messageChannel) throws IOException {
        ?? socket;
        Socket socket2;
        String str2;
        String str3;
        String str4 = " for message ";
        String str5 = Separators.SP;
        int i2 = z ? 2 : 1;
        int length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbT = kng0.t("sendBytes ", str, " local inAddr ");
            sbT.append(inetAddress.getHostAddress());
            sbT.append(" remote inAddr ");
            sbT.append(inetAddress2.getHostAddress());
            sbT.append(" port = ");
            axq.r(i, length, " length = ", " isClient ", sbT);
            sbT.append(z);
            stackLogger.logDebug(sbT.toString());
        }
        if (logger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            logger.logStackTrace(16);
        }
        if (str.compareToIgnoreCase("tcp") != 0) {
            if (str.compareToIgnoreCase("tls") != 0) {
                DatagramSocket datagramSocketCreateDatagramSocket = this.sipStack.getNetworkLayer().createDatagramSocket();
                datagramSocketCreateDatagramSocket.connect(inetAddress2, i);
                datagramSocketCreateDatagramSocket.send(new DatagramPacket(bArr, 0, length, inetAddress2, i));
                datagramSocketCreateDatagramSocket.close();
                return null;
            }
            String strMakeKey = makeKey(inetAddress2, i);
            enterIOCriticalSection(strMakeKey);
            try {
                try {
                    try {
                        socket = getSocket(strMakeKey);
                        int i3 = 0;
                        while (i3 < i2) {
                            if (socket == 0) {
                                socket = this.sipStack.getNetworkLayer().createSSLSocket(inetAddress2, i, inetAddress);
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("inaddr = " + inetAddress2);
                                    logger.logDebug("port = " + i);
                                }
                                HandshakeCompletedListenerImpl handshakeCompletedListenerImpl = new HandshakeCompletedListenerImpl((TLSMessageChannel) messageChannel, (Socket) socket);
                                ((TLSMessageChannel) messageChannel).setHandshakeCompletedListener(handshakeCompletedListenerImpl);
                                socket.addHandshakeCompletedListener(handshakeCompletedListenerImpl);
                                socket.setEnabledProtocols(this.sipStack.getEnabledProtocols());
                                handshakeCompletedListenerImpl.startHandshakeWatchdog();
                                socket.startHandshake();
                                ((TLSMessageChannel) messageChannel).setHandshakeCompleted(true);
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Handshake passed");
                                }
                                try {
                                    this.sipStack.getTlsSecurityPolicy().enforceTlsPolicy(messageChannel.getEncapsulatedClientTransaction());
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("TLS Security policy passed");
                                    }
                                    writeChunks(socket.getOutputStream(), bArr, length);
                                    putSocket(strMakeKey, socket);
                                    break;
                                } catch (SecurityException e) {
                                    throw new IOException(e.getMessage());
                                }
                            }
                            try {
                                writeChunks(socket.getOutputStream(), bArr, length);
                                break;
                            } catch (IOException e2) {
                                try {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logException(e2);
                                    }
                                    removeSocket(strMakeKey);
                                    try {
                                        logger.logDebug("Closing socket");
                                        socket.close();
                                    } catch (Exception unused) {
                                    }
                                    i3++;
                                    socket = 0;
                                } catch (IOException unused2) {
                                    removeSocket(strMakeKey);
                                    leaveIOCriticalSection(strMakeKey);
                                    if (socket != 0) {
                                        return socket;
                                    }
                                    ohq.m("Could not connect to ", inetAddress2, Separators.COLON, i);
                                    return null;
                                }
                            }
                        }
                    } catch (SSLHandshakeException e3) {
                        removeSocket(strMakeKey);
                        throw e3;
                    }
                } catch (IOException unused3) {
                    socket = 0;
                }
                leaveIOCriticalSection(strMakeKey);
                if (socket != 0) {
                    return socket;
                }
                ohq.m("Could not connect to ", inetAddress2, Separators.COLON, i);
                return null;
            } catch (Throwable th) {
                leaveIOCriticalSection(strMakeKey);
                throw th;
            }
        }
        String strMakeKey2 = makeKey(inetAddress2, i);
        enterIOCriticalSection(strMakeKey2);
        try {
            try {
                socket2 = getSocket(strMakeKey2);
                int i4 = 0;
                while (i4 < i2) {
                    if (socket2 != null) {
                        try {
                            writeChunks(socket2.getOutputStream(), bArr, length);
                            break;
                        } catch (IOException e4) {
                            try {
                                String str6 = str4;
                                if (logger.isLoggingEnabled(8)) {
                                    logger.logWarning("IOException occured retryCount " + i4);
                                }
                                try {
                                    socket2.close();
                                } catch (Exception unused4) {
                                }
                                i4++;
                                if (!z) {
                                    removeSocket(strMakeKey2);
                                    throw e4;
                                }
                                if (i4 >= i2) {
                                    removeSocket(strMakeKey2);
                                } else {
                                    this.socketTable.remove(strMakeKey2);
                                }
                                socket2 = null;
                                str4 = str6;
                                str5 = str5;
                            } catch (IOException unused5) {
                                if (logger.isLoggingEnabled(4)) {
                                    logger.logError("Problem sending: sendBytes " + str + " inAddr " + inetAddress2.getHostAddress() + " port = " + i + " remoteHost " + messageChannel.getPeerAddress() + " remotePort " + messageChannel.getPeerPort() + " peerPacketPort " + messageChannel.getPeerPacketSourcePort() + " isClient " + z);
                                }
                                removeSocket(strMakeKey2);
                                leaveIOCriticalSection(strMakeKey2);
                                if (socket2 != null) {
                                    return socket2;
                                }
                                if (logger.isLoggingEnabled(4)) {
                                    logger.logError(this.socketTable.toString());
                                    StackLogger stackLogger2 = logger;
                                    str3 = "Could not connect to ";
                                    StringBuilder sb = new StringBuilder(str3);
                                    sb.append(inetAddress2);
                                    str2 = Separators.COLON;
                                    sb.append(str2);
                                    sb.append(i);
                                    stackLogger2.logError(sb.toString());
                                } else {
                                    str2 = Separators.COLON;
                                    str3 = "Could not connect to ";
                                }
                                ohq.m(str3, inetAddress2, str2, i);
                                return null;
                            }
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError("Problem sending: sendBytes " + str + " inAddr " + inetAddress2.getHostAddress() + " port = " + i + " remoteHost " + messageChannel.getPeerAddress() + " remotePort " + messageChannel.getPeerPort() + " peerPacketPort " + messageChannel.getPeerPacketSourcePort() + " isClient " + z);
                            }
                            removeSocket(strMakeKey2);
                            leaveIOCriticalSection(strMakeKey2);
                            if (socket2 != null) {
                                return socket2;
                            }
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError(this.socketTable.toString());
                                StackLogger stackLogger3 = logger;
                                str3 = "Could not connect to ";
                                StringBuilder sb2 = new StringBuilder(str3);
                                sb2.append(inetAddress2);
                                str2 = Separators.COLON;
                                sb2.append(str2);
                                sb2.append(i);
                                stackLogger3.logError(sb2.toString());
                            } else {
                                str2 = Separators.COLON;
                                str3 = "Could not connect to ";
                            }
                            ohq.m(str3, inetAddress2, str2, i);
                            return null;
                        }
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("inaddr = " + inetAddress2);
                        logger.logDebug("port = " + i);
                    }
                    try {
                        Socket socketCreateSocket = this.sipStack.getNetworkLayer().createSocket(inetAddress2, i, inetAddress);
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("local inaddr = " + socketCreateSocket.getLocalAddress().getHostAddress());
                            }
                            writeChunks(socketCreateSocket.getOutputStream(), bArr, length);
                            putSocket(strMakeKey2, socketCreateSocket);
                            socket2 = socketCreateSocket;
                            break;
                        } catch (IOException unused6) {
                            socket2 = socketCreateSocket;
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError("Problem sending: sendBytes " + str + " inAddr " + inetAddress2.getHostAddress() + " port = " + i + " remoteHost " + messageChannel.getPeerAddress() + " remotePort " + messageChannel.getPeerPort() + " peerPacketPort " + messageChannel.getPeerPacketSourcePort() + " isClient " + z);
                            }
                            removeSocket(strMakeKey2);
                        }
                    } catch (SocketException e5) {
                        logger.logError("Problem connecting " + inetAddress2 + str5 + i + str5 + inetAddress + str4 + new String(bArr, "UTF-8"));
                        removeSocket(strMakeKey2);
                        throw new SocketException(e5.getClass() + str5 + e5.getMessage() + str5 + e5.getCause() + " Problem connecting " + inetAddress2 + str5 + i + str5 + inetAddress + str4 + new String(bArr, "UTF-8"));
                    }
                }
            } catch (IOException unused7) {
                socket2 = null;
            }
            leaveIOCriticalSection(strMakeKey2);
            if (socket2 != null) {
                return socket2;
            }
            if (logger.isLoggingEnabled(4)) {
                logger.logError(this.socketTable.toString());
                StackLogger stackLogger4 = logger;
                str3 = "Could not connect to ";
                StringBuilder sb3 = new StringBuilder(str3);
                sb3.append(inetAddress2);
                str2 = Separators.COLON;
                sb3.append(str2);
                sb3.append(i);
                stackLogger4.logError(sb3.toString());
            } else {
                str2 = Separators.COLON;
                str3 = "Could not connect to ";
            }
            ohq.m(str3, inetAddress2, str2, i);
            return null;
        } catch (Throwable th2) {
            leaveIOCriticalSection(strMakeKey2);
            throw th2;
        }
    }

    public static String makeKey(String str, int i) {
        return str + Separators.COLON + i;
    }
}
