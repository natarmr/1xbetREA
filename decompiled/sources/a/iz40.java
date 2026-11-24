package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iz40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15620a;
    public Object[] b;
    public int c;
    public int d;
    public lz40 e;
    public int f;

    public iz40(int i) {
        this.f15620a = u1h0.f34903a;
        this.b = jd8.j;
        if (i >= 0) {
            f(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.d;
        this.b[d(obj)] = obj;
        return this.d != i;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.f15620a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15620a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qx3.l(0, this.c, null, this.b);
        this.f = u1h0.a(this.c) - this.d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f15620a;
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

    public final int d(Object obj) {
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
        int i6 = this.c;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.f15620a;
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
                if (this.f != 0 || ((this.f15620a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.c;
                    if (i14 > 8) {
                        int i15 = 8;
                        long j9 = this.d;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f15620a;
                            int i16 = this.c;
                            Object[] objArr2 = this.b;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            j3 = 128;
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
                            long j12 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iD] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j13 = (jArr3[i22] >> i23) & j;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                                    int i24 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i13;
                                    int i25 = i24 ^ (i24 >>> 16);
                                    int i26 = i25 >>> 7;
                                    int iE2 = e(i26);
                                    int i27 = i26 & i16;
                                    if (((iE2 - i27) & i16) / i19 == ((i21 - i27) & i16) / i19) {
                                        long j14 = j12;
                                        jArr3[i22] = (((long) (i25 & 127)) << i23) | ((~(j << i23)) & jArr3[i22]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        j12 = j14;
                                    } else {
                                        long j15 = j12;
                                        int i28 = iE2 >> 3;
                                        long j16 = jArr3[i28];
                                        int i29 = (iE2 & 7) << 3;
                                        if (((j16 >> i29) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i28] = ((~(j << i29)) & j16) | (((long) (i25 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i28] = (((long) (i25 & 127)) << i29) | ((~(j << i29)) & j16);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j15) | Long.MIN_VALUE;
                                        i21++;
                                        j12 = j15;
                                        i19 = i19;
                                        i16 = i16;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = u1h0.a(this.c) - this.d;
                        }
                        iE = e(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB = u1h0.b(this.c);
                    long[] jArr4 = this.f15620a;
                    Object[] objArr3 = this.b;
                    int i30 = this.c;
                    f(iB);
                    long[] jArr5 = this.f15620a;
                    Object[] objArr4 = this.b;
                    int i31 = this.c;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
                            int i33 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i13;
                            int i34 = i33 ^ (i33 >>> 16);
                            int iE3 = e(i34 >>> 7);
                            long j17 = i34 & 127;
                            int i35 = iE3 >> 3;
                            int i36 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j18 = (jArr5[i35] & (~(255 << i36))) | (j17 << i36);
                            jArr[i35] = j18;
                            jArr[(((iE3 - 7) & i31) + (i31 & 7)) >> 3] = j18;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i32++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i4);
                }
                this.d++;
                int i37 = this.f;
                long[] jArr6 = this.f15620a;
                int i38 = iE >> 3;
                long j19 = jArr6[i38];
                int i39 = (iE & 7) << 3;
                this.f = i37 - (((j19 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.c;
                long j20 = (j19 & (~(j << i39))) | (j2 << i39);
                jArr6[i38] = j20;
                jArr6[(((iE - 7) & i40) + (i40 & 7)) >> 3] = j20;
                return iE;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i = i13;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f15620a;
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
        if (!(obj instanceof iz40)) {
            return false;
        }
        iz40 iz40Var = (iz40) obj;
        if (iz40Var.d != this.d) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.f15620a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !iz40Var.c(objArr[(i << 3) + i3])) {
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
        this.f15620a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = u1h0.a(this.c) - this.d;
        this.b = iMax == 0 ? jd8.j : new Object[iMax];
    }

    public final boolean g() {
        return this.d == 0;
    }

    public final boolean h() {
        return this.d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        long[] jArr = this.f15620a;
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
                        Object obj = objArr[(i << 3) + i3];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f15620a;
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
            } else {
                i += 8;
                i6 = i7 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(iz40 iz40Var) {
        iz40Var.getClass();
        Object[] objArr = iz40Var.b;
        long[] jArr = iz40Var.f15620a;
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
                        k(objArr[(i << 3) + i3]);
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

    public final void k(Object obj) {
        this.b[d(obj)] = obj;
    }

    public final boolean l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f15620a;
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
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.f15620a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[DONT_INVERT, PHI: r7
  0x0063: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0023, B:22:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[LOOP:0: B:5:0x0015->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[EDGE_INSN: B:29:0x0068->B:25:0x0068 BREAK  A[LOOP:0: B:5:0x0015->B:24:0x0065], SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.f15620a;
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
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
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

    public /* synthetic */ iz40() {
        this(6);
    }
}
