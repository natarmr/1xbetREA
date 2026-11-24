package a;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class cwq0 extends bag0 {
    public static final xoo e = new xoo(1.2f, 8000);
    public final tnx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwq0(vkr0 vkr0Var, int i, tnx tnxVar) {
        super(vkr0Var, i);
        bwq0 bwq0Var = bwq0.f3338a;
        this.d = tnxVar;
    }

    @Override // a.p4
    public final Object q0(td9 td9Var) throws InterruptedException, c44 {
        byte b = this.c;
        if (b >= 0) {
            int i = 0;
            while (true) {
                xoo xooVar = e;
                if (xooVar.e > 0) {
                    Thread.sleep(xooVar.d);
                }
                bwq0 bwq0Var = bwq0.f3338a;
                synchronized (bwq0Var) {
                    bwq0Var.a();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    ArrayDeque arrayDeque = bwq0.b;
                    arrayDeque.addLast(Long.valueOf(jElapsedRealtime));
                    Long l = (Long) arrayDeque.removeFirst();
                    l.getClass();
                    long jLongValue = 1000 - (jElapsedRealtime - l.longValue());
                    if (jLongValue > 0) {
                        Thread.sleep(jLongValue);
                    }
                }
                try {
                    Object objN1 = this.d.n1(td9Var, 0);
                    xooVar.d = 1000L;
                    xooVar.e = 0;
                    return objN1;
                } catch (yut0 e2) {
                    if (e2.b != 6) {
                        throw e2;
                    }
                    E0("Too many requests", e2);
                    e.a();
                    if (i != b) {
                        i++;
                    }
                }
            }
        }
        throw new c44(brm0.n(new StringBuilder("Can't handle too many requests due to retry limit! (retryLimit="), this.c, ')'), (byte) 15);
    }
}
