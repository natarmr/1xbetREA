package a;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class j04 extends fmq0 {
    public static final y78 h;
    public static j04 i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final char l;
    public static final long m;
    public byte e;
    public int f = -1;
    public long g;

    static {
        y78 y78Var = new y78((byte) 12, false);
        y78Var.c = new j04[8];
        h = y78Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        k = conditionNewCondition;
        l = (char) 60000;
        m = 60000000000L;
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.f9798a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = (byte) 1;
                zgc.L(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            byte b = this.e;
            this.e = (byte) 0;
            if (b != 1) {
                return b == 2;
            }
            h.v(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
