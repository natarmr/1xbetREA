package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class a2g implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122a;

    public a2g(int i) {
        this.f122a = i;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        list.getClass();
        zcl zclVar = qmk.f28987a;
        int iT = vj30Var.T(4.0f);
        final int iT2 = vj30Var.T(8.0f);
        int iT3 = vj30Var.T(36.0f);
        int iT4 = vj30Var.T(114.0f);
        int iMin = Math.min((int) (this.f122a * 0.9f), vj30Var.T(400.0f));
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(mrv.i0((pj30) obj), obj);
        }
        pj30 pj30Var = (pj30) linkedHashMap.get(z8k0.f43971a);
        pj30 pj30Var2 = (pj30) linkedHashMap.get(n8k0.f23094a);
        pj30 pj30Var3 = (pj30) linkedHashMap.get(y8k0.f42200a);
        pj30 pj30Var4 = (pj30) linkedHashMap.get(x8k0.f40466a);
        pj30 pj30Var5 = (pj30) linkedHashMap.get(o8k0.f24834a);
        pj30 pj30Var6 = (pj30) linkedHashMap.get(k9k0.f17919a);
        pu90 pu90VarS = pj30Var != null ? pj30Var.S(lgb.P(iMin, iT4)) : null;
        pu90 pu90VarS2 = pj30Var2 != null ? pj30Var2.S(lgb.P(iT3, iT3)) : null;
        int i = pu90VarS2 == null ? iT2 : pu90VarS2.f27604a + iT2 + iT;
        if (iT3 < 0) {
            zcx.a("height must be >= 0");
        }
        pu90 pu90VarS3 = pj30Var3 != null ? pj30Var3.S(r4e.h(0, Integer.MAX_VALUE, iT3, iT3)) : null;
        int i2 = pu90VarS3 == null ? 0 : (pu90VarS3 != null ? pu90VarS3.f27604a : 0) + iT;
        if (iT3 < 0) {
            zcx.a("height must be >= 0");
        }
        pu90 pu90VarS4 = pj30Var4 != null ? pj30Var4.S(r4e.h(0, Integer.MAX_VALUE, iT3, iT3)) : null;
        final int i3 = i2 + i;
        long jP = lgb.P(iT3, iT3);
        final pu90 pu90VarS5 = pj30Var5 != null ? pj30Var5.S(jP) : null;
        final int i4 = (iMin - iT3) - iT2;
        final int i5 = (iT4 - iT3) - iT2;
        pu90 pu90VarS6 = pj30Var6 != null ? pj30Var6.S(lgb.Q(((iMin - (iT2 * 2)) - p4e.i(jP)) - iT2)) : null;
        final int i6 = (iT4 - (pu90VarS6 != null ? pu90VarS6.b : 0)) - iT2;
        final pu90 pu90Var = pu90VarS3;
        final int i7 = i;
        final pu90 pu90Var2 = pu90VarS;
        final pu90 pu90Var3 = pu90VarS2;
        final pu90 pu90Var4 = pu90VarS6;
        final pu90 pu90Var5 = pu90VarS4;
        return vj30.x(vj30Var, iMin, iT4, new Function1() { // from class: a.z1g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ou90 ou90Var = (ou90) obj2;
                ou90Var.getClass();
                pu90 pu90Var6 = pu90Var2;
                if (pu90Var6 != null) {
                    ou90Var.m(pu90Var6, 0, 0, 0.0f);
                }
                pu90 pu90Var7 = pu90Var3;
                if (pu90Var7 != null) {
                    ou90Var.m(pu90Var7, iT2, iT2, 0.0f);
                }
                pu90 pu90Var8 = pu90Var;
                if (pu90Var8 != null) {
                    ou90Var.m(pu90Var8, i7, iT2, 0.0f);
                }
                pu90 pu90Var9 = pu90Var5;
                if (pu90Var9 != null) {
                    ou90Var.m(pu90Var9, i3, iT2, 0.0f);
                }
                pu90 pu90Var10 = pu90VarS5;
                if (pu90Var10 != null) {
                    ou90Var.m(pu90Var10, i4, i5, 0.0f);
                }
                pu90 pu90Var11 = pu90Var4;
                if (pu90Var11 != null) {
                    ou90Var.m(pu90Var11, iT2, i6, 0.0f);
                }
                return Unit.f46060a;
            }
        });
    }
}
