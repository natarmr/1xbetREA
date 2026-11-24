package android.gov.nist.javax.sip.stack;

import a.b1j;
import a.ohq;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.MessageParser;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import android.javax.sip.ListeningPoint;
import android.javax.sip.address.Hop;
import android.javax.sip.message.Response;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UDPMessageChannel extends MessageChannel implements ParseExceptionListener, Runnable, RawMessageChannel {
    private static final StackLogger logger = CommonLogger.getLogger(UDPMessageChannel.class);
    private static Hashtable<String, PingBackTimerTask> pingBackRecord = new Hashtable<>();
    private DatagramPacket incomingPacket;
    private String myAddress;
    protected MessageParser myParser;
    protected int myPort;
    private Thread mythread;
    private InetAddress peerAddress;
    private InetAddress peerPacketSourceAddress;
    private int peerPacketSourcePort;
    private int peerPort;
    private String peerProtocol;
    private long receptionTime;
    protected SIPTransactionStack sipStack;

    public class PingBackTimerTask extends SIPStackTimerTask {
        String ipAddress;
        int port;

        public PingBackTimerTask(String str, int i) {
            this.ipAddress = str;
            this.port = i;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        public int hashCode() {
            return (this.ipAddress + Separators.COLON + this.port).hashCode();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            UDPMessageChannel.pingBackRecord.remove(this.ipAddress + Separators.COLON + this.port);
        }
    }

    public UDPMessageChannel(InetAddress inetAddress, int i, SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor) {
        this.mythread = null;
        this.peerAddress = inetAddress;
        this.peerPort = i;
        this.peerProtocol = ListeningPoint.UDP;
        this.messageProcessor = uDPMessageProcessor;
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(sIPTransactionStack);
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("Creating message channel " + inetAddress.getHostAddress() + Separators.SLASH + i);
        }
    }

    private void processIncomingDataPacket(DatagramPacket datagramPacket) throws IOException {
        this.peerAddress = datagramPacket.getAddress();
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("UDPMessageChannel: processIncomingDataPacket : peerAddress = " + this.peerAddress.getHostAddress() + Separators.SLASH + datagramPacket.getPort() + " Length = " + length);
        }
        try {
            this.receptionTime = System.currentTimeMillis();
            boolean z = true;
            SIPMessage sIPMessage = this.myParser.parseSIPMessage(bArr, true, false, this);
            if (sIPMessage instanceof SIPRequest) {
                String sipVersion = ((SIPRequest) sIPMessage).getRequestLine().getSipVersion();
                if (!sipVersion.equals(SIPConstants.SIP_VERSION_STRING)) {
                    sendMessage(((SIPRequest) sIPMessage).createResponse(Response.VERSION_NOT_SUPPORTED, "Bad version ".concat(sipVersion)).toString().getBytes(), this.peerAddress, datagramPacket.getPort(), ListeningPoint.UDP, false);
                    return;
                } else if (!((SIPRequest) sIPMessage).getMethod().equalsIgnoreCase(((SIPRequest) sIPMessage).getCSeqHeader().getMethod())) {
                    sendMessage(((SIPRequest) sIPMessage).createResponse(Response.BAD_REQUEST).encodeAsBytes(getTransport()), this.peerAddress, datagramPacket.getPort(), ListeningPoint.UDP, false);
                    return;
                }
            }
            if (sIPMessage == null) {
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("Rejecting message !  + Null message parsed.");
                }
                String str = datagramPacket.getAddress().getHostAddress() + Separators.COLON + datagramPacket.getPort();
                if (pingBackRecord.get(str) != null || this.sipStack.getMinKeepAliveInterval() <= 0) {
                    stackLogger.logDebug("Not sending ping back");
                    return;
                }
                byte[] bytes = "\r\n\r\n".getBytes();
                DatagramPacket datagramPacket2 = new DatagramPacket(bytes, 0, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort());
                PingBackTimerTask pingBackTimerTask = new PingBackTimerTask(datagramPacket.getAddress().getHostAddress(), datagramPacket.getPort());
                pingBackRecord.put(str, pingBackTimerTask);
                this.sipStack.getTimer().schedule(pingBackTimerTask, this.sipStack.getMinKeepAliveInterval() * 1000);
                ((UDPMessageProcessor) this.messageProcessor).sock.send(datagramPacket2);
                return;
            }
            Via topmostVia = sIPMessage.getTopmostVia();
            if (sIPMessage.getFrom() == null || sIPMessage.getTo() == null || sIPMessage.getCallId() == null || sIPMessage.getCSeq() == null || topmostVia == null) {
                String str2 = new String(bArr);
                if (stackLogger.isLoggingEnabled()) {
                    stackLogger.logError("bad message ".concat(str2));
                    stackLogger.logError(">>> Dropped Bad Msg From = " + sIPMessage.getFrom() + "To = " + sIPMessage.getTo() + "CallId = " + sIPMessage.getCallId() + "CSeq = " + sIPMessage.getCSeq() + "Via = " + sIPMessage.getViaHeaders());
                    return;
                }
                return;
            }
            SIPEventInterceptor sIPEventInterceptor = this.sipStack.sipEventInterceptor;
            if (sIPEventInterceptor != null) {
                sIPEventInterceptor.beforeMessage(sIPMessage);
            }
            if (sIPMessage instanceof SIPRequest) {
                Hop hopResolveAddress = this.sipStack.addressResolver.resolveAddress(topmostVia.getHop());
                this.peerPort = hopResolveAddress.getPort();
                this.peerProtocol = topmostVia.getTransport();
                this.peerPacketSourceAddress = datagramPacket.getAddress();
                this.peerPacketSourcePort = datagramPacket.getPort();
                try {
                    this.peerAddress = datagramPacket.getAddress();
                    boolean zHasParameter = topmostVia.hasParameter("rport");
                    if (!this.sipStack.isPatchRport() || zHasParameter || topmostVia.getPort() == this.peerPacketSourcePort) {
                        z = zHasParameter;
                    } else if (stackLogger.isLoggingEnabled(32)) {
                        stackLogger.logDebug("setting rport since viaPort " + topmostVia.getPort() + " different than peerPacketSourcePort " + this.peerPacketSourcePort + " so that the response can be routed back");
                    }
                    if (z || !hopResolveAddress.getHost().equals(this.peerAddress.getHostAddress())) {
                        topmostVia.setParameter("received", this.peerAddress.getHostAddress());
                    }
                    if (z) {
                        topmostVia.setParameter("rport", Integer.toString(this.peerPacketSourcePort));
                    }
                } catch (ParseException e) {
                    InternalErrorHandler.handleException(e);
                }
            } else {
                this.peerPacketSourceAddress = datagramPacket.getAddress();
                this.peerPacketSourcePort = datagramPacket.getPort();
                this.peerAddress = datagramPacket.getAddress();
                this.peerPort = datagramPacket.getPort();
                this.peerProtocol = topmostVia.getTransport();
            }
            processMessage(sIPMessage);
            SIPEventInterceptor sIPEventInterceptor2 = this.sipStack.sipEventInterceptor;
            if (sIPEventInterceptor2 != null) {
                sIPEventInterceptor2.afterMessage(sIPMessage);
            }
        } catch (ParseException e2) {
            StackLogger stackLogger2 = logger;
            if (stackLogger2.isLoggingEnabled(32)) {
                stackLogger2.logDebug("Rejecting message !  " + new String(bArr) + Separators.SP + e2.getMessage());
            }
            String str3 = new String(bArr, 0, length);
            if (str3.startsWith("SIP/") || str3.startsWith("ACK ")) {
                return;
            }
            String strCreateBadReqRes = createBadReqRes(str3, e2);
            if (strCreateBadReqRes == null) {
                if (stackLogger2.isLoggingEnabled(32)) {
                    stackLogger2.logDebug("Could not formulate automatic 400 Bad Request");
                    return;
                }
                return;
            }
            if (stackLogger2.isLoggingEnabled(32)) {
                stackLogger2.logDebug("Sending automatic 400 Bad Request:");
                stackLogger2.logDebug(strCreateBadReqRes);
            }
            try {
                sendMessage(strCreateBadReqRes.getBytes(), this.peerAddress, datagramPacket.getPort(), ListeningPoint.UDP, false);
            } catch (IOException e3) {
                logger.logException(e3);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void close() {
        Thread thread = this.mythread;
        if (thread != null) {
            thread.interrupt();
            this.mythread = null;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            return getKey().equals(((UDPMessageChannel) obj).getKey());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getHost() {
        return this.messageProcessor.getIpAddress().getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getKey() {
        return MessageChannel.getKey(this.peerAddress, this.peerPort, ListeningPoint.UDP);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerAddress() {
        return this.peerAddress.getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerInetAddress() {
        return this.peerAddress;
    }

    public String getPeerName() {
        return this.peerAddress.getHostName();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerPacketSourceAddress() {
        return this.peerPacketSourceAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPacketSourcePort() {
        return this.peerPacketSourcePort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPort() {
        return this.peerPort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerProtocol() {
        return this.peerProtocol;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPort() {
        return ((UDPMessageProcessor) this.messageProcessor).getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return ParameterNames.UDP;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getViaHost() {
        return this.myAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getViaPort() {
        return this.myPort;
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) throws ParseException {
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("Parsing Issue " + parseException.getMessage());
        }
        if (cls == null || !(cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            sIPMessage.addUnparsed(str);
        } else {
            if (!stackLogger.isLoggingEnabled(32)) {
                throw parseException;
            }
            b1j.x("BAD MESSAGE! ", str2, stackLogger);
            throw parseException;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isReliable() {
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.RawMessageChannel
    public void processMessage(SIPMessage sIPMessage) {
        sIPMessage.setRemoteAddress(this.peerAddress);
        sIPMessage.setRemotePort(getPeerPort());
        sIPMessage.setLocalPort(getPort());
        sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16)) {
            stackLogger.logInfo("Setting SIPMessage peerPacketSource to: " + this.peerPacketSourceAddress + Separators.COLON + this.peerPacketSourcePort);
        }
        sIPMessage.setPeerPacketSourceAddress(this.peerPacketSourceAddress);
        sIPMessage.setPeerPacketSourcePort(this.peerPacketSourcePort);
        if (sIPMessage instanceof SIPRequest) {
            SIPRequest sIPRequest = (SIPRequest) sIPMessage;
            if (stackLogger.isLoggingEnabled(16)) {
                this.sipStack.serverLogger.logMessage(sIPMessage, getPeerHostPort().toString(), getHost() + Separators.COLON + this.myPort, false, this.receptionTime);
            }
            ServerRequestInterface serverRequestInterfaceNewSIPServerRequest = this.sipStack.newSIPServerRequest(sIPRequest, this);
            if (serverRequestInterfaceNewSIPServerRequest == null) {
                if (stackLogger.isLoggingEnabled()) {
                    stackLogger.logWarning("Null request interface returned -- dropping request");
                    return;
                }
                return;
            }
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug("About to process " + sIPRequest.getFirstLine() + Separators.SLASH + serverRequestInterfaceNewSIPServerRequest);
            }
            try {
                serverRequestInterfaceNewSIPServerRequest.processRequest(sIPRequest, this);
                if ((serverRequestInterfaceNewSIPServerRequest instanceof SIPTransaction) && !((SIPServerTransaction) serverRequestInterfaceNewSIPServerRequest).passToListener()) {
                    ((SIPTransaction) serverRequestInterfaceNewSIPServerRequest).releaseSem();
                }
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("Done processing " + sIPRequest.getFirstLine() + Separators.SLASH + serverRequestInterfaceNewSIPServerRequest);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (!(serverRequestInterfaceNewSIPServerRequest instanceof SIPTransaction) || ((SIPServerTransaction) serverRequestInterfaceNewSIPServerRequest).passToListener()) {
                    throw th;
                }
                ((SIPTransaction) serverRequestInterfaceNewSIPServerRequest).releaseSem();
                throw th;
            }
        }
        SIPResponse sIPResponse = (SIPResponse) sIPMessage;
        try {
            sIPResponse.checkHeaders();
            if (stackLogger.isLoggingEnabled(16)) {
                this.sipStack.serverLogger.logMessage((SIPMessage) sIPResponse, getPeerHostPort().toString(), getHost() + Separators.COLON + this.myPort, false, this.receptionTime);
            }
            ServerResponseInterface serverResponseInterfaceNewSIPServerResponse = this.sipStack.newSIPServerResponse(sIPResponse, this);
            if (serverResponseInterfaceNewSIPServerResponse == null) {
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("null sipServerResponse as could not acquire semaphore or the valve dropped the message.");
                    return;
                }
                return;
            }
            try {
                if (!(serverResponseInterfaceNewSIPServerResponse instanceof SIPClientTransaction) || ((SIPClientTransaction) serverResponseInterfaceNewSIPServerResponse).checkFromTag(sIPResponse)) {
                    serverResponseInterfaceNewSIPServerResponse.processResponse(sIPResponse, this);
                } else {
                    if (stackLogger.isLoggingEnabled()) {
                        stackLogger.logError("Dropping response message with invalid tag >>> " + sIPResponse);
                    }
                }
            } finally {
                if (serverResponseInterfaceNewSIPServerResponse instanceof SIPTransaction) {
                    SIPTransaction sIPTransaction = (SIPTransaction) serverResponseInterfaceNewSIPServerResponse;
                    if (!sIPTransaction.passToListener()) {
                        sIPTransaction.releaseSem();
                    }
                }
            }
        } catch (ParseException unused) {
            if (logger.isLoggingEnabled()) {
                logger.logError("Dropping Badly formatted response message >>> " + sIPResponse);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[Catch: InterruptedException -> 0x0049, TryCatch #2 {InterruptedException -> 0x0049, blocks: (B:12:0x0026, B:14:0x002e, B:16:0x003a, B:19:0x0053, B:24:0x005b, B:18:0x004b), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0006 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        DatagramPacket datagramPacket;
        DatagramQueuedMessageDispatch datagramQueuedMessageDispatchPoll;
        UDPMessageProcessor uDPMessageProcessor = (UDPMessageProcessor) this.messageProcessor;
        ThreadAuditor.ThreadHandle threadHandleAddCurrentThread = null;
        while (true) {
            SIPTransactionStack sIPTransactionStack = this.sipStack;
            try {
                if (sIPTransactionStack.threadPoolSize != -1) {
                    if (threadHandleAddCurrentThread == null && sIPTransactionStack.getThreadAuditor() != null) {
                        threadHandleAddCurrentThread = this.sipStack.getThreadAuditor().addCurrentThread();
                    }
                    if (threadHandleAddCurrentThread != null) {
                        threadHandleAddCurrentThread.ping();
                    }
                    if (threadHandleAddCurrentThread != null) {
                        try {
                            if (this.sipStack.getThreadAuditor() == null || !this.sipStack.getThreadAuditor().isEnabled()) {
                                datagramQueuedMessageDispatchPoll = uDPMessageProcessor.messageQueue.take();
                            } else {
                                datagramQueuedMessageDispatchPoll = uDPMessageProcessor.messageQueue.poll(threadHandleAddCurrentThread.getPingIntervalInMillisecs(), TimeUnit.MILLISECONDS);
                            }
                        } catch (InterruptedException unused) {
                            datagramPacket = null;
                            if (!uDPMessageProcessor.isRunning) {
                                return;
                            }
                            processIncomingDataPacket(datagramPacket);
                            if (this.sipStack.threadPoolSize == -1) {
                                return;
                            }
                        }
                    } else {
                        datagramQueuedMessageDispatchPoll = uDPMessageProcessor.messageQueue.take();
                    }
                    if (!uDPMessageProcessor.isRunning) {
                        return;
                    }
                    if (datagramQueuedMessageDispatchPoll != null) {
                        datagramPacket = datagramQueuedMessageDispatchPoll.packet;
                        try {
                            this.incomingPacket = datagramPacket;
                        } catch (InterruptedException unused2) {
                            if (!uDPMessageProcessor.isRunning) {
                                return;
                            }
                        }
                    }
                } else {
                    datagramPacket = this.incomingPacket;
                }
                processIncomingDataPacket(datagramPacket);
            } catch (Exception e) {
                logger.logError("Error while processing incoming UDP packet" + Arrays.toString(datagramPacket.getData()), e);
            }
            if (this.sipStack.threadPoolSize == -1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0150  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(final SIPMessage sIPMessage) throws Throwable {
        UDPMessageChannel uDPMessageChannel;
        StackLogger stackLogger;
        long j;
        InetAddress inetAddress;
        int i;
        StackLogger stackLogger2 = logger;
        if (stackLogger2.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            if (!(sIPMessage instanceof SIPRequest) || ((SIPRequest) sIPMessage).getRequestLine() == null) {
                stackLogger2.logStackTrace(16);
            } else {
                stackLogger2.logStackTrace(16);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                MessageProcessor[] messageProcessors = this.sipStack.getMessageProcessors();
                int length = messageProcessors.length;
                int i2 = 0;
                try {
                    try {
                        while (i2 < length) {
                            try {
                                MessageProcessor messageProcessor = messageProcessors[i2];
                                if (messageProcessor.getIpAddress().equals(this.peerAddress) && messageProcessor.getPort() == this.peerPort && messageProcessor.getTransport().equalsIgnoreCase(this.peerProtocol)) {
                                    Object objCreateMessageChannel = messageProcessor.createMessageChannel(this.peerAddress, this.peerPort);
                                    if (objCreateMessageChannel instanceof RawMessageChannel) {
                                        final RawMessageChannel rawMessageChannel = (RawMessageChannel) objCreateMessageChannel;
                                        getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.UDPMessageChannel.1
                                            @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                                            public Object getThreadHash() {
                                                return sIPMessage.getCallId().getCallId();
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                try {
                                                    rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                                } catch (Exception e) {
                                                    if (UDPMessageChannel.logger.isLoggingEnabled(4)) {
                                                        UDPMessageChannel.logger.logError("Error self routing message cause by: ", e);
                                                    }
                                                }
                                            }
                                        });
                                        StackLogger stackLogger3 = logger;
                                        if (stackLogger3.isLoggingEnabled(32)) {
                                            stackLogger3.logDebug("Self routing message");
                                        }
                                        if (!stackLogger3.isLoggingEnabled(16) || sIPMessage.isNullRequest()) {
                                            if (stackLogger3.isLoggingEnabled(32)) {
                                                stackLogger3.logDebug("Sent EMPTY Message");
                                                return;
                                            }
                                            return;
                                        } else {
                                            inetAddress = this.peerAddress;
                                            i = this.peerPort;
                                            uDPMessageChannel = this;
                                            uDPMessageChannel.logMessage(sIPMessage, inetAddress, i, jCurrentTimeMillis);
                                            return;
                                        }
                                    }
                                }
                                i2++;
                                jCurrentTimeMillis = jCurrentTimeMillis;
                            } catch (IOException e) {
                                e = e;
                                throw e;
                            } catch (Exception e2) {
                                e = e2;
                                logger.logError("An exception occured while sending message", e);
                                throw new IOException("An exception occured while sending message");
                            } catch (Throwable th) {
                                th = th;
                                uDPMessageChannel = this;
                                stackLogger = logger;
                                if (!stackLogger.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                                    uDPMessageChannel.logMessage(sIPMessage, uDPMessageChannel.peerAddress, uDPMessageChannel.peerPort, jCurrentTimeMillis);
                                } else if (stackLogger.isLoggingEnabled(32)) {
                                    stackLogger.logDebug("Sent EMPTY Message");
                                }
                                throw th;
                            }
                        }
                        uDPMessageChannel.sendMessage(sIPMessage.encodeAsBytes(getTransport()), this.peerAddress, this.peerPort, this.peerProtocol, sIPMessage instanceof SIPRequest);
                        sIPMessage.setRemoteAddress(uDPMessageChannel.peerAddress);
                        sIPMessage.setRemotePort(uDPMessageChannel.peerPort);
                        sIPMessage.setLocalPort(uDPMessageChannel.getPort());
                        sIPMessage.setLocalAddress(uDPMessageChannel.getMessageProcessor().getIpAddress());
                        StackLogger stackLogger4 = logger;
                        if (!stackLogger4.isLoggingEnabled(16) || sIPMessage.isNullRequest()) {
                            if (stackLogger4.isLoggingEnabled(32)) {
                                stackLogger4.logDebug("Sent EMPTY Message");
                                return;
                            }
                            return;
                        } else {
                            inetAddress = uDPMessageChannel.peerAddress;
                            i = uDPMessageChannel.peerPort;
                            jCurrentTimeMillis = j;
                            uDPMessageChannel.logMessage(sIPMessage, inetAddress, i, jCurrentTimeMillis);
                            return;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        throw e;
                    } catch (Exception e4) {
                        e = e4;
                        logger.logError("An exception occured while sending message", e);
                        throw new IOException("An exception occured while sending message");
                    } catch (Throwable th2) {
                        th = th2;
                        jCurrentTimeMillis = j;
                        stackLogger = logger;
                        if (!stackLogger.isLoggingEnabled(16)) {
                            if (stackLogger.isLoggingEnabled(32)) {
                                stackLogger.logDebug("Sent EMPTY Message");
                            }
                        } else if (stackLogger.isLoggingEnabled(32)) {
                            stackLogger.logDebug("Sent EMPTY Message");
                        }
                        throw th;
                    }
                    uDPMessageChannel = this;
                } catch (IOException e5) {
                    e = e5;
                } catch (Exception e6) {
                    e = e6;
                } catch (Throwable th3) {
                    th = th3;
                    uDPMessageChannel = this;
                }
                j = jCurrentTimeMillis;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Exception e8) {
            e = e8;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public UDPMessageChannel(SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor, DatagramPacket datagramPacket) {
        this.mythread = null;
        this.incomingPacket = datagramPacket;
        this.messageProcessor = uDPMessageProcessor;
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(this.sipStack);
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.start();
    }

    public UDPMessageChannel(SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor, String str) {
        this.mythread = null;
        this.messageProcessor = uDPMessageProcessor;
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(this.sipStack);
        this.mythread = new Thread(this);
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        this.mythread.setName(str);
        this.mythread.setDaemon(true);
        this.mythread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i, boolean z) throws IOException {
        DatagramSocket datagramSocket;
        boolean z2;
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            stackLogger.logStackTrace(16);
        }
        if (i == -1) {
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug(getClass().getName().concat(":sendMessage: Dropping reply!"));
            }
            ohq.l("Receiver port not set ");
            return;
        }
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i + "\nmessageSize =  " + bArr.length + " message = " + new String(bArr));
            stackLogger.logDebug("*******************\n");
        }
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i);
        try {
            if (this.sipStack.udpFlag) {
                datagramSocket = ((UDPMessageProcessor) this.messageProcessor).sock;
                z2 = false;
            } else {
                datagramSocket = new DatagramSocket();
                z2 = true;
            }
            datagramSocket.send(datagramPacket);
            if (z2) {
                datagramSocket.close();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            InternalErrorHandler.handleException(e2);
        }
    }

    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i, String str, boolean z) throws IOException {
        DatagramSocket datagramSocketCreateDatagramSocket;
        if (i == -1) {
            StackLogger stackLogger = logger;
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug(getClass().getName().concat(":sendMessage: Dropping reply!"));
            }
            ohq.l("Receiver port not set ");
            return;
        }
        StackLogger stackLogger2 = logger;
        if (stackLogger2.isLoggingEnabled(32)) {
            stackLogger2.logDebug(":sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i + "\n messageSize = " + bArr.length);
        }
        if (str.compareToIgnoreCase(ListeningPoint.UDP) == 0) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i);
            try {
                SIPTransactionStack sIPTransactionStack = this.sipStack;
                if (sIPTransactionStack.udpFlag) {
                    datagramSocketCreateDatagramSocket = ((UDPMessageProcessor) this.messageProcessor).sock;
                } else {
                    datagramSocketCreateDatagramSocket = sIPTransactionStack.getNetworkLayer().createDatagramSocket();
                }
                if (stackLogger2.isLoggingEnabled(32)) {
                    stackLogger2.logDebug("sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i + Separators.RETURN + new String(bArr));
                }
                datagramSocketCreateDatagramSocket.send(datagramPacket);
                if (this.sipStack.udpFlag) {
                    return;
                }
                datagramSocketCreateDatagramSocket.close();
                return;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                InternalErrorHandler.handleException(e2);
                return;
            }
        }
        OutputStream outputStream = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i, ParameterNames.TCP, bArr, z, this).getOutputStream();
        outputStream.write(bArr, 0, bArr.length);
        outputStream.flush();
    }
}
