package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fy40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10343a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public fy40(int i) {
        this.f10343a = u1h0.f34903a;
        this.b = pkx.f27156a;
        if (i >= 0) {
            f(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i) {
        int i2 = this.d;
        this.b[d(i)] = i;
        return this.d != i2;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.f10343a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f10343a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = u1h0.a(this.c) - this.d;
    }

    public final boolean c(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.f10343a;
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        int i3;
        int iHashCode = Integer.hashCode(i);
        int i4 = -862048943;
        int i5 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.f10343a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j4 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
            long j5 = i8;
            int i15 = i11;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                int i17 = i4;
                int i18 = i16;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i17;
                i16 = i18;
            }
            int i19 = i4;
            int i20 = i16;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iE = e(i7);
                long j8 = 255;
                if (this.e != 0 || ((this.f10343a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i21 = this.c;
                    if (i21 > 8) {
                        j3 = 128;
                        long j9 = this.d;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i21) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f10343a;
                            int i22 = this.c;
                            int[] iArr2 = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = i20;
                            while (i24 < i23) {
                                char c2 = c;
                                long j10 = jArr3[i24] & (-9187201950435737472L);
                                jArr3[i24] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i24++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int iD = tx3.D(jArr3);
                            int i25 = iD - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iD] = jArr3[i20];
                            int i26 = i20;
                            while (i26 != i22) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j12 = (jArr3[i27] >> i28) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i26]);
                                    int i29 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i19;
                                    int i30 = i29 ^ (i29 >>> 16);
                                    int i31 = i30 >>> 7;
                                    int iE2 = e(i31);
                                    int i32 = i31 & i22;
                                    if (((iE2 - i32) & i22) / 8 == ((i26 - i32) & i22) / 8) {
                                        long j13 = j11;
                                        jArr3[i27] = (((long) (i30 & 127)) << i28) | ((~(j << i28)) & jArr3[i27]);
                                        jArr3[jArr3.length - i14] = (jArr3[i20] & j13) | Long.MIN_VALUE;
                                        i26++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i33 = iE2 >> 3;
                                        long j15 = jArr3[i33];
                                        int i34 = (iE2 & 7) << 3;
                                        if (((j15 >> i34) & j) == 128) {
                                            iArr = iArr2;
                                            int i35 = i26;
                                            jArr3[i33] = ((~(j << i34)) & j15) | (((long) (i30 & 127)) << i34);
                                            jArr3[i27] = (jArr3[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[iE2] = iArr[i35];
                                            iArr[i35] = i20;
                                            i3 = i35;
                                        } else {
                                            iArr = iArr2;
                                            int i36 = i26;
                                            jArr3[i33] = (((long) (i30 & 127)) << i34) | ((~(j << i34)) & j15);
                                            int i37 = iArr[iE2];
                                            iArr[iE2] = iArr[i36];
                                            iArr[i36] = i37;
                                            i3 = i36 - 1;
                                        }
                                        jArr3[jArr3.length - i14] = (jArr3[i20] & j14) | Long.MIN_VALUE;
                                        i26 = i3 + i14;
                                        i14 = i14;
                                        j11 = j14;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i2 = i14;
                            this.e = u1h0.a(this.c) - this.d;
                        }
                        iE = e(i7);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iB = u1h0.b(this.c);
                    long[] jArr4 = this.f10343a;
                    int[] iArr3 = this.b;
                    int i38 = this.c;
                    f(iB);
                    long[] jArr5 = this.f10343a;
                    int[] iArr4 = this.b;
                    int i39 = this.c;
                    int i40 = i20;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            int i41 = iArr3[i40];
                            int iHashCode3 = Integer.hashCode(i41);
                            int i42 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i19;
                            int i43 = i42 ^ (i42 >>> 16);
                            int iE3 = e(i43 >>> 7);
                            long j16 = i43 & 127;
                            int i44 = iE3 >> 3;
                            int i45 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i44] & (~(255 << i45))) | (j16 << i45);
                            jArr[i44] = j17;
                            jArr[(((iE3 - 7) & i39) + (i39 & 7)) >> 3] = j17;
                            iArr4[iE3] = i41;
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i7);
                }
                this.d += i2;
                int i46 = this.e;
                long[] jArr6 = this.f10343a;
                int i47 = iE >> 3;
                long j18 = jArr6[i47];
                int i48 = (iE & 7) << 3;
                if (((j18 >> i48) & j) != j3) {
                    i2 = i20;
                }
                this.e = i46 - i2;
                int i49 = this.c;
                long j19 = (j18 & (~(j << i48))) | (j2 << i48);
                jArr6[i47] = j19;
                jArr6[(((iE - 7) & i49) + (i49 & 7)) >> 3] = j19;
                return iE;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i19;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10343a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fy40)) {
            return false;
        }
        fy40 fy40Var = (fy40) obj;
        if (fy40Var.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.f10343a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !fy40Var.c(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, u1h0.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = u1h0.f34903a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10343a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = u1h0.a(this.c) - this.d;
        this.b = new int[iMax];
    }

    public final boolean g(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.f10343a;
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
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            h(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void h(int i) {
        this.d--;
        long[] jArr = this.f10343a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.f10343a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[DONT_INVERT, PHI: r5
  0x0058: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0021, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[LOOP:0: B:5:0x0013->B:21:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[EDGE_INSN: B:26:0x005d->B:22:0x005d BREAK  A[LOOP:0: B:5:0x0013->B:21:0x005a], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.f10343a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append(i5);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ fy40() {
        this(6);
    }
}
