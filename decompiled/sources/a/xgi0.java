package a;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xgi0 implements Executor {
    public static final String e = wv00.h("SerialExecutorImpl");
    public final Executor b;
    public Runnable c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f40842a = new ArrayDeque();
    public final Object d = new Object();

    public xgi0(Executor executor) {
        this.b = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f40842a.poll();
        this.c = runnable;
        if (runnable != null) {
            try {
                this.b.execute(runnable);
            } catch (Throwable th) {
                wv00.f().e(e, "Delegate executor failed to execute", th);
                this.c = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.f40842a.add(new mfr((Object) this, (Object) runnable, (byte) 13));
                if (this.c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
