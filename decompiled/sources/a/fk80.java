package a;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class fk80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k06 f9678a;
    public final bvc b;
    public final lne c;
    public bby d;
    public final c4m0 e;
    public final p7m0 f;
    public final p7m0 g;

    public fk80(k06 k06Var, bvc bvcVar, lne lneVar) {
        k06Var.getClass();
        lneVar.getClass();
        this.f9678a = k06Var;
        this.b = bvcVar;
        this.c = lneVar;
        p7m0 p7m0VarA = q7m0.a(jtv.s);
        this.f = p7m0VarA;
        this.g = q7m0.a(e((wj80) p7m0VarA.getValue(), iun.f15405a));
        c4m0 c4m0Var = this.e;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.e = sac.T(new fnq(new p6d(p7m0VarA, (p7m0) k06Var.f17448a.d, new wx4((Object) this, yjeVar, (byte) 27), b), new s980(this, yjeVar, (byte) 2), (byte) 4), bvcVar, new hi70(2, this, fk80.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 4, (byte) 13));
            a(true);
        }
    }

    public static cm80 e(wj80 wj80Var, List list) {
        if (wj80Var != null) {
            if (wj80Var instanceof tj80) {
                return new tl80(((tj80) wj80Var).f34037a, list);
            }
            if (wj80Var instanceof uj80) {
                return new wl80(list, ((uj80) wj80Var).f35766a);
            }
            if (wj80Var instanceof vj80) {
                return new zl80(list, ((vj80) wj80Var).f37515a);
            }
        }
        t9f.b();
        return null;
    }

    public final void a(boolean z) {
        Object value = this.f.getValue();
        yje yjeVar = null;
        uj80 uj80Var = value instanceof uj80 ? (uj80) value : null;
        if (uj80Var == null || uj80Var.f35766a) {
            return;
        }
        bby bbyVar = this.d;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.d = sac.V(this.b, new xj80(1, this, fk80.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.c, new a220((Object) this, z, yjeVar, (byte) 6), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, zje zjeVar) {
        dk80 dk80Var;
        if (zjeVar instanceof dk80) {
            dk80Var = (dk80) zjeVar;
            int i = dk80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk80Var.k = i - Integer.MIN_VALUE;
            } else {
                dk80Var = new dk80(this, zjeVar);
            }
        } else {
            dk80Var = new dk80(this, zjeVar);
        }
        Object objA = dk80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dk80Var.k;
        p7m0 p7m0Var = this.f;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                vj80 vj80Var = new vj80(z);
                p7m0Var.getClass();
                p7m0Var.o(null, vj80Var);
                k06 k06Var = this.f9678a;
                dk80Var.k = 1;
                k06Var.getClass();
                objA = k06.a(k06Var, z, dk80Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            uj80 uj80Var = new uj80(((Boolean) objA).booleanValue());
            p7m0Var.getClass();
            p7m0Var.o(null, uj80Var);
        } catch (Throwable th) {
            c(th);
        }
        return Unit.f46060a;
    }

    public final void c(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        tj80 tj80Var = new tj80(th);
        p7m0 p7m0Var = this.f;
        p7m0Var.getClass();
        p7m0Var.o(null, tj80Var);
    }

    public final void d() {
        c4m0 c4m0Var = this.e;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar = this.d;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }
}
