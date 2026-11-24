package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class dae0 extends kkq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dae0(kzj0 kzj0Var, kzj0 kzj0Var2) {
        super(kzj0Var, kzj0Var2);
        kzj0Var.getClass();
        kzj0Var2.getClass();
        ysy.f43192a.b(kzj0Var, kzj0Var2);
    }

    public static final ArrayList p0(iek iekVar, wsy wsyVar) {
        List<pzs0> listJ = wsyVar.J();
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        for (pzs0 pzs0Var : listJ) {
            pzs0Var.getClass();
            StringBuilder sb = new StringBuilder();
            CollectionsKt.a0(kotlin.collections.a.c(pzs0Var), sb, ", ", null, null, new hek(iekVar, (byte) 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String q0(String str, String str2) {
        if (!StringsKt.P(str, '<')) {
            return str;
        }
        return StringsKt.q0(str, '<') + '<' + str2 + '>' + StringsKt.o0('>', str, str);
    }

    @Override // a.wsy
    public final wsy f0(cty ctyVar) {
        kzj0 kzj0Var = this.b;
        kzj0Var.getClass();
        kzj0 kzj0Var2 = this.c;
        kzj0Var2.getClass();
        return new dae0(kzj0Var, kzj0Var2);
    }

    @Override // a.tft0
    public final tft0 k0(boolean z) {
        return new dae0(this.b.k0(z), this.c.k0(z));
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: l0 */
    public final tft0 f0(cty ctyVar) {
        kzj0 kzj0Var = this.b;
        kzj0Var.getClass();
        kzj0 kzj0Var2 = this.c;
        kzj0Var2.getClass();
        return new dae0(kzj0Var, kzj0Var2);
    }

    @Override // a.tft0
    public final tft0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new dae0(this.b.m0(ays0Var), this.c.m0(ays0Var));
    }

    @Override // a.kkq
    public final kzj0 n0() {
        return this.b;
    }

    @Override // a.kkq
    public final String o0(iek iekVar, iek iekVar2) {
        kzj0 kzj0Var = this.b;
        String strP = iekVar.P(kzj0Var);
        kzj0 kzj0Var2 = this.c;
        String strP2 = iekVar.P(kzj0Var2);
        if (iekVar2.f14637a.p()) {
            return "raw (" + strP + ".." + strP2 + ')';
        }
        if (kzj0Var2.J().isEmpty()) {
            return iekVar.w(strP, strP2, vsm0.q(this));
        }
        ArrayList arrayListP0 = p0(iekVar, kzj0Var);
        ArrayList arrayListP1 = p0(iekVar, kzj0Var2);
        String strB0 = CollectionsKt.b0(arrayListP0, ", ", null, null, b180.h, 30);
        ArrayList arrayListT0 = CollectionsKt.T0(arrayListP0, arrayListP1);
        if (!arrayListT0.isEmpty()) {
            Iterator it = arrayListT0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strP2 = q0(strP2, strB0);
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.f46059a;
                String str2 = (String) pair.b;
                if (!Intrinsics.d(str, StringsKt.d0("out ", str2)) && !str2.equals(Separators.STAR)) {
                    break;
                }
            }
        } else {
            strP2 = q0(strP2, strB0);
            break;
        }
        String strQ0 = q0(strP, strB0);
        return strQ0.equals(strP2) ? strQ0 : iekVar.w(strQ0, strP2, vsm0.q(this));
    }

    @Override // a.kkq, a.wsy
    public final cr30 y() {
        foc focVarN = S().n();
        wm40 wm40Var = focVarN instanceof wm40 ? (wm40) focVarN : null;
        if (wm40Var == null) {
            e9d0.x(S().n(), "Incorrect classifier: ");
            return null;
        }
        cr30 cr30VarJ = wm40Var.J(new cae0());
        cr30VarJ.getClass();
        return cr30VarJ;
    }
}
