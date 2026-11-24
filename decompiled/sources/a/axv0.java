package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class axv0 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ywv0 f1640a;
    public final pz40 b;

    public axv0(ywv0 ywv0Var, pz40 pz40Var) {
        ywv0Var.getClass();
        this.f1640a = ywv0Var;
        this.b = pz40Var;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        long j2;
        pu90 pu90VarS;
        list.getClass();
        pj30 pj30Var = (pj30) CollectionsKt.W(1, list);
        if (pj30Var != null) {
            j2 = j;
            pu90VarS = pj30Var.S(p4e.b(j2, 0, 0, 0, Integer.MAX_VALUE, 3));
        } else {
            j2 = j;
            pu90VarS = null;
        }
        boolean zF = p4e.f(j2);
        ywv0 ywv0Var = this.f1640a;
        pz40 pz40Var = this.b;
        if (!zF) {
            pj30 pj30Var2 = (pj30) list.get(0);
            int i = pu90VarS != null ? pu90VarS.b : 0;
            int iH = p4e.h(j2) - Math.max(si30.b(Math.max(ywv0Var.j.e() - 0.0f, ((Number) pz40Var.getValue()).intValue())), ((Number) pz40Var.getValue()).intValue() + i);
            pu90 pu90VarS2 = pj30Var2.S(p4e.b(j2, 0, 0, 0, iH < 0 ? 0 : iH, 3));
            return vj30.x(vj30Var, p4e.i(j2), ((Number) pz40Var.getValue()).intValue() + pu90VarS2.b + i, new xv2(pu90VarS2, pu90VarS, (byte) 5));
        }
        pj30 pj30Var3 = (pj30) list.get(0);
        int iH2 = p4e.h(j2);
        int i2 = pu90VarS != null ? pu90VarS.b : 0;
        int iMax = iH2 - Math.max(si30.b(Math.max(ywv0Var.j.e() - 0.0f, ((Number) pz40Var.getValue()).intValue())), ((Number) pz40Var.getValue()).intValue() + i2);
        pu90 pu90VarS3 = pj30Var3.S(p4e.b(j2, 0, 0, 0, iMax < 0 ? 0 : iMax, 3));
        int iIntValue = (iH2 - i2) - ((Number) pz40Var.getValue()).intValue();
        return vj30.x(vj30Var, p4e.i(j2), iH2, new kw7(pu90VarS3, pu90VarS, iIntValue >= 0 ? iIntValue : 0, (byte) 4));
    }

    @Override // a.tj30
    public final int c(cnx cnxVar, List list, int i) {
        cnxVar.getClass();
        int iB = ((pj30) list.get(0)).b(i);
        pj30 pj30Var = (pj30) CollectionsKt.W(1, list);
        return ((Number) this.b.getValue()).intValue() + iB + (pj30Var != null ? pj30Var.b(i) : 0);
    }
}
