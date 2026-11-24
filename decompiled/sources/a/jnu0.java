package a;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class jnu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16828a;
    public final iev b;
    public final vne c;
    public final int d;
    public final Object e;
    public boolean f;
    public dnu0 g;
    public final qoj0 h;
    public final gmq i;
    public p2a j;
    public c4m0 k;
    public m050 l;

    public jnu0(String str, iev ievVar, vne vneVar) {
        str.getClass();
        vneVar.getClass();
        this.f16828a = str;
        this.b = ievVar;
        this.c = vneVar;
        z04 z04Var = inu0.f15090a;
        z04Var.getClass();
        this.d = z04.b.incrementAndGet(z04Var);
        this.e = new Object();
        qoj0 qoj0VarB = roj0.b(1, 3, null, 4);
        this.h = qoj0VarB;
        this.i = i120.W(qoj0VarB);
        y2a y2aVar = y2a.f41894a;
        this.j = y2aVar;
        if (qoj0VarB.g(y2aVar)) {
            return;
        }
        jf4.n("Check failed.");
        throw null;
    }

    public final void a(az9 az9Var) {
        p2a p2aVar;
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                Log.i("CXCP", "Disconnecting " + this);
                dnu0 dnu0Var = this.g;
                if (dnu0Var != null) {
                    synchronized (dnu0Var.b) {
                        dnu0Var.c = true;
                    }
                }
                c4m0 c4m0Var = this.k;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                m050 m050Var = this.l;
                if (m050Var != null) {
                    m050Var.b();
                }
                synchronized (this.e) {
                    p2aVar = this.j;
                }
                if (!(p2aVar instanceof s2a)) {
                    if (!(p2aVar instanceof t2a)) {
                        b(new t2a(null));
                    }
                    b(new s2a(this.f16828a, evc.b, null, null, null, null, null, null, az9Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(p2a p2aVar) {
        this.j = p2aVar;
        if (this.h.g(p2aVar)) {
            return;
        }
        throw new IllegalStateException(("Failed to emit " + p2aVar + " in " + this).toString());
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}
