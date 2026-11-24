package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw2 f30673a;
    public final Set b;
    public jnu0 c;
    public final hng d;

    public rl(tw2 tw2Var, Set set, vne vneVar, v6d0 v6d0Var) {
        yje yjeVar;
        byte b;
        tw2Var.getClass();
        set.getClass();
        vneVar.getClass();
        this.f30673a = tw2Var;
        this.b = set;
        mc mcVar = new mc((Object) v6d0Var, (Object) this, (byte) 1);
        vneVar.getClass();
        hng hngVar = new hng();
        hngVar.c = vneVar;
        hngVar.d = mcVar;
        Object obj = new Object();
        hngVar.e = obj;
        synchronized (obj) {
            yjeVar = null;
            b = 3;
            hngVar.f = qjj.W(vneVar, null, null, new k6s0(hngVar, yjeVar, (byte) 21), 3);
        }
        this.d = hngVar;
        qjj.W(vneVar, null, null, new pa(this, yjeVar, b), 3);
    }

    public final m050 a() {
        hng hngVar = this.d;
        synchronized (hngVar.e) {
            try {
                if (hngVar.b) {
                    return null;
                }
                int i = hngVar.f13350a + 1;
                hngVar.f13350a = i;
                if (i == 1) {
                    c4m0 c4m0Var = (c4m0) hngVar.f;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    hngVar.f = null;
                }
                return new m050(hngVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(zje zjeVar) {
        Object objL = ntb.L(this.f30673a.u, new pd(2, null, (byte) 12), zjeVar);
        wne wneVar = wne.f39444a;
        if (objL != wneVar) {
            objL = Unit.f46060a;
        }
        return objL == wneVar ? objL : Unit.f46060a;
    }

    public final void c() {
        this.d.d();
        this.f30673a.a();
    }

    public final Unit d(jnu0 jnu0Var, m050 m050Var) {
        Unit unit;
        jnu0 jnu0Var2 = this.c;
        this.c = jnu0Var;
        yje yjeVar = null;
        if (jnu0Var2 != null) {
            jnu0Var2.a(null);
        }
        p7m0 p7m0Var = this.f30673a.u;
        synchronized (jnu0Var.e) {
            if (jnu0Var.f) {
                m050Var.b();
                unit = Unit.f46060a;
            } else {
                jnu0Var.k = qjj.W(jnu0Var.c, null, null, new n7t0(p7m0Var, jnu0Var, yjeVar, (byte) 7), 3);
                jnu0Var.l = m050Var;
                unit = Unit.f46060a;
            }
        }
        return unit == wne.f39444a ? unit : unit;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) g0a.b(this.f30673a.f34627a));
        sb.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
