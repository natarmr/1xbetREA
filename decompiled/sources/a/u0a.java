package a;

import android.util.Log;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class u0a implements s0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppt0 f34846a;
    public final n0a b;
    public final ry9 c;
    public final tpt0 d;
    public final r2a e;
    public final String f;
    public hy9 g;
    public final int h;
    public final x04 i;

    public u0a(fhn fhnVar, ppt0 ppt0Var, n0a n0aVar, ry9 ry9Var, tpt0 tpt0Var, r2a r2aVar) {
        fhnVar.getClass();
        ppt0Var.getClass();
        n0aVar.getClass();
        ry9Var.getClass();
        tpt0Var.getClass();
        r2aVar.getClass();
        this.f34846a = ppt0Var;
        this.b = n0aVar;
        this.c = ry9Var;
        this.d = tpt0Var;
        this.e = r2aVar;
        String str = fhnVar.b;
        this.f = str;
        jy9 jy9Var = ky9.f19096a;
        jy9Var.getClass();
        this.g = jy9Var;
        z04 z04Var = v0a.f36572a;
        z04Var.getClass();
        this.h = z04.b.incrementAndGet(z04Var);
        this.i = o2e.X(false);
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) g0a.b(str)));
        }
    }

    @Override // a.s0a
    public final da60 b() {
        return this.e.b;
    }

    @Override // a.eot0
    public final void c(fot0 fot0Var) {
        ppt0 ppt0Var = this.f34846a;
        ppt0Var.getClass();
        synchronized (ppt0Var.k) {
            if (ppt0Var.m.remove(fot0Var)) {
                ppt0Var.k();
            }
        }
    }

    @Override // a.s0a
    public final ry9 d() {
        return this.c;
    }

    @Override // a.s0a
    public final hy9 e() {
        return this.g;
    }

    @Override // a.s0a
    public final void f(hy9 hy9Var) {
        hy9 hy9Var2;
        if (hy9Var == null) {
            hy9Var2 = ky9.f19096a;
            hy9Var2.getClass();
        } else {
            hy9Var2 = hy9Var;
        }
        this.g = hy9Var2;
        if (hy9Var != null) {
            hy9Var.o();
        }
        synchronized (this.f34846a.k) {
        }
    }

    @Override // a.s0a
    public final void g(boolean z) {
        ppt0 ppt0Var = this.f34846a;
        synchronized (ppt0Var.k) {
            ppt0Var.n = z;
            mot0 mot0VarG = ppt0Var.g();
            if (mot0VarG != null) {
                qjj.W(mot0VarG.b.f, null, null, new lot0(null, mot0VarG, z), 3);
            }
        }
    }

    @Override // a.s0a
    public final n0a h() {
        return this.b;
    }

    @Override // a.eot0
    public final void i(fot0 fot0Var) {
        ppt0 ppt0Var = this.f34846a;
        ppt0Var.getClass();
        synchronized (ppt0Var.k) {
            if (ppt0Var.l.contains(fot0Var)) {
                ppt0Var.k();
            }
        }
    }

    @Override // a.eot0
    public final void j(fot0 fot0Var) {
        ppt0 ppt0Var = this.f34846a;
        ppt0Var.getClass();
        synchronized (ppt0Var.k) {
            if (ppt0Var.m.add(fot0Var)) {
                ppt0Var.k();
            }
        }
    }

    @Override // a.eot0
    public final void l(fot0 fot0Var) {
        ppt0 ppt0Var = this.f34846a;
        ppt0Var.getClass();
        synchronized (ppt0Var.k) {
            if (ppt0Var.l.contains(fot0Var)) {
                ppt0Var.j(ppt0Var.l);
            }
        }
    }

    @Override // a.s0a
    public final boolean m() {
        return this.i.b();
    }

    @Override // a.s0a
    public final void n(ArrayList arrayList) {
        this.f34846a.f(CollectionsKt.L0(arrayList));
    }

    @Override // a.s0a
    public final void o(ArrayList arrayList) {
        this.f34846a.c(CollectionsKt.L0(arrayList));
    }

    @Override // a.s0a
    public final void p() {
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.i.a()) {
            qjj.W(this.d.f34352a, null, null, new t0a(this, null, (byte) 0), 3);
        }
    }

    @Override // a.s0a
    public final void r(boolean z) {
        ppt0 ppt0Var = this.f34846a;
        synchronized (ppt0Var.k) {
            ppt0Var.p = z;
        }
    }

    @Override // a.s0a
    public final ig00 release() {
        return y0x0.I(new gne(qjj.W(this.d.f34352a, null, null, new t0a(this, null, (byte) 1), 3), (byte) 0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) g0a.b(this.f));
        sb.append('(');
        return rz4.j(this.h, ")>", sb);
    }
}
