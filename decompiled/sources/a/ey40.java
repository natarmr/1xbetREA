package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ey40 extends gkx {
    public int f;

    public ey40(int i) {
        this.f11466a = u1h0.f34903a;
        this.b = pkx.f27156a;
        this.c = jd8.j;
        if (i >= 0) {
            f(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.f11466a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f11466a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qx3.l(0, this.d, null, this.c);
        this.f = u1h0.a(this.d) - this.e;
    }

    public final int d(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f11466a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int e(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int iHashCode = Integer.hashCode(i);
        int i3 = -862048943;
        int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.f11466a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i3;
                int i17 = i15;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i16;
                i15 = i17;
            }
            int i18 = i3;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iD = d(i6);
                long j8 = 255;
                if (this.f != 0 || ((this.f11466a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.d;
                    if (i20 > 8) {
                        j3 = 128;
                        long j9 = this.e;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f11466a;
                            int i21 = this.d;
                            int[] iArr2 = this.b;
                            Object[] objArr2 = this.c;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j10 = j8;
                                long j11 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int iD2 = tx3.D(jArr3);
                            int i24 = iD2 - 1;
                            long j12 = 72057594037927935L;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iD2] = jArr3[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j13 = (jArr3[i26] >> i27) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]);
                                    int i28 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i18;
                                    int i29 = i28 ^ (i28 >>> 16);
                                    int i30 = i29 >>> 7;
                                    int iD3 = d(i30);
                                    int i31 = i30 & i21;
                                    if (((iD3 - i31) & i21) / 8 == ((i25 - i31) & i21) / 8) {
                                        long j14 = j12;
                                        jArr3[i26] = (((long) (i29 & 127)) << i27) | ((~(j << i27)) & jArr3[i26]);
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j12 = j14;
                                    } else {
                                        long j15 = j12;
                                        int i32 = iD3 >> 3;
                                        long j16 = jArr3[i32];
                                        int i33 = (iD3 & 7) << 3;
                                        if (((j16 >> i33) & j) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i32] = ((~(j << i33)) & j16) | (((long) (i29 & 127)) << i33);
                                            jArr3[i26] = (jArr3[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iD3] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[iD3] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i32] = (((long) (i29 & 127)) << i33) | ((~(j << i33)) & j16);
                                            int i34 = iArr[iD3];
                                            iArr[iD3] = iArr[i25];
                                            iArr[i25] = i34;
                                            Object obj = objArr[iD3];
                                            objArr[iD3] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i19] & j15) | Long.MIN_VALUE;
                                        i25++;
                                        j12 = j15;
                                        i13 = i13;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.f = u1h0.a(this.d) - this.e;
                        }
                        iD = d(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iB = u1h0.b(this.d);
                    long[] jArr4 = this.f11466a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i35 = this.d;
                    f(iB);
                    long[] jArr5 = this.f11466a;
                    int[] iArr4 = this.b;
                    Object[] objArr4 = this.c;
                    int i36 = this.d;
                    int i37 = i19;
                    while (i37 < i35) {
                        if (((jArr4[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < j3) {
                            int i38 = iArr3[i37];
                            int iHashCode3 = Integer.hashCode(i38);
                            int i39 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i18;
                            int i40 = i39 ^ (i39 >>> 16);
                            int iD4 = d(i40 >>> 7);
                            long j17 = i40 & 127;
                            int i41 = iD4 >> 3;
                            int i42 = (iD4 & 7) << 3;
                            jArr = jArr5;
                            long j18 = (jArr5[i41] & (~(255 << i42))) | (j17 << i42);
                            jArr[i41] = j18;
                            jArr[(((iD4 - 7) & i36) + (i36 & 7)) >> 3] = j18;
                            iArr4[iD4] = i38;
                            objArr4[iD4] = objArr3[i37];
                        } else {
                            jArr = jArr5;
                        }
                        i37++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iD = d(i6);
                }
                this.e++;
                int i43 = this.f;
                long[] jArr6 = this.f11466a;
                int i44 = iD >> 3;
                long j19 = jArr6[i44];
                int i45 = (iD & 7) << 3;
                if (((j19 >> i45) & j) != j3) {
                    i2 = i19;
                }
                this.f = i43 - i2;
                int i46 = this.d;
                long j20 = (j19 & (~(j << i45))) | (j2 << i45);
                jArr6[i44] = j20;
                jArr6[(((iD - 7) & i46) + (i46 & 7)) >> 3] = j20;
                return ~iD;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i3 = i18;
        }
    }

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, u1h0.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = u1h0.f34903a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f11466a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = u1h0.a(this.d) - this.e;
        this.b = new int[iMax];
        this.c = new Object[iMax];
    }

    public final void g(int i, Object obj) {
        int iE = e(i);
        if (iE < 0) {
            iE = ~iE;
        }
        Object[] objArr = this.c;
        Object obj2 = objArr[iE];
        this.b[iE] = i;
        objArr[iE] = obj;
    }

    public final Object h(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.f11466a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return i(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object i(int i) {
        this.e--;
        long[] jArr = this.f11466a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void j(int i, Object obj) {
        int iE = e(i);
        if (iE < 0) {
            iE = ~iE;
        }
        this.b[iE] = i;
        this.c[iE] = obj;
    }

    public /* synthetic */ ey40() {
        this(6);
    }
}
