package android.javax.sip;

import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class TimeoutEvent extends EventObject {
    private ClientTransaction m_clientTransaction;
    private boolean m_isServerTransaction;
    private ServerTransaction m_serverTransaction;
    private Timeout m_timeout;

    public TimeoutEvent(Object obj, ServerTransaction serverTransaction, Timeout timeout) {
        super(obj);
        this.m_clientTransaction = null;
        this.m_serverTransaction = serverTransaction;
        this.m_isServerTransaction = true;
        this.m_timeout = timeout;
    }

    public ClientTransaction getClientTransaction() {
        return this.m_clientTransaction;
    }

    public ServerTransaction getServerTransaction() {
        return this.m_serverTransaction;
    }

    public Timeout getTimeout() {
        return this.m_timeout;
    }

    public boolean isServerTransaction() {
        return this.m_isServerTransaction;
    }

    public TimeoutEvent(Object obj, ClientTransaction clientTransaction, Timeout timeout) {
        super(obj);
        this.m_serverTransaction = null;
        this.m_clientTransaction = clientTransaction;
        this.m_isServerTransaction = false;
        this.m_timeout = timeout;
    }
}
