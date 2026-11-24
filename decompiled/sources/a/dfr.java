package a;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class dfr implements ig00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ig00 f6012a;
    public tu9 b;

    public dfr() {
        this.f6012a = y0x0.I(new cad(this, (byte) 24));
    }

    @Override // a.ig00
    public final void a(Runnable runnable, Executor executor) {
        this.f6012a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f6012a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f6012a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6012a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6012a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f6012a.get(j, timeUnit);
    }

    public dfr(ig00 ig00Var) {
        ig00Var.getClass();
        this.f6012a = ig00Var;
    }
}
