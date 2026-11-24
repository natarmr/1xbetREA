package a;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class j78 implements s5k0 {
    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) throws EOFException {
        f99Var.skip(j);
    }

    @Override // a.s5k0
    public final fmq0 h() {
        return fmq0.d;
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // a.s5k0, java.io.Flushable
    public final void flush() {
    }
}
