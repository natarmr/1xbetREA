package a;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fdx extends nw70 {
    @Override // a.nw70, a.qjt
    public final void a(htw htwVar, String str, j jVar) {
        Unit unit;
        String strA;
        jVar.getClass();
        c(htwVar, str, jVar);
        for (j jVar2 : d(jVar)) {
            if (jVar2 instanceof fiz) {
                ar20 ar20Var = jVar2.f15657a;
                dgu dguVar = htwVar.f13654a;
                HashMap map = (HashMap) dguVar.c;
                String str2 = (String) dguVar.f6058a;
                qjt qjtVar = (qjt) map.get(ar20Var);
                if (qjtVar != null) {
                    qjtVar.a(htwVar, str2, jVar2);
                    unit = Unit.f46060a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (Intrinsics.d(ar20Var, cy2.z)) {
                        strA = "";
                    } else {
                        Map map2 = tzn.f34812a;
                        strA = tzn.a(dwi0.N(jVar2, str2), true, true);
                    }
                    htwVar.f0(strA);
                }
            } else {
                aad.F(jVar2, htwVar);
            }
        }
        b(htwVar, str, jVar);
    }

    public List d(j jVar) {
        jVar.getClass();
        return jVar.a();
    }
}
