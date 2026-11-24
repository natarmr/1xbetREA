package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lyc extends oyc {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public lyc(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    @Override // a.oyc
    public final String A() throws box {
        int iK = K();
        if (iK > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iK <= i - i2) {
                String str = new String(this.c, i2, iK, fmx.f9806a);
                this.f += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw box.e();
        }
        throw box.f();
    }

    @Override // a.oyc
    public final String B() throws box {
        int iK = K();
        if (iK > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iK <= i - i2) {
                String strM = rtt0.f31092a.m(this.c, i2, iK);
                this.f += iK;
                return strM;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw box.e();
        }
        throw box.f();
    }

    @Override // a.oyc
    public final int C() throws box {
        if (e()) {
            this.h = 0;
            return 0;
        }
        int iK = K();
        this.h = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new box("Protocol message contained an invalid tag (zero).");
    }

    @Override // a.oyc
    public final int D() {
        return K();
    }

    @Override // a.oyc
    public final long E() {
        return L();
    }

    @Override // a.oyc
    public final boolean F(int i) throws box {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(K());
                return true;
            }
            if (i2 == 3) {
                G();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw box.b();
            }
            O(4);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw box.d();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 == this.d) {
                throw box.f();
            }
            this.f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw box.d();
        return true;
    }

    public final int I() throws box {
        int i = this.f;
        if (this.d - i < 4) {
            throw box.f();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() throws box {
        int i = this.f;
        if (this.d - i < 8) {
            throw box.f();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int K() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
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
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() throws box {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw box.f();
            }
            this.f = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw box.d();
    }

    public final void N() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void O(int i) throws box {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw box.f();
        }
        throw box.e();
    }

    @Override // a.oyc
    public final void a(int i) throws box {
        if (this.h != i) {
            throw new box("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // a.oyc
    public final int d() {
        return this.f - this.g;
    }

    @Override // a.oyc
    public final boolean e() {
        return this.f == this.d;
    }

    @Override // a.oyc
    public final void j(int i) {
        this.i = i;
        N();
    }

    @Override // a.oyc
    public final int k(int i) {
        if (i < 0) {
            throw box.e();
        }
        int iD = d() + i;
        if (iD < 0) {
            throw new box("Failed to parse the message.");
        }
        int i2 = this.i;
        if (iD > i2) {
            throw box.f();
        }
        this.i = iD;
        N();
        return i2;
    }

    @Override // a.oyc
    public final boolean m() {
        return L() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // a.oyc
    public final mg9 o() throws box {
        byte[] bArrCopyOfRange;
        int iK = K();
        byte[] bArr = this.c;
        if (iK > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iK <= i - i2) {
                mg9 mg9VarF = mg9.f(bArr, i2, iK);
                this.f += iK;
                return mg9VarF;
            }
        }
        if (iK == 0) {
            return mg9.c;
        }
        if (iK > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (iK <= i3 - i4) {
                int i5 = iK + i4;
                this.f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iK <= 0) {
                    throw box.f();
                }
                if (iK == 0) {
                    throw box.e();
                }
                bArrCopyOfRange = fmx.b;
            }
        } else {
            if (iK <= 0) {
                throw box.f();
            }
            if (iK == 0) {
                throw box.e();
            }
            bArrCopyOfRange = fmx.b;
        }
        mg9 mg9Var = mg9.c;
        return new mg9(bArrCopyOfRange);
    }

    @Override // a.oyc
    public final double p() {
        return Double.longBitsToDouble(J());
    }

    @Override // a.oyc
    public final int q() {
        return K();
    }

    @Override // a.oyc
    public final int r() {
        return I();
    }

    @Override // a.oyc
    public final long s() {
        return J();
    }

    @Override // a.oyc
    public final float t() {
        return Float.intBitsToFloat(I());
    }

    @Override // a.oyc
    public final int u() {
        return K();
    }

    @Override // a.oyc
    public final long v() {
        return L();
    }

    @Override // a.oyc
    public final int w() {
        return I();
    }

    @Override // a.oyc
    public final long x() {
        return J();
    }

    @Override // a.oyc
    public final int y() {
        int iK = K();
        return (-(iK & 1)) ^ (iK >>> 1);
    }

    @Override // a.oyc
    public final long z() {
        long jL = L();
        return (-(jL & 1)) ^ (jL >>> 1);
    }
}
