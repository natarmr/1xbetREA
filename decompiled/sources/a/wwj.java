package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wwj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lh80 f39888a;

    static {
        zcl zclVar = qmk.f28987a;
        f39888a = s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5);
    }

    public static final void a(pz40 pz40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-84888930);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(pz40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            b8k0.d(o2e.e0(vtb.U(o7k0.c, ((Boolean) l7m0Var.getValue()).booleanValue()), "DEFAULT_LAZY_COLUMN"), xczVar, pz40Var, null, knm0.g(f39888a, fetVar), false, null, u1c.M(-2071479136, new x2g((Object) qdzVar, (Object) function2, (Object) function1, (Object) xfn.a(fetVar), (byte) 16), fetVar), fetVar, ((i2 >> 3) & 112) | 100663296 | ((i2 << 6) & 896), 216);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwj(pz40Var, l7m0Var, xczVar, qdzVar, function1, function2, i, (byte) 0);
        }
    }
}
