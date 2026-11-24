package android.javax.sip;

import a.jf4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Timeout implements Serializable {
    public static final int _RETRANSMIT = 0;
    public static final int _TRANSACTION = 1;
    private static int m_size = 2;
    private int m_timeout;
    private static Timeout[] m_timeoutArray = new Timeout[2];
    public static final Timeout RETRANSMIT = new Timeout(0);
    public static final Timeout TRANSACTION = new Timeout(1);

    private Timeout(int i) {
        this.m_timeout = i;
        m_timeoutArray[i] = this;
    }

    private Object readResolve() {
        return m_timeoutArray[this.m_timeout];
    }

    public Timeout getObject(int i) {
        if (i >= 0 && i < m_size) {
            return m_timeoutArray[i];
        }
        jf4.o("Invalid timeout value");
        return null;
    }

    public int getValue() {
        return this.m_timeout;
    }

    public String toString() {
        int i = this.m_timeout;
        if (i != 0) {
            return i != 1 ? "Error while printing Timeout" : "Transaction Timeout";
        }
        return "Retransmission Timeout";
    }
}
