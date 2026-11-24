package android.javax.sip;

import android.javax.sip.address.Address;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface Dialog extends Serializable {
    Request createAck(long j);

    Request createPrack(Response response);

    Response createReliableProvisionalResponse(int i);

    Request createRequest(String str);

    void delete();

    Object getApplicationData();

    CallIdHeader getCallId();

    String getDialogId();

    Transaction getFirstTransaction();

    Address getLocalParty();

    long getLocalSeqNumber();

    int getLocalSequenceNumber();

    String getLocalTag();

    Address getRemoteParty();

    long getRemoteSeqNumber();

    int getRemoteSequenceNumber();

    String getRemoteTag();

    Address getRemoteTarget();

    Iterator getRouteSet();

    DialogState getState();

    void incrementLocalSequenceNumber();

    boolean isSecure();

    boolean isServer();

    void sendAck(Request request);

    void sendReliableProvisionalResponse(Response response);

    void sendRequest(ClientTransaction clientTransaction);

    void setApplicationData(Object obj);

    void terminateOnBye(boolean z);
}
