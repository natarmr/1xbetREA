package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ry40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f31295a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public ry40(int i) {
        this.f31295a = u1h0.f34903a;
        this.b = jd8.j;
        this.c = pkx.f27156a;
        if (i >= 0) {
            e(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f31295a;
        if (jArr != u1h0.f34903a) {
            qx3.p(jArr, -9187201950435737472L);
            long[] jArr2 = this.f31295a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qx3.l(0, this.d, null, this.b);
        this.f = u1h0.a(this.d) - this.e;
    }

    public final int b(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f31295a;
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

    public final int c(Object obj) {
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
            long[] jArr2 = this.f31295a;
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
                int iB = b(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.f31295a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
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
                            long[] jArr3 = this.f31295a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            int[] iArr = this.c;
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
                                    int iB2 = b(i26);
                                    int i27 = i26 & i16;
                                    long j14 = j12;
                                    if (((iB2 - i27) & i16) / 8 == ((i21 - i27) & i16) / i19) {
                                        jArr3[i22] = (((long) (i25 & 127)) << i23) | (jArr3[i22] & (~(j << i23)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        j12 = j14;
                                        i19 = i19;
                                    } else {
                                        int i28 = i19;
                                        int i29 = iB2 >> 3;
                                        long j15 = jArr3[i29];
                                        int i30 = (iB2 & 7) << 3;
                                        if (((j15 >> i30) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i29] = ((~(j << i30)) & j15) | (((long) (i25 & 127)) << i30);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iB2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iB2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i29] = (((long) (i25 & 127)) << i30) | ((~(j << i30)) & j15);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i31 = iArr[iB2];
                                            iArr[iB2] = iArr[i21];
                                            iArr[i21] = i31;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i16;
                                        j12 = j14;
                                        i19 = i28;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = u1h0.a(this.d) - this.e;
                        }
                        iB = b(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB3 = u1h0.b(this.d);
                    long[] jArr4 = this.f31295a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i32 = this.d;
                    e(iB3);
                    long[] jArr5 = this.f31295a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i33 = this.d;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr4[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i34];
                            int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
                            int i35 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i13;
                            int i36 = i35 ^ (i35 >>> 16);
                            int iB4 = b(i36 >>> 7);
                            jArr = jArr5;
                            long j16 = i36 & 127;
                            int i37 = iB4 >> 3;
                            int i38 = (iB4 & 7) << 3;
                            long j17 = (jArr[i37] & (~(255 << i38))) | (j16 << i38);
                            jArr[i37] = j17;
                            jArr[(((iB4 - 7) & i33) + (i33 & 7)) >> 3] = j17;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i34];
                        } else {
                            jArr = jArr5;
                        }
                        i34++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i4);
                }
                this.e++;
                int i39 = this.f;
                long[] jArr6 = this.f31295a;
                int i40 = iB >> 3;
                long j18 = jArr6[i40];
                int i41 = (iB & 7) << 3;
                this.f = i39 - (((j18 >> i41) & j) == j3 ? 1 : 0);
                int i42 = this.d;
                long j19 = (j18 & (~(j << i41))) | (j2 << i41);
                jArr6[i40] = j19;
                jArr6[(((iB - 7) & i42) + (i42 & 7)) >> 3] = j19;
                return ~iB;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i = i13;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f31295a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i6 = i7 + i;
        }
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
        this.f31295a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = u1h0.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ry40)) {
            return false;
        }
        ry40 ry40Var = (ry40) obj;
        if (ry40Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.f31295a;
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
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iD = ry40Var.d(obj2);
                            if (iD < 0 || i5 != ry40Var.c[iD]) {
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

    public final void f(int i) {
        this.e--;
        long[] jArr = this.f31295a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void g(int i, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = obj;
        this.c[iC] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.f31295a;
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
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.f31295a;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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

    public /* synthetic */ ry40() {
        this(6);
    }
}
