package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jos0 extends rfk0 {
    public final rfk0 e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jos0(rfk0 rfk0Var, Function1 function1, boolean z, boolean z2) {
        Function1 function1E;
        super(0L, wfk0.e);
        thj0 thj0Var = xfk0.f40794a;
        this.e = rfk0Var;
        this.f = z;
        this.g = z2;
        this.h = xfk0.i(function1, (rfk0Var == null || (function1E = rfk0Var.e()) == null) ? xfk0.j.e : function1E, z);
        this.i = hfm0.v();
    }

    @Override // a.rfk0
    public final void c() {
        rfk0 rfk0Var;
        this.c = true;
        if (!this.g || (rfk0Var = this.e) == null) {
            return;
        }
        rfk0Var.c();
    }

    @Override // a.rfk0
    public final wfk0 d() {
        return v().d();
    }

    @Override // a.rfk0
    public final Function1 e() {
        return this.h;
    }

    @Override // a.rfk0
    public final boolean f() {
        return v().f();
    }

    @Override // a.rfk0
    public final long g() {
        return v().g();
    }

    @Override // a.rfk0
    public final Function1 i() {
        return null;
    }

    @Override // a.rfk0
    public final void k() {
        q8a.x0();
        throw null;
    }

    @Override // a.rfk0
    public final void l() {
        q8a.x0();
        throw null;
    }

    @Override // a.rfk0
    public final void m() {
        v().m();
    }

    @Override // a.rfk0
    public final void n(b8m0 b8m0Var) {
        v().n(b8m0Var);
    }

    @Override // a.rfk0
    public final rfk0 u(Function1 function1) {
        Function1 function1I = xfk0.i(function1, this.h, true);
        return !this.f ? xfk0.e(v().u(null), function1I, true) : v().u(function1I);
    }

    public final rfk0 v() {
        rfk0 rfk0Var = this.e;
        return rfk0Var == null ? xfk0.j : rfk0Var;
    }
}
