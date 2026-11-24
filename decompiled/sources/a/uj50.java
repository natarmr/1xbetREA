package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uj50 extends rfk0 {
    public final Function1 e;
    public final rfk0 f;

    public uj50(long j, wfk0 wfk0Var, Function1 function1, rfk0 rfk0Var) {
        super(j, wfk0Var);
        this.e = function1;
        this.f = rfk0Var;
        rfk0Var.k();
    }

    @Override // a.rfk0
    public final void c() {
        rfk0 rfk0Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != rfk0Var.g()) {
            a();
        }
        rfk0Var.l();
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
    public final rfk0 u(Function1 function1) {
        return new uj50(this.b, this.f30392a, xfk0.i(function1, this.e, true), this.f);
    }
}
