package a;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class fxj implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f10313a;
    public final ojk0 b;
    public final /* synthetic */ pmi c;

    public fxj(pmi pmiVar) {
        this.c = pmiVar;
        Socket socket = (Socket) pmiVar.b;
        this.f10313a = socket.getInputStream();
        this.b = new ojk0(socket);
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
        ojk0 ojk0Var = this.b;
        ojk0Var.f();
        uvh0 uvh0VarS = f99Var.S(1);
        int iMin = (int) Math.min(j, 8192 - uvh0VarS.c);
        try {
            ojk0Var.i();
            try {
                try {
                    int i = this.f10313a.read(uvh0VarS.f36348a, uvh0VarS.c, iMin);
                    if (ojk0Var.j()) {
                        throw ojk0Var.l(null);
                    }
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
                } catch (IOException e) {
                    if (ojk0Var.j()) {
                        throw ojk0Var.l(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                ojk0Var.j();
                throw th;
            }
        } catch (AssertionError e2) {
            if (j4w0.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        pmi pmiVar = this.c;
        ojk0 ojk0Var = this.b;
        ojk0Var.i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) pmiVar.c;
                Socket socket = (Socket) pmiVar.b;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    ojk0Var.j();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    ojk0Var.j();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f10313a.close();
                    }
                }
                if (ojk0Var.j()) {
                    throw ojk0Var.l(null);
                }
            } catch (IOException e) {
                if (!ojk0Var.j()) {
                    throw e;
                }
                throw ojk0Var.l(e);
            }
        } catch (Throwable th) {
            ojk0Var.j();
            throw th;
        }
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
