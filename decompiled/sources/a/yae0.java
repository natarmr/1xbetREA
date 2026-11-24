package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class yae0 implements t99 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5k0 f42292a;
    public final f99 b;
    public boolean c;

    public yae0(s5k0 s5k0Var) {
        s5k0Var.getClass();
        this.f42292a = s5k0Var;
        this.b = new f99();
    }

    @Override // a.t99
    public final t99 B(byte[] bArr, int i) {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.U(bArr, i);
        a();
        return this;
    }

    @Override // a.t99
    public final t99 D(String str) {
        str.getClass();
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.c0(str);
        a();
        return this;
    }

    @Override // a.s5k0
    public final void F0(f99 f99Var, long j) {
        f99Var.getClass();
        if (this.c) {
            jf4.n("closed");
        } else {
            this.b.F0(f99Var, j);
            a();
        }
    }

    @Override // a.t99
    public final t99 I0(long j) {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.X(j);
        a();
        return this;
    }

    @Override // a.t99
    public final t99 N0(qg9 qg9Var) {
        qg9Var.getClass();
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.T(qg9Var);
        a();
        return this;
    }

    @Override // a.t99
    public final long P(emk0 emk0Var) {
        emk0Var.getClass();
        long j = 0;
        while (true) {
            long jY = emk0Var.Y(this.b, 8192L);
            if (jY == -1) {
                return j;
            }
            j += jY;
            a();
        }
    }

    public final t99 a() {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        f99 f99Var = this.b;
        long jC = f99Var.c();
        if (jC > 0) {
            this.f42292a.F0(f99Var, jC);
        }
        return this;
    }

    @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s5k0 s5k0Var = this.f42292a;
        if (this.c) {
            return;
        }
        f99 f99Var = this.b;
        long j = f99Var.b;
        if (j > 0) {
            s5k0Var.F0(f99Var, j);
        }
        th = null;
        try {
            s5k0Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // a.t99, a.s5k0, java.io.Flushable
    public final void flush() {
        if (this.c) {
            jf4.n("closed");
            return;
        }
        f99 f99Var = this.b;
        long j = f99Var.b;
        s5k0 s5k0Var = this.f42292a;
        if (j > 0) {
            s5k0Var.F0(f99Var, j);
        }
        s5k0Var.flush();
    }

    @Override // a.t99
    public final f99 g() {
        return this.b;
    }

    @Override // a.s5k0
    public final fmq0 h() {
        return this.f42292a.h();
    }

    @Override // a.t99
    public final t99 i0(long j) {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.W(j);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        return "buffer(" + this.f42292a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            jf4.n("closed");
            return 0;
        }
        int iWrite = this.b.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // a.t99
    public final t99 writeByte(int i) {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.V(i);
        a();
        return this;
    }

    @Override // a.t99
    public final t99 writeInt(int i) {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.Z(i);
        a();
        return this;
    }

    @Override // a.t99
    public final t99 writeShort(int i) {
        if (this.c) {
            jf4.n("closed");
            return null;
        }
        this.b.a0(i);
        a();
        return this;
    }

    @Override // a.t99
    public final t99 write(byte[] bArr) {
        bArr.getClass();
        if (!this.c) {
            this.b.U(bArr, bArr.length);
            a();
            return this;
        }
        jf4.n("closed");
        return null;
    }
}
