package a;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes2.dex */
public interface s5k0 extends Closeable, Flushable {
    void F0(f99 f99Var, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    fmq0 h();
}
