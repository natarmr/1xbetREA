package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ios0 extends nz40 {
    public final nz40 o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public ios0(nz40 nz40Var, Function1 function1, Function1 function2, boolean z, boolean z2) {
        Function1 function1I;
        Function1 function1E;
        thj0 thj0Var = xfk0.f40794a;
        super(0L, wfk0.e, xfk0.i(function1, (nz40Var == null || (function1E = nz40Var.e()) == null) ? xfk0.j.e : function1E, z), xfk0.j(function2, (nz40Var == null || (function1I = nz40Var.i()) == null) ? xfk0.j.f : function1I));
        this.o = nz40Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = hfm0.v();
    }

    @Override // a.nz40
    public final void B(iz40 iz40Var) {
        q8a.x0();
        throw null;
    }

    @Override // a.nz40
    public final nz40 C(Function1 function1, Function1 function2) {
        Function1 function1I = xfk0.i(function1, this.r, true);
        Function1 function1J = xfk0.j(function2, this.s);
        return !this.p ? new ios0(D().C(null, function1J), function1I, function1J, false, true) : D().C(function1I, function1J);
    }

    public final nz40 D() {
        nz40 nz40Var = this.o;
        return nz40Var == null ? xfk0.j : nz40Var;
    }

    @Override // a.nz40, a.rfk0
    public final void c() {
        nz40 nz40Var;
        this.c = true;
        if (!this.q || (nz40Var = this.o) == null) {
            return;
        }
        nz40Var.c();
    }

    @Override // a.rfk0
    public final wfk0 d() {
        return D().d();
    }

    @Override // a.nz40, a.rfk0
    public final Function1 e() {
        return this.r;
    }

    @Override // a.rfk0
    public final boolean f() {
        return D().f();
    }

    @Override // a.rfk0
    public final long g() {
        return D().g();
    }

    @Override // a.nz40, a.rfk0
    public final int h() {
        return D().h();
    }

    @Override // a.nz40, a.rfk0
    public final Function1 i() {
        return this.s;
    }

    @Override // a.nz40, a.rfk0
    public final void k() {
        q8a.x0();
        throw null;
    }

    @Override // a.nz40, a.rfk0
    public final void l() {
        q8a.x0();
        throw null;
    }

    @Override // a.nz40, a.rfk0
    public final void m() {
        D().m();
    }

    @Override // a.nz40, a.rfk0
    public final void n(b8m0 b8m0Var) {
        D().n(b8m0Var);
    }

    @Override // a.rfk0
    public final void r(wfk0 wfk0Var) {
        q8a.x0();
        throw null;
    }

    @Override // a.rfk0
    public final void s(long j) {
        q8a.x0();
        throw null;
    }

    @Override // a.nz40, a.rfk0
    public final void t(int i) {
        D().t(i);
    }

    @Override // a.nz40, a.rfk0
    public final rfk0 u(Function1 function1) {
        Function1 function1I = xfk0.i(function1, this.r, true);
        return !this.p ? xfk0.e(D().u(null), function1I, true) : D().u(function1I);
    }

    @Override // a.nz40
    public final wdx w() {
        return D().w();
    }

    @Override // a.nz40
    public final iz40 x() {
        return D().x();
    }

    @Override // a.nz40
    /* JADX INFO: renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
