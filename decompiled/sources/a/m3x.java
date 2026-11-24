package a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class m3x implements ig00 {
    public static final m3x c = new m3x(null, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21139a;
    public final Object b;

    public /* synthetic */ m3x(Object obj, byte b) {
        this.f21139a = b;
        this.b = obj;
    }

    @Override // a.ig00
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            l8x.Y("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        byte b = this.f21139a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return obj;
            default:
                throw new ExecutionException((Throwable) obj);
        }
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
        byte b = this.f21139a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + obj + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
