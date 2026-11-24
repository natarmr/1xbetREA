package a;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ug40 extends lm40 implements vld, v6z {
    public LinkedHashMap o;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        float f = ((ycl) mbc.R(this, rlx.c)).f42389a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        pu90 pu90VarS = pj30Var.S(j);
        boolean z = this.n && !Float.isNaN(f) && ycl.a(f, 0.0f) > 0;
        int iT = !Float.isNaN(f) ? vj30Var.T(f) : 0;
        int iMax = pu90VarS.f27604a;
        if (z) {
            iMax = Math.max(iMax, iT);
        }
        int iMax2 = pu90VarS.b;
        if (z) {
            iMax2 = Math.max(iMax2, iT);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.o = linkedHashMap;
            }
            gcu0 gcu0Var = rlx.b;
            int iRound = Math.round((iT - pu90VarS.f27604a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(gcu0Var, Integer.valueOf(iRound));
            ykw ykwVar = rlx.f30719a;
            int iRound2 = Math.round((iT - pu90VarS.b) / 2.0f);
            linkedHashMap.put(ykwVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.o;
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        return vj30Var.i0(iMax, iMax2, map, new mw7(iMax, pu90VarS, iMax2));
    }
}
