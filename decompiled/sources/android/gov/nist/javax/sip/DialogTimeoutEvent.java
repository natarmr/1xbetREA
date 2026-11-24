package android.gov.nist.javax.sip;

import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class DialogTimeoutEvent extends EventObject {
    private static final long serialVersionUID = -2514000059989311925L;
    private Dialog m_dialog;
    private ClientTransaction m_reInviteTransaction;
    private Reason m_reason;

    public enum Reason {
        AckNotReceived,
        AckNotSent,
        ReInviteTimeout,
        EarlyStateTimeout,
        CannotAcquireAckSemaphoreForOk
    }

    public DialogTimeoutEvent(Object obj, Dialog dialog, Reason reason) {
        super(obj);
        this.m_reInviteTransaction = null;
        this.m_dialog = dialog;
        this.m_reason = reason;
    }

    public ClientTransaction getClientTransaction() {
        return this.m_reInviteTransaction;
    }

    public Dialog getDialog() {
        return this.m_dialog;
    }

    public Reason getReason() {
        return this.m_reason;
    }

    public void setClientTransaction(ClientTransaction clientTransaction) {
        this.m_reInviteTransaction = clientTransaction;
    }
}
