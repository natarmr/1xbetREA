package a;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class exj implements s5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f8580a;
    public final ojk0 b;
    public final /* synthetic */ pmi c;

    public exj(pmi pmiVar) {
        this.c = pmiVar;
        Socket socket = (Socket) pmiVar.b;
        this.f8580a = socket.getOutputStream();
        this.b = new ojk0(socket);
    }

    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) throws IOException {
        cy2.x(f99Var.b, 0L, j);
        while (j > 0) {
            ojk0 ojk0Var = this.b;
            ojk0Var.f();
            uvh0 uvh0Var = f99Var.f9145a;
            uvh0Var.getClass();
            int iMin = (int) Math.min(j, uvh0Var.c - uvh0Var.b);
            ojk0Var.i();
            try {
                try {
                    this.f8580a.write(uvh0Var.f36348a, uvh0Var.b, iMin);
                    if (ojk0Var.j()) {
                        throw ojk0Var.l(null);
                    }
                    int i = uvh0Var.b + iMin;
                    uvh0Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    f99Var.b -= j2;
                    if (i == uvh0Var.c) {
                        f99Var.f9145a = uvh0Var.a();
                        mwh0.a(uvh0Var);
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
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f8580a;
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
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    ojk0Var.j();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    ojk0Var.j();
                    return;
                }
                socket.close();
                if (ojk0Var.j()) {
                    throw ojk0Var.l(null);
                }
            } catch (Throwable th) {
                ojk0Var.j();
                throw th;
            }
        } catch (IOException e) {
            if (!ojk0Var.j()) {
                throw e;
            }
            throw ojk0Var.l(e);
        }
    }

    @Override // a.s5k0, java.io.Flushable
    public final void flush() throws IOException {
        ojk0 ojk0Var = this.b;
        ojk0Var.i();
        try {
            try {
                this.f8580a.flush();
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

    @Override // a.s5k0
    public final fmq0 h() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }
}
