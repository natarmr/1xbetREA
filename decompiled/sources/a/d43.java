package a;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nul0 f5435a = ro4.g0(0.0f, 0.0f, null, 7);
    public static final nul0 b;

    static {
        Map map = quu0.f29360a;
        b = ro4.g0(0.0f, 0.0f, new ycl(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final l7m0 a(float f, cfq cfqVar, String str, fet fetVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            cfqVar = b;
        }
        cfq cfqVar2 = cfqVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new ycl(f), hp4.l, cfqVar2, null, str, null, fetVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final l7m0 b(float f, j73 j73Var, String str, Function1 function1, fet fetVar, int i, int i2) {
        int i3 = i2 & 2;
        nul0 nul0Var = f5435a;
        j73 j73Var2 = i3 != 0 ? nul0Var : j73Var;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        Function1 function2 = (i2 & 16) != 0 ? null : function1;
        if (j73Var2 == nul0Var) {
            fetVar.e0(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && fetVar.d(0.01f)) || (i & 384) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = ro4.g0(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                fetVar.o0(objP);
            }
            j73Var2 = (nul0) objP;
            fetVar.r(false);
        } else {
            fetVar.e0(1144225701);
            fetVar.r(false);
        }
        int i4 = i << 3;
        return c(Float.valueOf(f), hp4.j, j73Var2, null, str2, function2, fetVar, (i4 & 458752) | (i & 14) | (57344 & i4), 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    public static final l7m0 c(Object obj, lxs0 lxs0Var, j73 j73Var, Float f, String str, Function1 function1, fet fetVar, int i, int i2) {
        j73 nul0Var;
        Float f2 = (i2 & 8) != 0 ? null : f;
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (objP == obj2) {
            objP = androidx.compose.runtime.e.e(null);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj2) {
            objP2 = new t33(obj, lxs0Var, f2);
            fetVar.o0(objP2);
        }
        t33 t33Var = (t33) objP2;
        Object objF = androidx.compose.runtime.e.f(function1, fetVar);
        if (f2 == null || !(j73Var instanceof nul0)) {
            nul0Var = j73Var;
        } else {
            nul0 nul0Var2 = (nul0) j73Var;
            if (Intrinsics.d(nul0Var2.c, f2)) {
                nul0Var = j73Var;
            } else {
                nul0Var = new nul0(nul0Var2.f24154a, nul0Var2.b, f2);
            }
        }
        Object objF2 = androidx.compose.runtime.e.f(nul0Var, fetVar);
        Object objP3 = fetVar.P();
        if (objP3 == obj2) {
            objP3 = vtb.d(-1, null, null, 6);
            fetVar.o0(objP3);
        }
        Object obj3 = (htb) objP3;
        boolean zI = fetVar.i(obj3) | ((((i & 14) ^ 6) > 4 && fetVar.i(obj)) || (i & 6) == 4);
        Object objP4 = fetVar.P();
        if (zI || objP4 == obj2) {
            objP4 = new mc(obj3, obj, (byte) 25);
            fetVar.o0(objP4);
        }
        m0x0.D((Function0) objP4, fetVar);
        boolean zI2 = fetVar.i(obj3) | fetVar.i(t33Var) | fetVar.g(objF2) | fetVar.g(objF);
        Object objP5 = fetVar.P();
        if (zI2 || objP5 == obj2) {
            Object c43Var = new c43(obj3, (Object) t33Var, objF2, objF, (yje) null, (byte) 0);
            fetVar.o0(c43Var);
            objP5 = c43Var;
        }
        m0x0.t(fetVar, obj3, (Function2) objP5);
        l7m0 l7m0Var = (l7m0) pz40Var.getValue();
        return l7m0Var == null ? t33Var.c : l7m0Var;
    }
}
