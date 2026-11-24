package android.javax.sip;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public interface ServerTransaction extends Transaction {
    void enableRetransmissionAlerts();

    void sendResponse(Response response);
}
