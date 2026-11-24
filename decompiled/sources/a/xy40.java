package a;

import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xy40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f41690a = u1h0.f34903a;
    public Object[] b = jd8.j;
    public long[] c = dwi0.n;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    public int h;

    public xy40(int i) {
        if (i >= 0) {
            f(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.g;
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
        return this.g != i;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.f41690a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f41690a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qx3.l(0, this.f, null, this.b);
        qx3.p(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = u1h0.a(this.f) - this.g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.f;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f41690a;
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
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = -862048943;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.f41690a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                int i12 = i2;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i5);
                long j8 = 255;
                if (this.h != 0 || ((this.f41690a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j5;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i14 = this.f;
                    if (i14 > 8) {
                        c = 31;
                        long j9 = this.g;
                        g2t0 g2t0Var = h2t0.b;
                        j3 = 128;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f41690a;
                            if (jArr3 == null) {
                                i = 0;
                                j = j5;
                                j2 = 255;
                            } else {
                                int i15 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr4 = this.c;
                                long[] jArr5 = new long[i15];
                                Arrays.fill(jArr5, 0, i15, 9223372034707292159L);
                                i = 0;
                                int i16 = (i15 + 7) >> 3;
                                int i17 = 0;
                                while (i17 < i16) {
                                    long j10 = j8;
                                    long j11 = jArr3[i17] & (-9187201950435737472L);
                                    int i18 = i17;
                                    jArr3[i18] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i17 = i18 + 1;
                                    j8 = j10;
                                }
                                j2 = j8;
                                int length = jArr3.length;
                                int i19 = length - 1;
                                int i20 = length - 2;
                                jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i19] = jArr3[0];
                                int i21 = 0;
                                while (i21 != i15) {
                                    int i22 = i21 >> 3;
                                    int i23 = (i21 & 7) << 3;
                                    long j12 = (jArr3[i22] >> i23) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i21];
                                        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                                        int i24 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i13;
                                        int i25 = i24 ^ (i24 >>> 16);
                                        int i26 = i25 >>> 7;
                                        int iE2 = e(i26);
                                        int i27 = i26 & i15;
                                        if (((iE2 - i27) & i15) / 8 == ((i21 - i27) & i15) / 8) {
                                            int i28 = i15;
                                            Object[] objArr2 = objArr;
                                            jArr3[i22] = (jArr3[i22] & (~(j2 << i23))) | (((long) (i25 & 127)) << i23);
                                            if (jArr5[i21] == 9223372034707292159L) {
                                                long j13 = i21;
                                                jArr5[i21] = j13 | (j13 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i21++;
                                            i15 = i28;
                                            objArr = objArr2;
                                        } else {
                                            int i29 = i15;
                                            Object[] objArr3 = objArr;
                                            int i30 = iE2 >> 3;
                                            long j14 = jArr3[i30];
                                            int i31 = (iE2 & 7) << 3;
                                            if (((j14 >> i31) & j2) == 128) {
                                                jArr3[i30] = (j14 & (~(j2 << i31))) | (((long) (i25 & 127)) << i31);
                                                jArr3[i22] = (jArr3[i22] & (~(j2 << i23))) | (128 << i23);
                                                objArr3[iE2] = objArr3[i21];
                                                objArr3[i21] = null;
                                                jArr4[iE2] = jArr4[i21];
                                                jArr4[i21] = 4611686018427387903L;
                                                int i32 = (int) ((jArr5[i21] >> 32) & 4294967295L);
                                                if (i32 != Integer.MAX_VALUE) {
                                                    jArr5[i32] = ((long) iE2) | (jArr5[i32] & (-4294967296L));
                                                    jArr5[i21] = (jArr5[i21] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr5[i21] = 9223372032559808512L | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i21) << 32) | 2147483647L;
                                            } else {
                                                j5 = j5;
                                                jArr3[i30] = (((long) (i25 & 127)) << i31) | (j14 & (~(j2 << i31)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i21];
                                                objArr3[i21] = obj3;
                                                long j15 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i21];
                                                jArr4[i21] = j15;
                                                int i33 = (int) ((jArr5[i21] >> 32) & 4294967295L);
                                                if (i33 != Integer.MAX_VALUE) {
                                                    long j16 = iE2;
                                                    jArr5[i33] = (jArr5[i33] & (-4294967296L)) | j16;
                                                    jArr5[i21] = (jArr5[i21] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iE2;
                                                    jArr5[i21] = j17 | (j17 << 32);
                                                    i33 = i21;
                                                }
                                                jArr5[iE2] = (((long) i33) << 32) | ((long) i21);
                                                i21--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i21++;
                                            i15 = i29;
                                            objArr = objArr3;
                                            j5 = j5;
                                        }
                                    } else {
                                        i21++;
                                    }
                                }
                                j = j5;
                                this.h = u1h0.a(this.f) - this.g;
                                long[] jArr6 = this.c;
                                int length2 = jArr6.length;
                                for (int i34 = 0; i34 < length2; i34++) {
                                    long j18 = jArr6[i34];
                                    int i35 = (int) ((j18 >> 31) & 2147483647L);
                                    int i36 = (int) (j18 & 2147483647L);
                                    jArr6[i34] = (((j18 & (-4611686018427387904L)) | ((long) (i35 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i35] & 4294967295L)))) << 31) | ((long) (i36 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i36] & 4294967295L)));
                                }
                                int i37 = this.d;
                                if (i37 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr5[i37] & 4294967295L);
                                }
                                int i38 = this.e;
                                if (i38 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr5[i38] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i5);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j5;
                    j2 = 255;
                    int iB = u1h0.b(this.f);
                    long[] jArr7 = this.f41690a;
                    Object[] objArr4 = this.b;
                    long[] jArr8 = this.c;
                    int i39 = this.f;
                    int[] iArr = new int[i39];
                    f(iB);
                    long[] jArr9 = this.f41690a;
                    Object[] objArr5 = this.b;
                    long[] jArr10 = this.c;
                    int i40 = this.f;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr7[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i41];
                            int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
                            int i42 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i13;
                            int i43 = i42 ^ (i42 >>> 16);
                            int iE3 = e(i43 >>> 7);
                            jArr = jArr9;
                            long j19 = i43 & 127;
                            int i44 = iE3 >> 3;
                            int i45 = (iE3 & 7) << 3;
                            long j20 = (jArr[i44] & (~(255 << i45))) | (j19 << i45);
                            jArr[i44] = j20;
                            jArr[(((iE3 - 7) & i40) + (i40 & 7)) >> 3] = j20;
                            objArr5[iE3] = obj4;
                            jArr10[iE3] = jArr8[i41];
                            iArr[i41] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i41++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.c;
                    int length3 = jArr11.length;
                    for (int i46 = 0; i46 < length3; i46++) {
                        long j21 = jArr11[i46];
                        int i47 = (int) ((j21 >> c) & 2147483647L);
                        int i48 = (int) (j21 & 2147483647L);
                        jArr11[i46] = (((j21 & (-4611686018427387904L)) | ((long) (i47 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i47]))) << c) | ((long) (i48 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i48]));
                    }
                    int i49 = this.d;
                    if (i49 != Integer.MAX_VALUE) {
                        this.d = iArr[i49];
                    }
                    int i50 = this.e;
                    if (i50 != Integer.MAX_VALUE) {
                        this.e = iArr[i50];
                    }
                    iE = e(i5);
                }
                this.g++;
                int i51 = this.h;
                long[] jArr12 = this.f41690a;
                int i52 = iE >> 3;
                long j22 = jArr12[i52];
                int i53 = (iE & 7) << 3;
                if (((j22 >> i53) & j2) == j3) {
                    i = 1;
                }
                this.h = i51 - i;
                int i54 = this.f;
                long j23 = (j22 & (~(j2 << i53))) | (j << i53);
                jArr12[i52] = j23;
                jArr12[(((iE - 7) & i54) + (i54 & 7)) >> 3] = j23;
                return iE;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i2 = i13;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f41690a;
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
        if (!(obj instanceof xy40)) {
            return false;
        }
        xy40 xy40Var = (xy40) obj;
        if (xy40Var.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.f41690a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !xy40Var.c(objArr[(i << 3) + i3])) {
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
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, u1h0.c(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = u1h0.f34903a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f41690a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.h = u1h0.a(this.f) - this.g;
        this.b = iMax == 0 ? jd8.j : new Object[iMax];
        if (iMax == 0) {
            jArr2 = dwi0.n;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    public final void g(Object obj) {
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i = this.d;
        jArr[iD] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) iD) & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
    }

    public final boolean h(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = i2 & 127;
        int i4 = this.f;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f41690a;
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
            i(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.f41690a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!Intrinsics.d(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    public final void i(int i) {
        this.g--;
        long[] jArr = this.f41690a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0012->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[EDGE_INSN: B:24:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:5:0x0012->B:17:0x0051], SYNTHETIC] */
    public final boolean j(Collection collection) {
        collection.getClass();
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.f41690a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.L(collection, objArr[i5])) {
                                i(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
