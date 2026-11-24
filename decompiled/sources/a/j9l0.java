package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f16146a = new LinkedHashMap();

    public static nhi a(SportGameAdvancedScreenParams sportGameAdvancedScreenParams, Function0 function0, dnr dnrVar, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = f16146a;
        nhi nhiVar = (nhi) linkedHashMap.get(str);
        if (nhiVar != null) {
            return nhiVar;
        }
        i1w0 i1w0VarF = a4n0.f(dnrVar);
        ComponentCallbacks2 componentCallbacks2 = (Application) function0.invoke();
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xmr.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof xmr)) {
                ze3Var = null;
            }
            xmr xmrVar = (xmr) ze3Var;
            if (xmrVar != null) {
                i1w0VarF.getClass();
                cad cadVar = xmrVar.f41142a;
                ugf0 ugf0Var = xmrVar.g;
                oeg0 oeg0Var = xmrVar.b;
                o2j0 o2j0Var = xmrVar.q;
                m1e m1eVar = xmrVar.c;
                wdk0 wdk0Var = xmrVar.d;
                ctf0 ctf0Var = xmrVar.e;
                xri xriVar = xmrVar.f;
                rmd0 rmd0Var = xmrVar.h;
                iw20 iw20Var = xmrVar.i;
                gfk0 gfk0Var = xmrVar.j;
                wyu wyuVar = xmrVar.k;
                uyu uyuVar = xmrVar.l;
                a1d a1dVar = xmrVar.m;
                ivn ivnVar = xmrVar.n;
                ugf0 ugf0Var2 = xmrVar.p;
                zx10 zx10Var = xmrVar.o;
                roi0 roi0Var = xmrVar.r;
                uuz uuzVar = xmrVar.s;
                bwl bwlVar = xmrVar.t;
                ndf0 ndf0Var = xmrVar.v;
                nh70 nh70Var = xmrVar.u;
                poq0 poq0Var = xmrVar.w;
                qv2 qv2Var = xmrVar.x;
                h3c h3cVar = xmrVar.y;
                je jeVar = xmrVar.z;
                kt2 kt2Var = xmrVar.A;
                gst0 gst0Var = xmrVar.B;
                knf0 knf0Var = xmrVar.C;
                peg0 peg0Var = xmrVar.D;
                r9u r9uVar = xmrVar.E;
                wsf0 wsf0Var = xmrVar.F;
                xriVar.getClass();
                rmd0Var.getClass();
                o2j0Var.getClass();
                oeg0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                wyuVar.getClass();
                kt2Var.getClass();
                gst0Var.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                nhi nhiVar2 = new nhi(cadVar, ugf0Var, rmd0Var, iw20Var, bwlVar, a1dVar, ivnVar, ugf0Var2, roi0Var, zx10Var, nh70Var, poq0Var, wsf0Var, sportGameAdvancedScreenParams, oeg0Var, str, m1eVar, wdk0Var, ctf0Var, gfk0Var, wyuVar, uyuVar, uuzVar, ndf0Var, qv2Var, h3cVar, jeVar, kt2Var, gst0Var, knf0Var, peg0Var, r9uVar);
                linkedHashMap.put(str, nhiVar2);
                return nhiVar2;
            }
        }
        jf4.n(b1j.i(xmr.class, "Cannot create dependency "));
        return null;
    }
}
