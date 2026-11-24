package a;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public abstract class mir {
    public static final wfr Companion = new wfr();
    public static final a8z b = maz.a(wez.f39042a, new s9r(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21858a;

    public /* synthetic */ mir(int i, String str) {
        if ((i & 1) == 0) {
            this.f21858a = null;
        } else {
            this.f21858a = str;
        }
    }

    public static final /* synthetic */ void d(mir mirVar, cld cldVar, ugi0 ugi0Var) {
        if (!cldVar.u(ugi0Var) && mirVar.f21858a == null) {
            return;
        }
        cldVar.p(ugi0Var, 0, ysm0.f43175a, mirVar.f21858a);
    }

    public final agr a(vby vbyVar) {
        vbyVar.getClass();
        String strC = c();
        mcy mcyVarC = vbyVar.c(Companion.serializer(), this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jdy jdyVarC = ncy.c(strC);
        jdyVarC.getClass();
        return new agr(strC, ntm0.c("\n            window.dispatchEvent(\n                new CustomEvent('GPWebAppEvent', {\n                    detail: " + new edy(linkedHashMap).toString() + "\n                })\n            );\n        "));
    }

    public final agr b(Pair... pairArr) {
        String strN = ohs0.n(c(), "Result");
        bzu bzuVar = new bzu((byte) 19);
        for (Pair pair : pairArr) {
            String str = (String) pair.f46059a;
            Object obj = pair.b;
            if (obj != null) {
                if (obj instanceof String) {
                    cww.G(bzuVar, str, (String) obj);
                } else if (obj instanceof Number) {
                    cww.F(bzuVar, str, (Number) obj);
                } else if (obj instanceof Boolean) {
                    cww.E(bzuVar, str, (Boolean) obj);
                } else if (obj instanceof mcy) {
                    bzuVar.h((mcy) obj, str);
                }
            }
        }
        cww.E(bzuVar, "result", Boolean.TRUE);
        edy edyVarA = bzuVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jdy jdyVarC = ncy.c(strN);
        jdyVarC.getClass();
        jdy jdyVarC2 = ncy.c(this.f21858a);
        jdyVarC2.getClass();
        return new agr(strN, ntm0.c("\n            window.dispatchEvent(\n                new CustomEvent('GPWebAppEvent', {\n                    detail: " + new edy(linkedHashMap).toString() + "\n                })\n            );\n        "));
    }

    public abstract String c();
}
