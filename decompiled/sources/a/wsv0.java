package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class wsv0 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywv0 f39711a;
    public final pz40 b;
    public final pz40 c;

    public wsv0(ywv0 ywv0Var, pz40 pz40Var, pz40 pz40Var2) {
        ywv0Var.getClass();
        this.f39711a = ywv0Var;
        this.b = pz40Var;
        this.c = pz40Var2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        list.getClass();
        if (list.isEmpty()) {
            return vj30.x(vj30Var, 0, 0, new ejv0((byte) 17));
        }
        nuv0 nuv0Var = (nuv0) this.b.getValue();
        int i = p4e.i(j);
        pj30 pj30Var = (pj30) CollectionsKt.U(list);
        boolean zM = vj30Var.M();
        ywv0 ywv0Var = this.f39711a;
        if (!zM) {
            vkr0 vkr0Var = ywv0Var.m;
            int iIntValue = ((Number) this.c.getValue()).intValue();
            trm0 trm0Var = (trm0) vkr0Var.d;
            pz40 pz40Var = (pz40) trm0Var.b;
            pz40 pz40Var2 = (pz40) trm0Var.c;
            if (((Number) ((hgk0) pz40Var).getValue()).intValue() != iIntValue || ((Number) ((hgk0) pz40Var2).getValue()).intValue() != i) {
                ((hgk0) ((pz40) trm0Var.b)).setValue(Integer.valueOf(iIntValue));
                ((hgk0) pz40Var2).setValue(Integer.valueOf(i));
            }
            nuv0Var.getClass();
            int i2 = nuv0Var.f24164a - nuv0Var.b;
            if (i2 < 0) {
                i2 = 0;
            }
            int iD = l1e0.d(si30.b(((Number) ((t33) ywv0Var.d.c).d()).floatValue()), 0, i2);
            if (!((i >= 0) & (iD >= 0))) {
                zcx.a("width and height must be >= 0");
            }
            return vj30.x(vj30Var, i, iD, new klo0(pj30Var.S(r4e.h(i, i, iD, iD)), (byte) 8));
        }
        nuv0Var.getClass();
        int i3 = nuv0Var.f24164a - nuv0Var.b;
        if (i3 < 0) {
            i3 = 0;
        }
        pu90 pu90VarS = pj30Var.S(r4e.a(i, i, 0, i3));
        fht0 fht0Var = ywv0Var.c;
        int i4 = nuv0Var.f24164a;
        int i5 = nuv0Var.b;
        int i6 = nuv0Var.c;
        int i7 = nuv0Var.d;
        int i8 = nuv0Var.e;
        int i9 = pu90VarS.b;
        cvv0 cvv0VarF = fht0Var.f();
        if ((cvv0VarF == null || cvv0VarF.f5049a != i4 || cvv0VarF.b != i5 || cvv0VarF.c != i6 || cvv0VarF.d != i7 || cvv0VarF.e != i8 || cvv0VarF.f != i9) && (cvv0VarF == null || !((tly) ((duv0) fht0Var.b).b().getValue()).f34169a)) {
            cvv0 cvv0Var = new cvv0(i4, i5, i6, i7, i8, i9, ((h0q0) fht0Var.f9559a).l());
            ((hgk0) ((pz40) fht0Var.c)).setValue(cvv0Var);
            fht0Var.d = nsm0.x(cvv0Var);
        }
        return vj30.x(vj30Var, i, pu90VarS.b, new klo0(pu90VarS, (byte) 9));
    }
}
