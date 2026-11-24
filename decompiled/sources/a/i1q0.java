package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class i1q0 extends vs10 implements vzj {
    public final n0o0 c;
    public final h1q0 d = new h1q0();

    public i1q0(yip0 yip0Var) {
        this.c = maz.b(yip0Var);
    }

    @Override // a.vzj
    public final void a(long j, n5a n5aVar) {
        CoroutineContext.Element elementY = y();
        vzj vzjVar = elementY instanceof vzj ? (vzj) elementY : null;
        if (vzjVar == null) {
            vzjVar = fuj.f10165a;
        }
        vzjVar.a(j, n5aVar);
    }

    @Override // a.vzj
    public final nwk c(long j, Runnable runnable, CoroutineContext coroutineContext) {
        CoroutineContext.Element elementY = y();
        vzj vzjVar = elementY instanceof vzj ? (vzj) elementY : null;
        if (vzjVar == null) {
            vzjVar = fuj.f10165a;
        }
        return vzjVar.c(j, runnable, coroutineContext);
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        y().q(coroutineContext, runnable);
    }

    @Override // a.lne
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        y().r(coroutineContext, runnable);
    }

    @Override // a.lne
    public final boolean v(CoroutineContext coroutineContext) {
        return y().v(coroutineContext);
    }

    @Override // a.vs10
    public final vs10 x() {
        vs10 vs10VarX;
        lne lneVarY = y();
        vs10 vs10Var = lneVarY instanceof vs10 ? (vs10) lneVarY : null;
        return (vs10Var == null || (vs10VarX = vs10Var.x()) == null) ? this : vs10VarX;
    }

    public final lne y() {
        Throwable th = new Throwable("reader location");
        Unsafe unsafe = defpackage.a.f0a;
        long j = h1q0.d;
        h1q0 h1q0Var = this.d;
        unsafe.putObjectVolatile(h1q0Var, j, th);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h1q0.f12297a;
        atomicIntegerFieldUpdater.incrementAndGet(h1q0Var);
        Throwable th2 = (Throwable) unsafe.getObjectVolatile(h1q0Var, h1q0.e);
        if (th2 != null) {
            unsafe.putObjectVolatile(h1q0Var, h1q0.c, new IllegalStateException("Dispatchers.Main is used concurrently with setting it", th2));
        }
        Object objectVolatile = unsafe.getObjectVolatile(h1q0Var, h1q0.b);
        atomicIntegerFieldUpdater.decrementAndGet(h1q0Var);
        lne lneVar = (lne) objectVolatile;
        return lneVar == null ? (lne) this.c.getValue() : lneVar;
    }
}
