package a;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ijx extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f14900a;
    public final Timer b;
    public final ml50 c;
    public long d = -1;

    public ijx(OutputStream outputStream, ml50 ml50Var, Timer timer) {
        this.f14900a = outputStream;
        this.c = ml50Var;
        this.b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.d;
        ml50 ml50Var = this.c;
        if (j != -1) {
            ml50Var.h(j);
        }
        Timer timer = this.b;
        long jA = timer.a();
        jl50 jl50Var = ml50Var.d;
        jl50Var.i();
        ((ll50) jl50Var.b).U(jA);
        try {
            this.f14900a.close();
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f14900a.flush();
        } catch (IOException e) {
            Timer timer = this.b;
            ml50 ml50Var = this.c;
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        ml50 ml50Var = this.c;
        try {
            this.f14900a.write(i);
            long j = this.d + 1;
            this.d = j;
            ml50Var.h(j);
        } catch (IOException e) {
            twn.y(this.b, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ml50 ml50Var = this.c;
        try {
            this.f14900a.write(bArr);
            long length = this.d + ((long) bArr.length);
            this.d = length;
            ml50Var.h(length);
        } catch (IOException e) {
            twn.y(this.b, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ml50 ml50Var = this.c;
        try {
            this.f14900a.write(bArr, i, i2);
            long j = this.d + ((long) i2);
            this.d = j;
            ml50Var.h(j);
        } catch (IOException e) {
            twn.y(this.b, ml50Var, ml50Var);
            throw e;
        }
    }
}
