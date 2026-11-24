package a;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class yjw0 extends p4 {
    public final byte[] c;
    public final int d;
    public int e;

    public yjw0(byte[] bArr, int i) {
        super((byte) 14, false);
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            jf4.o(f140.j(bArr.length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    @Override // a.p4
    public final int N0() {
        return this.d - this.e;
    }

    @Override // a.p4
    public final void P0(byte b) throws l52 {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new l52(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // a.p4
    public final void Q0(int i) throws l52 {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = i >> 24;
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new l52(i2, this.d, 4, e);
        }
    }

    @Override // a.p4
    public final void R0(int i, int i2) throws l52 {
        h1(i, 5);
        Q0(i2);
    }

    @Override // a.p4
    public final void S0(int i, long j) throws l52 {
        h1(i, 1);
        W0(j);
    }

    @Override // a.p4
    public final void T0(int i, sjw0 sjw0Var) throws l52 {
        h1(i, 2);
        g1(sjw0Var.e());
        sjw0Var.m(this);
    }

    @Override // a.p4
    public final void U0(int i, String str) throws l52 {
        h1(i, 2);
        int i2 = this.e;
        try {
            int iI1 = p4.i1(str.length() * 3);
            int iI2 = p4.i1(str.length());
            byte[] bArr = this.c;
            if (iI2 != iI1) {
                g1(yqm0.v(str));
                int i3 = this.e;
                this.e = dqm0.I(str, bArr, i3, bArr.length - i3);
            } else {
                int i4 = i2 + iI2;
                this.e = i4;
                int I = dqm0.I(str, bArr, i4, bArr.length - i4);
                this.e = i2;
                g1((I - i2) - iI2);
                this.e = I;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new l52(e);
        }
    }

    @Override // a.p4
    public final void V0(int i, boolean z) throws l52 {
        h1(i, 0);
        P0(z ? (byte) 1 : (byte) 0);
    }

    @Override // a.p4
    public final void W0(long j) throws l52 {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new l52(i, this.d, 8, e);
        }
    }

    @Override // a.p4
    public final void X0(byte[] bArr, int i, int i2) throws l52 {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new l52(this.e, this.d, i2, e);
        }
    }

    @Override // a.p4
    public final void Z0(int i) throws l52 {
        if (i >= 0) {
            g1(i);
            return;
        }
        long j = i;
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.e = i2;
                    } catch (IndexOutOfBoundsException e) {
                        int i9 = i7;
                        e = e;
                        i2 = i9;
                        throw new l52(i2, this.d, 10, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i2 = i3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    @Override // a.p4
    public final void a1(int i, int i2) throws l52 {
        h1(i, 0);
        Z0(i2);
    }

    @Override // a.p4
    public final void b1(int i, long j) throws l52 {
        h1(i, 0);
        c1(j);
    }

    @Override // a.p4
    public final void c1(long j) throws l52 {
        int i = this.e;
        long j2 = j & (-128);
        byte[] bArr = this.c;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new l52(i, this.d, 1, e);
        }
    }

    @Override // a.p4
    public final void g1(int i) throws l52 {
        int i2 = this.e;
        int i3 = i & (-128);
        byte[] bArr = this.c;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.e = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | 128);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.e = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.e = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.e = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.e = i14;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i11;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i8;
                }
                throw new l52(i3, this.d, 1, e);
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                e = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    @Override // a.p4
    public final void h1(int i, int i2) throws l52 {
        g1((i << 3) | i2);
    }

    @Override // a.p4
    public final void k1(int i, int i2) throws l52 {
        h1(i, 0);
        g1(i2);
    }
}
