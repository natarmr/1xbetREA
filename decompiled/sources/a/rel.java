package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rel extends lm40 implements v6z {
    public qv2 o;
    public Function2 p;
    public ma80 q;
    public boolean r;

    @Override // a.lm40
    public final void S0() {
        this.r = false;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(j);
        if (!vj30Var.M() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new qkx((((long) pu90VarS.b) & 4294967295L) | (((long) pu90VarS.f27604a) << 32)), new p4e(j));
            qv2 qv2Var = this.o;
            no20 no20Var = (no20) pair.f46059a;
            Object obj = pair.b;
            if (!Intrinsics.d(qv2Var.j(), no20Var)) {
                ((hgk0) ((pz40) qv2Var.j)).setValue(no20Var);
                k050 k050Var = ((omx) qv2Var.f).b;
                boolean zG = k050Var.g();
                if (zG) {
                    try {
                        mv2 mv2Var = (mv2) qv2Var.n;
                        float fD = qv2Var.j().d(obj);
                        if (!Float.isNaN(fD)) {
                            mv2.a(mv2Var, fD);
                            qv2Var.x(null);
                        }
                        qv2Var.w(obj);
                        k050Var.c(null);
                    } catch (Throwable th) {
                        k050Var.c(null);
                        throw th;
                    }
                }
                if (!zG) {
                    qv2Var.x(obj);
                }
            }
        }
        this.r = vj30Var.M() || this.r;
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new sw8((Object) vj30Var, (Object) this, (Object) pu90VarS, (byte) 26));
    }
}
