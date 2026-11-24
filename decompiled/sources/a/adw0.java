package a;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class adw0 implements Closeable {
    public static final y50 b = new y50((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f701a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f701a;
        if (i > 0) {
            this.f701a = i - 1;
        } else {
            c99.l("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
