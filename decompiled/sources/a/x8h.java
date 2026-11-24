package a;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class x8h implements tj30 {
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(mrv.i0((pj30) obj), obj);
        }
        pj30 pj30Var = (pj30) linkedHashMap.get(s8k0.f31806a);
        pj30 pj30Var2 = (pj30) linkedHashMap.get(b9k0.f2215a);
        pj30 pj30Var3 = (pj30) linkedHashMap.get(h9k0.f12682a);
        pj30 pj30Var4 = (pj30) linkedHashMap.get(u8k0.f35236a);
        pj30 pj30Var5 = (pj30) linkedHashMap.get(d9k0.f5705a);
        pj30 pj30Var6 = (pj30) linkedHashMap.get(w8k0.f38726a);
        pj30 pj30Var7 = (pj30) linkedHashMap.get(f9k0.f9158a);
        pj30 pj30Var8 = (pj30) linkedHashMap.get(q8k0.f28305a);
        pj30 pj30Var9 = (pj30) linkedHashMap.get(j9k0.f16144a);
        pj30 pj30Var10 = (pj30) linkedHashMap.get(m9k0.f21414a);
        int i = p4e.i(j) / 2;
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(54.0f) / 2;
        int iT2 = vj30Var.T(2.0f);
        if (pj30Var3 != null) {
            int iT3 = vj30Var.T(64.0f);
            int iT4 = vj30Var.T(24.0f);
            if (!((iT3 >= 0) & (iT4 >= 0))) {
                zcx.a("width and height must be >= 0");
            }
            pu90VarS = pj30Var3.S(r4e.h(iT3, iT3, iT4, iT4));
        } else {
            pu90VarS = null;
        }
        long jQ = lgb.Q(vj30Var.T(16.0f));
        pu90 pu90VarS2 = pj30Var != null ? pj30Var.S(jQ) : null;
        pu90 pu90VarS3 = pj30Var2 != null ? pj30Var2.S(jQ) : null;
        long jP = lgb.P(vj30Var.T(32.0f), vj30Var.T(32.0f));
        pu90 pu90VarS4 = pj30Var4 != null ? pj30Var4.S(jP) : null;
        pu90 pu90VarS5 = pj30Var5 != null ? pj30Var5.S(jP) : null;
        int i2 = ((((p4e.i(j) - vj30Var.T(48.0f)) - (vj30Var.T(16.0f) * 2)) - (vj30Var.T(32.0f) * 2)) - vj30Var.T(52.0f)) / 2;
        long jQ2 = lgb.Q(i2 < 0 ? 0 : i2);
        return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new w8h(this, pu90VarS, pu90VarS2, pu90VarS3, pu90VarS4, pu90VarS5, pj30Var6 != null ? pj30Var6.S(jQ2) : null, pj30Var7 != null ? pj30Var7.S(jQ2) : null, iT, i, iT2, j, pj30Var9 != null ? pj30Var9.S(lgb.P(vj30Var.T(74.0f), vj30Var.T(18.0f))) : null, pj30Var10 != null ? pj30Var10.S(lgb.P(vj30Var.T(28.0f), vj30Var.T(18.0f))) : null, pj30Var8 != null ? pj30Var8.S(lgb.Q(p4e.i(j))) : null, (byte) 0));
    }
}
