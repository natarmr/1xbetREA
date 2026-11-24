package android.javax.sip;

import android.javax.sip.message.Request;
import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class RequestEvent extends EventObject {
    private Dialog m_dialog;
    private Request m_request;
    private ServerTransaction m_transaction;

    public RequestEvent(Object obj, ServerTransaction serverTransaction, Dialog dialog, Request request) {
        super(obj);
        this.m_transaction = serverTransaction;
        this.m_request = request;
        this.m_dialog = dialog;
    }

    public Dialog getDialog() {
        return this.m_dialog;
    }

    public Request getRequest() {
        return this.m_request;
    }

    public ServerTransaction getServerTransaction() {
        return this.m_transaction;
    }
}
