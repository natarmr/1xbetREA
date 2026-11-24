package a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wu9 implements ig00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f39779a;
    public final vu9 b = new vu9(this);

    public wu9(tu9 tu9Var) {
        this.f39779a = new WeakReference(tu9Var);
    }

    @Override // a.ig00
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean b(Throwable th) {
        return this.b.m(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        tu9 tu9Var = (tu9) this.f39779a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && tu9Var != null) {
            tu9Var.f34540a = null;
            tu9Var.b = null;
            tu9Var.c.l(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.f41976a instanceof r4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
