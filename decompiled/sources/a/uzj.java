package a;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class uzj implements s5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36537a;
    public boolean b;
    public final s5k0 c;
    public final Object d;

    public /* synthetic */ uzj(s5k0 s5k0Var, Object obj, byte b) {
        this.f36537a = b;
        this.c = s5k0Var;
        this.d = obj;
    }

    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) throws IOException {
        byte b = this.f36537a;
        Object obj = this.d;
        switch (b) {
            case 0:
                Deflater deflater = (Deflater) obj;
                f99Var.getClass();
                cy2.x(f99Var.b, 0L, j);
                while (j > 0) {
                    uvh0 uvh0Var = f99Var.f9145a;
                    uvh0Var.getClass();
                    int iMin = (int) Math.min(j, uvh0Var.c - uvh0Var.b);
                    deflater.setInput(uvh0Var.f36348a, uvh0Var.b, iMin);
                    a(false);
                    long j2 = iMin;
                    f99Var.b -= j2;
                    int i = uvh0Var.b + iMin;
                    uvh0Var.b = i;
                    if (i == uvh0Var.c) {
                        f99Var.f9145a = uvh0Var.a();
                        mwh0.a(uvh0Var);
                    }
                    j -= j2;
                }
                deflater.setInput(ffb0.e, 0, 0);
                break;
            default:
                if (this.b) {
                    f99Var.skip(j);
                } else {
                    try {
                        this.c.F0(f99Var, j);
                    } catch (IOException e) {
                        this.b = true;
                        ((e3j) obj).invoke(e);
                    }
                }
                break;
        }
    }

    public void a(boolean z) throws IOException {
        uvh0 uvh0VarS;
        int iDeflate;
        Deflater deflater = (Deflater) this.d;
        yae0 yae0Var = (yae0) this.c;
        f99 f99Var = yae0Var.b;
        while (true) {
            uvh0VarS = f99Var.S(1);
            byte[] bArr = uvh0VarS.f36348a;
            int i = uvh0VarS.c;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    csj.c("Deflater already closed", e);
                    return;
                } catch (NullPointerException e2) {
                    csj.c("Deflater already closed", e2);
                    return;
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                uvh0VarS.c += iDeflate;
                f99Var.b += (long) iDeflate;
                yae0Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (uvh0VarS.b == uvh0VarS.c) {
            f99Var.f9145a = uvh0VarS.a();
            mwh0.a(uvh0VarS);
        }
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        byte b = this.f36537a;
        Object obj = this.d;
        s5k0 s5k0Var = this.c;
        switch (b) {
            case 0:
                Deflater deflater = (Deflater) obj;
                if (this.b) {
                    return;
                }
                deflater.finish();
                a(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((yae0) s5k0Var).close();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                try {
                    s5k0Var.close();
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((e3j) obj).invoke(e);
                    return;
                }
        }
    }

    @Override // a.s5k0, java.io.Flushable
    public final void flush() throws IOException {
        byte b = this.f36537a;
        s5k0 s5k0Var = this.c;
        switch (b) {
            case 0:
                a(true);
                ((yae0) s5k0Var).flush();
                break;
            default:
                try {
                    s5k0Var.flush();
                } catch (IOException e) {
                    this.b = true;
                    ((e3j) this.d).invoke(e);
                    return;
                }
                break;
        }
    }

    @Override // a.s5k0
    public final fmq0 h() {
        byte b = this.f36537a;
        s5k0 s5k0Var = this.c;
        switch (b) {
            case 0:
                return ((yae0) s5k0Var).f42292a.h();
            default:
                return s5k0Var.h();
        }
    }

    public String toString() {
        switch (this.f36537a) {
            case 0:
                return "DeflaterSink(" + ((yae0) this.c) + ')';
            default:
                return super.toString();
        }
    }
}
