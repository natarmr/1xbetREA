package a;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class n3x implements ig00 {
    public static final n3x b = new n3x(null);
    public static final edz c = new edz(n3x.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22870a;

    public n3x(Object obj) {
        this.f22870a = obj;
    }

    @Override // a.ig00
    public final void a(Runnable runnable, Executor executor) {
        x0x.G(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f22870a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f22870a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f22870a;
    }
}
