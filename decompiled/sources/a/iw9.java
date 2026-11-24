package a;

import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class iw9 {
    public Map A;
    public c4m0 B;
    public c4m0 C;
    public c4m0 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vne f15478a;
    public final qcq0 b;
    public final bsm0 c;
    public final tz9 d;
    public final iev e;
    public final dmn0 f;
    public final qw9 g;
    public final m9a h;
    public final w5z i;
    public final k7d0 j;
    public final j3a k;
    public final jx9 l;
    public final cao0 m;
    public final zz9 n;
    public final wv9 o;
    public final lrm0 p;
    public final Object q;
    public boolean r;
    public cy2 s;
    public d3a t;
    public az9 u;
    public doq0 v;
    public c4m0 w;
    public final odd x;
    public jnu0 y;
    public r9a z;

    public iw9(vne vneVar, qcq0 qcq0Var, bsm0 bsm0Var, tz9 tz9Var, iev ievVar, dmn0 dmn0Var, qw9 qw9Var, m9a m9aVar, w5z w5zVar, k7d0 k7d0Var, j3a j3aVar, jx9 jx9Var, cao0 cao0Var, zz9 zz9Var, wv9 wv9Var, lrm0 lrm0Var, uqd uqdVar) {
        vneVar.getClass();
        qcq0Var.getClass();
        bsm0Var.getClass();
        qw9Var.getClass();
        m9aVar.getClass();
        k7d0Var.getClass();
        j3aVar.getClass();
        jx9Var.getClass();
        cao0Var.getClass();
        uqdVar.getClass();
        this.f15478a = vneVar;
        this.b = qcq0Var;
        this.c = bsm0Var;
        this.d = tz9Var;
        this.e = ievVar;
        this.f = dmn0Var;
        this.g = qw9Var;
        this.h = m9aVar;
        this.i = w5zVar;
        this.j = k7d0Var;
        this.k = j3aVar;
        this.l = jx9Var;
        this.m = cao0Var;
        this.n = zz9Var;
        this.o = wv9Var;
        this.p = lrm0Var;
        this.q = new Object();
        this.r = true;
        this.s = ty9.p0;
        this.t = new b3a(tz9Var.f34794a);
        this.x = new odd();
        yje yjeVar = null;
        this.C = qjj.W(vneVar, null, null, new gw9(this, yjeVar, (byte) 0), 3);
        this.D = qjj.W(vneVar, null, null, new gw9(this, yjeVar, (byte) 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        hw9 hw9Var;
        if (zjeVar instanceof hw9) {
            hw9Var = (hw9) zjeVar;
            int i = hw9Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw9Var.k = i - Integer.MIN_VALUE;
            } else {
                hw9Var = new hw9(this, zjeVar);
            }
        } else {
            hw9Var = new hw9(this, zjeVar);
        }
        Object obj = hw9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hw9Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            Log.d("CXCP", this + "#awaitClosed");
            synchronized (this.q) {
                if (this.s.equals(ty9.k0)) {
                    Log.d("CXCP", this + "#awaitClosed: Controller is already closed.");
                    return Boolean.TRUE;
                }
                if (!this.s.equals(ty9.l0)) {
                    Log.w("CXCP", this + "#awaitClosed: Controller isn't closing!");
                    return Boolean.FALSE;
                }
                odd oddVar = this.x;
                hw9Var.k = 1;
                if (oddVar.q(hw9Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Boolean.TRUE;
    }

    public final void b(r9a r9aVar, jnu0 jnu0Var) {
        c4m0 c4m0VarW = qjj.W(this.f15478a, null, null, new yp6(r9aVar, jnu0Var, null, (byte) 23), 3);
        if (this.s.equals(ty9.l0)) {
            c4m0VarW.invokeOnCompletion(new ew9(this, (byte) 0));
        }
    }

    public final boolean c() {
        return this.s.equals(ty9.l0) || this.s.equals(ty9.k0);
    }

    public final void d(d3a d3aVar) {
        Log.d("CXCP", this + " (" + ((Object) g0a.b(this.d.f34794a)) + ") camera status changed: " + d3aVar);
        synchronized (this.q) {
            try {
                if (c()) {
                    return;
                }
                if ((d3aVar instanceof z2a) || (d3aVar instanceof b3a)) {
                    this.t = d3aVar;
                } else if (d3aVar instanceof a3a) {
                    this.m.getClass();
                    this.v = new doq0(SystemClock.elapsedRealtimeNanos());
                }
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (c()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        cy2 cy2Var = this.s;
        ty9 ty9Var = ty9.o0;
        if (cy2Var.equals(ty9Var)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        yje yjeVar = null;
        this.u = null;
        tz9 tz9Var = this.d;
        String str = tz9Var.f34794a;
        List listL0 = CollectionsKt.L0(eui0.e(cui0.b(new g0a(str)), new g0a(str)));
        ew9 ew9Var = new ew9(this, (byte) 1);
        k7d0 k7d0Var = this.j;
        k7d0Var.getClass();
        str.getClass();
        listL0.getClass();
        vne vneVar = k7d0Var.d;
        iev ievVar = this.e;
        jnu0 jnu0Var = new jnu0(str, ievVar, vneVar);
        if (((q99) k7d0Var.e.e).f(new jnf0(jnu0Var, listL0, ievVar, ew9Var)) instanceof ytb) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) g0a.b(str)) + '!');
            ievVar.a(new mev(12, false));
            jnu0Var = null;
        }
        if (jnu0Var == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.y != null) {
            jf4.n("Check failed.");
            return;
        }
        if (this.z != null) {
            jf4.n("Check failed.");
            return;
        }
        this.y = jnu0Var;
        r9a r9aVar = new r9a(ievVar, this.h, this.i, this.k, this.m, tz9Var.n, null, this.p, this.c, this.b, this.f15478a);
        this.z = r9aVar;
        Map map = this.A;
        if (map != null) {
            r9aVar.j(map);
        }
        this.s = ty9Var;
        Log.d("CXCP", "Started " + this);
        c4m0 c4m0Var = this.B;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.B = qjj.W(this.f15478a, null, null, new gw9(this, yjeVar, (byte) 2), 3);
    }

    public final void f() {
        if (c()) {
            Log.w("CXCP", "Ignoring stop(): " + this + " is already closed");
            return;
        }
        cy2 cy2Var = this.s;
        ty9 ty9Var = ty9.q0;
        if (cy2Var.equals(ty9Var) || this.s.equals(ty9.p0)) {
            Log.w("CXCP", "Ignoring stop(): " + this + " already stopping or stopped");
            return;
        }
        jnu0 jnu0Var = this.y;
        r9a r9aVar = this.z;
        this.y = null;
        this.z = null;
        this.s = ty9Var;
        Log.d("CXCP", "Stopping " + this);
        b(r9aVar, jnu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r3.f1706a != 8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iw9.g():void");
    }

    public final String toString() {
        return "Camera2CameraController(" + this.n + ')';
    }
}
