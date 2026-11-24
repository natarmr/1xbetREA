package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wae0 extends rfk0 {
    public final Function1 e;
    public int f;

    public wae0(long j, wfk0 wfk0Var, Function1 function1) {
        super(j, wfk0Var);
        this.e = function1;
        this.f = 1;
    }

    @Override // a.rfk0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (xfk0.c) {
            o();
        }
    }

    @Override // a.rfk0
    public final Function1 e() {
        return this.e;
    }

    @Override // a.rfk0
    public final boolean f() {
        return true;
    }

    @Override // a.rfk0
    public final Function1 i() {
        return null;
    }

    @Override // a.rfk0
    public final void k() {
        this.f++;
    }

    @Override // a.rfk0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // a.rfk0
    public final void n(b8m0 b8m0Var) {
        thj0 thj0Var = xfk0.f40794a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // a.rfk0
    public final rfk0 u(Function1 function1) {
        xfk0.v(this);
        return new uj50(this.b, this.f30392a, xfk0.i(function1, this.e, true), this);
    }

    @Override // a.rfk0
    public final void m() {
    }
}
