package a;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hjx extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f13182a;
    public final ml50 b;
    public final Timer c;
    public long e;
    public long d = -1;
    public long f = -1;

    public hjx(InputStream inputStream, ml50 ml50Var, Timer timer) {
        this.c = timer;
        this.f13182a = inputStream;
        this.b = ml50Var;
        this.e = ((ll50) ml50Var.d.b).C();
    }

    public final void a(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            this.d = j;
        } else {
            this.d = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f13182a.available();
        } catch (IOException e) {
            Timer timer = this.c;
            ml50 ml50Var = this.b;
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ml50 ml50Var = this.b;
        Timer timer = this.c;
        long jA = timer.a();
        if (this.f == -1) {
            this.f = jA;
        }
        try {
            this.f13182a.close();
            long j = this.d;
            if (j != -1) {
                ml50Var.l(j);
            }
            long j2 = this.e;
            if (j2 != -1) {
                jl50 jl50Var = ml50Var.d;
                jl50Var.i();
                ((ll50) jl50Var.b).W(j2);
            }
            ml50Var.m(this.f);
            ml50Var.b();
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f13182a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f13182a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.c;
        ml50 ml50Var = this.b;
        try {
            int i = this.f13182a.read();
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i != -1 || this.f != -1) {
                a(1L);
                ml50Var.l(this.d);
                return i;
            }
            this.f = jA;
            ml50Var.m(jA);
            ml50Var.b();
            return i;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f13182a.reset();
        } catch (IOException e) {
            Timer timer = this.c;
            ml50 ml50Var = this.b;
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.c;
        ml50 ml50Var = this.b;
        try {
            long jSkip = this.f13182a.skip(j);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (jSkip == 0 && j != 0 && this.f == -1) {
                this.f = jA;
                ml50Var.m(jA);
                return jSkip;
            }
            a(jSkip);
            ml50Var.l(this.d);
            return jSkip;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.c;
        ml50 ml50Var = this.b;
        try {
            int i3 = this.f13182a.read(bArr, i, i2);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i3 == -1 && this.f == -1) {
                this.f = jA;
                ml50Var.m(jA);
                ml50Var.b();
                return i3;
            }
            a(i3);
            ml50Var.l(this.d);
            return i3;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.c;
        ml50 ml50Var = this.b;
        try {
            int i = this.f13182a.read(bArr);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i == -1 && this.f == -1) {
                this.f = jA;
                ml50Var.m(jA);
                ml50Var.b();
                return i;
            }
            a(i);
            ml50Var.l(this.d);
            return i;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }
}
