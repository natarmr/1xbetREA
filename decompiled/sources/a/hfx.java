package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hfx implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f12991a;
    public final fmq0 b;

    public hfx(InputStream inputStream, fmq0 fmq0Var) {
        inputStream.getClass();
        this.f12991a = inputStream;
        this.b = fmq0Var;
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) throws IOException {
        f99Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.b.f();
            uvh0 uvh0VarS = f99Var.S(1);
            int i = this.f12991a.read(uvh0VarS.f36348a, uvh0VarS.c, (int) Math.min(j, 8192 - uvh0VarS.c));
            if (i != -1) {
                uvh0VarS.c += i;
                long j2 = i;
                f99Var.b += j2;
                return j2;
            }
            if (uvh0VarS.b != uvh0VarS.c) {
                return -1L;
            }
            f99Var.f9145a = uvh0VarS.a();
            mwh0.a(uvh0VarS);
            return -1L;
        } catch (AssertionError e) {
            if (j4w0.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12991a.close();
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.f12991a + ')';
    }
}
