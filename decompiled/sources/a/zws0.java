package a;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zws0 implements tj30 {
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
        pj30 pj30Var = (pj30) linkedHashMap.get(v8k0.f36989a);
        pj30 pj30Var2 = (pj30) linkedHashMap.get(t8k0.f33515a);
        pj30 pj30Var3 = (pj30) linkedHashMap.get(r8k0.f30032a);
        pj30 pj30Var4 = (pj30) linkedHashMap.get(g9k0.f10918a);
        pj30 pj30Var5 = (pj30) linkedHashMap.get(a9k0.f482a);
        pj30 pj30Var6 = (pj30) linkedHashMap.get(c9k0.f3966a);
        pj30 pj30Var7 = (pj30) linkedHashMap.get(e9k0.f7426a);
        pj30 pj30Var8 = (pj30) linkedHashMap.get(p8k0.f26559a);
        pj30 pj30Var9 = (pj30) linkedHashMap.get(i9k0.f14392a);
        pj30 pj30Var10 = (pj30) linkedHashMap.get(l9k0.f19657a);
        int i = p4e.i(j) / 2;
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(54.0f) / 2;
        int iT2 = vj30Var.T(8.0f);
        if (pj30Var4 != null) {
            int iT3 = vj30Var.T(64.0f);
            int iT4 = vj30Var.T(24.0f);
            if (!((iT3 >= 0) & (iT4 >= 0))) {
                zcx.a("width and height must be >= 0");
            }
            pu90VarS = pj30Var4.S(r4e.h(iT3, iT3, iT4, iT4));
        } else {
            pu90VarS = null;
        }
        long jP = lgb.P(vj30Var.T(32.0f), vj30Var.T(32.0f));
        pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(jP) : null;
        pu90 pu90VarS3 = pj30Var6 != null ? pj30Var6.S(jP) : null;
        pu90 pu90VarS4 = pj30Var3 != null ? pj30Var3.S(r4e.b(0, 0, 0, 0, 15)) : null;
        pu90 pu90VarS5 = pj30Var5 != null ? pj30Var5.S(r4e.b(0, 0, 0, 0, 15)) : null;
        int i2 = pu90VarS2 != null ? pu90VarS2.f27604a : 0;
        int i3 = pu90VarS3 != null ? pu90VarS3.f27604a : 0;
        int i4 = pu90VarS != null ? pu90VarS.f27604a : 0;
        int i5 = i - (i4 / 2);
        int i6 = i5 + i4 + iT2;
        int i7 = i2 > 0 ? (i2 > 0 ? (i5 - iT2) - i2 : i5 - iT2) - iT2 : i5 - iT2;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = p4e.i(j) - (i3 > 0 ? (i6 + i3) + iT2 : (i5 + i4) + iT2);
        return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new w8h(this, pu90VarS, pu90VarS2, pu90VarS4, pu90VarS5, pu90VarS3, pj30Var != null ? pj30Var.S(lgb.Q(i7)) : null, pj30Var7 != null ? pj30Var7.S(lgb.Q(i8 >= 0 ? i8 : 0)) : null, iT, i, iT2, j, pj30Var9 != null ? pj30Var9.S(lgb.P(vj30Var.T(74.0f), vj30Var.T(18.0f))) : null, pj30Var10 != null ? pj30Var10.S(lgb.P(vj30Var.T(28.0f), vj30Var.T(18.0f))) : null, pj30Var8 != null ? pj30Var8.S(lgb.Q(p4e.i(j))) : null, (byte) 1));
    }
}
