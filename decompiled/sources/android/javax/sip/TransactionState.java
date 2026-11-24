package android.javax.sip;

import a.jf4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class TransactionState implements Serializable {
    public static final int _CALLING = 0;
    public static final int _COMPLETED = 3;
    public static final int _CONFIRMED = 4;
    public static final int _PROCEEDING = 2;
    public static final int _TERMINATED = 5;
    public static final int _TRYING = 1;
    private static int m_size = 6;
    private int m_transactionState;
    private static TransactionState[] m_transStateArray = new TransactionState[6];
    public static final TransactionState CALLING = new TransactionState(0);
    public static final TransactionState TRYING = new TransactionState(1);
    public static final TransactionState PROCEEDING = new TransactionState(2);
    public static final TransactionState COMPLETED = new TransactionState(3);
    public static final TransactionState CONFIRMED = new TransactionState(4);
    public static final TransactionState TERMINATED = new TransactionState(5);

    private TransactionState(int i) {
        this.m_transactionState = i;
        m_transStateArray[i] = this;
    }

    public static TransactionState getObject(int i) {
        if (i >= 0 && i < m_size) {
            return m_transStateArray[i];
        }
        jf4.o("Invalid transactionState value");
        return null;
    }

    private Object readResolve() {
        return m_transStateArray[this.m_transactionState];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TransactionState) && ((TransactionState) obj).m_transactionState == this.m_transactionState;
    }

    public int getValue() {
        return this.m_transactionState;
    }

    public int hashCode() {
        return this.m_transactionState;
    }

    public String toString() {
        int i = this.m_transactionState;
        if (i == 0) {
            return "Calling Transaction";
        }
        if (i == 1) {
            return "Trying Transaction";
        }
        if (i == 2) {
            return "Proceeding Transaction";
        }
        if (i == 3) {
            return "Completed Transaction";
        }
        if (i != 4) {
            return i != 5 ? "Error while printing Transaction State" : "Terminated Transaction";
        }
        return "Confirmed Transaction";
    }
}
