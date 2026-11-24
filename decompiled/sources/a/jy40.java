package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jy40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f17342a = u1h0.f34903a;
    public long[] b = t710.f33445a;
    public Object[] c = jd8.j;
    public int d;
    public int e;
    public int f;

    public jy40(int i) {
        if (i >= 0) {
            e(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f17342a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f17342a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qx3.l(0, this.d, null, this.c);
        this.f = u1h0.a(this.d) - this.e;
    }

    public final boolean b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j);
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f17342a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f17342a;
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

    public final Object d(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j);
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f17342a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void e(int i) {
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
        this.f17342a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = u1h0.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jy40)) {
            return false;
        }
        jy40 jy40Var = (jy40) obj;
        if (jy40Var.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.f17342a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (jy40Var.d(j2) != null || !jy40Var.b(j2)) {
                                    return false;
                                }
                            } else if (!obj2.equals(jy40Var.d(j2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final Object f(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j);
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f17342a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.f17342a;
        int i9 = this.d;
        int i10 = iNumberOfTrailingZeros >> 3;
        int i11 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j5;
        Object[] objArr = this.c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void g(Object obj, long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int i3;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int iHashCode = Long.hashCode(j);
        int i4 = -862048943;
        int i5 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f17342a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j5 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j6 = i8;
            int i15 = i11;
            int i16 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                int i17 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    i3 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j8 &= j8 - 1;
                    i4 = i17;
                }
            }
            int i18 = i4;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iC = c(i7);
                if (this.f != 0 || ((this.f17342a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 > 8) {
                        j4 = 128;
                        long j9 = this.e;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f17342a;
                            int i20 = this.d;
                            long[] jArr5 = this.b;
                            Object[] objArr2 = this.c;
                            int i21 = (i20 + 7) >> 3;
                            j2 = 255;
                            int i22 = 0;
                            while (i22 < i21) {
                                long j10 = jArr4[i22] & (-9187201950435737472L);
                                jArr4[i22] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i22++;
                                i14 = i14;
                                i16 = i16;
                                j6 = j6;
                            }
                            j3 = j6;
                            i = i16;
                            int i23 = i14;
                            char c = 7;
                            int iD = tx3.D(jArr4);
                            int i24 = iD - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iD] = jArr4[i];
                            int i25 = i;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i25]);
                                    int i28 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i18;
                                    int i29 = i28 ^ (i28 >>> 16);
                                    int i30 = i29 >>> 7;
                                    int iC2 = c(i30);
                                    int i31 = i30 & i20;
                                    char c2 = c;
                                    if (((iC2 - i31) & i20) / 8 == ((i25 - i31) & i20) / 8) {
                                        int i32 = i23;
                                        long j13 = j11;
                                        jArr4[i26] = (((long) (i29 & 127)) << i27) | (jArr4[i26] & (~(255 << i27)));
                                        jArr4[jArr4.length - i32] = (jArr4[i] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        i23 = i32;
                                        c = c2;
                                        j11 = j13;
                                    } else {
                                        int i33 = i23;
                                        long j14 = j11;
                                        int i34 = iC2 >> 3;
                                        long j15 = jArr4[i34];
                                        int i35 = (iC2 & 7) << 3;
                                        if (((j15 >> i35) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i34] = (j15 & (~(255 << i35))) | (((long) (i29 & 127)) << i35);
                                            jArr4[i26] = (jArr4[i26] & (~(255 << i27))) | (128 << i27);
                                            jArr2[iC2] = jArr2[i25];
                                            jArr2[i25] = 0;
                                            objArr[iC2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i34] = (((long) (i29 & 127)) << i35) | (j15 & (~(255 << i35)));
                                            long j16 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i25];
                                            jArr2[i25] = j16;
                                            Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i25];
                                            objArr[i25] = obj2;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        jArr5 = jArr2;
                                        i23 = i33;
                                        c = c2;
                                        j11 = j14;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i23;
                            this.f = u1h0.a(this.d) - this.e;
                        }
                        iC = c(i7);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int iB = u1h0.b(this.d);
                    long[] jArr6 = this.f17342a;
                    long[] jArr7 = this.b;
                    Object[] objArr3 = this.c;
                    int i36 = this.d;
                    e(iB);
                    long[] jArr8 = this.f17342a;
                    long[] jArr9 = this.b;
                    Object[] objArr4 = this.c;
                    int i37 = this.d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr6[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j4) {
                            long j17 = jArr7[i38];
                            int iHashCode3 = Long.hashCode(j17);
                            int i39 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i18;
                            int i40 = i39 ^ (i39 >>> 16);
                            int iC3 = c(i40 >>> 7);
                            jArr = jArr8;
                            long j18 = i40 & 127;
                            int i41 = iC3 >> 3;
                            int i42 = (iC3 & 7) << 3;
                            long j19 = (jArr[i41] & (~(255 << i42))) | (j18 << i42);
                            jArr[i41] = j19;
                            jArr[(((iC3 - 7) & i37) + (i37 & 7)) >> 3] = j19;
                            jArr9[iC3] = j17;
                            objArr4[iC3] = objArr3[i38];
                        } else {
                            jArr = jArr8;
                        }
                        i38++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i7);
                }
                this.e++;
                int i43 = this.f;
                long[] jArr10 = this.f17342a;
                int i44 = iC >> 3;
                long j20 = jArr10[i44];
                int i45 = (iC & 7) << 3;
                if (((j20 >> i45) & j2) == j4) {
                    i = i2;
                }
                this.f = i43 - i;
                int i46 = this.d;
                long j21 = (j20 & (~(j2 << i45))) | (j3 << i45);
                jArr10[i44] = j21;
                jArr10[(((iC - 7) & i46) + (i46 & 7)) >> 3] = j21;
                i3 = ~iC;
                break;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i18;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.b[i3] = j;
        this.c[i3] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.f17342a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.f17342a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
