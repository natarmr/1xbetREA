package android.gov.nist.javax.sip.stack;

import a.b1j;
import a.kng0;
import a.ohq;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class NIOHandler {
    private static StackLogger logger = CommonLogger.getLogger(NIOHandler.class);
    private NioTcpMessageProcessor messageProcessor;
    private SipStackImpl sipStack;
    protected SocketTimeoutAuditor socketTimeoutAuditor;
    private AtomicBoolean stopped = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, SocketChannel> socketTable = new ConcurrentHashMap<>();
    protected HashMap<SocketChannel, NioTcpMessageChannel> channelMap = new HashMap<>();
    KeyedSemaphore keyedSemaphore = new KeyedSemaphore();

    public NIOHandler(SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        this.socketTimeoutAuditor = null;
        this.sipStack = (SipStackImpl) sIPTransactionStack;
        this.messageProcessor = nioTcpMessageProcessor;
        if (sIPTransactionStack.nioSocketMaxIdleTime <= 0 || nioTcpMessageProcessor == null) {
            return;
        }
        this.socketTimeoutAuditor = new SocketTimeoutAuditor(sIPTransactionStack.nioSocketMaxIdleTime, this);
        SipTimer timer = sIPTransactionStack.getTimer();
        SocketTimeoutAuditor socketTimeoutAuditor = this.socketTimeoutAuditor;
        long j = sIPTransactionStack.nioSocketMaxIdleTime;
        timer.scheduleWithFixedDelay(socketTimeoutAuditor, j, j);
    }

    public static String makeKey(InetAddress inetAddress, int i) {
        return inetAddress.getHostAddress() + Separators.COLON + i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0121 A[Catch: all -> 0x0145, TRY_ENTER, TryCatch #2 {all -> 0x0145, blocks: (B:48:0x0115, B:51:0x0121, B:54:0x014a, B:59:0x0155, B:81:0x01d0, B:82:0x01d7), top: B:90:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:60:0x0159, B:62:0x015f, B:64:0x0165, B:73:0x01a7, B:75:0x01b1, B:69:0x016f, B:71:0x017c, B:72:0x0193), top: B:91:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x017c A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:60:0x0159, B:62:0x015f, B:64:0x0165, B:73:0x01a7, B:75:0x01b1, B:69:0x016f, B:71:0x017c, B:72:0x0193), top: B:91:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:60:0x0159, B:62:0x015f, B:64:0x0165, B:73:0x01a7, B:75:0x01b1, B:69:0x016f, B:71:0x017c, B:72:0x0193), top: B:91:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0 A[Catch: all -> 0x0145, TRY_ENTER, TryCatch #2 {all -> 0x0145, blocks: (B:48:0x0115, B:51:0x0121, B:54:0x014a, B:59:0x0155, B:81:0x01d0, B:82:0x01d7), top: B:90:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0121, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x017c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01b1, please report this as an issue */
    private SocketChannel openOutgoingConnection(InetAddress inetAddress, InetAddress inetAddress2, int i, boolean z, String str) throws Throwable {
        boolean z2;
        boolean z3;
        int i2;
        String strMakeKey;
        SocketChannel socket;
        String str2 = str;
        boolean z4 = true;
        boolean z5 = false;
        try {
            this.keyedSemaphore.enterIOCriticalSection(str2);
            try {
                SocketChannel socket2 = getSocket(str2);
                if (socket2 != null && (!socket2.isConnected() || !socket2.isOpen())) {
                    if (!socket2.isConnectionPending()) {
                        removeSocket(str2, false);
                        socket2 = null;
                    }
                }
                if (socket2 == null) {
                    if (socket2 == null) {
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("inaddr = " + inetAddress2);
                                logger.logDebug("port = " + i);
                            }
                            try {
                                socket2 = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                putSocket(str2, socket2);
                            } catch (SocketException e) {
                                if (logger.isLoggingEnabled(16)) {
                                    logger.logInfo("Problem connecting " + inetAddress2 + Separators.SP + i + Separators.SP + inetAddress);
                                }
                                removeSocket(str2, false);
                                throw new SocketException(e.getClass() + Separators.SP + e.getMessage() + Separators.SP + e.getCause() + " Problem connecting " + inetAddress2 + Separators.SP + i + Separators.SP + inetAddress);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            z2 = true;
                            z3 = z2;
                            try {
                                if (logger.isLoggingEnabled(16)) {
                                    logger.logInfo("Problem OpeningConn:  inAddr " + inetAddress2.getHostAddress() + " port = " + i + " retry " + z);
                                }
                                removeSocket(str2, false);
                                if (!z) {
                                    logger.logError("IOException occured at ", e);
                                    throw e;
                                }
                                if (i <= 0) {
                                    i2 = 5060;
                                } else {
                                    i2 = i;
                                }
                                strMakeKey = makeKey(inetAddress2, i2);
                                try {
                                    socket = getSocket(strMakeKey);
                                    if (socket != null) {
                                        removeSocket(strMakeKey, false);
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("inaddr = " + inetAddress2 + " port = " + i2);
                                        }
                                        socket = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i2), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                        putSocket(strMakeKey, socket);
                                    } else {
                                        removeSocket(strMakeKey, false);
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("inaddr = " + inetAddress2 + " port = " + i2);
                                        }
                                        socket = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i2), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                        putSocket(strMakeKey, socket);
                                    }
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("sending to " + strMakeKey);
                                    }
                                    if (z2) {
                                        if (z3) {
                                            removeSocket(strMakeKey, true);
                                        }
                                        this.keyedSemaphore.leaveIOCriticalSection(strMakeKey);
                                    }
                                    return socket;
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = strMakeKey;
                                    z5 = z2;
                                    z4 = z3;
                                    if (z5) {
                                        if (z4) {
                                            removeSocket(str2, true);
                                        }
                                        this.keyedSemaphore.leaveIOCriticalSection(str2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z5 = true;
                            if (z5) {
                                if (z4) {
                                    removeSocket(str2, true);
                                }
                                this.keyedSemaphore.leaveIOCriticalSection(str2);
                            }
                            throw th;
                        }
                    }
                    z5 = true;
                }
                if (z5) {
                    removeSocket(str2, true);
                }
                this.keyedSemaphore.leaveIOCriticalSection(str2);
                return socket2;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                z3 = false;
                if (logger.isLoggingEnabled(16)) {
                    logger.logInfo("Problem OpeningConn:  inAddr " + inetAddress2.getHostAddress() + " port = " + i + " retry " + z);
                }
                removeSocket(str2, false);
                if (!z) {
                    logger.logError("IOException occured at ", e);
                    throw e;
                }
                if (i <= 0) {
                    i2 = 5060;
                } else {
                    i2 = i;
                }
                strMakeKey = makeKey(inetAddress2, i2);
                socket = getSocket(strMakeKey);
                if (socket != null || !socket.isConnected() || !socket.isOpen()) {
                    removeSocket(strMakeKey, false);
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("inaddr = " + inetAddress2 + " port = " + i2);
                    }
                    socket = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i2), inetAddress, this.messageProcessor.sipStack.connTimeout);
                    putSocket(strMakeKey, socket);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("sending to " + strMakeKey);
                }
                if (z2) {
                    if (z3) {
                        removeSocket(strMakeKey, true);
                    }
                    this.keyedSemaphore.leaveIOCriticalSection(strMakeKey);
                }
                return socket;
            } catch (Throwable th4) {
                th = th4;
                z5 = true;
                z4 = false;
            }
        } catch (IOException e4) {
            e = e4;
            z2 = false;
        } catch (Throwable th5) {
            th = th5;
            z4 = false;
        }
    }

    private void removeSocket(String str, boolean z) throws Throwable {
        boolean z2 = false;
        try {
            try {
                this.keyedSemaphore.enterIOCriticalSection(str);
                try {
                    SocketChannel socketChannelRemove = this.socketTable.remove(str);
                    if (logger.isLoggingEnabled(32)) {
                        boolean z3 = socketChannelRemove != null;
                        logger.logDebug("removed Socket for key " + str + ", removed:" + z3);
                    }
                    if (z) {
                        this.keyedSemaphore.remove(str);
                        if (logger.isLoggingEnabled(32)) {
                            z2 = socketChannelRemove != null;
                            logger.logDebug("removed Semaphore for key " + str + ", removed:" + z2);
                        }
                    }
                    this.keyedSemaphore.leaveIOCriticalSection(str);
                } catch (IOException e) {
                    e = e;
                    z2 = true;
                    if (logger.isLoggingEnabled(32)) {
                        logger.logError("Failed on putting socket", e);
                    }
                    if (z2) {
                        this.keyedSemaphore.leaveIOCriticalSection(str);
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                    if (z2) {
                        this.keyedSemaphore.leaveIOCriticalSection(str);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private void writeChunks(SocketChannel socketChannel, byte[] bArr, int i) {
        this.messageProcessor.send(socketChannel, bArr);
    }

    public void closeAll() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Closing " + this.socketTable.size() + " sockets from IOHandler");
        }
        Enumeration<SocketChannel> enumerationElements = this.socketTable.elements();
        while (enumerationElements.hasMoreElements()) {
            try {
                enumerationElements.nextElement().close();
            } catch (IOException unused) {
            }
        }
    }

    public SocketChannel createOrReuseSocket(InetAddress inetAddress, int i) throws Throwable {
        SocketChannel socketChannelOpenOutgoingConnection = null;
        if (this.stopped.get()) {
            return null;
        }
        String strMakeKey = makeKey(inetAddress, i);
        SocketChannel socket = getSocket(strMakeKey);
        if (socket == null || ((socket.isConnected() && socket.isOpen()) || socket.isConnectionPending())) {
            socketChannelOpenOutgoingConnection = socket;
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Channel disconnected " + socket);
        }
        if (socketChannelOpenOutgoingConnection == null) {
            socketChannelOpenOutgoingConnection = openOutgoingConnection(this.messageProcessor.getIpAddress(), inetAddress, i, false, strMakeKey);
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Returning socket " + strMakeKey + " channel = " + socketChannelOpenOutgoingConnection);
        }
        return socketChannelOpenOutgoingConnection;
    }

    public int getCurrentChannelSize() {
        return this.channelMap.size();
    }

    public NioTcpMessageChannel getMessageChannel(SocketChannel socketChannel) {
        return this.channelMap.get(socketChannel);
    }

    public SocketChannel getSocket(String str) {
        return this.socketTable.get(str);
    }

    public void putMessageChannel(SocketChannel socketChannel, NioTcpMessageChannel nioTcpMessageChannel) {
        this.channelMap.put(socketChannel, nioTcpMessageChannel);
    }

    public void putSocket(String str, SocketChannel socketChannel) {
        if (this.stopped.get()) {
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            b1j.x("adding socket for key ", str, logger);
        }
        boolean z = false;
        try {
            try {
                this.keyedSemaphore.enterIOCriticalSection(str);
                z = true;
                this.socketTable.put(str, socketChannel);
                this.keyedSemaphore.leaveIOCriticalSection(str);
            } catch (IOException e) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logError("Failed on putting socket", e);
                }
                if (z) {
                    this.keyedSemaphore.leaveIOCriticalSection(str);
                }
            }
        } catch (Throwable th) {
            if (z) {
                this.keyedSemaphore.leaveIOCriticalSection(str);
            }
            throw th;
        }
    }

    public void removeMessageChannel(SocketChannel socketChannel) {
        this.channelMap.remove(socketChannel);
    }

    public SocketChannel sendBytes(InetAddress inetAddress, InetAddress inetAddress2, int i, String str, byte[] bArr, boolean z, NioTcpMessageChannel nioTcpMessageChannel) throws Throwable {
        boolean z2;
        boolean z3;
        if (this.stopped.get()) {
            return null;
        }
        int length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbT = kng0.t("sendBytes ", str, " inAddr ");
            sbT.append(inetAddress2.getHostAddress());
            sbT.append(" port = ");
            sbT.append(i);
            sbT.append(" length = ");
            sbT.append(length);
            sbT.append(" retry ");
            z2 = z;
            sbT.append(z2);
            stackLogger.logDebug(sbT.toString());
        } else {
            z2 = z;
        }
        if (logger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            logger.logStackTrace(16);
        }
        String strMakeKey = makeKey(inetAddress2, i);
        SocketChannel socket = getSocket(strMakeKey);
        SocketChannel socketChannelOpenOutgoingConnection = (socket == null || (socket.isConnected() && socket.isOpen()) || socket.isConnectionPending()) ? socket : null;
        if (socketChannelOpenOutgoingConnection == null) {
            socketChannelOpenOutgoingConnection = openOutgoingConnection(inetAddress, inetAddress2, i, z2, strMakeKey);
            nioTcpMessageChannel.peerPort = i;
            z3 = true;
        } else {
            z3 = false;
        }
        if (socketChannelOpenOutgoingConnection != null) {
            if (z3 && (nioTcpMessageChannel instanceof NioTlsMessageChannel)) {
                NioTlsMessageChannel nioTlsMessageChannel = (NioTlsMessageChannel) nioTcpMessageChannel;
                nioTlsMessageChannel.setHandshakeCompletedListener(new HandshakeCompletedListenerImpl(nioTlsMessageChannel, socketChannelOpenOutgoingConnection));
            } else {
                writeChunks(socketChannelOpenOutgoingConnection, bArr, length);
            }
        }
        if (socketChannelOpenOutgoingConnection != null) {
            return socketChannelOpenOutgoingConnection;
        }
        if (logger.isLoggingEnabled(4)) {
            logger.logError(this.socketTable.toString());
            logger.logError("Could not connect to " + inetAddress2 + Separators.COLON + i);
        }
        ohq.m("Could not connect to ", inetAddress2, Separators.COLON, i);
        return null;
    }

    public void stop() {
        this.stopped.set(true);
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("keys to check for inactivity removal " + this.channelMap.keySet());
                logger.logDebug("existing socket in NIOHandler " + this.socketTable.keySet());
            }
            Iterator<Map.Entry<SocketChannel, NioTcpMessageChannel>> it = this.channelMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<SocketChannel, NioTcpMessageChannel> next = it.next();
                SocketChannel key = next.getKey();
                NioTcpMessageChannel value = next.getValue();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("stop() : Removing socket " + value.key + " socketChannel = " + key);
                }
                value.close();
                this.channelMap.remove(key);
                it = this.channelMap.entrySet().iterator();
            }
        } catch (Exception unused) {
        }
    }

    public static String makeKey(String str, int i) {
        return str + Separators.COLON + i;
    }

    public void removeSocket(SocketChannel socketChannel) throws Throwable {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Trying to remove cached socketChannel without key" + this + " socketChannel = " + socketChannel);
        }
        LinkedList<String> linkedList = new LinkedList();
        for (Map.Entry<String, SocketChannel> entry : this.socketTable.entrySet()) {
            if (entry.getValue().equals(socketChannel)) {
                linkedList.add(entry.getKey());
            }
        }
        for (String str : linkedList) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Removing cached socketChannel without key" + this + " socketChannel = " + socketChannel + " key = " + str);
            }
            removeSocket(str, true);
        }
    }
}
