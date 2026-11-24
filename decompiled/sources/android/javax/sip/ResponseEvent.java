package android.javax.sip;

import android.javax.sip.message.Response;
import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class ResponseEvent extends EventObject {
    private Dialog m_dialog;
    private Response m_response;
    private ClientTransaction m_transaction;

    public ResponseEvent(Object obj, ClientTransaction clientTransaction, Dialog dialog, Response response) {
        super(obj);
        this.m_response = response;
        this.m_transaction = clientTransaction;
        this.m_dialog = dialog;
    }

    public ClientTransaction getClientTransaction() {
        return this.m_transaction;
    }

    public Dialog getDialog() {
        return this.m_dialog;
    }

    public Response getResponse() {
        return this.m_response;
    }
}
