package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class twj implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d0 f34652a;
    public final o5d0 b;
    public final n2h0 c;
    public final o5d0 d;
    public final o5d0 e;

    public twj(o5d0 o5d0Var, o5d0 o5d0Var2, n2h0 n2h0Var, o5d0 o5d0Var3, o5d0 o5d0Var4) {
        this.f34652a = o5d0Var;
        this.b = o5d0Var2;
        this.c = n2h0Var;
        this.d = o5d0Var3;
        this.e = o5d0Var4;
    }

    @Override // a.o5d0
    public final Object get() {
        return new swj((Executor) this.f34652a.get(), (hd40) this.b.get(), (y3v) this.c.get(), (wpg0) this.d.get(), (wpg0) this.e.get());
    }
}
