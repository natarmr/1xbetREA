package a;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e03 implements qw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uiz f6971a;
    public c4m0 b;
    public ejz c;
    public qoj0 d;

    @Override // a.qw90
    public final void a() {
        j(null);
    }

    @Override // a.qw90
    public final void b() {
        c4m0 c4m0Var = this.b;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.b = null;
        mz40 mz40VarI = i();
        if (mz40VarI != null) {
            ((qoj0) mz40VarI).i();
        }
    }

    @Override // a.qw90
    public final void c(a8q0 a8q0Var, qe60 qe60Var, a9q0 a9q0Var, caz cazVar, jge0 jge0Var, jge0 jge0Var2) {
        ejz ejzVar = this.c;
        if (ejzVar != null) {
            viz vizVar = ejzVar.m;
            synchronized (vizVar.c) {
                try {
                    vizVar.j = a8q0Var;
                    vizVar.l = qe60Var;
                    vizVar.k = a9q0Var;
                    vizVar.m = jge0Var;
                    vizVar.n = jge0Var2;
                    if (vizVar.e || vizVar.d) {
                        vizVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // a.qw90
    public final void d() {
        pkk0 pkk0Var;
        uiz uizVar = this.f6971a;
        if (uizVar == null || (pkk0Var = (pkk0) mbc.R(uizVar, bmd.q)) == null) {
            return;
        }
        ((r3k) pkk0Var).a();
    }

    @Override // a.qw90
    public final void e(jge0 jge0Var) {
        Rect rect;
        ejz ejzVar = this.c;
        if (ejzVar != null) {
            ejzVar.l = new Rect(si30.b(jge0Var.f16474a), si30.b(jge0Var.b), si30.b(jge0Var.c), si30.b(jge0Var.d));
            if (!ejzVar.j.isEmpty() || (rect = ejzVar.l) == null) {
                return;
            }
            ejzVar.f7930a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // a.qw90
    public final void f() {
        pkk0 pkk0Var;
        uiz uizVar = this.f6971a;
        if (uizVar == null || (pkk0Var = (pkk0) mbc.R(uizVar, bmd.q)) == null) {
            return;
        }
        ((r3k) pkk0Var).b();
    }

    @Override // a.qw90
    public final void g(a8q0 a8q0Var, k3x k3xVar, nej0 nej0Var, ome omeVar) {
        j(new dg(a8q0Var, this, k3xVar, nej0Var, omeVar, (byte) 1));
    }

    @Override // a.qw90
    public final void h(a8q0 a8q0Var, a8q0 a8q0Var2) {
        ejz ejzVar = this.c;
        if (ejzVar != null) {
            boolean z = (o9q0.b(ejzVar.h.b, a8q0Var2.b) && Intrinsics.d(ejzVar.h.c, a8q0Var2.c)) ? false : true;
            ejzVar.h = a8q0Var2;
            int size = ejzVar.j.size();
            for (int i = 0; i < size; i++) {
                hge0 hge0Var = (hge0) ((WeakReference) ejzVar.j.get(i)).get();
                if (hge0Var != null) {
                    hge0Var.g = a8q0Var2;
                }
            }
            viz vizVar = ejzVar.m;
            synchronized (vizVar.c) {
                vizVar.j = null;
                vizVar.l = null;
                vizVar.k = null;
                vizVar.m = null;
                vizVar.n = null;
            }
            if (Intrinsics.d(a8q0Var, a8q0Var2)) {
                if (z) {
                    xex xexVar = ejzVar.b;
                    int iF = o9q0.f(a8q0Var2.b);
                    int iE = o9q0.e(a8q0Var2.b);
                    o9q0 o9q0Var = ejzVar.h.c;
                    int iF2 = o9q0Var != null ? o9q0.f(o9q0Var.f24893a) : -1;
                    o9q0 o9q0Var2 = ejzVar.h.c;
                    xexVar.D().updateSelection((View) xexVar.f40764a, iF, iE, iF2, o9q0Var2 != null ? o9q0.e(o9q0Var2.f24893a) : -1);
                    return;
                }
                return;
            }
            if (a8q0Var != null && (!Intrinsics.d(a8q0Var.f440a.b, a8q0Var2.f440a.b) || (o9q0.b(a8q0Var.b, a8q0Var2.b) && !Intrinsics.d(a8q0Var.c, a8q0Var2.c)))) {
                xex xexVar2 = ejzVar.b;
                xexVar2.D().restartInput((View) xexVar2.f40764a);
                return;
            }
            int size2 = ejzVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hge0 hge0Var2 = (hge0) ((WeakReference) ejzVar.j.get(i2)).get();
                if (hge0Var2 != null) {
                    a8q0 a8q0Var3 = ejzVar.h;
                    xex xexVar3 = ejzVar.b;
                    if (hge0Var2.k) {
                        hge0Var2.g = a8q0Var3;
                        if (hge0Var2.i) {
                            xexVar3.D().updateExtractedText((View) xexVar3.f40764a, hge0Var2.h, d9x.V(a8q0Var3));
                        }
                        o9q0 o9q0Var3 = a8q0Var3.c;
                        long j = a8q0Var3.b;
                        int iF3 = o9q0Var3 != null ? o9q0.f(o9q0Var3.f24893a) : -1;
                        o9q0 o9q0Var4 = a8q0Var3.c;
                        xexVar3.D().updateSelection((View) xexVar3.f40764a, o9q0.f(j), o9q0.e(j), iF3, o9q0Var4 != null ? o9q0.e(o9q0Var4.f24893a) : -1);
                    }
                }
            }
        }
    }

    public final mz40 i() {
        qoj0 qoj0Var = this.d;
        if (qoj0Var != null) {
            return qoj0Var;
        }
        if (!pum0.f27625a) {
            return null;
        }
        qoj0 qoj0VarB = roj0.b(1, 0, i99.c, 2);
        this.d = qoj0VarB;
        return qoj0VarB;
    }

    public final void j(dg dgVar) {
        uiz uizVar = this.f6971a;
        if (uizVar == null) {
            return;
        }
        c4m0 c4m0Var = null;
        this.b = uizVar.n ? qjj.W(uizVar.N0(), null, yne.d, new juy((Object) uizVar, (Object) new ic1((Object) dgVar, (Object) this, (Object) uizVar, (yje) c4m0Var, (byte) 1), (yje) c4m0Var, (byte) 6), 1) : null;
    }

    public final void k(uiz uizVar) {
        uiz uizVar2 = this.f6971a;
        if (uizVar2 != uizVar) {
            adx.c("Expected textInputModifierNode to be " + uizVar + " but was " + uizVar2);
        }
        this.f6971a = null;
    }
}
