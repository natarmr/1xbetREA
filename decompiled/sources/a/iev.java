package a;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz9 f14655a;
    public final tz9 b;
    public final bev c;
    public final List d;
    public final p7m0 e;

    public iev(qcq0 qcq0Var, zz9 zz9Var, tz9 tz9Var, pg00 pg00Var, List list, jx9 jx9Var) {
        qcq0Var.getClass();
        pg00Var.getClass();
        list.getClass();
        jx9Var.getClass();
        this.f14655a = zz9Var;
        this.b = tz9Var;
        this.d = tz9Var.k;
        Map map = tz9Var.i;
        Map map2 = tz9Var.l;
        dd40 dd40Var = n1a.c;
        Object obj = map.get(dd40Var);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(obj, bool) || Intrinsics.d(map2.get(dd40Var), bool)) {
            Log.i("CXCP", dd40Var + " is set to true, ignoring GraphState3A parameters.");
        }
        vz9 vz9Var = tz9Var.n;
        jx9Var.b.getClass();
        x860 x860Var = vz9Var.b;
        Set set = (Set) jx9.c.get(Build.MANUFACTURER);
        int iMax = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10);
        wz9 wz9Var = wz9.f40013a;
        int iMax2 = Math.max(iMax, x860Var.f40449a);
        y7a y7aVar = iMax2 != 0 ? new y7a(iMax2) : null;
        bev bevVar = new bev(zz9Var, map, map2, CollectionsKt.q0(list, q3d.k(y7aVar)), tx3.z(new Object[]{pg00Var, y7aVar}), qcq0Var.f28496a, qcq0Var.h);
        this.c = bevVar;
        if (y7aVar != null) {
            if (y7aVar.c != null) {
                jf4.n("GraphLoop has already been set!");
                throw null;
            }
            y7aVar.c = bevVar;
            bevVar.v(false);
            Log.w("CXCP", "Capture processing has been disabled for " + bevVar + " until " + y7aVar.f42144a + " frames have been completed.");
        }
        this.e = q7m0.a(oev.b);
    }

    public final void a(mev mevVar) {
        p7m0 p7m0Var;
        Object value;
        rev revVar;
        Log.d("CXCP", this + " onGraphError(" + mevVar + ')');
        do {
            p7m0Var = this.e;
            value = p7m0Var.getValue();
            revVar = (rev) value;
        } while (!p7m0Var.m(value, ((revVar instanceof pev) || (revVar instanceof oev)) ? oev.b : mevVar));
        for (sev sevVar : this.d) {
            sevVar.getClass();
            sevVar.f32090a.b(sevVar.a(), mevVar);
        }
    }

    public final void b(ucs0 ucs0Var) {
        Log.d("CXCP", this + " onGraphStarted");
        nev nevVar = nev.b;
        this.e.n(nevVar);
        this.c.w(ucs0Var);
        for (sev sevVar : this.d) {
            sevVar.f32090a.b(sevVar.a(), nevVar);
        }
    }

    public final void c() {
        Log.d("CXCP", this + " onGraphStopped");
        p7m0 p7m0Var = this.e;
        oev oevVar = oev.b;
        p7m0Var.n(oevVar);
        this.c.w(null);
        for (sev sevVar : this.d) {
            sevVar.f32090a.b(sevVar.a(), oevVar);
        }
    }

    public final void d(cmf0 cmf0Var) {
        bev bevVar = this.c;
        synchronized (bevVar.h) {
            try {
                cmf0 cmf0Var2 = bevVar.k;
                bevVar.k = cmf0Var;
                if (cmf0Var2 != null || cmf0Var != null) {
                    w5z w5zVar = bevVar.g;
                    if (cmf0Var != null) {
                        w5zVar.k0(new tdv(cmf0Var));
                    } else {
                        w5zVar.k0(pdv.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cmf0Var == null) {
            int size = bevVar.d.size();
            for (int i = 0; i < size; i++) {
                ((xdv) bevVar.d.get(i)).b();
            }
        }
    }

    public final boolean e(Map map) {
        map.getClass();
        bev bevVar = this.c;
        if (bevVar.d() != null) {
            return bevVar.g.k0(new vdv(map));
        }
        jf4.n("Cannot submit parameters without an active repeating request!");
        return false;
    }

    public final void f(LinkedHashMap linkedHashMap) {
        bev bevVar = this.c;
        synchronized (bevVar.h) {
            bevVar.g.k0(new sdv(bevVar.l, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.f14655a + ')';
    }
}
