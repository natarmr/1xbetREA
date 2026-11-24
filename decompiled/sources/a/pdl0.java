package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pdl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f26813a = new LinkedHashMap();

    public static uhi a(SportGameLiteScreenParams sportGameLiteScreenParams, Function0 function0, cjs cjsVar, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = f26813a;
        uhi uhiVar = (uhi) linkedHashMap.get(str);
        if (uhiVar != null) {
            return uhiVar;
        }
        i1w0 i1w0VarF = a4n0.f(cjsVar);
        ComponentCallbacks2 componentCallbacks2 = (Application) function0.invoke();
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tis.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof tis)) {
                ze3Var = null;
            }
            tis tisVar = (tis) ze3Var;
            if (tisVar != null) {
                i1w0VarF.getClass();
                cad cadVar = tisVar.f34021a;
                ugf0 ugf0Var = tisVar.g;
                oeg0 oeg0Var = tisVar.b;
                o2j0 o2j0Var = tisVar.p;
                m1e m1eVar = tisVar.c;
                wdk0 wdk0Var = tisVar.d;
                ctf0 ctf0Var = tisVar.e;
                xri xriVar = tisVar.f;
                rmd0 rmd0Var = tisVar.h;
                iw20 iw20Var = tisVar.i;
                gfk0 gfk0Var = tisVar.j;
                wyu wyuVar = tisVar.k;
                a1d a1dVar = tisVar.l;
                ivn ivnVar = tisVar.m;
                zx10 zx10Var = tisVar.n;
                uuz uuzVar = tisVar.o;
                roi0 roi0Var = tisVar.q;
                bwl bwlVar = tisVar.r;
                ndf0 ndf0Var = tisVar.t;
                nh70 nh70Var = tisVar.s;
                qv2 qv2Var = tisVar.u;
                h3c h3cVar = tisVar.v;
                je jeVar = tisVar.w;
                kt2 kt2Var = tisVar.x;
                gst0 gst0Var = tisVar.y;
                knf0 knf0Var = tisVar.z;
                peg0 peg0Var = tisVar.A;
                r9u r9uVar = tisVar.B;
                wsf0 wsf0Var = tisVar.C;
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
                uhi uhiVar2 = new uhi(cadVar, ugf0Var, rmd0Var, iw20Var, bwlVar, a1dVar, ivnVar, roi0Var, zx10Var, nh70Var, wsf0Var, sportGameLiteScreenParams, i1w0VarF, m1eVar, wdk0Var, ctf0Var, gfk0Var, uuzVar, ndf0Var, qv2Var, h3cVar, jeVar, kt2Var, gst0Var, knf0Var, peg0Var, r9uVar);
                linkedHashMap.put(str, uhiVar2);
                return uhiVar2;
            }
        }
        jf4.n(b1j.i(tis.class, "Cannot create dependency "));
        return null;
    }
}
