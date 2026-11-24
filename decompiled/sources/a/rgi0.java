package a;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class rgi0 implements Executor {
    public final Executor b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f30438a = new ArrayDeque();
    public final mx2 c = new mx2(this, 25);
    public int d = 1;
    public long e = 0;

    public rgi0(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f30438a) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.e;
                btg0 btg0Var = new btg0(runnable, (byte) 2);
                this.f30438a.add(btg0Var);
                this.d = 2;
                try {
                    this.b.execute(this.c);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.f30438a) {
                        try {
                            if (this.e == j && this.d == 2) {
                                this.d = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f30438a) {
                        try {
                            int i2 = this.d;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f30438a.removeLastOccurrence(btg0Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f30438a.add(runnable);
        }
    }
}
