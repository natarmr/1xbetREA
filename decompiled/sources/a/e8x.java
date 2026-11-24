package a;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class e8x implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zae0 f7395a;
    public final Inflater b;
    public int c;
    public boolean d;

    public e8x(zae0 zae0Var, Inflater inflater) {
        this.f7395a = zae0Var;
        this.b = inflater;
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        f99Var.getClass();
        do {
            long jA = a(f99Var, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f7395a.v0());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(f99 f99Var, long j) throws IOException {
        Inflater inflater = this.b;
        f99Var.getClass();
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            jf4.n("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                uvh0 uvh0VarS = f99Var.S(1);
                int iMin = (int) Math.min(j, 8192 - uvh0VarS.c);
                boolean zNeedsInput = inflater.needsInput();
                zae0 zae0Var = this.f7395a;
                if (zNeedsInput && !zae0Var.v0()) {
                    uvh0 uvh0Var = zae0Var.b.f9145a;
                    uvh0Var.getClass();
                    int i = uvh0Var.c;
                    int i2 = uvh0Var.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(uvh0Var.f36348a, i2, i3);
                }
                int iInflate = inflater.inflate(uvh0VarS.f36348a, uvh0VarS.c, iMin);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    zae0Var.skip(remaining);
                }
                if (iInflate > 0) {
                    uvh0VarS.c += iInflate;
                    long j2 = iInflate;
                    f99Var.b += j2;
                    return j2;
                }
                if (uvh0VarS.b == uvh0VarS.c) {
                    f99Var.f9145a = uvh0VarS.a();
                    mwh0.a(uvh0VarS);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.f7395a.close();
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.f7395a.f44063a.h();
    }
}
