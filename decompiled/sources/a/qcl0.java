package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qcl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f28489a = new LinkedHashMap();

    public static qhi a(SportGameDashboardScreenParams sportGameDashboardScreenParams, Function0 function0, i7s i7sVar, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = f28489a;
        qhi qhiVar = (qhi) linkedHashMap.get(str);
        if (qhiVar != null) {
            return qhiVar;
        }
        i1w0 i1w0VarF = a4n0.f(i7sVar);
        ComponentCallbacks2 componentCallbacks2 = (Application) function0.invoke();
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(w6s.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof w6s)) {
                ze3Var = null;
            }
            w6s w6sVar = (w6s) ze3Var;
            if (w6sVar != null) {
                i1w0VarF.getClass();
                cad cadVar = w6sVar.f38640a;
                ugf0 ugf0Var = w6sVar.g;
                oeg0 oeg0Var = w6sVar.b;
                o2j0 o2j0Var = w6sVar.q;
                m1e m1eVar = w6sVar.c;
                wdk0 wdk0Var = w6sVar.d;
                ctf0 ctf0Var = w6sVar.e;
                xri xriVar = w6sVar.f;
                rmd0 rmd0Var = w6sVar.h;
                iw20 iw20Var = w6sVar.i;
                gfk0 gfk0Var = w6sVar.j;
                wyu wyuVar = w6sVar.k;
                uyu uyuVar = w6sVar.l;
                a1d a1dVar = w6sVar.m;
                ivn ivnVar = w6sVar.n;
                ugf0 ugf0Var2 = w6sVar.p;
                zx10 zx10Var = w6sVar.o;
                roi0 roi0Var = w6sVar.r;
                uuz uuzVar = w6sVar.s;
                bwl bwlVar = w6sVar.t;
                ndf0 ndf0Var = w6sVar.v;
                nh70 nh70Var = w6sVar.u;
                qv2 qv2Var = w6sVar.w;
                h3c h3cVar = w6sVar.x;
                je jeVar = w6sVar.y;
                kt2 kt2Var = w6sVar.z;
                gst0 gst0Var = w6sVar.A;
                knf0 knf0Var = w6sVar.B;
                peg0 peg0Var = w6sVar.C;
                r9u r9uVar = w6sVar.D;
                wsf0 wsf0Var = w6sVar.E;
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
                qhi qhiVar2 = new qhi(cadVar, ugf0Var, rmd0Var, iw20Var, bwlVar, a1dVar, ivnVar, ugf0Var2, roi0Var, zx10Var, nh70Var, wsf0Var, sportGameDashboardScreenParams, i1w0VarF, m1eVar, wdk0Var, ctf0Var, gfk0Var, wyuVar, uyuVar, uuzVar, ndf0Var, qv2Var, h3cVar, jeVar, kt2Var, gst0Var, knf0Var, peg0Var, r9uVar);
                linkedHashMap.put(str, qhiVar2);
                return qhiVar2;
            }
        }
        jf4.n(b1j.i(w6s.class, "Cannot create dependency "));
        return null;
    }
}
