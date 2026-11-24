package a;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class dvj extends bko implements Executor {
    public static final dvj c = new dvj();
    public static final lne d;

    static {
        cet0 cet0Var = cet0.c;
        int i = bao0.f2270a;
        if (64 >= i) {
            i = 64;
        }
        d = cet0Var.w(ktt0.z(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q(kotlin.coroutines.g.f46065a, runnable);
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        d.q(coroutineContext, runnable);
    }

    @Override // a.lne
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        d.r(coroutineContext, runnable);
    }

    @Override // a.lne
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // a.lne
    public final lne w(int i) {
        return cet0.c.w(i);
    }

    @Override // a.bko
    public final Executor x() {
        return this;
    }
}
