package a;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class bl6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvt0 f2779a;
    public final xyt b;
    public final knf0 c;
    public final mne d;
    public final he1 e;
    public final xi6 f;
    public final jym0 g;
    public final yvf h;
    public final i9s i;
    public final k3h0 j;
    public final pc90 k;

    public bl6(fvt0 fvt0Var, xyt xytVar, knf0 knf0Var, mne mneVar, he1 he1Var, xi6 xi6Var, jym0 jym0Var, yvf yvfVar, i9s i9sVar, k3h0 k3h0Var, pc90 pc90Var) {
        knf0Var.getClass();
        xi6Var.getClass();
        jym0Var.getClass();
        yvfVar.getClass();
        i9sVar.getClass();
        k3h0Var.getClass();
        pc90Var.getClass();
        this.f2779a = fvt0Var;
        this.b = xytVar;
        this.c = knf0Var;
        this.d = mneVar;
        this.e = he1Var;
        this.f = xi6Var;
        this.g = jym0Var;
        this.h = yvfVar;
        this.i = i9sVar;
        this.j = k3h0Var;
        this.k = pc90Var;
    }

    public final Unit a() {
        Object value;
        xi6 xi6Var = this.f;
        p7m0 p7m0Var = xi6Var.f40929a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ch6.f4346a));
        xi6Var.b.clear();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(yf6 yf6Var, zje zjeVar) {
        yk6 yk6Var;
        Object g0g0Var;
        Object value;
        Object obj;
        if (zjeVar instanceof yk6) {
            yk6Var = (yk6) zjeVar;
            int i = yk6Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yk6Var.k = i - Integer.MIN_VALUE;
            } else {
                yk6Var = new yk6(this, zjeVar);
            }
        } else {
            yk6Var = new yk6(this, zjeVar);
        }
        Object objD0 = yk6Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yk6Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.d.b;
                td6 td6Var = new td6((Object) this, (Object) yf6Var, yjeVar, (byte) 3);
                yk6Var.k = 1;
                objD0 = qjj.d0(dvjVar, td6Var, yk6Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            g0g0Var = (List) objD0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            if (!hic.C(thA)) {
                p7m0 p7m0Var = this.f.f40929a;
                do {
                    value = p7m0Var.getValue();
                    obj = (eh6) value;
                    if (!(obj instanceof dh6)) {
                        obj = bh6.f2590a;
                    }
                } while (!p7m0Var.m(value, obj));
            }
        }
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(long j, boolean z, are areVar, zje zjeVar) {
        zk6 zk6Var;
        boolean z2;
        boolean z3;
        Object g0g0Var;
        if (zjeVar instanceof zk6) {
            zk6Var = (zk6) zjeVar;
            int i = zk6Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zk6Var.l = i - Integer.MIN_VALUE;
            } else {
                zk6Var = new zk6(this, zjeVar);
            }
        } else {
            zk6Var = new zk6(this, zjeVar);
        }
        zk6 zk6Var2 = zk6Var;
        Object objD0 = zk6Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = zk6Var2.l;
        if (i2 == 0) {
            z1x.P(objD0);
            try {
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.d.b;
                al6 al6Var = new al6(areVar, this, j, z, null);
                zk6Var2.i = z;
                zk6Var2.l = 1;
                objD0 = qjj.d0(dvjVar, al6Var, zk6Var2);
                if (objD0 == wneVar) {
                    return wneVar;
                }
                z3 = z;
            } catch (Throwable th) {
                th = th;
                z2 = z;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
                z3 = z2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = zk6Var2.i;
            try {
                z1x.P(objD0);
            } catch (Throwable th2) {
                th = th2;
                z2 = z3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
                z3 = z2;
            }
        }
        g0g0Var = (j9s) objD0;
        e0g0 e0g0Var4 = j0g0.b;
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        try {
            i2o i2oVar = z3 ? i2o.LiveGameFinished : i2o.LineGameFinished;
            if ((thA instanceof CancellationException) || hic.C(thA)) {
                throw thA;
            }
            boolean z4 = thA instanceof zhi0;
            if (z4 && ((zhi0) thA).c == i2oVar) {
                throw thA;
            }
            if (thA instanceof ff5) {
                throw new qh6();
            }
            if (z4) {
                throw new qh6();
            }
            throw thA;
        } catch (Throwable th3) {
            e0g0 e0g0Var5 = j0g0.b;
            return new g0g0(th3);
        }
    }
}
