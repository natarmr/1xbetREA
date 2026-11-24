package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.TransactionExt;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.javax.sip.Dialog;
import android.javax.sip.TransactionState;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface SIPTransaction extends TransactionExt {
    public static final TransactionState INITIAL_STATE = null;
    public static final int T1 = 1;
    public static final int TIMER_A = 1;
    public static final int TIMER_B = 64;
    public static final int TIMER_F = 64;
    public static final int TIMER_H = 64;
    public static final int TIMER_J = 64;
    public static final TransactionState TRYING_STATE = TransactionState.TRYING;
    public static final TransactionState CALLING_STATE = TransactionState.CALLING;
    public static final TransactionState PROCEEDING_STATE = TransactionState.PROCEEDING;
    public static final TransactionState COMPLETED_STATE = TransactionState.COMPLETED;
    public static final TransactionState CONFIRMED_STATE = TransactionState.CONFIRMED;
    public static final TransactionState TERMINATED_STATE = TransactionState.TERMINATED;

    boolean acquireSem();

    void addEventListener(SIPTransactionEventListener sIPTransactionEventListener);

    void cancelMaxTxLifeTimeTimer();

    void cleanUp();

    void close();

    void disableRetransmissionTimer();

    void disableTimeoutTimer();

    boolean doesCancelMatchTransaction(SIPRequest sIPRequest);

    @Override // android.gov.nist.javax.sip.TransactionExt
    List<String> extractCertIdentities();

    void fireRetransmissionTimer();

    void fireTimeoutTimer();

    void fireTimer();

    @Override // android.javax.sip.Transaction
    Object getApplicationData();

    long getAuditTag();

    int getBaseTimerInterval();

    String getBranch();

    @Override // android.javax.sip.Transaction
    String getBranchId();

    long getCSeq();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getCipherSuite();

    Dialog getDialog();

    String getForkId();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getHost();

    int getInternalState();

    String getKey();

    SIPResponse getLastResponse();

    @Override // android.gov.nist.javax.sip.TransactionExt
    Certificate[] getLocalCertificates();

    String getMergeId();

    MessageChannel getMessageChannel();

    MessageProcessor getMessageProcessor();

    String getMethod();

    SIPRequest getOriginalRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getPeerAddress();

    @Override // android.gov.nist.javax.sip.TransactionExt
    Certificate[] getPeerCertificates();

    InetAddress getPeerPacketSourceAddress();

    int getPeerPacketSourcePort();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getPeerPort();

    String getPeerProtocol();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getPort();

    @Override // android.gov.nist.javax.sip.TransactionExt
    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    @Override // android.javax.sip.Transaction
    Request getRequest();

    Response getResponse();

    @Override // android.javax.sip.Transaction
    int getRetransmitTimer();

    SIPTransactionStack getSIPStack();

    @Override // android.gov.nist.javax.sip.TransactionExt
    SipProviderImpl getSipProvider();

    @Override // android.javax.sip.Transaction
    TransactionState getState();

    int getT2();

    int getT4();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getTimerD();

    int getTimerI();

    int getTimerK();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getTimerT2();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getTimerT4();

    String getTransactionId();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getTransport();

    Via getViaHeader();

    String getViaHost();

    int getViaPort();

    int hashCode();

    boolean isByeTransaction();

    boolean isCancelTransaction();

    boolean isDialogCreatingTransaction();

    boolean isInviteTransaction();

    boolean isMessagePartOfTransaction(SIPMessage sIPMessage);

    boolean isReliable();

    boolean isSecure();

    boolean isServerTransaction();

    boolean isTerminated();

    boolean isTransactionMapped();

    boolean passToListener();

    void raiseErrorEvent(int i);

    void raiseIOExceptionEvent();

    void releaseSem();

    void removeEventListener(SIPTransactionEventListener sIPTransactionEventListener);

    void scheduleMaxTxLifeTimeTimer();

    void semRelease();

    void sendMessage(SIPMessage sIPMessage);

    @Override // android.javax.sip.Transaction
    void setApplicationData(Object obj);

    void setAuditTag(long j);

    void setBranch(String str);

    void setCollectionTime(int i);

    void setDialog(SIPDialog sIPDialog, String str);

    void setEncapsulatedChannel(MessageChannel messageChannel);

    void setForkId(String str);

    void setOriginalRequest(SIPRequest sIPRequest);

    void setPassToListener();

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    @Override // android.javax.sip.Transaction
    void setRetransmitTimer(int i);

    void setState(int i);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setTimerD(int i);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setTimerT2(int i);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setTimerT4(int i);

    void setTransactionMapped(boolean z);

    void startTransactionTimer();

    boolean testAndSetTransactionTerminatedEvent();
}
