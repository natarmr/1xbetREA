package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bpv0 implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d0 f3003a;
    public final o5d0 b;
    public final n2h0 c;
    public final o5d0 d;

    public bpv0(o5d0 o5d0Var, o5d0 o5d0Var2, n2h0 n2h0Var, o5d0 o5d0Var3) {
        this.f3003a = o5d0Var;
        this.b = o5d0Var2;
        this.c = n2h0Var;
        this.d = o5d0Var3;
    }

    @Override // a.o5d0
    public final Object get() {
        return new fht0((Executor) this.f3003a.get(), (wpg0) this.b.get(), (y3v) this.c.get(), (wpg0) this.d.get());
    }
}
