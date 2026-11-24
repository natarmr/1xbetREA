package a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class jxv implements Executor {
    public static volatile jxv c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17329a;
    public final Executor b;

    public jxv() {
        this.f17329a = (byte) 0;
        this.b = Executors.newSingleThreadExecutor(new ixv((byte) 0));
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (jxv.class) {
            try {
                if (c == null) {
                    c = new jxv();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17329a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            default:
                this.b.execute(new btg0(runnable, (byte) 0));
                break;
        }
    }

    public jxv(ExecutorService executorService) {
        this.f17329a = (byte) 1;
        this.b = executorService;
    }
}
