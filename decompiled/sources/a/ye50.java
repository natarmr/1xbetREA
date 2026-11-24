package a;

/* JADX INFO: loaded from: classes.dex */
public final class ye50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ye50 f42472a;
    public final viq b;
    public boolean c;
    public boolean d = true;
    public final ff50 e;
    public final xy40 f;
    public final xy40 g;
    public final xy40 h;

    public ye50(ye50 ye50Var, viq viqVar) {
        ff50 ff50Var;
        this.f42472a = ye50Var;
        this.b = viqVar;
        this.e = (ye50Var == null || (ff50Var = ye50Var.e) == null) ? new ff50() : ff50Var;
        this.f = ha80.a();
        this.g = ha80.a();
        this.h = ha80.a();
        ye50 ye50Var2 = this.f42472a;
        if (ye50Var2 != null) {
            ye50Var2.f.g(this);
        }
    }

    public static void a(ye50 ye50Var, af50 af50Var) {
        ye50Var.getClass();
        af50Var.getClass();
        ye50Var.d();
        if (ye50Var.g.a(af50Var)) {
            ff50 ff50Var = ye50Var.e;
            ff50Var.getClass();
            if (af50Var.g != null) {
                e9d0.u(af50Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            ff50Var.e.addFirst(af50Var);
            af50Var.g = ye50Var;
            ff50Var.b();
        }
    }

    public final void b(ef50 ef50Var) {
        d();
        if (this.h.a(ef50Var)) {
            this.e.a(this, ef50Var, -1);
        }
    }

    public final void c(ag60 ag60Var, int i) {
        d();
        if (i != 1 && i != 0) {
            c99.s(twn.m(i, "Unsupported priority value: "));
        } else if (this.h.a(ag60Var)) {
            this.e.a(this, ag60Var, i);
        }
    }

    public final void d() {
        if (h()) {
            jf4.n("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void e(ef50 ef50Var, xe50 xe50Var) {
        d();
        if (i()) {
            ff50 ff50Var = this.e;
            ff50Var.getClass();
            if (ff50Var.g != 0) {
                return;
            }
            af50 af50VarC = ff50Var.c(-1);
            ff50Var.f = af50VarC;
            ff50Var.g = -1;
            ff50Var.h = ef50Var;
            if (xe50Var != null) {
                if (af50VarC != null) {
                    af50VarC.d = new if50(xe50Var, -1);
                    af50VarC.f(xe50Var);
                }
                ff50Var.f9435a.o(null, new if50(xe50Var, -1));
            }
        }
    }

    public final viq f() {
        viq viqVar = this.b;
        if (viqVar != null) {
            return viqVar;
        }
        ye50 ye50Var = this.f42472a;
        if (ye50Var != null) {
            return ye50Var.f();
        }
        return null;
    }

    public final void g() {
        ye50 ye50Var = this.f42472a;
        if (ye50Var != null) {
            ye50Var.g();
        }
    }

    public final boolean h() {
        ye50 ye50Var = this.f42472a;
        if (ye50Var == null || !ye50Var.h()) {
            return this.c;
        }
        return true;
    }

    public final boolean i() {
        ye50 ye50Var = this.f42472a;
        if (ye50Var == null || ye50Var.i()) {
            return this.d;
        }
        return false;
    }
}
