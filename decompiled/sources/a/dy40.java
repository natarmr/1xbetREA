package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dy40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f6876a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public dy40(int i) {
        this.f6876a = u1h0.f34903a;
        int[] iArr = pkx.f27156a;
        this.b = iArr;
        this.c = iArr;
        if (i >= 0) {
            e(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f6876a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f6876a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f = u1h0.a(this.d) - this.e;
    }

    public final int b(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f6876a;
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

    public final int c(int i) {
        int iHashCode = Integer.hashCode(i);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f6876a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int d(int i) {
        int iC = c(i);
        if (iC >= 0) {
            return this.c[iC];
        }
        return -1;
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
        this.f6876a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = u1h0.a(this.d) - this.e;
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dy40)) {
            return false;
        }
        dy40 dy40Var = (dy40) obj;
        if (dy40Var.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.f6876a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            int i6 = iArr2[i4];
                            int iC = dy40Var.c(i5);
                            if (iC < 0 || i6 != dy40Var.c[iC]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    public final void f(int i, int i2) {
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i5 = i;
        int iHashCode = Integer.hashCode(i5);
        int i6 = -862048943;
        int i7 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i8 = i7 ^ (i7 >>> 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.d;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f6876a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            int i16 = 1;
            int i17 = i13;
            int i18 = 0;
            long j4 = (((-i15) >> 63) & (jArr2[i14 + 1] << (64 - i15))) | (jArr2[i14] >>> i15);
            long j5 = i10;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i12) & i11;
                int i19 = i6;
                if (this.b[iNumberOfTrailingZeros] == i5) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i6 = i19;
            }
            int i20 = i6;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i9);
                long j8 = 255;
                if (this.f != 0 || ((this.f6876a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    j3 = 128;
                } else {
                    int i21 = this.d;
                    if (i21 > 8) {
                        j3 = 128;
                        long j9 = this.e;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i21) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f6876a;
                            int i22 = this.d;
                            int[] iArr3 = this.b;
                            int[] iArr4 = this.c;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            while (i24 < i23) {
                                long j10 = jArr3[i24] & (-9187201950435737472L);
                                jArr3[i24] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i24++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int iD = tx3.D(jArr3);
                            int i25 = iD - 1;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iD] = jArr3[0];
                            int i26 = 0;
                            while (i26 != i22) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j11 = (jArr3[i27] >> i28) & j2;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i26]);
                                    int i29 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i20;
                                    int i30 = i29 ^ (i29 >>> 16);
                                    int i31 = i30 >>> 7;
                                    int iB2 = b(i31);
                                    int i32 = i31 & i22;
                                    char c2 = c;
                                    if (((iB2 - i32) & i22) / 8 == ((i26 - i32) & i22) / 8) {
                                        int i33 = i18;
                                        jArr3[i27] = (((long) (i30 & 127)) << i28) | (jArr3[i27] & (~(j2 << i28)));
                                        jArr3[jArr3.length - 1] = (jArr3[i33] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i16 = i16;
                                        c = c2;
                                        i18 = i33;
                                    } else {
                                        int i34 = i16;
                                        int i35 = i18;
                                        int i36 = iB2 >> 3;
                                        long j12 = jArr3[i36];
                                        int i37 = (iB2 & 7) << 3;
                                        if (((j12 >> i37) & j2) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i36] = ((~(j2 << i37)) & j12) | (((long) (i30 & 127)) << i37);
                                            jArr3[i27] = (jArr3[i27] & (~(j2 << i28))) | (128 << i28);
                                            iArr[iB2] = iArr[i26];
                                            iArr[i26] = i35;
                                            iArr2[iB2] = iArr2[i26];
                                            iArr2[i26] = i35;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i36] = (((long) (i30 & 127)) << i37) | ((~(j2 << i37)) & j12);
                                            int i38 = iArr[iB2];
                                            iArr[iB2] = iArr[i26];
                                            iArr[i26] = i38;
                                            int i39 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i26];
                                            iArr2[i26] = i39;
                                            i26--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i35] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i16 = i34;
                                        c = c2;
                                        i18 = i35;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i3 = i16;
                            i4 = i18;
                            this.f = u1h0.a(this.d) - this.e;
                        }
                        iB = b(i9);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    int iB3 = u1h0.b(this.d);
                    long[] jArr4 = this.f6876a;
                    int[] iArr5 = this.b;
                    int[] iArr6 = this.c;
                    int i40 = this.d;
                    e(iB3);
                    long[] jArr5 = this.f6876a;
                    int[] iArr7 = this.b;
                    int[] iArr8 = this.c;
                    int i41 = this.d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr4[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j3) {
                            int i43 = iArr5[i42];
                            int iHashCode3 = Integer.hashCode(i43);
                            int i44 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i20;
                            int i45 = i44 ^ (i44 >>> 16);
                            int iB4 = b(i45 >>> 7);
                            jArr = jArr5;
                            long j13 = i45 & 127;
                            int i46 = iB4 >> 3;
                            int i47 = (iB4 & 7) << 3;
                            long j14 = (jArr[i46] & (~(255 << i47))) | (j13 << i47);
                            jArr[i46] = j14;
                            jArr[(((iB4 - 7) & i41) + (i41 & 7)) >> 3] = j14;
                            iArr7[iB4] = i43;
                            iArr8[iB4] = iArr6[i42];
                        } else {
                            jArr = jArr5;
                        }
                        i42++;
                        jArr5 = jArr;
                    }
                    iB = b(i9);
                }
                this.e++;
                int i48 = this.f;
                long[] jArr6 = this.f6876a;
                int i49 = iB >> 3;
                long j15 = jArr6[i49];
                int i50 = (iB & 7) << 3;
                if (((j15 >> i50) & j2) == j3) {
                    i4 = i3;
                }
                this.f = i48 - i4;
                int i51 = this.d;
                long j16 = (j15 & (~(j2 << i50))) | (j << i50);
                jArr6[i49] = j16;
                jArr6[(((iB - 7) & i51) + (i51 & 7)) >> 3] = j16;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i13 = i17 + 8;
            i12 = (i12 + i13) & i11;
            i5 = i;
            i6 = i20;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i;
        this.c[iNumberOfTrailingZeros] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.f6876a;
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
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.f6876a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
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
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ dy40() {
        this(6);
    }
}
