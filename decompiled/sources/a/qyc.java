package a;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class qyc {
    public static final Logger e = Logger.getLogger(qyc.class.getName());
    public static final boolean f = ift0.e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public prc f29525a;
    public final byte[] b;
    public final int c;
    public int d;

    public qyc(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            jf4.l("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int b(String str) {
        int length;
        try {
            length = qtt0.a(str);
        } catch (ntt0 unused) {
            length = str.getBytes(dmx.f6339a).length;
        }
        return d(length) + length;
    }

    public static int c(int i) {
        return d(i << 3);
    }

    public static int d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void f(byte b) throws l52 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, (byte) 2);
        }
    }

    public final void g(byte[] bArr, int i, int i2) throws l52 {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2, (byte) 2);
        }
    }

    public final void h(lg9 lg9Var) throws l52 {
        n(lg9Var.size());
        g(lg9Var.b, lg9Var.f(), lg9Var.size());
    }

    public final void i(int i) throws l52 {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, (byte) 2);
        }
    }

    public final void j(long j) throws l52 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, (byte) 2);
        }
    }

    public final void k(int i) throws l52 {
        if (i >= 0) {
            n(i);
        } else {
            o(i);
        }
    }

    public final void l(String str) throws l52 {
        int i = this.d;
        try {
            int iD = d(str.length() * 3);
            int iD2 = d(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (iD2 != iD) {
                n(qtt0.a(str));
                int i3 = this.d;
                this.d = qtt0.f29315a.i(str, bArr, i3, i2 - i3);
                return;
            }
            int i4 = i + iD2;
            this.d = i4;
            int i5 = qtt0.f29315a.i(str, bArr, i4, i2 - i4);
            this.d = i;
            n((i5 - i) - iD2);
            this.d = i5;
        } catch (ntt0 e2) {
            this.d = i;
            e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(dmx.f6339a);
            try {
                n(bytes.length);
                g(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new l52(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new l52(e4);
        }
    }

    public final void m(int i, int i2) {
        n((i << 3) | i2);
    }

    public final void n(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, (byte) 2);
                }
            }
            throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2, (byte) 2);
        }
    }

    public final void o(long j) throws l52 {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2, (byte) 2);
                    }
                }
                throw new l52(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2, (byte) 2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.d;
            if (j3 == 0) {
                this.d = i3 + 1;
                ift0.l(bArr, i3, (byte) j);
                return;
            } else {
                this.d = i3 + 1;
                ift0.l(bArr, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
