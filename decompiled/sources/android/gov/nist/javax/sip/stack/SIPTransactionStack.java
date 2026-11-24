package android.gov.nist.javax.sip.stack;

import a.b1j;
import a.f140;
import a.hne;
import a.jf4;
import a.kng0;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.core.net.DefaultNetworkLayer;
import android.gov.nist.core.net.NetworkLayer;
import android.gov.nist.core.net.SecurityManagerProvider;
import android.gov.nist.javax.sip.DefaultAddressResolver;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.LogRecordFactory;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipListenerExt;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.ThreadAffinityExecutor;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.MessageParserFactory;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import android.javax.sip.DialogState;
import android.javax.sip.DialogTerminatedEvent;
import android.javax.sip.ListeningPoint;
import android.javax.sip.ServerTransaction;
import android.javax.sip.SipListener;
import android.javax.sip.Transaction;
import android.javax.sip.TransactionState;
import android.javax.sip.TransactionTerminatedEvent;
import android.javax.sip.address.Hop;
import android.javax.sip.address.Router;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.message.Request;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class SIPTransactionStack implements SIPTransactionEventListener, SIPDialogEventListener {
    public static final int BASE_TIMER_INTERVAL = 500;
    protected static final Set<String> dialogCreatingMethods;
    protected static ScheduledExecutorService selfRoutingThreadpoolExecutor;
    private AtomicInteger activeClientTransactionCount;
    protected AddressResolver addressResolver;
    protected boolean cacheClientConnections;
    protected boolean cacheServerConnections;
    protected boolean cancelClientTransactionChecked;
    protected boolean checkBranchId;
    protected ClientAuthType clientAuth;
    protected ConcurrentHashMap<String, SIPClientTransaction> clientTransactionTable;
    protected int clientTransactionTableHiwaterMark;
    protected int clientTransactionTableLowaterMark;
    protected int connTimeout;
    protected DefaultRouter defaultRouter;
    protected boolean deliverRetransmittedAckToListener;
    private boolean deliverTerminatedEventForAck;
    private boolean deliverUnsolicitedNotify;
    protected ConcurrentHashMap<String, SIPDialog> dialogTable;
    protected int dialogTimeoutFactor;
    protected ConcurrentHashMap<String, SIPDialog> earlyDialogTable;
    protected int earlyDialogTimeout;
    private ConcurrentHashMap<String, SIPClientTransaction> forkedClientTransactionTable;
    protected HashSet<String> forkedEvents;
    protected boolean generateTimeStampHeader;
    protected IOHandler ioHandler;
    protected boolean isAutomaticDialogErrorHandlingEnabled;
    protected boolean isAutomaticDialogSupportEnabled;
    protected boolean isBackToBackUserAgent;
    protected boolean isDialogTerminatedEventDeliveredForNullDialog;
    protected LogRecordFactory logRecordFactory;
    protected boolean logStackTraceOnMessageSend;
    protected int maxConnections;
    protected int maxContentLength;
    protected int maxForkTime;
    protected int maxListenerResponseTime;
    protected int maxMessageSize;
    protected int maxTxLifetimeInvite;
    protected int maxTxLifetimeNonInvite;
    private ConcurrentHashMap<String, SIPServerTransaction> mergeTable;
    public MessageParserFactory messageParserFactory;
    public MessageProcessorFactory messageProcessorFactory;
    private Collection<MessageProcessor> messageProcessors;
    protected long minKeepAliveInterval;
    protected boolean needsLogging;
    protected NetworkLayer networkLayer;
    public NIOMode nioMode;
    public long nioSocketMaxIdleTime;
    private boolean non2XXAckPassedToListener;
    protected String outboundProxy;
    protected boolean patchReceivedRport;
    protected boolean patchRport;
    protected boolean patchWebSocketHeaders;
    private ConcurrentHashMap<String, SIPServerTransaction> pendingTransactions;
    protected int readTimeout;
    protected int receiveUdpBufferSize;
    private ExecutorService reinviteExecutor;
    private ReleaseReferencesStrategy releaseReferencesStrategy;
    protected int reliableConnectionKeepAliveTimeout;
    protected boolean remoteTagReassignmentAllowed;
    protected ConcurrentHashMap<String, SIPServerTransaction> retransmissionAlertTransactions;
    protected boolean rfc2543Supported;
    protected Router router;
    protected String routerPath;
    protected SecurityManagerProvider securityManagerProvider;
    protected int sendUdpBufferSize;
    protected ConcurrentHashMap<String, SIPDialog> serverDialogMergeTestTable;
    protected ServerLogger serverLogger;
    protected ConcurrentHashMap<String, SIPServerTransaction> serverTransactionTable;
    protected int serverTransactionTableHighwaterMark;
    protected int serverTransactionTableLowaterMark;
    public SIPEventInterceptor sipEventInterceptor;
    protected StackMessageFactory sipMessageFactory;
    public List<SIPMessageValve> sipMessageValves;
    private long sslHandshakeTimeout;
    private boolean sslRenegotiationEnabled;
    protected String stackAddress;
    private int stackCongestionControlTimeout;
    protected InetAddress stackInetAddress;
    protected String stackName;
    private int tcpPostParsingThreadPoolSize;
    private ConcurrentHashMap<String, SIPServerTransaction> terminatedServerTransactionsPendingAck;
    protected ThreadAuditor threadAuditor;
    protected int threadPoolSize;
    private int threadPriority;
    private SipTimer timer;
    protected boolean toExit;
    boolean udpFlag;
    protected boolean unlimitedClientTransactionTableSize;
    protected boolean unlimitedServerTransactionTableSize;
    protected boolean useRouterForAll;
    private static StackLogger logger = CommonLogger.getLogger(SIPTransactionStack.class);
    private static int connectionLingerTimer = 8;

    public class PingTimer extends SIPStackTimerTask {
        ThreadAuditor.ThreadHandle threadHandle;

        public PingTimer(ThreadAuditor.ThreadHandle threadHandle) {
            this.threadHandle = threadHandle;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPTransactionStack.this.getTimer() != null) {
                if (this.threadHandle == null && SIPTransactionStack.this.getThreadAuditor() != null) {
                    this.threadHandle = SIPTransactionStack.this.getThreadAuditor().addCurrentThread();
                }
                this.threadHandle.ping();
                SIPTransactionStack.this.getTimer().schedule(SIPTransactionStack.this.new PingTimer(this.threadHandle), this.threadHandle.getPingIntervalInMillisecs());
            }
        }
    }

    public class RemoveForkedTransactionTimerTask extends SIPStackTimerTask {
        private final String forkId;

        public RemoveForkedTransactionTimerTask(String str) {
            this.forkId = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPTransactionStack.logger.isLoggingEnabled(32)) {
                SIPTransactionStack.logger.logDebug("Removing forked client transaction : forkId = " + this.forkId);
            }
            SIPTransactionStack.this.forkedClientTransactionTable.remove(this.forkId);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        dialogCreatingMethods = hashSet;
        hashSet.add(Request.REFER);
        hashSet.add("INVITE");
        hashSet.add("SUBSCRIBE");
    }

    public SIPTransactionStack() {
        this.earlyDialogTimeout = 180;
        this.unlimitedServerTransactionTableSize = true;
        this.unlimitedClientTransactionTableSize = true;
        this.serverTransactionTableHighwaterMark = 5000;
        this.serverTransactionTableLowaterMark = 4000;
        this.clientTransactionTableHiwaterMark = 1000;
        this.clientTransactionTableLowaterMark = 800;
        this.activeClientTransactionCount = new AtomicInteger(0);
        this.deliverRetransmittedAckToListener = false;
        this.connTimeout = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        this.rfc2543Supported = true;
        this.threadAuditor = null;
        this.cancelClientTransactionChecked = true;
        this.remoteTagReassignmentAllowed = true;
        this.logStackTraceOnMessageSend = true;
        this.stackCongestionControlTimeout = 0;
        this.isBackToBackUserAgent = false;
        this.isAutomaticDialogErrorHandlingEnabled = true;
        this.isDialogTerminatedEventDeliveredForNullDialog = false;
        this.maxForkTime = 0;
        this.deliverUnsolicitedNotify = false;
        this.deliverTerminatedEventForAck = false;
        this.patchWebSocketHeaders = false;
        this.patchRport = false;
        this.patchReceivedRport = false;
        this.clientAuth = ClientAuthType.Default;
        this.tcpPostParsingThreadPoolSize = 0;
        this.minKeepAliveInterval = -1L;
        this.dialogTimeoutFactor = 64;
        this.nioMode = NIOMode.BLOCKING;
        this.releaseReferencesStrategy = ReleaseReferencesStrategy.None;
        this.threadPriority = 10;
        this.reliableConnectionKeepAliveTimeout = -1;
        this.sslHandshakeTimeout = -1L;
        this.sslRenegotiationEnabled = false;
        this.reinviteExecutor = Executors.newCachedThreadPool(new ThreadFactory() { // from class: android.gov.nist.javax.sip.stack.SIPTransactionStack.1
            private int threadCount = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                int i = this.threadCount;
                this.threadCount = i + 1;
                return new Thread(runnable, String.format("%s-%d", "ReInviteSender", Integer.valueOf(i)));
            }
        });
        this.toExit = false;
        this.forkedEvents = new HashSet<>();
        this.threadPoolSize = -1;
        this.cacheServerConnections = true;
        this.cacheClientConnections = true;
        this.maxConnections = -1;
        this.messageProcessors = new CopyOnWriteArrayList();
        this.ioHandler = new IOHandler(this);
        this.readTimeout = -1;
        this.maxListenerResponseTime = -1;
        this.addressResolver = new DefaultAddressResolver();
        this.sipMessageValves = new ArrayList();
        this.dialogTable = new ConcurrentHashMap<>();
        this.earlyDialogTable = new ConcurrentHashMap<>();
        this.serverDialogMergeTestTable = new ConcurrentHashMap<>();
        this.clientTransactionTable = new ConcurrentHashMap<>();
        this.serverTransactionTable = new ConcurrentHashMap<>();
        this.terminatedServerTransactionsPendingAck = new ConcurrentHashMap<>();
        this.mergeTable = new ConcurrentHashMap<>();
        this.retransmissionAlertTransactions = new ConcurrentHashMap<>();
        this.pendingTransactions = new ConcurrentHashMap<>();
        this.forkedClientTransactionTable = new ConcurrentHashMap<>();
    }

    private void addTransactionHash(SIPTransaction sIPTransaction) {
        Transaction transaction;
        SIPRequest originalRequest = sIPTransaction.getOriginalRequest();
        if (sIPTransaction instanceof SIPClientTransaction) {
            boolean z = this.unlimitedClientTransactionTableSize;
            AtomicInteger atomicInteger = this.activeClientTransactionCount;
            if (z) {
                atomicInteger.incrementAndGet();
            } else if (atomicInteger.get() > this.clientTransactionTableHiwaterMark) {
                try {
                    synchronized (this.clientTransactionTable) {
                        this.clientTransactionTable.wait();
                        this.activeClientTransactionCount.incrementAndGet();
                    }
                } catch (Exception e) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("Exception occured while waiting for room", e);
                    }
                }
            }
            String transactionId = originalRequest.getTransactionId();
            transaction = (SIPTransaction) this.clientTransactionTable.putIfAbsent(transactionId, (SIPClientTransaction) sIPTransaction);
            if (logger.isLoggingEnabled(32)) {
                b1j.x(" putTransactionHash :  key = ", transactionId, logger);
            }
        } else {
            String transactionId2 = originalRequest.getTransactionId();
            if (logger.isLoggingEnabled(32)) {
                b1j.x(" putTransactionHash :  key = ", transactionId2, logger);
            }
            transaction = (SIPTransaction) this.serverTransactionTable.putIfAbsent(transactionId2, (SIPServerTransaction) sIPTransaction);
        }
        if (transaction == null) {
            sIPTransaction.scheduleMaxTxLifeTimeTimer();
        }
    }

    private String auditDialogs(Set set, long j) {
        LinkedList linkedList;
        String strM = "  Leaked dialogs:\n";
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.dialogTable) {
            linkedList = new LinkedList(this.dialogTable.values());
        }
        Iterator it = linkedList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SIPDialog sIPDialog = (SIPDialog) it.next();
            CallIdHeader callId = sIPDialog != null ? sIPDialog.getCallId() : null;
            String callId2 = callId != null ? callId.getCallId() : null;
            if (sIPDialog != null && callId2 != null && !set.contains(callId2)) {
                long j2 = sIPDialog.auditTag;
                if (j2 == 0) {
                    sIPDialog.auditTag = jCurrentTimeMillis;
                } else if (jCurrentTimeMillis - j2 >= j) {
                    i++;
                    DialogState state = sIPDialog.getState();
                    StringBuilder sb = new StringBuilder("dialog id: ");
                    sb.append(sIPDialog.getDialogId());
                    sb.append(", dialog state: ");
                    sb.append(state != null ? state.toString() : "null");
                    String string = sb.toString();
                    strM = kng0.m(strM, "    ", string, Separators.RETURN);
                    sIPDialog.setState(3);
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("auditDialogs: leaked ".concat(string));
                    }
                }
            }
        }
        if (i <= 0) {
            return null;
        }
        return strM + "    Total: " + Integer.toString(i) + " leaked dialogs detected and removed.\n";
    }

    private String auditTransactions(ConcurrentHashMap concurrentHashMap, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = new LinkedList(concurrentHashMap.values()).iterator();
        String strM = "  Leaked transactions:\n";
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SIPTransaction sIPTransaction = (SIPTransaction) it.next();
            if (sIPTransaction != null) {
                if (sIPTransaction.getAuditTag() == 0) {
                    sIPTransaction.setAuditTag(jCurrentTimeMillis);
                } else if (jCurrentTimeMillis - sIPTransaction.getAuditTag() >= j) {
                    i++;
                    TransactionState state = sIPTransaction.getState();
                    SIPRequest originalRequest = sIPTransaction.getOriginalRequest();
                    String method = originalRequest != null ? originalRequest.getMethod() : null;
                    StringBuilder sb = new StringBuilder(sIPTransaction.getClass().getName());
                    sb.append(", state: ");
                    sb.append(state != null ? state.toString() : "null");
                    sb.append(", OR: ");
                    if (method == null) {
                        method = "null";
                    }
                    sb.append(method);
                    String string = sb.toString();
                    strM = kng0.m(strM, "    ", string, Separators.RETURN);
                    removeTransaction(sIPTransaction);
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("auditTransactions: leaked ".concat(string));
                    }
                }
            }
        }
        if (i <= 0) {
            return null;
        }
        return strM + "    Total: " + Integer.toString(i) + " leaked transactions detected and removed.\n";
    }

    private MessageProcessor findMessageProcessor(String str, int i, String str2) {
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            if (messageProcessor.getTransport().equalsIgnoreCase(str2) && messageProcessor.getSavedIpAddress().equals(str) && messageProcessor.getPort() == i) {
                return messageProcessor;
            }
        }
        return null;
    }

    public static boolean isDialogCreated(String str) {
        return dialogCreatingMethods.contains(str);
    }

    public void addExtensionMethod(String str) {
        if (!str.equals("NOTIFY")) {
            dialogCreatingMethods.add(Utils.toUpperCase(str.trim()));
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("NOTIFY Supported Natively");
        }
    }

    public void addForkedClientTransaction(SIPClientTransaction sIPClientTransaction) {
        String forkId = ((SIPRequest) sIPClientTransaction.getRequest()).getForkId();
        sIPClientTransaction.setForkId(forkId);
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
            logger.logDebug("Adding forked client transaction : " + sIPClientTransaction + " branch=" + sIPClientTransaction.getBranch() + " forkId = " + forkId + "  sipDialog = " + sIPClientTransaction.getDefaultDialog() + " sipDialogId= " + sIPClientTransaction.getDefaultDialog().getDialogId());
        }
        this.forkedClientTransactionTable.put(forkId, sIPClientTransaction);
    }

    public void addMessageProcessor(MessageProcessor messageProcessor) {
        this.messageProcessors.add(messageProcessor);
    }

    public void addTransaction(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("added transaction " + sIPServerTransaction);
        }
        sIPServerTransaction.map();
        addTransactionHash(sIPServerTransaction);
    }

    public void addTransactionPendingAck(SIPServerTransaction sIPServerTransaction) {
        String branch = ((SIPRequest) sIPServerTransaction.getRequest()).getTopmostVia().getBranch();
        if (branch != null) {
            this.terminatedServerTransactionsPendingAck.put(branch, sIPServerTransaction);
        }
    }

    public String auditStack(Set set, long j, long j2) {
        String strAuditDialogs = auditDialogs(set, j);
        String strAuditTransactions = auditTransactions(this.serverTransactionTable, j2);
        String strAuditTransactions2 = auditTransactions(this.clientTransactionTable, j2);
        if (strAuditDialogs == null && strAuditTransactions == null && strAuditTransactions2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("SIP Stack Audit:\n");
        if (strAuditDialogs == null) {
            strAuditDialogs = "";
        }
        sb.append(strAuditDialogs);
        if (strAuditTransactions == null) {
            strAuditTransactions = "";
        }
        sb.append(strAuditTransactions);
        if (strAuditTransactions2 == null) {
            strAuditTransactions2 = "";
        }
        sb.append(strAuditTransactions2);
        return sb.toString();
    }

    public boolean checkBranchId() {
        return this.checkBranchId;
    }

    public void closeAllSockets() {
        this.ioHandler.closeAll();
        for (MessageProcessor messageProcessor : this.messageProcessors) {
            if (messageProcessor instanceof NioTcpMessageProcessor) {
                ((NioTcpMessageProcessor) messageProcessor).nioHandler.closeAll();
            }
        }
    }

    public boolean closeReliableConnection(String str, int i, String str2, String str3, int i2) {
        MessageProcessor messageProcessorFindMessageProcessor = findMessageProcessor(str, i, str2);
        if (messageProcessorFindMessageProcessor == null || !(messageProcessorFindMessageProcessor instanceof ConnectionOrientedMessageProcessor)) {
            return false;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbP = kng0.p(i, "~~~ closeReliableConnection( myAddress=", str, ", myPort=", ", transport=");
            f140.v(sbP, str2, ", peerAddress=", str3, ", peerPort=");
            sbP.append(i2);
            sbP.append("), MessageProcessor=");
            sbP.append(messageProcessorFindMessageProcessor);
            stackLogger.logDebug(sbP.toString());
        }
        return ((ConnectionOrientedMessageProcessor) messageProcessorFindMessageProcessor).closeReliableConnection(str3, i2);
    }

    public SIPClientTransaction createClientTransaction(SIPRequest sIPRequest, MessageChannel messageChannel) {
        SIPClientTransactionImpl sIPClientTransactionImpl = new SIPClientTransactionImpl(this, messageChannel);
        sIPClientTransactionImpl.setOriginalRequest(sIPRequest);
        return sIPClientTransactionImpl;
    }

    public SIPDialog createDialog(SIPClientTransaction sIPClientTransaction, SIPResponse sIPResponse) {
        String dialogId = ((SIPRequest) sIPClientTransaction.getRequest()).getDialogId(false);
        String dialogId2 = sIPResponse.getDialogId(false);
        if (logger.isLoggingEnabled(32)) {
            b1j.x("createDialog originalDialogId=", dialogId, logger);
            b1j.x("createDialog earlyDialogId=", dialogId2, logger);
            logger.logDebug("createDialog default Dialog=" + sIPClientTransaction.getDefaultDialog());
            if (sIPClientTransaction.getDefaultDialog() != null) {
                logger.logDebug("createDialog default Dialog Id=" + sIPClientTransaction.getDefaultDialog().getDialogId());
            }
        }
        SIPDialog sIPDialog = this.earlyDialogTable.get(dialogId);
        if (sIPDialog == null || !(sIPClientTransaction.getDefaultDialog() == null || sIPClientTransaction.getDefaultDialog().getDialogId().equals(dialogId))) {
            SIPDialog sIPDialog2 = new SIPDialog(sIPClientTransaction, sIPResponse);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("createDialog early Dialog not found : earlyDialogId=" + dialogId2 + " created one " + sIPDialog2);
            }
            return sIPDialog2;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("createDialog early Dialog found : earlyDialogId=" + dialogId + " earlyDialog= " + sIPDialog);
        }
        if (sIPResponse.isFinalResponse()) {
            this.earlyDialogTable.remove(dialogId);
        }
        return sIPDialog;
    }

    public MessageChannel createMessageChannel(SIPRequest sIPRequest, MessageProcessor messageProcessor, Hop hop) {
        Host host = new Host();
        host.setHostname(hop.getHost());
        HostPort hostPort = new HostPort();
        hostPort.setHost(host);
        hostPort.setPort(hop.getPort());
        return messageProcessor.createMessageChannel(hostPort);
    }

    public MessageProcessor createMessageProcessor(InetAddress inetAddress, int i, String str) {
        MessageProcessor messageProcessorCreateMessageProcessor = this.messageProcessorFactory.createMessageProcessor(this, inetAddress, i, str);
        addMessageProcessor(messageProcessorCreateMessageProcessor);
        return messageProcessorCreateMessageProcessor;
    }

    public MessageChannel createRawMessageChannel(String str, int i, Hop hop) {
        Host host = new Host();
        host.setHostname(hop.getHost());
        HostPort hostPort = new HostPort();
        hostPort.setHost(host);
        hostPort.setPort(hop.getPort());
        Iterator<MessageProcessor> it = this.messageProcessors.iterator();
        MessageChannel messageChannelCreateMessageChannel = null;
        while (it.hasNext() && messageChannelCreateMessageChannel == null) {
            MessageProcessor next = it.next();
            if (hop.getTransport().equalsIgnoreCase(next.getTransport()) && str.equals(next.getIpAddress().getHostAddress()) && i == next.getPort()) {
                try {
                    messageChannelCreateMessageChannel = next.createMessageChannel(hostPort);
                } catch (UnknownHostException e) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("host is not known " + hostPort + Separators.SP + e.getMessage());
                    }
                    throw e;
                } catch (IOException e2) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("host is reachable " + hostPort + Separators.SP + e2.getMessage());
                    }
                }
            }
        }
        if (messageChannelCreateMessageChannel == null && logger.isLoggingEnabled(32)) {
            logger.logDebug("newChanne is null, messageProcessors.size = " + this.messageProcessors.size());
            Iterator<MessageProcessor> it2 = this.messageProcessors.iterator();
            while (it2.hasNext() && messageChannelCreateMessageChannel == null) {
                MessageProcessor next2 = it2.next();
                logger.logDebug("nextProcessor:" + next2 + "| transport = " + next2.getTransport() + " ipAddress=" + next2.getIpAddress() + " port=" + next2.getPort());
            }
            logger.logDebug("More info on newChannel=null");
            logger.logDebug("nextHop=" + hop + " sourceIp=" + str + " sourcePort=" + i + " targetHostPort=" + hostPort);
        }
        return messageChannelCreateMessageChannel;
    }

    public SIPServerTransaction createServerTransaction(MessageChannel messageChannel) {
        if (this.unlimitedServerTransactionTableSize) {
            return new SIPServerTransactionImpl(this, messageChannel);
        }
        int size = this.serverTransactionTable.size();
        int i = this.serverTransactionTableLowaterMark;
        if (Math.random() > 1.0d - ((double) ((size - i) / (this.serverTransactionTableHighwaterMark - i)))) {
            return null;
        }
        return new SIPServerTransactionImpl(this, messageChannel);
    }

    public void decrementActiveClientTransactionCount() {
        if (this.activeClientTransactionCount.decrementAndGet() > this.clientTransactionTableLowaterMark || this.unlimitedClientTransactionTableSize) {
            return;
        }
        synchronized (this.clientTransactionTable) {
            this.clientTransactionTable.notify();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPDialogEventListener
    public synchronized void dialogErrorEvent(SIPDialogErrorEvent sIPDialogErrorEvent) {
        SIPDialog sIPDialog = (SIPDialog) sIPDialogErrorEvent.getSource();
        SipListener sipListener = ((SipStackImpl) this).getSipListener();
        if (sIPDialog != null && !(sipListener instanceof SipListenerExt)) {
            sIPDialog.delete();
        }
    }

    public void disableLogging() {
        logger.disableLogging();
    }

    public void enableLogging() {
        logger.enableLogging();
    }

    public SIPTransaction findCancelTransaction(SIPRequest sIPRequest, boolean z) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("findCancelTransaction request= \n" + sIPRequest + "\nfindCancelRequest isServer=" + z);
        }
        if (z) {
            for (SIPServerTransaction sIPServerTransaction : this.serverTransactionTable.values()) {
                if (sIPServerTransaction.doesCancelMatchTransaction(sIPRequest)) {
                    return sIPServerTransaction;
                }
            }
        } else {
            for (SIPClientTransaction sIPClientTransaction : this.clientTransactionTable.values()) {
                if (sIPClientTransaction.doesCancelMatchTransaction(sIPRequest)) {
                    return sIPClientTransaction;
                }
            }
        }
        if (!logger.isLoggingEnabled(32)) {
            return null;
        }
        logger.logDebug("Could not find transaction for cancel request");
        return null;
    }

    public boolean findMergedTransaction(SIPRequest sIPRequest) {
        String mergeId;
        if (sIPRequest.getMethod().equals("INVITE") && (mergeId = sIPRequest.getMergeId()) != null) {
            SIPServerTransaction sIPServerTransaction = this.mergeTable.get(mergeId);
            if (sIPServerTransaction != null && !sIPServerTransaction.isMessagePartOfTransaction(sIPRequest)) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Mathcing merged transaction for merge id " + mergeId + " with " + sIPServerTransaction);
                }
                return true;
            }
            SIPDialog sIPDialog = this.serverDialogMergeTestTable.get(mergeId);
            if (sIPDialog != null && sIPDialog.firstTransactionIsServerTransaction && sIPDialog.getState() == DialogState.CONFIRMED) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Mathcing merged dialog for merge id " + mergeId + " with " + sIPDialog);
                }
                return true;
            }
        }
        return false;
    }

    public SIPServerTransaction findPendingTransaction(String str) {
        if (logger.isLoggingEnabled(32)) {
            b1j.x("looking for pending tx for :", str, logger);
        }
        return this.pendingTransactions.get(str);
    }

    public SIPClientTransaction findSubscribeTransaction(SIPRequest sIPRequest, ListeningPointImpl listeningPointImpl) {
        SIPClientTransaction sIPClientTransaction = null;
        try {
            String dialogId = sIPRequest.getDialogId(true);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("ct table size = " + this.clientTransactionTable.size());
            }
            String tag = sIPRequest.getTo().getTag();
            if (tag != null) {
                Event event = (Event) sIPRequest.getHeader("Event");
                if (event != null) {
                    for (SIPClientTransaction sIPClientTransaction2 : this.clientTransactionTable.values()) {
                        if (sIPClientTransaction2.getMethod().equals("SUBSCRIBE")) {
                            String originalRequestFromTag = sIPClientTransaction2.getOriginalRequestFromTag();
                            Event originalRequestEvent = sIPClientTransaction2.getOriginalRequestEvent();
                            if (originalRequestEvent != null) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("ct.fromTag = " + originalRequestFromTag);
                                    logger.logDebug("thisToTag = " + tag);
                                    logger.logDebug("hisEvent = " + originalRequestEvent);
                                    logger.logDebug("eventHdr " + event);
                                    logger.logDebug("ct.req.contact = " + sIPClientTransaction2.getOriginalRequestContact());
                                    if (sIPClientTransaction2.getOriginalRequest() != null) {
                                        logger.logDebug("ct.req.reqURI = " + sIPClientTransaction2.getOriginalRequest().getRequestURI());
                                    }
                                    logger.logDebug("msg.Contact= " + sIPRequest.getContactHeader());
                                    logger.logDebug("msg.reqURI " + sIPRequest.getRequestURI());
                                }
                                if (originalRequestFromTag.equalsIgnoreCase(tag) && event.match(originalRequestEvent) && sIPRequest.getCallId().getCallId().equalsIgnoreCase(sIPClientTransaction2.getOriginalRequestCallId())) {
                                    if (!isDeliverUnsolicitedNotify()) {
                                        sIPClientTransaction2.acquireSem();
                                    }
                                    if (sIPClientTransaction == null) {
                                        sIPClientTransaction = sIPClientTransaction2;
                                    }
                                    if (sIPClientTransaction2.getOriginalRequest() != null && sIPRequest.getRequestURI().equals(sIPClientTransaction2.getOriginalRequest().getContactHeader().getAddress().getURI()) && (sIPClientTransaction2.getDefaultDialog() != null || sIPClientTransaction2.getDialog(dialogId) != null)) {
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("Tx compl conditions met." + sIPClientTransaction2);
                                        }
                                        sIPClientTransaction = sIPClientTransaction2;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("findSubscribeTransaction : returning " + sIPClientTransaction);
                    }
                    return sIPClientTransaction;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("event Header is null -- returning null");
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("findSubscribeTransaction : returning null");
                }
            } else if (logger.isLoggingEnabled(32)) {
                logger.logDebug("findSubscribeTransaction : returning null");
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("findSubscribeTransaction : returning " + ((Object) null));
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0123, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x013d, please report this as an issue */
    public SIPTransaction findTransaction(SIPMessage sIPMessage, boolean z) throws Throwable {
        StackLogger stackLogger;
        StringBuilder sb;
        SIPClientTransaction sIPClientTransaction;
        StackLogger stackLogger2;
        StringBuilder sb2;
        Object obj = null;
        sIPTransaction = null;
        SIPTransaction sIPTransaction = null;
        try {
            try {
                if (z) {
                    if (sIPMessage.getTopmostVia().getBranch() != null) {
                        String transactionId = sIPMessage.getTransactionId();
                        sIPClientTransaction = this.serverTransactionTable.get(transactionId);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("serverTx: looking for key " + transactionId + " existing=" + this.serverTransactionTable);
                        }
                        if (transactionId.startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                            if (logger.isLoggingEnabled(32)) {
                                stackLogger2 = logger;
                                sb2 = new StringBuilder("findTransaction: returning  : ");
                                sb2.append(sIPClientTransaction);
                                stackLogger2.logDebug(sb2.toString());
                            }
                            return sIPClientTransaction;
                        }
                        sIPTransaction = sIPClientTransaction;
                    }
                    for (SIPClientTransaction sIPClientTransaction2 : this.serverTransactionTable.values()) {
                        if (sIPClientTransaction2.isMessagePartOfTransaction(sIPMessage)) {
                            if (logger.isLoggingEnabled(32)) {
                                stackLogger = logger;
                                sb = new StringBuilder("findTransaction: returning  : ");
                                sb.append(sIPClientTransaction2);
                                stackLogger.logDebug(sb.toString());
                            }
                            return sIPClientTransaction2;
                        }
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("findTransaction: returning  : " + sIPTransaction);
                    }
                    return sIPTransaction;
                }
                if (sIPMessage.getTopmostVia().getBranch() != null) {
                    String transactionId2 = sIPMessage.getTransactionId();
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("clientTx: looking for key " + transactionId2);
                    }
                    sIPClientTransaction = this.clientTransactionTable.get(transactionId2);
                    if (transactionId2.startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                        if (!logger.isLoggingEnabled(32)) {
                            return sIPClientTransaction;
                        }
                        stackLogger2 = logger;
                        sb2 = new StringBuilder("findTransaction: returning  : ");
                        sb2.append(sIPClientTransaction);
                        stackLogger2.logDebug(sb2.toString());
                        return sIPClientTransaction;
                    }
                    sIPTransaction = sIPClientTransaction;
                }
                for (SIPClientTransaction sIPClientTransaction3 : this.clientTransactionTable.values()) {
                    if (sIPClientTransaction3.isMessagePartOfTransaction(sIPMessage)) {
                        if (!logger.isLoggingEnabled(32)) {
                            return sIPClientTransaction3;
                        }
                        stackLogger = logger;
                        sb = new StringBuilder("findTransaction: returning  : ");
                        sb.append(sIPClientTransaction3);
                        stackLogger.logDebug(sb.toString());
                        return sIPClientTransaction3;
                    }
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("findTransaction: returning  : " + sIPTransaction);
                }
                return sIPTransaction;
            } catch (Throwable th) {
                th = th;
                obj = "clientTx: looking for key ";
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("findTransaction: returning  : " + obj);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("findTransaction: returning  : " + obj);
            }
            throw th;
        }
    }

    public SIPServerTransaction findTransactionPendingAck(SIPRequest sIPRequest) {
        return this.terminatedServerTransactionsPendingAck.get(sIPRequest.getTopmostVia().getBranch());
    }

    public int getAckTimeoutFactor() {
        if (getSipListener() == null || !(getSipListener() instanceof SipListenerExt)) {
            return 64;
        }
        return this.dialogTimeoutFactor;
    }

    public int getActiveClientTransactionCount() {
        return this.activeClientTransactionCount.get();
    }

    public AddressResolver getAddressResolver() {
        return this.addressResolver;
    }

    public ClientAuthType getClientAuth() {
        return this.clientAuth;
    }

    public int getClientTransactionTableSize() {
        return this.clientTransactionTable.size();
    }

    public int getConnectionLingerTimer() {
        return connectionLingerTimer;
    }

    public SIPDialog getDialog(String str) {
        SIPDialog sIPDialog = this.dialogTable.get(str);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("getDialog(" + str + ") : returning " + sIPDialog);
        }
        return sIPDialog;
    }

    public Collection<Dialog> getDialogs(DialogState dialogState) {
        HashSet hashSet = new HashSet();
        if (DialogState.EARLY.equals(dialogState)) {
            hashSet.addAll(this.earlyDialogTable.values());
            return hashSet;
        }
        for (SIPDialog sIPDialog : this.dialogTable.values()) {
            if (sIPDialog.getState() != null && sIPDialog.getState().equals(dialogState)) {
                hashSet.add(sIPDialog);
            }
        }
        return hashSet;
    }

    public SIPDialog getEarlyDialog(String str) {
        SIPDialog sIPDialog = this.earlyDialogTable.get(str);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("getEarlyDialog(" + str + ") : returning " + sIPDialog);
        }
        return sIPDialog;
    }

    public int getEarlyDialogTimeout() {
        return this.earlyDialogTimeout;
    }

    public SIPClientTransaction getForkedTransaction(String str) {
        return this.forkedClientTransactionTable.get(str);
    }

    public String getHostAddress() {
        return this.stackAddress;
    }

    public Dialog getJoinDialog(JoinHeader joinHeader) {
        String callId = joinHeader.getCallId();
        String fromTag = joinHeader.getFromTag();
        String toTag = joinHeader.getToTag();
        StringBuilder sb = new StringBuilder(callId);
        if (toTag != null) {
            sb.append(Separators.COLON);
            sb.append(toTag);
        }
        if (fromTag != null) {
            sb.append(Separators.COLON);
            sb.append(fromTag);
        }
        return this.dialogTable.get(sb.toString().toLowerCase());
    }

    public SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        if (!(getMessageProcessorFactory() instanceof NioMessageProcessorFactory)) {
            return this.ioHandler.getLocalAddressForTcpDst(inetAddress, i, inetAddress2, i2);
        }
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            if (ListeningPoint.TCP.equals(messageProcessor.getTransport())) {
                return ((NioTcpMessageChannel) messageProcessor.createMessageChannel(inetAddress, i)).socketChannel.socket().getLocalSocketAddress();
            }
        }
        return null;
    }

    public SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i, InetAddress inetAddress2) {
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            if (messageProcessor instanceof TLSMessageProcessor) {
                return this.ioHandler.getLocalAddressForTlsDst(inetAddress, i, inetAddress2, (TLSMessageChannel) messageProcessor.createMessageChannel(inetAddress, i));
            }
            if (messageProcessor instanceof NioTlsMessageProcessor) {
                return ((NioTlsMessageChannel) messageProcessor.createMessageChannel(inetAddress, i)).socketChannel.socket().getLocalSocketAddress();
            }
        }
        return null;
    }

    public int getMaxForkTime() {
        return this.maxForkTime;
    }

    public int getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public int getMaxTxLifetimeInvite() {
        return this.maxTxLifetimeInvite;
    }

    public int getMaxTxLifetimeNonInvite() {
        return this.maxTxLifetimeNonInvite;
    }

    public MessageParserFactory getMessageParserFactory() {
        return this.messageParserFactory;
    }

    public MessageProcessorFactory getMessageProcessorFactory() {
        return this.messageProcessorFactory;
    }

    public MessageProcessor[] getMessageProcessors() {
        return (MessageProcessor[]) this.messageProcessors.toArray(new MessageProcessor[0]);
    }

    public long getMinKeepAliveInterval() {
        return this.minKeepAliveInterval;
    }

    public NetworkLayer getNetworkLayer() {
        NetworkLayer networkLayer = this.networkLayer;
        return networkLayer == null ? DefaultNetworkLayer.SINGLETON : networkLayer;
    }

    public Hop getNextHop(SIPRequest sIPRequest) {
        if (this.useRouterForAll) {
            Router router = this.router;
            if (router != null) {
                return router.getNextHop(sIPRequest);
            }
            return null;
        }
        if (sIPRequest.getRequestURI().isSipURI() || sIPRequest.getRouteHeaders() != null) {
            return this.defaultRouter.getNextHop(sIPRequest);
        }
        Router router2 = this.router;
        if (router2 != null) {
            return router2.getNextHop(sIPRequest);
        }
        return null;
    }

    public int getReceiveUdpBufferSize() {
        return this.receiveUdpBufferSize;
    }

    public ExecutorService getReinviteExecutor() {
        return this.reinviteExecutor;
    }

    public ReleaseReferencesStrategy getReleaseReferencesStrategy() {
        return this.releaseReferencesStrategy;
    }

    public int getReliableConnectionKeepAliveTimeout() {
        return this.reliableConnectionKeepAliveTimeout;
    }

    public Dialog getReplacesDialog(ReplacesHeader replacesHeader) {
        String callId = replacesHeader.getCallId();
        String fromTag = replacesHeader.getFromTag();
        String toTag = replacesHeader.getToTag();
        for (SIPDialog sIPDialog : this.dialogTable.values()) {
            if (sIPDialog.getCallId().getCallId().equals(callId) && fromTag.equalsIgnoreCase(sIPDialog.lastResponseFromTag) && toTag.equalsIgnoreCase(sIPDialog.lastResponseToTag)) {
                return sIPDialog;
            }
        }
        StringBuilder sb = new StringBuilder(callId);
        if (toTag != null) {
            sb.append(Separators.COLON);
            sb.append(toTag);
        }
        if (fromTag != null) {
            sb.append(Separators.COLON);
            sb.append(fromTag);
        }
        String lowerCase = sb.toString().toLowerCase();
        if (logger.isLoggingEnabled(32)) {
            b1j.x("Looking for dialog ", lowerCase, logger);
        }
        SIPDialog sIPDialog2 = this.dialogTable.get(lowerCase);
        if (sIPDialog2 == null) {
            for (SIPClientTransaction sIPClientTransaction : this.clientTransactionTable.values()) {
                if (sIPClientTransaction.getDialog(lowerCase) != null) {
                    return sIPClientTransaction.getDialog(lowerCase);
                }
            }
        }
        return sIPDialog2;
    }

    public SIPServerTransaction getRetransmissionAlertTransaction(String str) {
        return this.retransmissionAlertTransactions.get(str);
    }

    public Router getRouter(SIPRequest sIPRequest) {
        if (sIPRequest.getRequestLine() == null) {
            return this.defaultRouter;
        }
        if (this.useRouterForAll) {
            return this.router;
        }
        if (sIPRequest.getRequestURI().getScheme().equals("sip") || sIPRequest.getRequestURI().getScheme().equals("sips")) {
            return this.defaultRouter;
        }
        Router router = this.router;
        return router != null ? router : this.defaultRouter;
    }

    public ScheduledExecutorService getSelfRoutingThreadpoolExecutor() {
        ScheduledExecutorService scheduledExecutorService = selfRoutingThreadpoolExecutor;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        if (this.threadPoolSize <= 0) {
            ThreadAffinityExecutor threadAffinityExecutor = new ThreadAffinityExecutor(16);
            selfRoutingThreadpoolExecutor = threadAffinityExecutor;
            return threadAffinityExecutor;
        }
        ThreadAffinityExecutor threadAffinityExecutor2 = new ThreadAffinityExecutor(this.threadPoolSize);
        selfRoutingThreadpoolExecutor = threadAffinityExecutor2;
        return threadAffinityExecutor2;
    }

    public int getSendUdpBufferSize() {
        return this.sendUdpBufferSize;
    }

    public ServerLogger getServerLogger() {
        return this.serverLogger;
    }

    public int getServerTransactionTableSize() {
        return this.serverTransactionTable.size();
    }

    public abstract SipListener getSipListener();

    public long getSslHandshakeTimeout() {
        return this.sslHandshakeTimeout;
    }

    public int getStackCongestionControlTimeout() {
        return this.stackCongestionControlTimeout;
    }

    @Deprecated
    public StackLogger getStackLogger() {
        return logger;
    }

    public int getTcpPostParsingThreadPoolSize() {
        return this.tcpPostParsingThreadPoolSize;
    }

    public ThreadAuditor getThreadAuditor() {
        return this.threadAuditor;
    }

    public int getThreadPriority() {
        return this.threadPriority;
    }

    public SipTimer getTimer() {
        return this.timer;
    }

    public boolean isAggressiveCleanup() {
        return this.releaseReferencesStrategy != ReleaseReferencesStrategy.None;
    }

    public boolean isAlive() {
        return !this.toExit;
    }

    public boolean isCancelClientTransactionChecked() {
        return this.cancelClientTransactionChecked;
    }

    public boolean isDeliverRetransmittedAckToListener() {
        return this.deliverRetransmittedAckToListener;
    }

    public boolean isDeliverTerminatedEventForAck() {
        return this.deliverTerminatedEventForAck;
    }

    public boolean isDeliverUnsolicitedNotify() {
        return this.deliverUnsolicitedNotify;
    }

    public boolean isEventForked(String str) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbT = kng0.t("isEventForked: ", str, " returning ");
            sbT.append(this.forkedEvents.contains(str));
            stackLogger.logDebug(sbT.toString());
        }
        return this.forkedEvents.contains(str);
    }

    public boolean isLogStackTraceOnMessageSend() {
        return this.logStackTraceOnMessageSend;
    }

    @Deprecated
    public boolean isLoggingEnabled() {
        StackLogger stackLogger = logger;
        if (stackLogger == null) {
            return false;
        }
        return stackLogger.isLoggingEnabled();
    }

    public boolean isNon2XXAckPassedToListener() {
        return this.non2XXAckPassedToListener;
    }

    public boolean isPatchReceivedRport() {
        return this.patchReceivedRport;
    }

    public boolean isPatchRport() {
        return this.patchRport;
    }

    public boolean isPatchWebSocketHeaders() {
        return this.patchWebSocketHeaders;
    }

    public boolean isRemoteTagReassignmentAllowed() {
        return this.remoteTagReassignmentAllowed;
    }

    public boolean isRfc2543Supported() {
        return this.rfc2543Supported;
    }

    public boolean isSslRenegotiationEnabled() {
        return this.sslRenegotiationEnabled;
    }

    public boolean isTransactionPendingAck(SIPServerTransaction sIPServerTransaction) {
        return this.terminatedServerTransactionsPendingAck.contains(((SIPRequest) sIPServerTransaction.getRequest()).getTopmostVia().getBranch());
    }

    public void mapTransaction(SIPServerTransaction sIPServerTransaction) {
        if (sIPServerTransaction.isTransactionMapped()) {
            return;
        }
        addTransactionHash(sIPServerTransaction);
        sIPServerTransaction.setTransactionMapped(true);
    }

    public ServerRequestInterface newSIPServerRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        String transactionId = sIPRequest.getTransactionId();
        sIPRequest.setMessageChannel(messageChannel);
        if (this.sipMessageValves.size() != 0) {
            try {
                for (SIPMessageValve sIPMessageValve : this.sipMessageValves) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Checking SIP message valve " + sIPMessageValve + " for Request = " + sIPRequest.getFirstLine());
                    }
                    if (!sIPMessageValve.processRequest(sIPRequest, messageChannel)) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Request dropped by the SIP message valve. Request = " + sIPRequest);
                        }
                        return null;
                    }
                }
            } catch (Exception e) {
                if (logger.isLoggingEnabled(4)) {
                    logger.logError("An issue happening the valve on request " + sIPRequest + " thus the message will not be processed further", e);
                }
                return null;
            }
        }
        SIPServerTransaction sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) findTransaction(transactionId, true);
        if (sIPServerTransactionCreateServerTransaction == null || !sIPServerTransactionCreateServerTransaction.isMessagePartOfTransaction(sIPRequest)) {
            if (transactionId.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                sIPServerTransactionCreateServerTransaction = null;
            } else {
                Iterator<SIPServerTransaction> it = this.serverTransactionTable.values().iterator();
                SIPServerTransaction sIPServerTransaction = null;
                while (it.hasNext() && sIPServerTransaction == null) {
                    SIPServerTransaction next = it.next();
                    if (next.isMessagePartOfTransaction(sIPRequest)) {
                        sIPServerTransaction = next;
                    }
                }
                sIPServerTransactionCreateServerTransaction = sIPServerTransaction;
            }
            if (sIPServerTransactionCreateServerTransaction == null) {
                SIPServerTransaction sIPServerTransactionFindPendingTransaction = findPendingTransaction(transactionId);
                if (sIPServerTransactionFindPendingTransaction != null) {
                    sIPRequest.setTransaction(sIPServerTransactionFindPendingTransaction);
                    if (sIPServerTransactionFindPendingTransaction.acquireSem()) {
                        return sIPServerTransactionFindPendingTransaction;
                    }
                    return null;
                }
                sIPServerTransactionCreateServerTransaction = createServerTransaction(messageChannel);
                if (sIPServerTransactionCreateServerTransaction != null) {
                    sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                    sIPRequest.setTransaction(sIPServerTransactionCreateServerTransaction);
                }
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("newSIPServerRequest( " + sIPRequest.getMethod() + Separators.COLON + sIPRequest.getTopmostVia().getBranch() + "):" + sIPServerTransactionCreateServerTransaction);
        }
        if (sIPServerTransactionCreateServerTransaction != null) {
            sIPServerTransactionCreateServerTransaction.setRequestInterface(this.sipMessageFactory.newSIPServerRequest(sIPRequest, sIPServerTransactionCreateServerTransaction));
        }
        if (sIPServerTransactionCreateServerTransaction != null && sIPServerTransactionCreateServerTransaction.acquireSem()) {
            return sIPServerTransactionCreateServerTransaction;
        }
        if (sIPServerTransactionCreateServerTransaction != null) {
            try {
                if (sIPServerTransactionCreateServerTransaction.isMessagePartOfTransaction(sIPRequest) && sIPServerTransactionCreateServerTransaction.getMethod().equals(sIPRequest.getMethod())) {
                    SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(100);
                    sIPResponseCreateResponse.removeContent();
                    sIPServerTransactionCreateServerTransaction.getMessageChannel().sendMessage(sIPResponseCreateResponse);
                }
            } catch (Exception unused) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Exception occured sending TRYING");
                }
            }
        }
        return null;
    }

    public ServerResponseInterface newSIPServerResponse(SIPResponse sIPResponse, MessageChannel messageChannel) {
        if (this.sipMessageValves.size() != 0) {
            try {
                Iterator<SIPMessageValve> it = this.sipMessageValves.iterator();
                while (it.hasNext()) {
                    if (!it.next().processResponse(sIPResponse, messageChannel)) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Response dropped by the SIP message valve. Response = " + sIPResponse);
                        }
                        return null;
                    }
                }
            } catch (Exception e) {
                if (logger.isLoggingEnabled(4)) {
                    logger.logError("An issue happening the valve on response " + sIPResponse + " thus the message will not be processed further", e);
                }
                return null;
            }
        }
        String transactionId = sIPResponse.getTransactionId();
        SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) findTransaction(transactionId, false);
        if (sIPClientTransaction == null || (!sIPClientTransaction.isMessagePartOfTransaction(sIPResponse) && !transactionId.startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE))) {
            Iterator<SIPClientTransaction> it2 = this.clientTransactionTable.values().iterator();
            sIPClientTransaction = null;
            while (it2.hasNext() && sIPClientTransaction == null) {
                SIPClientTransaction next = it2.next();
                if (next.isMessagePartOfTransaction(sIPResponse)) {
                    sIPClientTransaction = next;
                }
            }
            if (sIPClientTransaction == null) {
                if (logger.isLoggingEnabled(16)) {
                    messageChannel.logResponse(sIPResponse, System.currentTimeMillis(), "before processing");
                }
                return this.sipMessageFactory.newSIPServerResponse(sIPResponse, messageChannel);
            }
        }
        boolean zAcquireSem = sIPClientTransaction.acquireSem();
        if (logger.isLoggingEnabled(16)) {
            sIPClientTransaction.getMessageChannel().logResponse(sIPResponse, System.currentTimeMillis(), "before processing");
        }
        if (zAcquireSem) {
            ServerResponseInterface serverResponseInterfaceNewSIPServerResponse = this.sipMessageFactory.newSIPServerResponse(sIPResponse, sIPClientTransaction.getMessageChannel());
            if (serverResponseInterfaceNewSIPServerResponse == null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("returning null - serverResponseInterface is null!");
                }
                sIPClientTransaction.releaseSem();
                return null;
            }
            sIPClientTransaction.setResponseInterface(serverResponseInterfaceNewSIPServerResponse);
        } else {
            logger.logWarning("Application is blocked -- could not acquire semaphore -- dropping response");
        }
        if (zAcquireSem) {
            return sIPClientTransaction;
        }
        return null;
    }

    public void printDialogTable() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("dialog table  = " + this.dialogTable);
        }
    }

    public SIPDialog putDialog(SIPDialog sIPDialog) {
        String dialogId = sIPDialog.getDialogId();
        if (this.dialogTable.containsKey(dialogId)) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                StringBuilder sbT = kng0.t("putDialog: dialog already exists", dialogId, " in table = ");
                sbT.append(this.dialogTable.get(dialogId));
                stackLogger.logDebug(sbT.toString());
            }
            return this.dialogTable.get(dialogId);
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("putDialog dialogId=" + dialogId + " dialog = " + sIPDialog);
        }
        sIPDialog.setStack(this);
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
        }
        this.dialogTable.put(dialogId, sIPDialog);
        putMergeDialog(sIPDialog);
        return sIPDialog;
    }

    public void putInMergeTable(SIPServerTransaction sIPServerTransaction, SIPRequest sIPRequest) {
        String mergeId = sIPRequest.getMergeId();
        if (mergeId != null) {
            this.mergeTable.put(mergeId, sIPServerTransaction);
        }
    }

    public void putMergeDialog(SIPDialog sIPDialog) {
        String mergeId;
        if (sIPDialog == null || (mergeId = sIPDialog.getMergeId()) == null) {
            return;
        }
        this.serverDialogMergeTestTable.put(mergeId, sIPDialog);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("put Dialog " + sIPDialog + " in serverDialogMerge table with Merge Dialog Id " + mergeId);
        }
    }

    public void putPendingTransaction(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("putPendingTransaction: " + sIPServerTransaction);
        }
        this.pendingTransactions.put(sIPServerTransaction.getTransactionId(), sIPServerTransaction);
    }

    public void reInit() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Re-initializing !");
        }
        this.messageProcessors = new CopyOnWriteArrayList();
        this.ioHandler = new IOHandler(this);
        this.pendingTransactions = new ConcurrentHashMap<>();
        this.clientTransactionTable = new ConcurrentHashMap<>();
        this.serverTransactionTable = new ConcurrentHashMap<>();
        this.retransmissionAlertTransactions = new ConcurrentHashMap<>();
        this.mergeTable = new ConcurrentHashMap<>();
        this.dialogTable = new ConcurrentHashMap<>();
        this.earlyDialogTable = new ConcurrentHashMap<>();
        this.serverDialogMergeTestTable = new ConcurrentHashMap<>();
        this.terminatedServerTransactionsPendingAck = new ConcurrentHashMap<>();
        this.forkedClientTransactionTable = new ConcurrentHashMap<>();
        this.activeClientTransactionCount = new AtomicInteger(0);
    }

    public void removeDialog(SIPDialog sIPDialog) {
        String dialogId = sIPDialog.getDialogId();
        String earlyDialogId = sIPDialog.getEarlyDialogId();
        if (earlyDialogId != null) {
            this.earlyDialogTable.remove(earlyDialogId);
            this.dialogTable.remove(earlyDialogId);
        }
        removeMergeDialog(sIPDialog.getMergeId());
        if (dialogId == null) {
            if (!this.isDialogTerminatedEventDeliveredForNullDialog || sIPDialog.testAndSetIsDialogTerminatedEventDelivered()) {
                return;
            }
            sIPDialog.getSipProvider().handleEvent(new DialogTerminatedEvent(sIPDialog.getSipProvider(), sIPDialog), null);
            return;
        }
        if (this.dialogTable.get(dialogId) == sIPDialog) {
            this.dialogTable.remove(dialogId);
        }
        if (sIPDialog.testAndSetIsDialogTerminatedEventDelivered()) {
            return;
        }
        sIPDialog.getSipProvider().handleEvent(new DialogTerminatedEvent(sIPDialog.getSipProvider(), sIPDialog), null);
    }

    public void removeFromMergeTable(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Removing tx from merge table ");
        }
        String mergeId = sIPServerTransaction.getMergeId();
        if (mergeId != null) {
            this.mergeTable.remove(mergeId);
        }
    }

    public void removeMergeDialog(String str) {
        if (str != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Tyring to remove Dialog from serverDialogMerge table with Merge Dialog Id ".concat(str));
            }
            SIPDialog sIPDialogRemove = this.serverDialogMergeTestTable.remove(str);
            if (!logger.isLoggingEnabled(32) || sIPDialogRemove == null) {
                return;
            }
            logger.logDebug("removed Dialog " + sIPDialogRemove + " from serverDialogMerge table with Merge Dialog Id " + str);
        }
    }

    public void removeMessageProcessor(MessageProcessor messageProcessor) {
        if (this.messageProcessors.remove(messageProcessor)) {
            messageProcessor.stop();
        }
    }

    public void removePendingTransaction(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("removePendingTx: " + sIPServerTransaction.getTransactionId());
        }
        this.pendingTransactions.remove(sIPServerTransaction.getTransactionId());
    }

    public void removeTransaction(SIPTransaction sIPTransaction) {
        Object objRemove;
        SIPClientTransaction sIPClientTransaction;
        String forkId;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("removeTransaction: Removing Transaction = " + sIPTransaction.getTransactionId() + " transaction = " + sIPTransaction);
        }
        try {
            if (sIPTransaction instanceof SIPServerTransaction) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                }
                objRemove = this.serverTransactionTable.remove(sIPTransaction.getTransactionId());
                String method = sIPTransaction.getMethod();
                removePendingTransaction((SIPServerTransaction) sIPTransaction);
                removeTransactionPendingAck((SIPServerTransaction) sIPTransaction);
                if (method.equalsIgnoreCase("INVITE")) {
                    removeFromMergeTable((SIPServerTransaction) sIPTransaction);
                }
                SipProviderImpl sipProvider = sIPTransaction.getSipProvider();
                if (objRemove != null && sIPTransaction.testAndSetTransactionTerminatedEvent()) {
                    sipProvider.handleEvent(new TransactionTerminatedEvent(sipProvider, (ServerTransaction) sIPTransaction), sIPTransaction);
                }
            } else {
                String transactionId = sIPTransaction.getTransactionId();
                objRemove = this.clientTransactionTable.remove(transactionId);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("REMOVED client tx " + objRemove + " KEY = " + transactionId);
                }
                if (objRemove != null && (forkId = (sIPClientTransaction = (SIPClientTransaction) objRemove).getForkId()) != null && sIPClientTransaction.isInviteTransaction() && this.maxForkTime != 0) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Scheduling to remove forked client transaction : forkId = " + forkId + " in " + this.maxForkTime + " seconds");
                    }
                    this.timer.schedule(new RemoveForkedTransactionTimerTask(forkId), this.maxForkTime * 1000);
                    sIPClientTransaction.stopExpiresTimer();
                }
                if (objRemove != null && sIPTransaction.testAndSetTransactionTerminatedEvent()) {
                    SipProviderImpl sipProvider2 = sIPTransaction.getSipProvider();
                    sipProvider2.handleEvent(new TransactionTerminatedEvent(sipProvider2, (ClientTransaction) sIPTransaction), sIPTransaction);
                }
            }
            if (objRemove != null) {
                SIPTransaction sIPTransaction2 = (SIPTransaction) objRemove;
            }
        } finally {
            if (0 != 0) {
                ((SIPTransaction) null).cancelMaxTxLifeTimeTimer();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(String.format("removeTransaction: Table size :  clientTransactionTable %d  serverTransactionTable %d  mergetTable %d  terminatedServerTransactionsPendingAck %d   forkedClientTransactionTable %d  pendingTransactions %d ", Integer.valueOf(this.clientTransactionTable.size()), Integer.valueOf(this.serverTransactionTable.size()), Integer.valueOf(this.mergeTable.size()), Integer.valueOf(this.terminatedServerTransactionsPendingAck.size()), Integer.valueOf(this.forkedClientTransactionTable.size()), Integer.valueOf(this.pendingTransactions.size())));
            }
        }
    }

    public void removeTransactionHash(SIPTransaction sIPTransaction) {
        Object objRemove;
        if (sIPTransaction.getOriginalRequest() == null) {
            return;
        }
        if (sIPTransaction instanceof SIPClientTransaction) {
            String transactionId = sIPTransaction.getTransactionId();
            if (logger.isLoggingEnabled(32)) {
                logger.logStackTrace();
                b1j.x("removing client Tx : ", transactionId, logger);
            }
            objRemove = this.clientTransactionTable.remove(transactionId);
        } else if (sIPTransaction instanceof SIPServerTransaction) {
            String transactionId2 = sIPTransaction.getTransactionId();
            objRemove = this.serverTransactionTable.remove(transactionId2);
            if (logger.isLoggingEnabled(32)) {
                b1j.x("removing server Tx : ", transactionId2, logger);
            }
        } else {
            objRemove = null;
        }
        if (objRemove != null) {
            ((SIPTransaction) objRemove).cancelMaxTxLifeTimeTimer();
        }
    }

    public boolean removeTransactionPendingAck(SIPServerTransaction sIPServerTransaction) {
        String branchId = sIPServerTransaction.getBranchId();
        if (branchId == null || !this.terminatedServerTransactionsPendingAck.containsKey(branchId)) {
            return false;
        }
        this.terminatedServerTransactionsPendingAck.remove(branchId);
        return true;
    }

    public void setAddressResolver(AddressResolver addressResolver) {
        this.addressResolver = addressResolver;
    }

    public void setAggressiveCleanup(boolean z) {
        if (z) {
            this.releaseReferencesStrategy = ReleaseReferencesStrategy.Normal;
        } else {
            this.releaseReferencesStrategy = ReleaseReferencesStrategy.None;
        }
    }

    public void setClientAuth(ClientAuthType clientAuthType) {
        this.clientAuth = clientAuthType;
    }

    public void setConnectionLingerTimer(int i) {
        connectionLingerTimer = i;
    }

    public void setDeliverDialogTerminatedEventForNullDialog() {
        this.isDialogTerminatedEventDeliveredForNullDialog = true;
    }

    public void setDeliverTerminatedEventForAck(boolean z) {
        this.deliverTerminatedEventForAck = z;
    }

    public void setDeliverUnsolicitedNotify(boolean z) {
        this.deliverUnsolicitedNotify = z;
    }

    public void setEarlyDialogTimeout(int i) {
        this.earlyDialogTimeout = i;
    }

    public void setHostAddress(String str) {
        if (str.indexOf(58) == str.lastIndexOf(58) || str.trim().charAt(0) == '[') {
            this.stackAddress = str;
        } else {
            this.stackAddress = hne.l(']', "[", str);
        }
        this.stackInetAddress = InetAddress.getByName(str);
    }

    public boolean setKeepAliveTimeout(String str, int i, String str2, String str3, int i2, long j) {
        MessageProcessor messageProcessorFindMessageProcessor = findMessageProcessor(str, i, str2);
        if (messageProcessorFindMessageProcessor == null || !(messageProcessorFindMessageProcessor instanceof ConnectionOrientedMessageProcessor)) {
            return false;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder sbP = kng0.p(i, "~~~ Trying to find MessageChannel and set new KeepAliveTimeout( myAddress=", str, ", myPort=", ", transport=");
            f140.v(sbP, str2, ", peerAddress=", str3, ", peerPort=");
            sbP.append(i2);
            sbP.append(", keepAliveTimeout=");
            sbP.append(j);
            sbP.append("), MessageProcessor=");
            sbP.append(messageProcessorFindMessageProcessor);
            stackLogger.logDebug(sbP.toString());
        }
        return ((ConnectionOrientedMessageProcessor) messageProcessorFindMessageProcessor).setKeepAliveTimeout(str3, i2, j);
    }

    public void setLogRecordFactory(LogRecordFactory logRecordFactory) {
        this.logRecordFactory = logRecordFactory;
    }

    public void setLogStackTraceOnMessageSend(boolean z) {
        this.logStackTraceOnMessageSend = z;
    }

    public void setMaxConnections(int i) {
        this.maxConnections = i;
    }

    public void setMaxForkTime(int i) {
        this.maxForkTime = i;
    }

    public void setMaxTxLifetimeInvite(int i) {
        this.maxTxLifetimeInvite = i;
    }

    public void setMaxTxLifetimeNonInvite(int i) {
        this.maxTxLifetimeNonInvite = i;
    }

    public void setMessageFactory(StackMessageFactory stackMessageFactory) {
        this.sipMessageFactory = stackMessageFactory;
    }

    public void setMessageParserFactory(MessageParserFactory messageParserFactory) {
        this.messageParserFactory = messageParserFactory;
    }

    public void setMessageProcessorFactory(MessageProcessorFactory messageProcessorFactory) {
        this.messageProcessorFactory = messageProcessorFactory;
    }

    public void setNon2XXAckPassedToListener(boolean z) {
        this.non2XXAckPassedToListener = z;
    }

    public void setPatchReceivedRport(boolean z) {
        this.patchReceivedRport = z;
    }

    public void setPatchRport(Boolean bool) {
        this.patchRport = bool.booleanValue();
    }

    public void setPatchWebSocketHeaders(Boolean bool) {
        this.patchWebSocketHeaders = bool.booleanValue();
    }

    public void setReceiveUdpBufferSize(int i) {
        this.receiveUdpBufferSize = i;
    }

    public void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy) {
        this.releaseReferencesStrategy = releaseReferencesStrategy;
    }

    public void setReliableConnectionKeepAliveTimeout(int i) {
        if (i == 0) {
            if (logger.isLoggingEnabled(16)) {
                logger.logInfo("Default value (840000 ms) will be used for reliableConnectionKeepAliveTimeout stack property");
            }
            i = 840000;
        }
        if (logger.isLoggingEnabled(16)) {
            logger.logInfo("value " + i + " will be used for reliableConnectionKeepAliveTimeout stack property");
        }
        this.reliableConnectionKeepAliveTimeout = i;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public void setSendUdpBufferSize(int i) {
        this.sendUdpBufferSize = i;
    }

    public void setSingleThreaded() {
        this.threadPoolSize = 1;
    }

    public void setSslHandshakeTimeout(long j) {
        this.sslHandshakeTimeout = j;
    }

    public void setSslRenegotiationEnabled(boolean z) {
        this.sslRenegotiationEnabled = z;
    }

    public void setStackCongestionControlTimeout(int i) {
        this.stackCongestionControlTimeout = i;
    }

    public void setStackName(String str) {
        this.stackName = str;
    }

    public void setTcpPostParsingThreadPoolSize(int i) {
        this.tcpPostParsingThreadPoolSize = i;
    }

    public void setThreadPoolSize(int i) {
        this.threadPoolSize = i;
    }

    public void setThreadPriority(int i) {
        if (i < 1) {
            jf4.o("The Stack Thread Priority shouldn't be lower than Thread.MIN_PRIORITY");
            return;
        }
        if (i > 10) {
            jf4.o("The Stack Thread Priority shouldn't be higher than Thread.MAX_PRIORITY");
            return;
        }
        if (logger.isLoggingEnabled(16)) {
            logger.logInfo("Setting Stack Thread priority to " + i);
        }
        this.threadPriority = i;
    }

    public void setTimer(SipTimer sipTimer) {
        this.timer = sipTimer;
    }

    public void stopStack() {
        this.toExit = true;
        this.pendingTransactions.clear();
        synchronized (this) {
            notifyAll();
        }
        synchronized (this.clientTransactionTable) {
            this.clientTransactionTable.notifyAll();
        }
        ScheduledExecutorService scheduledExecutorService = selfRoutingThreadpoolExecutor;
        if (scheduledExecutorService != null && scheduledExecutorService != null) {
            selfRoutingThreadpoolExecutor.shutdown();
        }
        selfRoutingThreadpoolExecutor = null;
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            removeMessageProcessor(messageProcessor);
        }
        closeAllSockets();
        SipTimer sipTimer = this.timer;
        if (sipTimer != null) {
            sipTimer.stop();
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
        this.clientTransactionTable.clear();
        this.serverTransactionTable.clear();
        this.dialogTable.clear();
        this.serverLogger.closeLogFile();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionEventListener
    public synchronized void transactionErrorEvent(SIPTransactionErrorEvent sIPTransactionErrorEvent) {
        try {
            SIPTransaction sIPTransaction = (SIPTransaction) sIPTransactionErrorEvent.getSource();
            if (sIPTransactionErrorEvent.getErrorID() == 2) {
                sIPTransaction.setState(5);
                if (sIPTransaction instanceof SIPServerTransaction) {
                    ((SIPServerTransaction) sIPTransaction).setCollectionTime(0);
                }
                sIPTransaction.disableTimeoutTimer();
                sIPTransaction.disableRetransmissionTimer();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public boolean isLoggingEnabled(int i) {
        StackLogger stackLogger = logger;
        if (stackLogger == null) {
            return false;
        }
        return stackLogger.isLoggingEnabled(i);
    }

    public void addTransaction(SIPClientTransaction sIPClientTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("added transaction " + sIPClientTransaction);
        }
        addTransactionHash(sIPClientTransaction);
    }

    public Router getRouter() {
        return this.router;
    }

    public Collection<Dialog> getDialogs() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.dialogTable.values());
        hashSet.addAll(this.earlyDialogTable.values());
        return hashSet;
    }

    public void removeDialog(String str) {
        if (logger.isLoggingEnabled()) {
            logger.logWarning("Silently removing dialog from table");
        }
        this.dialogTable.remove(str);
    }

    public SIPDialog createDialog(SIPTransaction sIPTransaction) {
        if (sIPTransaction instanceof SIPClientTransaction) {
            String dialogId = ((SIPRequest) sIPTransaction.getRequest()).getDialogId(false);
            if (logger.isLoggingEnabled(32)) {
                b1j.x("createDialog dialogId=", dialogId, logger);
            }
            if (this.earlyDialogTable.get(dialogId) != null) {
                SIPDialog sIPDialog = this.earlyDialogTable.get(dialogId);
                if (sIPDialog.getState() != null && sIPDialog.getState() != DialogState.EARLY) {
                    SIPDialog sIPDialog2 = new SIPDialog(sIPTransaction);
                    this.earlyDialogTable.put(dialogId, sIPDialog2);
                    return sIPDialog2;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("createDialog early Dialog found : earlyDialogId=" + dialogId + " earlyDialog= " + sIPDialog);
                }
                return sIPDialog;
            }
            SIPDialog sIPDialog3 = new SIPDialog(sIPTransaction);
            this.earlyDialogTable.put(dialogId, sIPDialog3);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("createDialog early Dialog not found : earlyDialogId=" + dialogId + " created one " + sIPDialog3);
            }
            return sIPDialog3;
        }
        return new SIPDialog(sIPTransaction);
    }

    public SIPDialog createDialog(SipProviderImpl sipProviderImpl, SIPResponse sIPResponse) {
        return new SIPDialog(sipProviderImpl, sIPResponse);
    }

    public SIPDialog createDialog(SIPClientTransaction sIPClientTransaction, SIPTransaction sIPTransaction) {
        return new SIPDialog(sIPClientTransaction, sIPTransaction);
    }

    public SIPTransactionStack(StackMessageFactory stackMessageFactory) {
        this();
        this.sipMessageFactory = stackMessageFactory;
    }

    public SIPTransaction findTransaction(String str, boolean z) {
        if (z) {
            return this.serverTransactionTable.get(str);
        }
        return this.clientTransactionTable.get(str);
    }
}
