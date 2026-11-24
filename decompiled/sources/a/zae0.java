package a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zae0 implements u99 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final emk0 f44063a;
    public final f99 b;
    public boolean c;

    public zae0(emk0 emk0Var) {
        emk0Var.getClass();
        this.f44063a = emk0Var;
        this.b = new f99();
    }

    @Override // a.u99
    public final String A(long j) throws EOFException {
        if (j < 0) {
            c99.s(h97.h(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        f99 f99Var = this.b;
        if (jA != -1) {
            return b.c(f99Var, jA);
        }
        if (j2 < Long.MAX_VALUE && G(j2) && f99Var.n(j2 - 1) == 13 && G(j2 + 1) && f99Var.n(j2) == 10) {
            return b.c(f99Var, j2);
        }
        f99 f99Var2 = new f99();
        f99Var.e(f99Var2, 0L, Math.min(32L, f99Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(f99Var.b, j) + " content=" + f99Var2.q0(f99Var2.b).f() + (char) 8230);
    }

    @Override // a.u99
    public final void A0(f99 f99Var, long j) throws EOFException {
        f99 f99Var2 = this.b;
        try {
            h0(j);
            f99Var2.A0(f99Var, j);
        } catch (EOFException e) {
            f99Var.P(f99Var2);
            throw e;
        }
    }

    @Override // a.u99
    public final boolean G(long j) {
        f99 f99Var;
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            jf4.n("closed");
            return false;
        }
        do {
            f99Var = this.b;
            if (f99Var.b >= j) {
                return true;
            }
        } while (this.f44063a.Y(f99Var, 8192L) != -1);
        return false;
    }

    @Override // a.u99
    public final String H0(Charset charset) {
        charset.getClass();
        emk0 emk0Var = this.f44063a;
        f99 f99Var = this.b;
        f99Var.P(emk0Var);
        return f99Var.L(f99Var.b, charset);
    }

    @Override // a.u99
    public final String M() {
        return A(Long.MAX_VALUE);
    }

    @Override // a.u99
    public final byte[] N(long j) {
        h0(j);
        return this.b.N(j);
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        f99Var.getClass();
        if (j < 0) {
            c99.s(h97.h(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            jf4.n("closed");
            return 0L;
        }
        f99 f99Var2 = this.b;
        if (f99Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f44063a.Y(f99Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return f99Var2.Y(f99Var, Math.min(j, f99Var2.b));
    }

    @Override // a.u99
    public final long Y0() {
        f99 f99Var;
        h0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zG = G(i2);
            f99Var = this.b;
            if (!zG) {
                break;
            }
            byte bN = f99Var.n(i);
            if ((bN < 48 || bN > 57) && ((bN < 97 || bN > 102) && (bN < 65 || bN > 70))) {
                if (i != 0) {
                    break;
                }
                String string = Integer.toString(bN, CharsKt.checkRadix(16));
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return f99Var.Y0();
    }

    public final long a(byte b, long j, long j2) {
        if (this.c) {
            jf4.n("closed");
            return 0L;
        }
        if (0 > j2) {
            c99.s(h97.h(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            f99 f99Var = this.b;
            byte b2 = b;
            long j3 = j2;
            long jR = f99Var.r(b2, jMax, j3);
            if (jR != -1) {
                return jR;
            }
            long j4 = f99Var.b;
            if (j4 >= j3 || this.f44063a.Y(f99Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // a.u99
    public final InputStream a1() {
        return new e99((Closeable) this, (byte) 1);
    }

    public final long c(qg9 qg9Var) {
        qg9Var.getClass();
        long jMax = 0;
        if (this.c) {
            jf4.n("closed");
            return 0L;
        }
        while (true) {
            f99 f99Var = this.b;
            long jV = f99Var.v(jMax, qg9Var);
            if (jV != -1) {
                return jV;
            }
            long j = f99Var.b;
            if (this.f44063a.Y(f99Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f44063a.close();
        this.b.a();
    }

    public final zae0 d() {
        return new zae0(new sb90(this));
    }

    public final int e() {
        h0(4L);
        return cy2.H(this.b.readInt());
    }

    @Override // a.u99, a.t99
    public final f99 g() {
        return this.b;
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.f44063a.h();
    }

    @Override // a.u99
    public final void h0(long j) {
        if (G(j)) {
            return;
        }
        c99.f();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final long k() throws EOFException {
        h0(8L);
        long j = this.b.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public final short l() {
        h0(2L);
        return this.b.J();
    }

    @Override // a.u99
    public final boolean m0(long j, qg9 qg9Var) {
        qg9Var.getClass();
        int iE = qg9Var.e();
        if (!this.c) {
            return iE >= 0 && iE <= qg9Var.e() && (iE == 0 || cfx0.C(this, qg9Var, iE, 1L) != -1);
        }
        jf4.n("closed");
        return false;
    }

    public final String n(long j) {
        h0(j);
        return this.b.L(j, Charsets.UTF_8);
    }

    @Override // a.u99
    public final int o0(z680 z680Var) throws EOFException {
        f99 f99Var;
        z680Var.getClass();
        if (this.c) {
            jf4.n("closed");
            return 0;
        }
        do {
            f99Var = this.b;
            int iD = b.d(f99Var, z680Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                f99Var.skip(z680Var.b[iD].e());
                return iD;
            }
        } while (this.f44063a.Y(f99Var, 8192L) != -1);
        return -1;
    }

    @Override // a.u99
    public final qg9 q0(long j) {
        h0(j);
        return this.b.q0(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f99 f99Var = this.b;
        if (f99Var.b == 0 && this.f44063a.Y(f99Var, 8192L) == -1) {
            return -1;
        }
        return f99Var.read(byteBuffer);
    }

    @Override // a.u99
    public final byte readByte() {
        h0(1L);
        return this.b.readByte();
    }

    @Override // a.u99
    public final void readFully(byte[] bArr) throws EOFException {
        f99 f99Var = this.b;
        bArr.getClass();
        try {
            h0(bArr.length);
            f99Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = f99Var.b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = f99Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // a.u99
    public final int readInt() {
        h0(4L);
        return this.b.readInt();
    }

    @Override // a.u99
    public final long readLong() {
        h0(8L);
        return this.b.readLong();
    }

    @Override // a.u99
    public final short readShort() {
        h0(2L);
        return this.b.readShort();
    }

    @Override // a.u99
    public final void skip(long j) {
        if (this.c) {
            jf4.n("closed");
            return;
        }
        while (j > 0) {
            f99 f99Var = this.b;
            if (f99Var.b == 0 && this.f44063a.Y(f99Var, 8192L) == -1) {
                c99.f();
                return;
            } else {
                long jMin = Math.min(j, f99Var.b);
                f99Var.skip(jMin);
                j -= jMin;
            }
        }
    }

    @Override // a.u99
    public final byte[] t0() {
        emk0 emk0Var = this.f44063a;
        f99 f99Var = this.b;
        f99Var.P(emk0Var);
        return f99Var.N(f99Var.b);
    }

    public final String toString() {
        return "buffer(" + this.f44063a + ')';
    }

    @Override // a.u99
    public final long u(t99 t99Var) {
        f99 f99Var;
        long j = 0;
        while (true) {
            emk0 emk0Var = this.f44063a;
            f99Var = this.b;
            if (emk0Var.Y(f99Var, 8192L) == -1) {
                break;
            }
            long jC = f99Var.c();
            if (jC > 0) {
                j += jC;
                t99Var.F0(f99Var, jC);
            }
        }
        long j2 = f99Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        t99Var.F0(f99Var, j2);
        return j3;
    }

    @Override // a.u99
    public final boolean v0() {
        if (this.c) {
            jf4.n("closed");
            return false;
        }
        f99 f99Var = this.b;
        return f99Var.v0() && this.f44063a.Y(f99Var, 8192L) == -1;
    }

    @Override // a.u99
    public final long y0(long j, qg9 qg9Var) {
        qg9Var.getClass();
        return cfx0.C(this, qg9Var, qg9Var.e(), j);
    }
}
