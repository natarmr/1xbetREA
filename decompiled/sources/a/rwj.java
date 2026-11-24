package a;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class rwj extends bko {
    public static final rwj d;
    public une c;

    static {
        int i = xuo0.c;
        int i2 = xuo0.d;
        long j = xuo0.e;
        String str = xuo0.f41521a;
        rwj rwjVar = new rwj();
        rwjVar.c = new une(str, i, i2, j);
        d = rwjVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        une.d(this.c, runnable, 6);
    }

    @Override // a.lne
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        une.d(this.c, runnable, 2);
    }

    @Override // a.lne
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // a.lne
    public final lne w(int i) {
        g7x.x(i);
        return i >= xuo0.c ? this : super.w(i);
    }

    @Override // a.bko
    public final Executor x() {
        return this.c;
    }
}
