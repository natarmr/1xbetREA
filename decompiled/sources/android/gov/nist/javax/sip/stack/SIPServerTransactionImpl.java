package android.gov.nist.javax.sip.stack;

import a.hny;
import a.v4i0;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.Expires;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.Dialog;
import android.javax.sip.DialogState;
import android.javax.sip.DialogTerminatedEvent;
import android.javax.sip.ListeningPoint;
import android.javax.sip.SipException;
import android.javax.sip.Timeout;
import android.javax.sip.TimeoutEvent;
import android.javax.sip.TransactionState;
import android.javax.sip.address.Hop;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class SIPServerTransactionImpl extends SIPTransactionImpl implements SIPServerTransaction {
    private SIPDialog dialog;
    protected String dialogId;
    private SIPServerTransaction inviteTransaction;
    protected boolean isAckSeen;
    private byte[] lastResponseAsBytes;
    private String lastResponseHost;
    private int lastResponsePort;
    private int lastResponseStatusCode;
    private String lastResponseTransport;
    private String originalRequestFromTag;
    private HostPort originalRequestSentBy;
    private long pendingReliableCSeqNumber;
    private long pendingReliableRSeqNumber;
    private byte[] pendingReliableResponseAsBytes;
    private String pendingReliableResponseMethod;
    private SIPClientTransaction pendingSubscribeTransaction;
    private Semaphore provisionalResponseSem;
    private ProvisionalResponseTask provisionalResponseTask;
    private transient ServerRequestInterface requestOf;
    private boolean retransmissionAlertEnabled;
    private RetransmissionAlertTimerTask retransmissionAlertTimerTask;
    private int rseqNumber;
    private Semaphore terminationSemaphore;
    private static StackLogger logger = CommonLogger.getLogger(SIPServerTransaction.class);
    private static boolean interlockProvisionalResponses = true;

    public class ProvisionalResponseTask extends SIPStackTimerTask {
        int ticks = 1;
        int ticksLeft = 1;

        public ProvisionalResponseTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            Request request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            if (sIPServerTransactionImpl.isTerminated()) {
                SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                return;
            }
            int i = this.ticksLeft - 1;
            this.ticksLeft = i;
            if (i == -1) {
                sIPServerTransactionImpl.fireReliableResponseRetransmissionTimer();
                int i2 = this.ticks * 2;
                this.ticksLeft = i2;
                this.ticks = i2;
                if (i2 >= 64) {
                    SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                    SIPServerTransactionImpl.this.setState(5);
                    SIPServerTransactionImpl.this.fireTimeoutTimer();
                }
            }
        }
    }

    public class RetransmissionAlertTimerTask extends SIPStackTimerTask {
        String dialogId;
        int ticks = 1;
        int ticksLeft = 1;

        public RetransmissionAlertTimerTask(String str) {
            this.dialogId = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            Request request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            int i = this.ticksLeft - 1;
            this.ticksLeft = i;
            if (i == -1) {
                sIPServerTransactionImpl.fireRetransmissionTimer();
                this.ticksLeft = this.ticks * 2;
            }
        }
    }

    public class SendTrying extends SIPStackTimerTask {
        public SendTrying() {
            if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                SIPServerTransactionImpl.logger.logDebug("scheduled timer for " + SIPServerTransactionImpl.this);
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            Request request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            int realState = sIPServerTransactionImpl.getRealState();
            if (realState < 0 || 1 == realState) {
                if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                    SIPServerTransactionImpl.logger.logDebug(" sending Trying current state = " + sIPServerTransactionImpl.getRealState());
                }
                try {
                    sIPServerTransactionImpl.sendMessage(sIPServerTransactionImpl.getOriginalRequest().createResponse(100, "Trying"));
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                        SIPServerTransactionImpl.logger.logDebug(" trying sent " + sIPServerTransactionImpl.getRealState());
                    }
                } catch (IOException unused) {
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled()) {
                        SIPServerTransactionImpl.logger.logError("IO error sending  TRYING");
                    }
                }
            }
        }
    }

    public class TransactionTimer extends SIPStackTimerTask {
        public TransactionTimer() {
            if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                SIPServerTransactionImpl.logger.logDebug("TransactionTimer() : " + SIPServerTransactionImpl.this.getTransactionId());
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            Request request = SIPServerTransactionImpl.this.getRequest();
            if (request == null || !(request instanceof SIPRequest)) {
                return null;
            }
            return ((SIPRequest) request).getCallIdHeader().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            boolean zIsTerminated = SIPServerTransactionImpl.this.isTerminated();
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            if (zIsTerminated) {
                try {
                    sIPServerTransactionImpl.sipStack.getTimer().cancel(this);
                } catch (IllegalStateException unused) {
                    if (!SIPServerTransactionImpl.this.sipStack.isAlive()) {
                        return;
                    }
                }
                SIPTransactionImpl.LingerTimer lingerTimer = new SIPTransactionImpl.LingerTimer();
                if (SIPServerTransactionImpl.this.sipStack.getConnectionLingerTimer() != 0) {
                    SIPServerTransactionImpl.this.sipStack.getTimer().schedule(lingerTimer, SIPServerTransactionImpl.this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    lingerTimer.runTask();
                }
            } else {
                sIPServerTransactionImpl.fireTimer();
            }
            SIPRequest sIPRequest = SIPServerTransactionImpl.this.originalRequest;
            if (sIPRequest != null) {
                sIPRequest.cleanUp();
            }
        }
    }

    public SIPServerTransactionImpl(SIPTransactionStack sIPTransactionStack, MessageChannel messageChannel) {
        super(sIPTransactionStack, messageChannel);
        this.rseqNumber = -1;
        this.provisionalResponseSem = new Semaphore(1);
        this.terminationSemaphore = new Semaphore(0);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Creating Server Transaction" + getBranchId());
            logger.logStackTrace();
        }
    }

    private boolean checkStateTimers(int i) {
        if (getRealState() == 1) {
            int i2 = i / 100;
            if (i2 == 1) {
                setState(2);
            } else if (200 <= i && i <= 699) {
                if (isInviteTransaction()) {
                    if (i2 == 2) {
                        disableRetransmissionTimer();
                        disableTimeoutTimer();
                        this.collectionTime = 64;
                        cleanUpOnTimer();
                        setState(5);
                        if (getDialog() != null) {
                            ((SIPDialog) getDialog()).setRetransmissionTicks();
                        }
                    } else {
                        setState(3);
                        if (!isReliable()) {
                            enableRetransmissionTimer();
                        }
                        cleanUpOnTimer();
                        enableTimeoutTimer(64);
                    }
                } else if (isReliable() || getInternalState() == 3) {
                    cleanUpOnTimer();
                    setState(5);
                    startTransactionTimerJ(0L);
                } else {
                    setState(3);
                    startTransactionTimerJ(64L);
                    cleanUpOnTimer();
                }
            }
        } else if (getRealState() == 2) {
            if (isInviteTransaction()) {
                if (i / 100 == 2) {
                    disableRetransmissionTimer();
                    disableTimeoutTimer();
                    this.collectionTime = 64;
                    cleanUpOnTimer();
                    setState(5);
                    if (getDialog() != null) {
                        ((SIPDialog) getDialog()).setRetransmissionTicks();
                    }
                } else if (300 <= i && i <= 699) {
                    setState(3);
                    if (!isReliable()) {
                        enableRetransmissionTimer();
                    }
                    cleanUpOnTimer();
                    enableTimeoutTimer(64);
                }
            } else if (200 <= i && i <= 699) {
                setState(3);
                if (isReliable()) {
                    setState(5);
                    startTransactionTimerJ(0L);
                } else {
                    disableRetransmissionTimer();
                    startTransactionTimerJ(64L);
                }
                cleanUpOnTimer();
            }
        } else if (3 == getRealState()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireReliableResponseRetransmissionTimer() {
        try {
            resendLastResponseAsBytes();
        } catch (IOException e) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e);
            }
            setState(5);
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean ackSeen() {
        return this.isAckSeen;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void cleanUp() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("removing" + this);
        }
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanup : " + getTransactionId());
            }
            if (this.originalRequest == null && this.originalRequestBytes != null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                try {
                    this.originalRequest = (SIPRequest) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.originalRequestBytes, true, false, null);
                } catch (ParseException e) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("message " + this.originalRequestBytes + "could not be reparsed !", e);
                    }
                }
            } else if (this.originalRequest != null && this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null && this.originalRequestBytes == null) {
                this.mergeId = sIPRequest.getMergeId();
            }
            this.sipStack.removeTransaction(this);
            cleanUpOnTimer();
            this.originalRequestFromTag = null;
            this.originalRequestSentBy = null;
            if (this.originalRequest != null) {
                this.originalRequest = null;
            }
            if (!isReliable() && this.inviteTransaction != null) {
                this.inviteTransaction = null;
            }
            this.lastResponse = null;
        } else {
            this.sipStack.removeTransaction(this);
        }
        if (!this.sipStack.cacheServerConnections && isReliable()) {
            MessageChannel messageChannel = getMessageChannel();
            int i = messageChannel.useCount - 1;
            messageChannel.useCount = i;
            if (i <= 0) {
                close();
                return;
            }
        }
        if (logger.isLoggingEnabled(32) && !this.sipStack.cacheServerConnections && isReliable()) {
            int i2 = getMessageChannel().useCount;
            logger.logDebug("Use Count = " + i2);
        }
    }

    public void cleanUpOnTimer() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("cleanup on timer : " + getTransactionId());
            }
            if (this.dialog != null && getMethod().equals(Request.CANCEL)) {
                this.dialogId = this.dialog.getDialogId();
            }
            this.dialog = null;
            if (this.inviteTransaction != null && !getMethod().equals(Request.CANCEL)) {
                this.inviteTransaction.releaseSem();
                this.inviteTransaction = null;
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null) {
                this.mergeId = sIPRequest.getMergeId();
                this.originalRequest.setTransaction(null);
                this.originalRequest.setInviteTransaction(null);
                if (!getMethod().equalsIgnoreCase("INVITE")) {
                    if (this.originalRequestSentBy == null) {
                        this.originalRequestSentBy = this.originalRequest.getTopmostVia().getSentBy();
                    }
                    if (this.originalRequestFromTag == null) {
                        this.originalRequestFromTag = this.originalRequest.getFromTag();
                    }
                }
                if (this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                if (!getMethod().equalsIgnoreCase("INVITE") && !getMethod().equalsIgnoreCase(Request.CANCEL)) {
                    this.originalRequest = null;
                }
            }
            if (this.lastResponse != null) {
                if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.lastResponseAsBytes = this.lastResponse.encodeAsBytes(getTransport());
                }
                this.lastResponse = null;
            }
            this.pendingReliableResponseAsBytes = null;
            this.pendingReliableResponseMethod = null;
            this.pendingSubscribeTransaction = null;
            this.provisionalResponseSem = null;
            this.retransmissionAlertTimerTask = null;
            this.requestOf = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void disableRetransmissionAlerts() {
        if (this.retransmissionAlertTimerTask == null || !this.retransmissionAlertEnabled) {
            return;
        }
        this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
        this.retransmissionAlertEnabled = false;
        String str = this.retransmissionAlertTimerTask.dialogId;
        if (str != null) {
            this.sipStack.retransmissionAlertTransactions.remove(str);
        }
        this.retransmissionAlertTimerTask = null;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.javax.sip.ServerTransaction
    public void enableRetransmissionAlerts() throws SipException {
        if (getDialog() != null) {
            v4i0.k("Dialog associated with tx");
        } else if (isInviteTransaction()) {
            this.retransmissionAlertEnabled = true;
        } else {
            v4i0.k("Request Method must be INVITE");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            return getBranch().equalsIgnoreCase(((SIPServerTransaction) obj).getBranch());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireRetransmissionTimer() {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("fireRetransmissionTimer() -- " + this + " state " + getState());
            }
            if (isInviteTransaction()) {
                if (this.lastResponse == null && this.lastResponseAsBytes == null) {
                    return;
                }
                if (this.retransmissionAlertEnabled && !this.sipStack.isTransactionPendingAck(this)) {
                    SipProviderImpl sipProvider = getSipProvider();
                    sipProvider.handleEvent(new TimeoutEvent(sipProvider, this, Timeout.RETRANSMIT), this);
                    return;
                }
                if (this.lastResponseStatusCode / 100 < 2 || this.isAckSeen) {
                    return;
                }
                resendLastResponseAsBytes();
            }
        } catch (IOException e) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e);
            }
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireTimeoutTimer() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPServerTransaction.fireTimeoutTimer this = " + this + " current state = " + getRealState() + " method = " + getMethod());
        }
        if (isInviteTransaction() && this.sipStack.removeTransactionPendingAck(this) && logger.isLoggingEnabled(32)) {
            logger.logDebug("Found tx pending ACK - timer H has kicked");
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (SIPTransactionStack.isDialogCreated(getMethod()) && (getRealState() == 0 || 1 == getRealState())) {
            sIPDialog.setState(3);
        } else if (getMethod().equals("BYE") && sIPDialog != null && sIPDialog.isTerminatedOnBye()) {
            sIPDialog.setState(3);
        }
        if (3 == getRealState() && isInviteTransaction()) {
            raiseErrorEvent(1);
            setState(5);
            this.sipStack.removeTransaction(this);
            return;
        }
        if (3 == getRealState() && !isInviteTransaction()) {
            setState(5);
            if (getMethod().equals(Request.CANCEL)) {
                this.sipStack.removeTransaction(this);
                return;
            } else {
                cleanUp();
                return;
            }
        }
        if (4 == getRealState() && isInviteTransaction()) {
            setState(5);
            this.sipStack.removeTransaction(this);
            return;
        }
        if (!isInviteTransaction() && (3 == getRealState() || 4 == getRealState())) {
            setState(5);
            return;
        }
        if (isInviteTransaction() && 5 == getRealState()) {
            raiseErrorEvent(1);
            if (sIPDialog != null) {
                sIPDialog.setState(3);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public Dialog getDialog() {
        String str;
        SIPDialog sIPDialog = this.dialog;
        return (sIPDialog != null || (str = this.dialogId) == null) ? sIPDialog : this.sipStack.getDialog(str);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public int getLastResponseStatusCode() {
        return this.lastResponseStatusCode;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public long getPendingReliableCSeqNumber() {
        return this.pendingReliableCSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public long getPendingReliableRSeqNumber() {
        return this.pendingReliableRSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public String getPendingReliableResponseMethod() {
        return this.pendingReliableResponseMethod;
    }

    public int getRealState() {
        return super.getInternalState();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public byte[] getReliableProvisionalResponse() {
        return this.pendingReliableResponseAsBytes;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public MessageChannel getResponseChannel() {
        return this.encapsulatedChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.javax.sip.Transaction
    public TransactionState getState() {
        return (isInviteTransaction() && 1 == super.getInternalState()) ? TransactionState.PROCEEDING : super.getState();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public String getViaHost() {
        return super.getViaHost();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public int getViaPort() {
        return super.getViaPort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isMessagePartOfTransaction(SIPMessage sIPMessage) {
        Via topmostVia;
        String method = sIPMessage.getCSeq().getMethod();
        SIPRequest originalRequest = getOriginalRequest();
        if ((isInviteTransaction() || !isTerminated()) && (topmostVia = sIPMessage.getTopmostVia()) != null) {
            String branch = topmostVia.getBranch();
            if (branch != null && !branch.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                branch = null;
            }
            if (branch != null && getBranch() != null) {
                if (method.equals(Request.CANCEL)) {
                    return getMethod().equals(Request.CANCEL) && getBranch().equalsIgnoreCase(branch) && topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy());
                }
                if (originalRequest != null) {
                    return getBranch().equalsIgnoreCase(branch) && topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy());
                }
                return getBranch().equalsIgnoreCase(branch) && topmostVia.getSentBy().equals(this.originalRequestSentBy);
            }
            SIPRequest sIPRequest = (SIPRequest) getRequest();
            String fromTag = sIPRequest.getFromTag();
            String tag = sIPMessage.getFrom().getTag();
            boolean z = fromTag == null || tag == null;
            String toTag = sIPRequest.getToTag();
            String tag2 = sIPMessage.getTo().getTag();
            boolean z2 = toTag == null || tag2 == null;
            boolean z3 = sIPMessage instanceof SIPResponse;
            if (sIPMessage.getCSeq().getMethod().equalsIgnoreCase(Request.CANCEL) && !sIPRequest.getCSeq().getMethod().equalsIgnoreCase(Request.CANCEL)) {
                return false;
            }
            if ((z3 || sIPRequest.getRequestURI().equals(((SIPRequest) sIPMessage).getRequestURI())) && ((z || (fromTag != null && fromTag.equalsIgnoreCase(tag))) && ((z2 || (toTag != null && toTag.equalsIgnoreCase(tag2))) && sIPRequest.getCallId().getCallId().equalsIgnoreCase(sIPMessage.getCallId().getCallId()) && sIPRequest.getCSeq().getSeqNumber() == sIPMessage.getCSeq().getSeqNumber() && ((!sIPMessage.getCSeq().getMethod().equals(Request.CANCEL) || getMethod().equals(sIPMessage.getCSeq().getMethod())) && topmostVia.equals(sIPRequest.getTopmostVia()))))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean isRetransmissionAlertEnabled() {
        return this.retransmissionAlertEnabled;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void map() {
        int realState = getRealState();
        if (realState < 0 || realState == 1) {
            if (!isInviteTransaction() || this.isMapped || this.sipStack.getTimer() == null) {
                this.isMapped = true;
            } else {
                this.isMapped = true;
                this.sipStack.getTimer().schedule(new SendTrying(), 200L);
            }
        }
        this.sipStack.removePendingTransaction(this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean prackRecieved() {
        if (this.pendingReliableResponseAsBytes == null) {
            return false;
        }
        if (this.provisionalResponseTask != null) {
            this.sipStack.getTimer().cancel(this.provisionalResponseTask);
            this.provisionalResponseTask = null;
        }
        this.pendingReliableResponseAsBytes = null;
        if (!interlockProvisionalResponses || getDialog() == null) {
            return true;
        }
        this.provisionalResponseSem.release();
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.stack.ServerRequestInterface
    public void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        boolean z;
        ServerRequestInterface serverRequestInterface;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("processRequest: " + sIPRequest.getFirstLine());
            logger.logDebug("tx state = " + getRealState());
        }
        try {
            if (getRealState() < 0) {
                setOriginalRequest(sIPRequest);
                setState(1);
                setPassToListener();
                if (isInviteTransaction() && this.isMapped) {
                    sendMessage(sIPRequest.createResponse(100, "Trying"));
                }
                z = true;
            } else {
                if (isInviteTransaction() && 3 == getRealState() && sIPRequest.getMethod().equals("ACK")) {
                    setState(4);
                    disableRetransmissionTimer();
                    if (isReliable()) {
                        setState(5);
                    } else {
                        enableTimeoutTimer(this.timerI);
                    }
                    if (this.sipStack.isNon2XXAckPassedToListener()) {
                        this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                        return;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("ACK received for server Tx " + getTransactionId() + " not delivering to application!");
                    }
                    semRelease();
                    return;
                }
                if (sIPRequest.getMethod().equals(getMethod())) {
                    if (2 == getRealState() || 3 == getRealState()) {
                        semRelease();
                        resendLastResponseAsBytes();
                    } else if (!sIPRequest.getMethod().equals("ACK") || (serverRequestInterface = this.requestOf) == null) {
                        semRelease();
                    } else {
                        serverRequestInterface.processRequest(sIPRequest, this.encapsulatedChannel);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("completed processing retransmitted request : " + sIPRequest.getFirstLine() + this + " txState = " + getState() + " lastResponse = " + this.lastResponseAsBytes);
                        return;
                    }
                    return;
                }
                z = false;
            }
            if (3 != getRealState() && 5 != getRealState() && this.requestOf != null) {
                if (getMethod().equals(sIPRequest.getMethod())) {
                    if (z) {
                        this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                        return;
                    } else {
                        semRelease();
                        return;
                    }
                }
                ServerRequestInterface serverRequestInterface2 = this.requestOf;
                if (serverRequestInterface2 != null) {
                    serverRequestInterface2.processRequest(sIPRequest, this.encapsulatedChannel);
                    return;
                } else {
                    semRelease();
                    return;
                }
            }
            if (SIPTransactionStack.isDialogCreated(getMethod()) && getRealState() == 5 && sIPRequest.getMethod().equals("ACK") && this.requestOf != null) {
                SIPDialog sIPDialog = (SIPDialog) getDialog();
                if (sIPDialog == null || !sIPDialog.ackProcessed) {
                    if (sIPDialog != null) {
                        sIPDialog.ackReceived(sIPRequest.getCSeq().getSeqNumber());
                        sIPDialog.ackProcessed = true;
                    }
                    this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                } else {
                    semRelease();
                }
            } else if (sIPRequest.getMethod().equals(Request.CANCEL)) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Too late to cancel Transaction");
                }
                semRelease();
                try {
                    sendMessage(sIPRequest.createResponse(Response.OK));
                } catch (IOException unused) {
                }
            } else {
                semRelease();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping request " + getRealState());
            }
        } catch (IOException e) {
            if (logger.isLoggingEnabled()) {
                logger.logError("IOException ", e);
            }
            semRelease();
            raiseIOExceptionEvent();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void releaseSem() {
        if (this.pendingSubscribeTransaction != null) {
            if (!this.sipStack.isDeliverUnsolicitedNotify()) {
                this.pendingSubscribeTransaction.releaseSem();
            }
        } else if (this.inviteTransaction != null && getMethod().equals(Request.CANCEL)) {
            this.inviteTransaction.releaseSem();
        }
        super.releaseSem();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void resendLastResponseAsBytes() throws IOException {
        if (this.lastResponse != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("resend last response " + this.lastResponse);
            }
            sendMessage(this.lastResponse);
            return;
        }
        if (this.lastResponseAsBytes != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("resend last response ".concat(new String(this.lastResponseAsBytes)));
            }
            if (isReliable()) {
                if (logger.isLoggingEnabled(16)) {
                    try {
                        SIPResponse sIPResponse = (SIPResponse) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.lastResponseAsBytes, true, false, null);
                        sIPResponse.setRemoteAddress(getPeerInetAddress());
                        sIPResponse.setRemotePort(getPeerPort());
                        sIPResponse.setLocalPort(getMessageChannel().getPort());
                        sIPResponse.setLocalAddress(getMessageChannel().getMessageProcessor().getIpAddress());
                        getMessageChannel().logMessage(sIPResponse, getPeerInetAddress(), getPeerPort(), System.currentTimeMillis());
                    } catch (ParseException e) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("couldn't reparse last response ".concat(new String(this.lastResponseAsBytes)), e);
                        }
                    }
                }
                getMessageChannel().sendMessage(this.lastResponseAsBytes, getPeerInetAddress(), getPeerPort(), false);
                return;
            }
            Hop hopResolveAddress = this.sipStack.addressResolver.resolveAddress(new HopImpl(this.lastResponseHost, this.lastResponsePort, this.lastResponseTransport));
            MessageChannel messageChannelCreateRawMessageChannel = getSIPStack().createRawMessageChannel(getSipProvider().getListeningPoint(hopResolveAddress.getTransport()).getIPAddress(), getPort(), hopResolveAddress);
            if (messageChannelCreateRawMessageChannel == null) {
                StringBuilder sb = new StringBuilder("Could not create a message channel for ");
                sb.append(hopResolveAddress);
                String iPAddress = getSipProvider().getListeningPoint(hopResolveAddress.getTransport()).getIPAddress();
                int port = getPort();
                sb.append(" with source IP:Port ");
                sb.append(iPAddress);
                sb.append(Separators.COLON);
                sb.append(port);
                throw new IOException(sb.toString());
            }
            if (logger.isLoggingEnabled(16)) {
                try {
                    SIPResponse sIPResponse2 = (SIPResponse) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.lastResponseAsBytes, true, false, null);
                    sIPResponse2.setRemoteAddress(messageChannelCreateRawMessageChannel.getPeerInetAddress());
                    sIPResponse2.setRemotePort(messageChannelCreateRawMessageChannel.getPeerPort());
                    sIPResponse2.setLocalPort(messageChannelCreateRawMessageChannel.getPort());
                    sIPResponse2.setLocalAddress(messageChannelCreateRawMessageChannel.getMessageProcessor().getIpAddress());
                    messageChannelCreateRawMessageChannel.logMessage(sIPResponse2, messageChannelCreateRawMessageChannel.getPeerInetAddress(), messageChannelCreateRawMessageChannel.getPeerPort(), System.currentTimeMillis());
                } catch (ParseException e2) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("couldn't reparse last response ".concat(new String(this.lastResponseAsBytes)), e2);
                    }
                }
            }
            messageChannelCreateRawMessageChannel.sendMessage(this.lastResponseAsBytes, InetAddress.getByName(hopResolveAddress.getHost()), hopResolveAddress.getPort(), false);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void scheduleAckRemoval() {
        if (getMethod() != null && getMethod().equals("ACK")) {
            startTransactionTimer();
            return;
        }
        StringBuilder sb = new StringBuilder("Method is null[");
        sb.append(getMethod() == null);
        sb.append("] or method is not ACK[");
        sb.append(getMethod());
        sb.append("]");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void sendMessage(SIPMessage sIPMessage) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sipServerTransaction::sendMessage " + sIPMessage.getFirstLine());
        }
        SIPResponse sIPResponse = (SIPResponse) sIPMessage;
        int statusCode = sIPResponse.getStatusCode();
        try {
            try {
                if (this.originalRequestBranch != null) {
                    sIPResponse.getTopmostVia().setBranch(getBranch());
                } else {
                    sIPResponse.getTopmostVia().removeParameter("branch");
                }
                if (!this.originalRequestHasPort) {
                    sIPResponse.getTopmostVia().removePort();
                }
                if (!sIPResponse.getCSeq().getMethod().equals(getMethod())) {
                    sendResponse(sIPResponse);
                    startTransactionTimer();
                    return;
                }
                if (!checkStateTimers(statusCode)) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("checkStateTimers returned false -- not sending message");
                    }
                    startTransactionTimer();
                    return;
                }
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("sendMessage : tx = " + this + " getState = " + getState());
                    }
                    this.lastResponse = sIPResponse;
                    this.lastResponseStatusCode = sIPResponse.getStatusCode();
                    sendResponse(sIPResponse);
                    startTransactionTimer();
                } catch (IOException e) {
                    setState(5);
                    this.collectionTime = 0;
                    throw e;
                }
            } catch (ParseException e2) {
                logger.logError("UnexpectedException", e2);
                throw new IOException("Unexpected exception");
            }
        } catch (Throwable th) {
            startTransactionTimer();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void sendReliableProvisionalResponse(Response response) throws SipException {
        if (this.pendingReliableResponseAsBytes != null) {
            v4i0.k("Unacknowledged response");
            return;
        }
        SIPResponse sIPResponse = (SIPResponse) response;
        this.pendingReliableResponseAsBytes = sIPResponse.encodeAsBytes(getTransport());
        this.pendingReliableResponseMethod = sIPResponse.getCSeq().getMethod();
        this.pendingReliableCSeqNumber = sIPResponse.getCSeq().getSeqNumber();
        RSeq rSeq = (RSeq) response.getHeader("RSeq");
        if (response.getHeader("RSeq") == null) {
            rSeq = new RSeq();
            response.setHeader(rSeq);
        }
        try {
            int iRandom = this.rseqNumber;
            if (iRandom < 0) {
                iRandom = (int) (Math.random() * 1000.0d);
                this.rseqNumber = iRandom;
            }
            int i = iRandom + 1;
            this.rseqNumber = i;
            rSeq.setSeqNumber(i);
            this.pendingReliableRSeqNumber = rSeq.getSeqNumber();
            this.lastResponse = (SIPResponse) response;
            if (getDialog() != null && interlockProvisionalResponses && !this.provisionalResponseSem.tryAcquire(1L, TimeUnit.SECONDS)) {
                throw new SipException("Unacknowledged reliable response");
            }
            this.provisionalResponseTask = new ProvisionalResponseTask();
            this.sipStack.getTimer().scheduleWithFixedDelay(this.provisionalResponseTask, 0L, 500L);
            sendMessage((SIPMessage) response);
        } catch (Exception e) {
            InternalErrorHandler.handleException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.javax.sip.ServerTransaction
    public void sendResponse(Response response) throws SipException {
        SIPResponse sIPResponse = (SIPResponse) response;
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (response == 0) {
            hny.u("null response");
            return;
        }
        try {
            sIPResponse.checkHeaders();
            String method = sIPResponse.getCSeq().getMethod();
            if (!method.equals(getMethod())) {
                throw new IllegalTransactionStateException("CSeq method does not match Request method of request that created the tx.", IllegalTransactionStateException.Reason.UnmatchingCSeq);
            }
            int statusCode = response.getStatusCode();
            if (getMethod().equals("SUBSCRIBE") && statusCode / 100 == 2) {
                if (response.getHeader("Expires") == null) {
                    throw new IllegalTransactionStateException("Expires header is mandatory in 2xx response of SUBSCRIBE", IllegalTransactionStateException.Reason.ExpiresHeaderMandatory);
                }
                Expires expires = (Expires) getOriginalRequest().getExpires();
                Expires expires2 = (Expires) response.getExpires();
                if (expires != null && expires2.getExpires() > expires.getExpires()) {
                    v4i0.k("Response Expires time exceeds request Expires time : See RFC 3265 3.1.1");
                    return;
                }
            }
            if (statusCode == 200 && method.equals("INVITE") && sIPResponse.getHeader("Contact") == null) {
                throw new IllegalTransactionStateException("Contact Header is mandatory for the OK to the INVITE", IllegalTransactionStateException.Reason.ContactHeaderMandatory);
            }
            if (!isMessagePartOfTransaction((SIPMessage) response)) {
                v4i0.k("Response does not belong to this transaction.");
                return;
            }
            try {
                ContentType contentTypeHeader = ((SIPResponse) response).getContentTypeHeader();
                if (this.pendingReliableResponseAsBytes == null || getDialog() == null || getInternalState() == 5 || statusCode / 100 != 2 || contentTypeHeader == null || !contentTypeHeader.getContentType().equalsIgnoreCase(SIPServerTransaction.CONTENT_TYPE_APPLICATION) || !contentTypeHeader.getContentSubType().equalsIgnoreCase(SIPServerTransaction.CONTENT_SUBTYPE_SDP)) {
                    if (this.pendingReliableResponseAsBytes != null && sIPResponse.isFinalResponse()) {
                        this.sipStack.getTimer().cancel(this.provisionalResponseTask);
                        this.provisionalResponseTask = null;
                    }
                } else {
                    if (!interlockProvisionalResponses) {
                        throw new SipException("cannot send response -- unacked provisional");
                    }
                    try {
                        if (!this.provisionalResponseSem.tryAcquire(1L, TimeUnit.SECONDS)) {
                            throw new SipException("cannot send response -- unacked provisional");
                        }
                    } catch (InterruptedException unused) {
                        logger.logError("Interrupted acuqiring PRACK sem");
                        throw new SipException("Cannot aquire PRACK sem");
                    }
                }
                if (sIPDialog != null) {
                    if (statusCode / 100 == 2 && SIPTransactionStack.isDialogCreated(method)) {
                        if (sIPDialog.getLocalTag() == null && sIPResponse.getToTag() == null) {
                            sIPResponse.getTo().setTag(Utils.getInstance().generateTag());
                        } else if (sIPDialog.getLocalTag() != null && sIPResponse.getToTag() == null) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("assigning toTag : serverTransaction = " + this + " dialog " + sIPDialog + " tag = " + sIPDialog.getLocalTag());
                            }
                            sIPResponse.setToTag(sIPDialog.getLocalTag());
                        } else if (sIPDialog.getLocalTag() != null && sIPResponse.getToTag() != null && !sIPDialog.getLocalTag().equals(sIPResponse.getToTag())) {
                            throw new SipException("Tag mismatch dialogTag is " + sIPDialog.getLocalTag() + " responseTag is " + sIPResponse.getToTag());
                        }
                    }
                    if (!sIPResponse.getCallId().getCallId().equals(sIPDialog.getCallId().getCallId())) {
                        throw new SipException("Dialog mismatch!");
                    }
                }
                String fromTag = this.originalRequestFromTag;
                if (getRequest() != null) {
                    fromTag = ((SIPRequest) getRequest()).getFromTag();
                }
                if (fromTag != null && sIPResponse.getFromTag() != null && !sIPResponse.getFromTag().equals(fromTag)) {
                    throw new SipException("From tag of request does not match response from tag");
                }
                if (fromTag != null) {
                    sIPResponse.getFrom().setTag(fromTag);
                } else if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("WARNING -- Null From tag in request!!");
                }
                if (sIPDialog != null && statusCode != 100) {
                    sIPDialog.setResponseTags(sIPResponse);
                    DialogState state = sIPDialog.getState();
                    sIPDialog.setLastResponse(this, (SIPResponse) response);
                    if (state == null && sIPDialog.getState() == DialogState.TERMINATED) {
                        sIPDialog.getSipProvider().handleEvent(new DialogTerminatedEvent(sIPDialog.getSipProvider(), sIPDialog), this);
                    }
                } else if (sIPDialog == null && isInviteTransaction() && this.retransmissionAlertEnabled && this.retransmissionAlertTimerTask == null && response.getStatusCode() / 100 == 2) {
                    String dialogId = ((SIPResponse) response).getDialogId(true);
                    this.retransmissionAlertTimerTask = new RetransmissionAlertTimerTask(dialogId);
                    this.sipStack.retransmissionAlertTransactions.put(dialogId, this);
                    this.sipStack.getTimer().scheduleWithFixedDelay(this.retransmissionAlertTimerTask, 0L, 500L);
                }
                sendMessage((SIPResponse) response);
                if (sIPDialog != null) {
                    sIPDialog.startRetransmitTimer(this, (SIPResponse) response);
                }
            } catch (IOException e) {
                if (logger.isLoggingEnabled()) {
                    logger.logException(e);
                }
                setState(5);
                raiseErrorEvent(2);
                throw new SipException(e.getMessage(), e);
            } catch (ParseException e2) {
                if (logger.isLoggingEnabled()) {
                    logger.logException(e2);
                }
                setState(5);
                throw new SipException(e2.getMessage(), e2);
            }
        } catch (ParseException e3) {
            throw new IllegalTransactionStateException(e3.getMessage(), IllegalTransactionStateException.Reason.MissingRequiredHeader);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setAckSeen() {
        this.isAckSeen = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setDialog(SIPDialog sIPDialog, String str) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setDialog " + this + " dialog = " + sIPDialog);
        }
        this.dialog = sIPDialog;
        this.dialogId = str;
        if (str != null) {
            sIPDialog.setAssigned();
        }
        if (this.retransmissionAlertEnabled && this.retransmissionAlertTimerTask != null) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            String str2 = this.retransmissionAlertTimerTask.dialogId;
            if (str2 != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str2);
            }
            this.retransmissionAlertTimerTask = null;
        }
        this.retransmissionAlertEnabled = false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setInviteTransaction(SIPServerTransaction sIPServerTransaction) {
        this.inviteTransaction = sIPServerTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setMapped(boolean z) {
        this.isMapped = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setOriginalRequest(SIPRequest sIPRequest) {
        super.setOriginalRequest(sIPRequest);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setPendingSubscribe(SIPClientTransaction sIPClientTransaction) {
        this.pendingSubscribeTransaction = sIPClientTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setRequestInterface(ServerRequestInterface serverRequestInterface) {
        this.requestOf = serverRequestInterface;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setState(int i) {
        if (i == 5 && isReliable() && !getSIPStack().cacheServerConnections) {
            this.collectionTime = 64;
            this.terminationSemaphore.release();
        }
        super.setState(i);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void startTransactionTimer() {
        if ((getMethod().equalsIgnoreCase("INVITE") || getMethod().equalsIgnoreCase(Request.CANCEL) || getMethod().equalsIgnoreCase("ACK")) && this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            TransactionTimer transactionTimer = new TransactionTimer();
            if (this.sipStack.getTimer() == null || !this.sipStack.getTimer().isStarted()) {
                return;
            }
            SipTimer timer = this.sipStack.getTimer();
            int i = this.baseTimerInterval;
            timer.scheduleWithFixedDelay(transactionTimer, i, i);
        }
    }

    public void startTransactionTimerJ(long j) {
        if (this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("starting TransactionTimerJ() : " + getTransactionId() + " time " + j);
            }
            SIPStackTimerTask sIPStackTimerTask = new SIPStackTimerTask() { // from class: android.gov.nist.javax.sip.stack.SIPServerTransactionImpl.1
                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                public Object getThreadHash() {
                    Request request = SIPServerTransactionImpl.this.getRequest();
                    if (request == null || !(request instanceof SIPRequest)) {
                        return null;
                    }
                    return ((SIPRequest) request).getCallIdHeader().getCallId();
                }

                @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
                public void runTask() {
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                        SIPServerTransactionImpl.logger.logDebug("executing TransactionTimerJ() : " + SIPServerTransactionImpl.this.getTransactionId());
                    }
                    SIPServerTransactionImpl.this.fireTimeoutTimer();
                    SIPServerTransactionImpl.this.cleanUp();
                    SIPRequest sIPRequest = SIPServerTransactionImpl.this.originalRequest;
                    if (sIPRequest != null) {
                        sIPRequest.cleanUp();
                    }
                }
            };
            if (j > 0) {
                this.sipStack.getTimer().schedule(sIPStackTimerTask, j * ((long) this.baseTimerInterval));
            } else {
                sIPStackTimerTask.runTask();
            }
        }
    }

    @Override // android.javax.sip.Transaction
    public void terminate() {
        setState(5);
        if (this.retransmissionAlertTimerTask != null) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            String str = this.retransmissionAlertTimerTask.dialogId;
            if (str != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str);
            }
            this.retransmissionAlertTimerTask = null;
        }
        if (this.transactionTimerStarted.get()) {
            return;
        }
        testAndSetTransactionTerminatedEvent();
        this.sipStack.removeTransaction(this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void waitForTermination() {
        try {
            this.terminationSemaphore.acquire();
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.ServerTransactionExt
    public SIPServerTransaction getCanceledInviteTransaction() {
        return this.inviteTransaction;
    }

    public void sendResponse(SIPResponse sIPResponse) {
        String host;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sipServerTransaction::sendResponse " + sIPResponse.getFirstLine());
        }
        try {
            if (isReliable() && !this.sipStack.isPatchReceivedRport()) {
                getMessageChannel().sendMessage(sIPResponse);
            } else {
                Via topmostVia = sIPResponse.getTopmostVia();
                String transport = topmostVia.getTransport();
                if (transport != null) {
                    int rPort = topmostVia.getRPort();
                    if (rPort == -1) {
                        rPort = topmostVia.getPort();
                    }
                    if (rPort == -1) {
                        rPort = transport.equalsIgnoreCase(ListeningPoint.TLS) ? 5061 : 5060;
                    }
                    if (topmostVia.getMAddr() != null) {
                        host = topmostVia.getMAddr();
                    } else {
                        String parameter = topmostVia.getParameter("received");
                        host = parameter == null ? topmostVia.getHost() : parameter;
                    }
                    Hop hopResolveAddress = this.sipStack.addressResolver.resolveAddress(new HopImpl(host, rPort, transport));
                    MessageChannel messageChannelCreateRawMessageChannel = getSIPStack().createRawMessageChannel(getSipProvider().getListeningPoint(hopResolveAddress.getTransport()).getIPAddress(), getPort(), hopResolveAddress);
                    if (messageChannelCreateRawMessageChannel == null) {
                        throw new IOException("Could not create a message channel for " + hopResolveAddress + " with source IP:Port " + getSipProvider().getListeningPoint(hopResolveAddress.getTransport()).getIPAddress() + Separators.COLON + getPort());
                    }
                    messageChannelCreateRawMessageChannel.sendMessage(sIPResponse);
                    this.lastResponseHost = host;
                    this.lastResponsePort = rPort;
                    this.lastResponseTransport = transport;
                } else {
                    throw new IOException("missing transport!");
                }
            }
            this.lastResponseAsBytes = sIPResponse.encodeAsBytes(getTransport());
            this.lastResponse = null;
            startTransactionTimer();
        } catch (Throwable th) {
            startTransactionTimer();
            throw th;
        }
    }
}
