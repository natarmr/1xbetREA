package a;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class kzn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lxs0 f19160a = new lxs0(zdh.Z, zdh.f1);
    public static final nul0 b = ro4.g0(0.0f, 400.0f, null, 5);
    public static final nul0 c = ro4.g0(0.0f, 400.0f, null, 5);
    public static final nul0 d;
    public static final nul0 e;

    static {
        Map map = quu0.f29360a;
        d = ro4.g0(0.0f, 400.0f, new ikx(4294967297L), 1);
        e = ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1);
    }

    public static final void a(oms0 oms0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1186853286);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(oms0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40Var = oms0Var.e;
            pz40 pz40Var2 = oms0Var.d;
            boolean z = ((hgk0) pz40Var).getValue() != null;
            hgk0 hgk0Var = (hgk0) pz40Var2;
            if (Intrinsics.d(oms0Var.f25519a.y0(), hgk0Var.getValue()) && !z) {
                function0.invoke();
            }
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj = objP;
            if (objP == cl5Var) {
                boolean[] zArr = {z};
                fetVar.o0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new Object[1];
                fetVar.o0(objP2);
            }
            Object[] objArr = (Object[]) objP2;
            if (!Intrinsics.d(objArr[0], hgk0Var.getValue())) {
                if (!z && !zArr2[0]) {
                    function0.invoke();
                }
                objArr[0] = hgk0Var.getValue();
            }
            zArr2[0] = z;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dzn(oms0Var, function0, i);
        }
    }

    public static final pzn b(cfq cfqVar, zx7 zx7Var, boolean z, Function1 function1) {
        return new pzn(new jms0((fwo) null, (e8k0) null, new isb(zx7Var, function1, cfqVar, z), (k1h0) null, (LinkedHashMap) null, 123));
    }

    public static pzn c(cfq cfqVar, yx7 yx7Var, int i) {
        zx7 zx7Var;
        yx7 yx7Var2 = gqw0.l;
        int i2 = 1;
        if ((i & 1) != 0) {
            Map map = quu0.f29360a;
            cfqVar = ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            yx7Var = yx7Var2;
        }
        boolean z = (i & 4) != 0;
        if (Intrinsics.d(yx7Var, gqw0.j)) {
            zx7Var = gqw0.b;
        } else {
            zx7Var = Intrinsics.d(yx7Var, yx7Var2) ? gqw0.h : gqw0.e;
        }
        return b(cfqVar, zx7Var, z, new mnu0(i2, (byte) 9));
    }

    public static pzn d(cfq cfqVar, float f, int i) {
        if ((i & 1) != 0) {
            cfqVar = ro4.g0(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new pzn(new jms0(new fwo(f, cfqVar), (e8k0) null, (isb) null, (k1h0) null, (LinkedHashMap) null, 126));
    }

    public static alo e(cfq cfqVar, int i) {
        if ((i & 1) != 0) {
            cfqVar = ro4.g0(0.0f, 400.0f, null, 5);
        }
        return new alo(new jms0(new fwo(0.0f, cfqVar), (e8k0) null, (isb) null, (k1h0) null, (LinkedHashMap) null, 126));
    }

    public static pzn f(uts0 uts0Var, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new pzn(new jms0((fwo) null, (e8k0) null, (isb) null, new k1h0(f, ils0.b, uts0Var), (LinkedHashMap) null, 119));
    }

    public static alo g(uts0 uts0Var, float f, int i) {
        cfq cfqVarG0 = uts0Var;
        if ((i & 1) != 0) {
            cfqVarG0 = ro4.g0(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new alo(new jms0((fwo) null, (e8k0) null, (isb) null, new k1h0(f, ils0.b, cfqVarG0), (LinkedHashMap) null, 119));
    }

    public static alo h() {
        Map map = quu0.f29360a;
        return new alo(new jms0((fwo) null, (e8k0) null, new isb(gqw0.i, gzn.e, ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), true), (k1h0) null, (LinkedHashMap) null, 123));
    }

    public static alo i(cfq cfqVar, yx7 yx7Var, int i) {
        zx7 zx7Var;
        yx7 yx7Var2 = gqw0.l;
        int i2 = 1;
        if ((i & 1) != 0) {
            Map map = quu0.f29360a;
            cfqVar = ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            yx7Var = yx7Var2;
        }
        boolean z = (i & 4) != 0;
        if (Intrinsics.d(yx7Var, gqw0.j)) {
            zx7Var = gqw0.b;
        } else {
            zx7Var = Intrinsics.d(yx7Var, yx7Var2) ? gqw0.h : gqw0.e;
        }
        return new alo(new jms0((fwo) null, (e8k0) null, new isb(zx7Var, new mnu0(i2, (byte) 10), cfqVar, z), (k1h0) null, (LinkedHashMap) null, 123));
    }

    public static final pzn j(cfq cfqVar, Function1 function1) {
        return new pzn(new jms0((fwo) null, new e8k0(cfqVar, new jzn(function1, (byte) 1)), (isb) null, (k1h0) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ pzn k(uts0 uts0Var, Function1 function1, int i) {
        cfq cfqVarG0 = uts0Var;
        if ((i & 1) != 0) {
            Map map = quu0.f29360a;
            cfqVarG0 = ro4.g0(0.0f, 400.0f, new ikx(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            function1 = gzn.f;
        }
        return j(cfqVarG0, function1);
    }

    public static final alo l(cfq cfqVar, Function1 function1) {
        return new alo(new jms0((fwo) null, new e8k0(cfqVar, new jzn(function1, (byte) 2)), (isb) null, (k1h0) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ alo m(Function1 function1) {
        Map map = quu0.f29360a;
        return l(ro4.g0(0.0f, 400.0f, new ikx(4294967297L), 1), function1);
    }
}
