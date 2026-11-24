package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class qhq implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lji0 f28752a;
    public final m5d0 b;
    public final m5d0 c;
    public final m5d0 d;

    public qhq(lji0 lji0Var, m5d0 m5d0Var, m5d0 m5d0Var2, m5d0 m5d0Var3) {
        this.f28752a = lji0Var;
        this.b = m5d0Var;
        this.c = m5d0Var2;
        this.d = m5d0Var3;
    }

    @Override // a.o5d0
    public final Object get() {
        return new ghq((nfq) this.f28752a.b, (xmi0) this.b.get(), (CoroutineContext) this.c.get(), (vmi0) this.d.get());
    }
}
