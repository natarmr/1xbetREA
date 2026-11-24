package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class hsz extends lne implements vzj {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(hsz.class, "runningWorkers$volatile");
    public static final /* synthetic */ long i = defpackage.a.f0a.objectFieldOffset(hsz.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ vzj c;
    public final lne d;
    public final int e;
    public final iu00 f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public hsz(lne lneVar, int i2) {
        vzj vzjVar = lneVar instanceof vzj ? (vzj) lneVar : null;
        this.c = vzjVar == null ? fuj.f10165a : vzjVar;
        this.d = lneVar;
        this.e = i2;
        this.f = new iu00();
        this.g = new Object();
    }

    @Override // a.vzj
    public final void a(long j, n5a n5aVar) {
        this.c.a(j, n5aVar);
    }

    @Override // a.vzj
    public final nwk c(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.c.c(j, runnable, coroutineContext);
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableX;
        this.f.a(runnable);
        if (defpackage.a.f0a.getIntVolatile(this, i) >= this.e || !y() || (runnableX = x()) == null) {
            return;
        }
        try {
            ovk.b(this.d, this, new mfr(this, runnableX, false, (byte) 10));
        } catch (Throwable th) {
            h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // a.lne
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableX;
        this.f.a(runnable);
        if (defpackage.a.f0a.getIntVolatile(this, i) >= this.e || !y() || (runnableX = x()) == null) {
            return;
        }
        try {
            this.d.r(this, new mfr(this, runnableX, false, (byte) 10));
        } catch (Throwable th) {
            h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // a.lne
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return brm0.n(sb, this.e, ')');
    }

    @Override // a.lne
    public final lne w(int i2) {
        g7x.x(i2);
        return i2 >= this.e ? this : super.w(i2);
    }

    public final Runnable x() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean y() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            if (defpackage.a.f0a.getIntVolatile(this, i) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
