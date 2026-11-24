package a;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class x2e0 {
    public static final int i;
    public g2e0 b;
    public final g2e0 e;
    public final g2e0 f;
    public final long g;
    public final long h;
    public long c = 500;
    public double d = 500.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f40163a = new Timer();

    static {
        f03.d();
        i = 1000000;
    }

    public x2e0(g2e0 g2e0Var, yk5 yk5Var, hsd hsdVar, String str) {
        etd etdVar;
        long jLongValue;
        dtd dtdVar;
        long jLongValue2;
        ptd ptdVar;
        qtd qtdVar;
        this.b = g2e0Var;
        long j = str == "Trace" ? hsdVar.j() : hsdVar.j();
        if (str == "Trace") {
            synchronized (qtd.class) {
                qtdVar = qtd.f29294a;
                if (qtdVar == null) {
                    qtdVar = new qtd();
                    qtd.f29294a = qtdVar;
                }
            }
            v680 v680Var = hsdVar.f13576a.getLong("fpr_rl_trace_event_count_fg");
            if (v680Var.b() && hsd.k(((Long) v680Var.a()).longValue())) {
                hsdVar.c.d(((Long) v680Var.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jLongValue = ((Long) v680Var.a()).longValue();
            } else {
                v680 v680VarC = hsdVar.c(qtdVar);
                jLongValue = (v680VarC.b() && hsd.k(((Long) v680VarC.a()).longValue())) ? ((Long) v680VarC.a()).longValue() : 300L;
            }
        } else {
            synchronized (etd.class) {
                etdVar = etd.f8370a;
                if (etdVar == null) {
                    etdVar = new etd();
                    etd.f8370a = etdVar;
                }
            }
            v680 v680Var2 = hsdVar.f13576a.getLong("fpr_rl_network_event_count_fg");
            if (v680Var2.b() && hsd.k(((Long) v680Var2.a()).longValue())) {
                hsdVar.c.d(((Long) v680Var2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                jLongValue = ((Long) v680Var2.a()).longValue();
            } else {
                v680 v680VarC2 = hsdVar.c(etdVar);
                jLongValue = (v680VarC2.b() && hsd.k(((Long) v680VarC2.a()).longValue())) ? ((Long) v680VarC2.a()).longValue() : 700L;
            }
        }
        long j2 = jLongValue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new g2e0(j2, j, timeUnit);
        this.g = j2;
        long j3 = str == "Trace" ? hsdVar.j() : hsdVar.j();
        if (str == "Trace") {
            synchronized (ptd.class) {
                ptdVar = ptd.f27559a;
                if (ptdVar == null) {
                    ptdVar = new ptd();
                    ptd.f27559a = ptdVar;
                }
            }
            v680 v680Var3 = hsdVar.f13576a.getLong("fpr_rl_trace_event_count_bg");
            if (v680Var3.b() && hsd.k(((Long) v680Var3.a()).longValue())) {
                hsdVar.c.d(((Long) v680Var3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                jLongValue2 = ((Long) v680Var3.a()).longValue();
            } else {
                v680 v680VarC3 = hsdVar.c(ptdVar);
                jLongValue2 = (v680VarC3.b() && hsd.k(((Long) v680VarC3.a()).longValue())) ? ((Long) v680VarC3.a()).longValue() : 30L;
            }
        } else {
            synchronized (dtd.class) {
                dtdVar = dtd.f6650a;
                if (dtdVar == null) {
                    dtdVar = new dtd();
                    dtd.f6650a = dtdVar;
                }
            }
            v680 v680Var4 = hsdVar.f13576a.getLong("fpr_rl_network_event_count_bg");
            if (v680Var4.b() && hsd.k(((Long) v680Var4.a()).longValue())) {
                hsdVar.c.d(((Long) v680Var4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                jLongValue2 = ((Long) v680Var4.a()).longValue();
            } else {
                v680 v680VarC4 = hsdVar.c(dtdVar);
                jLongValue2 = (v680VarC4.b() && hsd.k(((Long) v680VarC4.a()).longValue())) ? ((Long) v680VarC4.a()).longValue() : 70L;
            }
        }
        long j4 = jLongValue2;
        this.f = new g2e0(j4, j3, timeUnit);
        this.h = j4;
    }

    public final synchronized void a(boolean z) {
        try {
            this.b = z ? this.e : this.f;
            this.c = z ? this.g : this.h;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0051, B:16:0x005d, B:19:0x006e, B:21:0x0076, B:10:0x0034, B:11:0x003c, B:12:0x003f, B:13:0x0048), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0051, B:16:0x005d, B:19:0x006e, B:21:0x0076, B:10:0x0034, B:11:0x003c, B:12:0x003f, B:13:0x0048), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x007b, please report this as an issue */
    public final synchronized boolean b() {
        double d;
        double d2;
        double seconds;
        double d3;
        double d4;
        try {
            Timer timer = new Timer();
            Timer timer2 = this.f40163a;
            timer2.getClass();
            double d5 = timer.b - timer2.b;
            g2e0 g2e0Var = this.b;
            long j = g2e0Var.f10555a;
            long j2 = g2e0Var.b;
            int[] iArr = f2e0.f8808a;
            TimeUnit timeUnit = (TimeUnit) g2e0Var.c;
            int i2 = iArr[timeUnit.ordinal()];
            if (i2 == 1) {
                d = j / j2;
                d2 = 1.0E9d;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        seconds = j / timeUnit.toSeconds(j2);
                    } else {
                        d = j / j2;
                        d2 = 1000.0d;
                    }
                    d3 = (d5 * seconds) / ((double) i);
                    if (d3 > 0.0d) {
                        this.d = Math.min(this.d + d3, this.c);
                        this.f40163a = timer;
                    }
                    d4 = this.d;
                    if (d4 >= 1.0d) {
                        return false;
                    }
                    this.d = d4 - 1.0d;
                    return true;
                }
                d = j / j2;
                d2 = 1000000.0d;
            }
            seconds = d * d2;
            d3 = (d5 * seconds) / ((double) i);
            if (d3 > 0.0d) {
                this.d = Math.min(this.d + d3, this.c);
                this.f40163a = timer;
            }
            d4 = this.d;
            if (d4 >= 1.0d) {
                return false;
            }
            this.d = d4 - 1.0d;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
