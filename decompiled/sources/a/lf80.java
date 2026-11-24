package a;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lf80 implements s5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f19941a;
    public final fmq0 b;

    public lf80(FileOutputStream fileOutputStream, fmq0 fmq0Var) {
        this.f19941a = fileOutputStream;
        this.b = fmq0Var;
    }

    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) throws IOException {
        cy2.x(f99Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            uvh0 uvh0Var = f99Var.f9145a;
            uvh0Var.getClass();
            int iMin = (int) Math.min(j, uvh0Var.c - uvh0Var.b);
            this.f19941a.write(uvh0Var.f36348a, uvh0Var.b, iMin);
            int i = uvh0Var.b + iMin;
            uvh0Var.b = i;
            long j2 = iMin;
            j -= j2;
            f99Var.b -= j2;
            if (i == uvh0Var.c) {
                f99Var.f9145a = uvh0Var.a();
                mwh0.a(uvh0Var);
            }
        }
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19941a.close();
    }

    @Override // a.s5k0, java.io.Flushable
    public final void flush() throws IOException {
        this.f19941a.flush();
    }

    @Override // a.s5k0
    public final fmq0 h() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.f19941a + ')';
    }
}
