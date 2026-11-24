package a;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class kmv implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f18559a = new AtomicReference(null);
    public final long b;
    public final Callable c;
    public final wu9 d;

    public kmv(Handler handler, long j, Callable callable) {
        this.b = j;
        this.c = callable;
        gxu gxuVar = new gxu();
        gxuVar.c = this;
        gxuVar.f12096a = handler;
        gxuVar.b = callable;
        this.d = y0x0.I(gxuVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.d.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        tu9 tu9Var = (tu9) this.f18559a.getAndSet(null);
        if (tu9Var != null) {
            try {
                tu9Var.b(this.c.call());
            } catch (Exception e) {
                tu9Var.d(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.d.b.get(j, timeUnit);
    }
}
