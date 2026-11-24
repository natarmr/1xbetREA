package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hz40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f13891a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public qp20 f;
    public int g;

    public hz40(int i) {
        this.f13891a = u1h0.f34903a;
        Object[] objArr = jd8.j;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            h(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f13891a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f13891a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qx3.l(0, this.d, null, this.c);
        qx3.l(0, this.d, null, this.b);
        this.g = u1h0.a(this.d) - this.e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f13891a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f13891a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(Object obj) {
        Object[] objArr = this.c;
        long[] jArr = this.f13891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && Intrinsics.d(obj, objArr[(i << 3) + i3])) {
                            return true;
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
        return false;
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f13891a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz40)) {
            return false;
        }
        hz40 hz40Var = (hz40) obj;
        if (hz40Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.f13891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
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
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (hz40Var.g(obj2) != null || !hz40Var.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(hz40Var.g(obj2))) {
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

    public final int f(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = -862048943;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.f13891a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i12;
            }
            int i13 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iE = e(i4);
                long j8 = 255;
                if (this.g != 0 || ((this.f13891a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        long j9 = this.e;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f13891a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j10 = j8;
                                long j11 = jArr3[i18] & (-9187201950435737472L);
                                jArr3[i18] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iD = tx3.D(jArr3);
                            int i20 = iD - 1;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iD] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr3[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                                    int i24 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i13;
                                    int i25 = i24 ^ (i24 >>> 16);
                                    int i26 = i25 >>> 7;
                                    int iE2 = e(i26);
                                    int i27 = i26 & i16;
                                    if (((iE2 - i27) & i16) / i19 == ((i21 - i27) & i16) / i19) {
                                        jArr3[i22] = (((long) (i25 & 127)) << i23) | (jArr3[i22] & (~(j << i23)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i28 = i19;
                                        int i29 = iE2 >> 3;
                                        long j13 = jArr3[i29];
                                        int i30 = (iE2 & 7) << 3;
                                        if (((j13 >> i30) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i29] = ((~(j << i30)) & j13) | (((long) (i25 & 127)) << i30);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[iE2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i29] = (((long) (i25 & 127)) << i30) | ((~(j << i30)) & j13);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i21++;
                                        i19 = i28;
                                        i16 = i16;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.g = u1h0.a(this.d) - this.e;
                        }
                        iE = e(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB = u1h0.b(this.d);
                    long[] jArr4 = this.f13891a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i31 = this.d;
                    h(iB);
                    long[] jArr5 = this.f13891a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr4[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i33];
                            int iHashCode3 = obj5 != null ? obj5.hashCode() : 0;
                            int i34 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i13;
                            int i35 = i34 ^ (i34 >>> 16);
                            int iE3 = e(i35 >>> 7);
                            jArr = jArr5;
                            long j14 = i35 & 127;
                            int i36 = iE3 >> 3;
                            int i37 = (iE3 & 7) << 3;
                            long j15 = (jArr[i36] & (~(255 << i37))) | (j14 << i37);
                            jArr[i36] = j15;
                            jArr[(((iE3 - 7) & i32) + (i32 & 7)) >> 3] = j15;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i33];
                        } else {
                            jArr = jArr5;
                        }
                        i33++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i4);
                }
                this.e++;
                int i38 = this.g;
                long[] jArr6 = this.f13891a;
                int i39 = iE >> 3;
                long j16 = jArr6[i39];
                int i40 = (iE & 7) << 3;
                this.g = i38 - (((j16 >> i40) & j) == j3 ? 1 : 0);
                int i41 = this.d;
                long j17 = (j16 & (~(j << i40))) | (j2 << i40);
                jArr6[i39] = j17;
                jArr6[(((iE - 7) & i41) + (i41 & 7)) >> 3] = j17;
                return ~iE;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i = i13;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f13891a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i6 = i7 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i) {
        long[] jArr;
        Object[] objArr = jd8.j;
        int iMax = i > 0 ? Math.max(7, u1h0.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = u1h0.f34903a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.f13891a = jArr;
        this.g = u1h0.a(this.d) - this.e;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.f13891a;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.e == 0;
    }

    public final boolean j() {
        return this.e != 0;
    }

    public final void k(hz40 hz40Var) {
        hz40Var.getClass();
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        n(objArr[i4], objArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final Object l(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f13891a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i6 = i7 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object m(int i) {
        this.e--;
        long[] jArr = this.f13891a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void n(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.b[iF] = obj;
        this.c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.f13891a;
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
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public /* synthetic */ hz40() {
        this(6);
    }
}
