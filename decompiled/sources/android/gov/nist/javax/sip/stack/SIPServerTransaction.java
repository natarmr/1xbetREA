package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ServerTransactionExt;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.Dialog;
import android.javax.sip.ServerTransaction;
import android.javax.sip.TransactionState;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public interface SIPServerTransaction extends SIPTransaction, ServerTransaction, ServerTransactionExt, ServerRequestInterface {
    public static final String CONTENT_SUBTYPE_SDP = "sdp";
    public static final String CONTENT_TYPE_APPLICATION = "application";

    boolean ackSeen();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void cleanUp();

    void disableRetransmissionAlerts();

    @Override // android.javax.sip.ServerTransaction
    void enableRetransmissionAlerts();

    boolean equals(Object obj);

    @Override // android.gov.nist.javax.sip.ServerTransactionExt
    SIPServerTransaction getCanceledInviteTransaction();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    Dialog getDialog();

    int getLastResponseStatusCode();

    long getPendingReliableCSeqNumber();

    long getPendingReliableRSeqNumber();

    String getPendingReliableResponseMethod();

    byte[] getReliableProvisionalResponse();

    MessageChannel getResponseChannel();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.javax.sip.Transaction
    TransactionState getState();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    String getViaHost();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    int getViaPort();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    boolean isMessagePartOfTransaction(SIPMessage sIPMessage);

    boolean isRetransmissionAlertEnabled();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    boolean isTransactionMapped();

    void map();

    boolean prackRecieved();

    @Override // android.gov.nist.javax.sip.stack.ServerRequestInterface
    void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void releaseSem();

    void resendLastResponseAsBytes();

    void scheduleAckRemoval();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void sendMessage(SIPMessage sIPMessage);

    void sendReliableProvisionalResponse(Response response);

    @Override // android.javax.sip.ServerTransaction
    void sendResponse(Response response);

    void setAckSeen();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setDialog(SIPDialog sIPDialog, String str);

    void setInviteTransaction(SIPServerTransaction sIPServerTransaction);

    void setMapped(boolean z);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setOriginalRequest(SIPRequest sIPRequest);

    void setPendingSubscribe(SIPClientTransaction sIPClientTransaction);

    void setRequestInterface(ServerRequestInterface serverRequestInterface);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setState(int i);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setTransactionMapped(boolean z);

    @Override // android.javax.sip.Transaction
    void terminate();

    void waitForTermination();
}
