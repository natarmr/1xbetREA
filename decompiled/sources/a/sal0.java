package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class sal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f31894a = new LinkedHashMap();

    public static oui a(frs frsVar, xrs xrsVar, npn npnVar, Function0 function0, yx5 yx5Var, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = f31894a;
        oui ouiVar = (oui) linkedHashMap.get(str);
        if (ouiVar != null) {
            return ouiVar;
        }
        i1w0 i1w0VarF = a4n0.f(yx5Var);
        ComponentCallbacks2 componentCallbacks2 = (Application) function0.invoke();
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ral0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ral0)) {
                ze3Var = null;
            }
            ral0 ral0Var = (ral0) ze3Var;
            if (ral0Var != null) {
                i1w0VarF.getClass();
                cad cadVar = ral0Var.b;
                ivn ivnVar = ral0Var.c;
                zx10 zx10Var = ral0Var.f30141a;
                oeg0 oeg0Var = ral0Var.H;
                o2j0 o2j0Var = ral0Var.m;
                s9m0 s9m0Var = ral0Var.d;
                ugf0 ugf0Var = ral0Var.f;
                gfk0 gfk0Var = ral0Var.e;
                wdk0 wdk0Var = ral0Var.g;
                ugf0 ugf0Var2 = ral0Var.h;
                wyu wyuVar = ral0Var.i;
                uyu uyuVar = ral0Var.j;
                bwl bwlVar = ral0Var.k;
                iw20 iw20Var = ral0Var.l;
                ctf0 ctf0Var = ral0Var.n;
                duj dujVar = ral0Var.o;
                a1d a1dVar = ral0Var.q;
                m1e m1eVar = ral0Var.p;
                roi0 roi0Var = ral0Var.r;
                rmd0 rmd0Var = ral0Var.s;
                gst0 gst0Var = ral0Var.t;
                kt2 kt2Var = ral0Var.u;
                knf0 knf0Var = ral0Var.v;
                peg0 peg0Var = ral0Var.w;
                je jeVar = ral0Var.x;
                j1q0 j1q0Var = ral0Var.y;
                qv2 qv2Var = ral0Var.z;
                h3c h3cVar = ral0Var.A;
                r9u r9uVar = ral0Var.B;
                wsf0 wsf0Var = ral0Var.C;
                uuz uuzVar = ral0Var.D;
                ndf0 ndf0Var = ral0Var.E;
                nh70 nh70Var = ral0Var.F;
                poq0 poq0Var = ral0Var.G;
                o2j0Var.getClass();
                rmd0Var.getClass();
                wdk0Var.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                kt2Var.getClass();
                knf0Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                oeg0Var.getClass();
                oui ouiVar2 = new oui(cadVar, ivnVar, zx10Var, ugf0Var, bwlVar, a1dVar, iw20Var, rmd0Var, ugf0Var2, roi0Var, wsf0Var, nh70Var, poq0Var, frsVar, xrsVar, npnVar, i1w0VarF, s9m0Var, gfk0Var, wdk0Var, wyuVar, uyuVar, ctf0Var, dujVar, m1eVar, gst0Var, kt2Var, knf0Var, peg0Var, jeVar, qv2Var, h3cVar, r9uVar, uuzVar, ndf0Var, oeg0Var, str);
                linkedHashMap.put(str, ouiVar2);
                return ouiVar2;
            }
        }
        jf4.n(b1j.i(ral0.class, "Cannot create dependency "));
        return null;
    }

    public static String b(long j, cb50 cb50Var) {
        cb50Var.getClass();
        return dw9.o(j, cb50Var.f4046a);
    }
}
