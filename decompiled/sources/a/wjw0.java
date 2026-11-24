package a;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wjw0 extends tdw0 {
    public final byte[] d;
    public final int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public wjw0(byte[] bArr, int i, int i2) {
        this.d = bArr;
        int i3 = i2 + i;
        this.e = i3;
        this.f = i3;
        this.g = i;
        this.h = i;
    }

    @Override // a.tdw0
    public final int A() {
        return k0();
    }

    @Override // a.tdw0
    public final int C() {
        return g0();
    }

    @Override // a.tdw0
    public final int E() {
        int iL0 = l0();
        return (-(iL0 & 1)) ^ (iL0 >>> 1);
    }

    @Override // a.tdw0
    public final int F() throws qkw0 {
        if (b0()) {
            this.i = 0;
            return 0;
        }
        int iL0 = l0();
        this.i = iL0;
        if ((iL0 >>> 3) != 0) {
            return iL0;
        }
        throw qkw0.b();
    }

    @Override // a.tdw0
    public final int H() {
        return l0();
    }

    @Override // a.tdw0
    public final long I() {
        return h0();
    }

    @Override // a.tdw0
    public final long K() {
        return i0();
    }

    @Override // a.tdw0
    public final long N() {
        return h0();
    }

    @Override // a.tdw0
    public final long P() {
        return tdw0.n(i0());
    }

    @Override // a.tdw0
    public final long S() {
        return i0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    @Override // a.tdw0
    public final vjw0 U() throws qkw0 {
        byte[] bArrCopyOfRange;
        int iL0 = l0();
        byte[] bArr = this.d;
        if (iL0 > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iL0 <= i - i2) {
                vjw0 vjw0VarL = sjw0.l(bArr, i2, iL0);
                this.g += iL0;
                return vjw0VarL;
            }
        }
        if (iL0 == 0) {
            return sjw0.b;
        }
        if (iL0 > 0) {
            int i3 = this.f;
            int i4 = this.g;
            if (iL0 <= i3 - i4) {
                int i5 = iL0 + i4;
                this.g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iL0 <= 0) {
                    throw qkw0.h();
                }
                if (iL0 == 0) {
                    throw qkw0.f();
                }
                bArrCopyOfRange = lkw0.f20222a;
            }
        } else {
            if (iL0 <= 0) {
                throw qkw0.h();
            }
            if (iL0 == 0) {
                throw qkw0.f();
            }
            bArrCopyOfRange = lkw0.f20222a;
        }
        vjw0 vjw0Var = sjw0.b;
        return bArrCopyOfRange.length == 0 ? sjw0.b : new vjw0(bArrCopyOfRange);
    }

    @Override // a.tdw0
    public final String W() throws qkw0 {
        int iL0 = l0();
        if (iL0 > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iL0 <= i - i2) {
                String str = new String(this.d, i2, iL0, StandardCharsets.UTF_8);
                this.g += iL0;
                return str;
            }
        }
        if (iL0 == 0) {
            return "";
        }
        if (iL0 < 0) {
            throw qkw0.f();
        }
        throw qkw0.h();
    }

    @Override // a.tdw0
    public final String Y() throws qkw0 {
        int iL0 = l0();
        if (iL0 > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iL0 <= i - i2) {
                String strJ = dqm0.J(this.d, i2, iL0);
                this.g += iL0;
                return strJ;
            }
        }
        if (iL0 == 0) {
            return "";
        }
        if (iL0 <= 0) {
            throw qkw0.f();
        }
        throw qkw0.h();
    }

    @Override // a.tdw0
    public final boolean b0() {
        return this.g == this.f;
    }

    @Override // a.tdw0
    public final boolean d0() {
        return i0() != 0;
    }

    public final int f0() {
        int i;
        int i2 = this.g;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) j0();
    }

    public final int g0() throws qkw0 {
        int i = this.g;
        if (this.f - i < 4) {
            throw qkw0.h();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long h0() throws qkw0 {
        int i = this.g;
        if (this.f - i < 8) {
            throw qkw0.h();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long i0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i8]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (((long) bArr[i4]) << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return j0();
    }

    public final long j0() throws qkw0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.f) {
                throw qkw0.h();
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw qkw0.e();
    }

    public final int k0() {
        return f0();
    }

    @Override // a.tdw0
    public final double l() {
        return Double.longBitsToDouble(h0());
    }

    public final int l0() {
        return f0();
    }

    @Override // a.tdw0
    public final float p() {
        return Float.intBitsToFloat(g0());
    }

    @Override // a.tdw0
    public final int q(int i) throws qkw0 {
        if (i < 0) {
            throw qkw0.f();
        }
        int i2 = this.g;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - (i2 - this.h)) {
                throw new qkw0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i4 = this.j;
        if (i3 > i4) {
            throw qkw0.h();
        }
        this.j = i3;
        int i5 = this.e;
        if (i3 <= i5) {
            this.f = i3;
            return i4;
        }
        this.f = i5;
        return i4;
    }

    @Override // a.tdw0
    public final int s() {
        return this.g - this.h;
    }

    @Override // a.tdw0
    public final void t(int i) throws qkw0 {
        if (this.i != i) {
            throw new qkw0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // a.tdw0
    public final int w() {
        return k0();
    }

    @Override // a.tdw0
    public final void x(int i) {
        this.j = i;
        int i2 = this.e;
        if (i <= i2) {
            this.f = i;
        } else {
            this.f = i2;
        }
    }

    @Override // a.tdw0
    public final int z() {
        return g0();
    }
}
