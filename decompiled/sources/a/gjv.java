package a;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class gjv implements s5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yae0 f11418a;
    public final Deflater b;
    public final uzj c;
    public boolean d;
    public final CRC32 e;

    public gjv(t99 t99Var) {
        yae0 yae0Var = new yae0(t99Var);
        this.f11418a = yae0Var;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new uzj(yae0Var, deflater, (byte) 0);
        this.e = new CRC32();
        f99 f99Var = yae0Var.b;
        f99Var.a0(8075);
        f99Var.V(8);
        f99Var.V(0);
        f99Var.Z(0);
        f99Var.V(0);
        f99Var.V(0);
    }

    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) throws IOException {
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        uvh0 uvh0Var = f99Var.f9145a;
        uvh0Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, uvh0Var.c - uvh0Var.b);
            this.e.update(uvh0Var.f36348a, uvh0Var.b, iMin);
            j2 -= (long) iMin;
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
        }
        this.c.F0(f99Var, j);
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        yae0 yae0Var = this.f11418a;
        f99 f99Var = yae0Var.b;
        if (this.d) {
            return;
        }
        try {
            uzj uzjVar = this.c;
            ((Deflater) uzjVar.d).finish();
            uzjVar.a(false);
            int value = (int) this.e.getValue();
            if (yae0Var.c) {
                throw new IllegalStateException("closed");
            }
            f99Var.Z(cy2.H(value));
            yae0Var.a();
            int bytesRead = (int) deflater.getBytesRead();
            if (yae0Var.c) {
                throw new IllegalStateException("closed");
            }
            f99Var.Z(cy2.H(bytesRead));
            yae0Var.a();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                yae0Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // a.s5k0, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }

    @Override // a.s5k0
    public final fmq0 h() {
        return this.f11418a.f42292a.h();
    }
}
