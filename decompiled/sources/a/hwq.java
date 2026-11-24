package a;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hwq extends fpq {
    public final ig00 i;

    public hwq(ig00 ig00Var) {
        this.i = ig00Var;
    }

    @Override // a.l2, a.ig00
    public final void a(Runnable runnable, Executor executor) {
        this.i.a(runnable, executor);
    }

    @Override // a.l2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    @Override // a.l2, java.util.concurrent.Future
    public final Object get() {
        return this.i.get();
    }

    @Override // a.l2, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override // a.l2, java.util.concurrent.Future
    public final boolean isDone() {
        return this.i.isDone();
    }

    @Override // a.l2
    public final String toString() {
        return this.i.toString();
    }

    @Override // a.l2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.i.get(j, timeUnit);
    }
}
