package a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ckw0 extends p4 {
    public final byte[] c;
    public final int d;
    public int e;
    public final ByteArrayOutputStream f;

    public ckw0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        super((byte) 14, false);
        this.f = byteArrayOutputStream;
        if (i < 0) {
            jf4.o("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.c = new byte[iMax];
        this.d = iMax;
    }

    @Override // a.p4
    public final void P0(byte b) throws IOException {
        if (this.e == this.d) {
            o1();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // a.p4
    public final void Q0(int i) throws IOException {
        t1(4);
        q1(i);
    }

    @Override // a.p4
    public final void R0(int i, int i2) throws IOException {
        t1(14);
        u1(i, 5);
        q1(i2);
    }

    @Override // a.p4
    public final void S0(int i, long j) throws IOException {
        t1(18);
        u1(i, 1);
        p1(j);
    }

    @Override // a.p4
    public final void T0(int i, sjw0 sjw0Var) throws IOException {
        h1(i, 2);
        g1(sjw0Var.e());
        sjw0Var.m(this);
    }

    @Override // a.p4
    public final void U0(int i, String str) throws IOException {
        h1(i, 2);
        int length = str.length() * 3;
        int iI1 = p4.i1(length);
        int i2 = iI1 + length;
        int i3 = this.d;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int I = dqm0.I(str, bArr, 0, length);
            g1(I);
            n1(bArr, 0, I);
            return;
        }
        if (i2 > i3 - this.e) {
            o1();
        }
        int iI2 = p4.i1(str.length());
        int i4 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (iI2 != iI1) {
                int iV = yqm0.v(str);
                s1(iV);
                this.e = dqm0.I(str, bArr2, this.e, iV);
            } else {
                int i5 = i4 + iI2;
                this.e = i5;
                int I2 = dqm0.I(str, bArr2, i5, i3 - i5);
                this.e = i4;
                s1((I2 - i4) - iI2);
                this.e = I2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new l52(e);
        }
    }

    @Override // a.p4
    public final void V0(int i, boolean z) throws IOException {
        t1(11);
        u1(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.e;
        this.c[i2] = b;
        this.e = i2 + 1;
    }

    @Override // a.p4
    public final void W0(long j) throws IOException {
        t1(8);
        p1(j);
    }

    @Override // a.p4
    public final void X0(byte[] bArr, int i, int i2) throws IOException {
        n1(bArr, i, i2);
    }

    @Override // a.p4
    public final void Z0(int i) throws IOException {
        if (i >= 0) {
            g1(i);
        } else {
            c1(i);
        }
    }

    @Override // a.p4
    public final void a1(int i, int i2) throws IOException {
        t1(20);
        u1(i, 0);
        if (i2 >= 0) {
            s1(i2);
        } else {
            r1(i2);
        }
    }

    @Override // a.p4
    public final void b1(int i, long j) throws IOException {
        t1(20);
        u1(i, 0);
        r1(j);
    }

    @Override // a.p4
    public final void c1(long j) throws IOException {
        t1(10);
        r1(j);
    }

    @Override // a.p4
    public final void g1(int i) throws IOException {
        t1(5);
        s1(i);
    }

    @Override // a.p4
    public final void h1(int i, int i2) throws IOException {
        g1((i << 3) | i2);
    }

    @Override // a.p4
    public final void k1(int i, int i2) throws IOException {
        t1(20);
        u1(i, 0);
        s1(i2);
    }

    public final void n1(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.e = i4;
        o1();
        if (i7 > i4) {
            this.f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
        }
    }

    public final void o1() throws IOException {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void p1(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void q1(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = i >> 24;
        this.e = i2 + 4;
    }

    public final void r1(long j) {
        int i = this.e;
        long j2 = j & (-128);
        byte[] bArr = this.c;
        if (j2 == 0) {
            bArr[i] = (byte) j;
            this.e = i + 1;
            return;
        }
        bArr[i] = (byte) (((int) j) | 128);
        long j3 = j >>> 7;
        if ((j3 & (-128)) == 0) {
            bArr[i + 1] = (byte) j3;
            this.e = i + 2;
            return;
        }
        bArr[i + 1] = (byte) (((int) j3) | 128);
        long j4 = j >>> 14;
        if ((j4 & (-128)) == 0) {
            bArr[i + 2] = (byte) j4;
            this.e = i + 3;
            return;
        }
        bArr[i + 2] = (byte) (((int) j4) | 128);
        long j5 = j >>> 21;
        if ((j5 & (-128)) == 0) {
            bArr[i + 3] = (byte) j5;
            this.e = i + 4;
            return;
        }
        bArr[i + 3] = (byte) (((int) j5) | 128);
        long j6 = j >>> 28;
        if ((j6 & (-128)) == 0) {
            bArr[i + 4] = (byte) j6;
            this.e = i + 5;
            return;
        }
        bArr[i + 4] = (byte) (((int) j6) | 128);
        long j7 = j >>> 35;
        if ((j7 & (-128)) == 0) {
            bArr[i + 5] = (byte) j7;
            this.e = i + 6;
            return;
        }
        bArr[i + 5] = (byte) (((int) j7) | 128);
        long j8 = j >>> 42;
        if ((j8 & (-128)) == 0) {
            bArr[i + 6] = (byte) j8;
            this.e = i + 7;
            return;
        }
        bArr[i + 6] = (byte) (((int) j8) | 128);
        long j9 = j >>> 49;
        if ((j9 & (-128)) == 0) {
            bArr[i + 7] = (byte) j9;
            this.e = i + 8;
            return;
        }
        bArr[i + 7] = (byte) (((int) j9) | 128);
        long j10 = j >>> 56;
        if (((-128) & j10) == 0) {
            bArr[i + 8] = (byte) j10;
            this.e = i + 9;
        } else {
            bArr[i + 8] = (byte) (((int) j10) | 128);
            bArr[i + 9] = (byte) (j >>> 63);
            this.e = i + 10;
        }
    }

    public final void s1(int i) {
        int i2 = this.e;
        int i3 = i & (-128);
        byte[] bArr = this.c;
        if (i3 == 0) {
            bArr[i2] = (byte) i;
            this.e = i2 + 1;
            return;
        }
        bArr[i2] = (byte) (i | 128);
        int i4 = i >>> 7;
        if ((i4 & (-128)) == 0) {
            bArr[i2 + 1] = (byte) i4;
            this.e = i2 + 2;
            return;
        }
        bArr[i2 + 1] = (byte) (i4 | 128);
        int i5 = i >>> 14;
        if ((i5 & (-128)) == 0) {
            bArr[i2 + 2] = (byte) i5;
            this.e = i2 + 3;
            return;
        }
        bArr[i2 + 2] = (byte) (i5 | 128);
        int i6 = i >>> 21;
        if ((i6 & (-128)) == 0) {
            bArr[i2 + 3] = (byte) i6;
            this.e = i2 + 4;
        } else {
            bArr[i2 + 3] = (byte) (i6 | 128);
            bArr[i2 + 4] = (byte) (i >>> 28);
            this.e = i2 + 5;
        }
    }

    public final void t1(int i) throws IOException {
        if (this.d - this.e < i) {
            o1();
        }
    }

    public final void u1(int i, int i2) {
        s1((i << 3) | i2);
    }
}
