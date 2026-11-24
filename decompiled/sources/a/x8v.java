package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x8v extends nz40 {
    @Override // a.nz40
    public final nz40 C(Function1 function1, Function1 function2) {
        return (nz40) ((rfk0) xfk0.b(new abh0((Function1) new d2p(function1, function2, (byte) 16), (byte) 23)));
    }

    @Override // a.nz40, a.rfk0
    public final void c() {
        synchronized (xfk0.c) {
            o();
        }
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
        xfk0.c();
    }

    @Override // a.nz40, a.rfk0
    public final rfk0 u(Function1 function1) {
        return (wae0) ((rfk0) xfk0.b(new abh0((Function1) new w8v(function1, (byte) 0), (byte) 23)));
    }

    @Override // a.nz40
    public final wdx w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
