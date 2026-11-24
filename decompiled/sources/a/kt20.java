package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class kt20 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f18842a;
    public final /* synthetic */ float b;

    public kt20(float f, float f2) {
        this.f18842a = f;
        this.b = f2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        list.getClass();
        int iT = vj30Var.T(this.f18842a);
        int iT2 = vj30Var.T(this.b);
        int i = p4e.i(j);
        int i2 = ((int) (i * 0.6f)) - iT;
        int i3 = i2 < 0 ? 0 : i2;
        pj30 pj30Var = (pj30) CollectionsKt.W(1, list);
        pu90 pu90VarS = pj30Var != null ? pj30Var.S(p4e.b(j, 0, i3, 0, 0, 13)) : null;
        int i4 = ((i - (pu90VarS != null ? pu90VarS.f27604a : 0)) - (iT * 2)) - iT2;
        int i5 = i4 < 0 ? 0 : i4;
        pj30 pj30Var2 = (pj30) CollectionsKt.W(0, list);
        pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(p4e.b(j, 0, i5, 0, 0, 13)) : null;
        int iMax = Math.max(pu90VarS2 != null ? pu90VarS2.b : 0, pu90VarS != null ? pu90VarS.b : 0);
        return vj30.x(vj30Var, i, iMax, new lw7(pu90VarS2, iT, iMax, pu90VarS, i, (byte) 5));
    }
}
