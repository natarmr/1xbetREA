package android.javax.sip;

import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class TransactionTerminatedEvent extends EventObject {
    private ClientTransaction m_clientTransaction;
    private boolean m_isServerTransaction;
    private ServerTransaction m_serverTransaction;

    public TransactionTerminatedEvent(Object obj, ServerTransaction serverTransaction) {
        super(obj);
        this.m_clientTransaction = null;
        this.m_serverTransaction = serverTransaction;
        this.m_isServerTransaction = true;
    }

    public ClientTransaction getClientTransaction() {
        return this.m_clientTransaction;
    }

    public ServerTransaction getServerTransaction() {
        return this.m_serverTransaction;
    }

    public boolean isServerTransaction() {
        return this.m_isServerTransaction;
    }

    public TransactionTerminatedEvent(Object obj, ClientTransaction clientTransaction) {
        super(obj);
        this.m_serverTransaction = null;
        this.m_clientTransaction = clientTransaction;
        this.m_isServerTransaction = false;
    }
}
