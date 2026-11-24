package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class x480 {
    public static void a(mm40 mm40Var, Fragment fragment, v480 v480Var, fet fetVar) {
        Object ah0Var;
        mm40Var.getClass();
        v480Var.getClass();
        i3m0 i3m0Var = v480Var.e;
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
            af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(u480.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                if (!(ze3Var instanceof u480)) {
                    ze3Var = null;
                }
                u480 u480Var = (u480) ze3Var;
                if (u480Var != null) {
                    LinkedHashMap linkedHashMap = xbv0.f40619a;
                    String strB = xbv0.b(v480Var.f36764a, efx.v(fragment).f4046a);
                    Application application = fragment.n0().getApplication();
                    application.getClass();
                    Object aniVar = new ani(u480Var.f35032a, xbv0.c(application, strB), v480Var);
                    fetVar.o0(aniVar);
                    objP = aniVar;
                }
            }
            jf4.n(b1j.i(u480.class, "Cannot create dependency "));
            return;
        }
        ani aniVar2 = (ani) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            ozi oziVar = aniVar2.c;
            e720 e720VarZ = ((ali) oziVar.p.f25567a).z();
            vq vqVarW = oziVar.i.w();
            x1x.x(vqVarW);
            Object dcv0Var = new dcv0(e720VarZ, vqVarW, oziVar.q);
            fetVar.o0(dcv0Var);
            objP2 = dcv0Var;
        }
        Object obj2 = (dcv0) objP2;
        String str = v480Var.b;
        String strL = kng0.l(i3m0Var.getKey(), BundleUtil.UNDERLINE_TAG, str);
        q0h0 q0h0Var = new q0h0((zmi) aniVar2.d.get());
        sgy sgyVarB = sre0.f32672a.b(v580.class);
        int i = v580.u;
        k3t0 k3t0VarX = n4c.X(sgyVarB, strL, q0h0Var, fetVar, 12);
        boolean zI = fetVar.i(obj2) | fetVar.i(fragment) | fetVar.i(v480Var) | fetVar.i(k3t0VarX);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            ah0Var = new ah0(obj2, fragment, v480Var, k3t0VarX, (yje) null, (byte) 12);
            fetVar.o0(ah0Var);
        } else {
            ah0Var = objP3;
        }
        m0x0.t(fetVar, aniVar2, (Function2) ah0Var);
        Unit unit = Unit.f46060a;
        boolean zI2 = fetVar.i(k3t0VarX);
        Object objP4 = fetVar.P();
        if (zI2 || objP4 == obj) {
            objP4 = new w480(k3t0VarX, null, (byte) 0);
            fetVar.o0(objP4);
        }
        m0x0.t(fetVar, unit, (Function2) objP4);
        boolean zI3 = fetVar.i(k3t0VarX) | fetVar.i(v480Var);
        Object objP5 = fetVar.P();
        if (zI3 || objP5 == obj) {
            objP5 = new nf60(k3t0VarX, v480Var, null, (byte) 28);
            fetVar.o0(objP5);
        }
        m0x0.v(i3m0Var, str, (Function2) objP5, fetVar);
        Object objP6 = fetVar.P();
        if (objP6 == obj) {
            objP6 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP6);
        }
        vne vneVar = (vne) objP6;
        boolean zI4 = fetVar.i(obj2) | fetVar.i(fragment) | fetVar.i(k3t0VarX);
        Object objP7 = fetVar.P();
        if (zI4 || objP7 == obj) {
            objP7 = new jl40(obj2, fragment, k3t0VarX, (byte) 18);
            fetVar.o0(objP7);
        }
        Function1 function1 = (Function1) objP7;
        boolean zI5 = fetVar.i(vneVar) | fetVar.i(k3t0VarX) | fetVar.g(function1) | fetVar.g(null);
        Object objP8 = fetVar.P();
        if (zI5 || objP8 == obj) {
            objP8 = new et(vneVar, k3t0VarX, function1, (byte) 28);
            fetVar.o0(objP8);
        }
        m0x0.o(unit, (Function1) objP8, fetVar);
        boolean zI6 = fetVar.i(k3t0VarX);
        Object objP9 = fetVar.P();
        if (zI6 || objP9 == obj) {
            objP9 = new dbh(k3t0VarX, (byte) 12);
            fetVar.o0(objP9);
        }
        Function0 function0 = (Function0) objP9;
        boolean zI7 = fetVar.i(k3t0VarX);
        Object objP10 = fetVar.P();
        if (zI7 || objP10 == obj) {
            objP10 = new dbh(k3t0VarX, (byte) 13);
            fetVar.o0(objP10);
        }
        v3c.A(function0, (Function0) objP10, null, fetVar, 0, 4);
        i3t0 i3t0Var = (i3t0) k3t0VarX;
        a4x a4xVar = ((q580) i3t0Var.y(fetVar).getValue()).f28139a;
        boolean zI8 = fetVar.i(i3t0Var);
        Object objP11 = fetVar.P();
        if (zI8 || objP11 == obj) {
            objP11 = new caz(i3t0Var, (byte) 8);
            fetVar.o0(objP11);
        }
        wdx.q(6, fetVar, a4xVar, mm40Var, (Function1) objP11);
    }
}
