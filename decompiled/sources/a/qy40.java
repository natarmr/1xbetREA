package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qy40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f29517a = u1h0.f34903a;
    public Object[] b = jd8.j;
    public float[] c = llq.f20261a;
    public int d;
    public int e;
    public int f;

    public qy40(int i) {
        if (i >= 0) {
            d(u1h0.d(i));
        } else {
            jf4.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f29517a;
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

    public final int b(Object obj) {
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f29517a;
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

    public final float c(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.c[iB];
        }
        v4i0.o(f140.k(obj, "There is no key ", " in the map"));
        return 0.0f;
    }

    public final void d(int i) {
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
        this.f29517a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = u1h0.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new float[iMax];
    }

    public final void e(h63 h63Var, float f) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        float[] fArr;
        h63 h63Var2 = h63Var;
        int iHashCode = h63Var2.hashCode();
        int i3 = -862048943;
        int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f29517a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            int i14 = i10;
            int i15 = 0;
            long j4 = (((-i12) >> 63) & (jArr2[i11 + 1] << (64 - i12))) | (jArr2[i11] >>> i12);
            long j5 = i7;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i8;
                int i16 = i3;
                if (Intrinsics.d(this.b[iNumberOfTrailingZeros], h63Var2)) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i3 = i16;
            }
            int i17 = i3;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i6);
                long j8 = 255;
                if (this.f != 0 || ((this.f29517a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i = 1;
                    i2 = 0;
                    j3 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j3 = 128;
                        long j9 = this.e;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f29517a;
                            int i19 = this.d;
                            Object[] objArr2 = this.b;
                            float[] fArr2 = this.c;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = jArr3[i21] & (-9187201950435737472L);
                                jArr3[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int iD = tx3.D(jArr3);
                            int i22 = iD - 1;
                            jArr3[i22] = (jArr3[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iD] = jArr3[0];
                            int i23 = 0;
                            while (i23 != i19) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j11 = (jArr3[i24] >> i25) & j2;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj = objArr2[i23];
                                    int iHashCode2 = obj != null ? obj.hashCode() : i15;
                                    int i26 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i17;
                                    int i27 = i26 ^ (i26 >>> 16);
                                    int i28 = i27 >>> 7;
                                    int iA2 = a(i28);
                                    int i29 = i28 & i19;
                                    char c2 = c;
                                    if (((iA2 - i29) & i19) / 8 == ((i23 - i29) & i19) / 8) {
                                        int i30 = i15;
                                        jArr3[i24] = (((long) (i27 & 127)) << i25) | (jArr3[i24] & (~(j2 << i25)));
                                        jArr3[jArr3.length - 1] = (jArr3[i30] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i13 = i13;
                                        c = c2;
                                        i15 = i30;
                                    } else {
                                        int i31 = i13;
                                        int i32 = i15;
                                        int i33 = iA2 >> 3;
                                        long j12 = jArr3[i33];
                                        int i34 = (iA2 & 7) << 3;
                                        if (((j12 >> i34) & j2) == 128) {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i33] = ((~(j2 << i34)) & j12) | (((long) (i27 & 127)) << i34);
                                            jArr3[i24] = (jArr3[i24] & (~(j2 << i25))) | (128 << i25);
                                            objArr[iA2] = objArr[i23];
                                            objArr[i23] = null;
                                            fArr[iA2] = fArr[i23];
                                            fArr[i23] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i33] = (((long) (i27 & 127)) << i34) | ((~(j2 << i34)) & j12);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i23];
                                            objArr[i23] = obj2;
                                            float f2 = fArr[iA2];
                                            fArr[iA2] = fArr[i23];
                                            fArr[i23] = f2;
                                            i23--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i32] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i13 = i31;
                                        c = c2;
                                        i15 = i32;
                                        objArr2 = objArr;
                                        fArr2 = fArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            i = i13;
                            i2 = i15;
                            this.f = u1h0.a(this.d) - this.e;
                        }
                        iA = a(i6);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i = 1;
                    i2 = 0;
                    int iB = u1h0.b(this.d);
                    long[] jArr4 = this.f29517a;
                    Object[] objArr3 = this.b;
                    float[] fArr3 = this.c;
                    int i35 = this.d;
                    d(iB);
                    long[] jArr5 = this.f29517a;
                    Object[] objArr4 = this.b;
                    float[] fArr4 = this.c;
                    int i36 = this.d;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr4[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < j3) {
                            Object obj3 = objArr3[i37];
                            int iHashCode3 = obj3 != null ? obj3.hashCode() : 0;
                            int i38 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i17;
                            int i39 = i38 ^ (i38 >>> 16);
                            int iA3 = a(i39 >>> 7);
                            jArr = jArr5;
                            long j13 = i39 & 127;
                            int i40 = iA3 >> 3;
                            int i41 = (iA3 & 7) << 3;
                            long j14 = (jArr[i40] & (~(255 << i41))) | (j13 << i41);
                            jArr[i40] = j14;
                            jArr[(((iA3 - 7) & i36) + (i36 & 7)) >> 3] = j14;
                            objArr4[iA3] = obj3;
                            fArr4[iA3] = fArr3[i37];
                        } else {
                            jArr = jArr5;
                        }
                        i37++;
                        jArr5 = jArr;
                    }
                    iA = a(i6);
                }
                this.e++;
                int i42 = this.f;
                long[] jArr6 = this.f29517a;
                int i43 = iA >> 3;
                long j15 = jArr6[i43];
                int i44 = (iA & 7) << 3;
                if (((j15 >> i44) & j2) == j3) {
                    i2 = i;
                }
                this.f = i42 - i2;
                int i45 = this.d;
                long j16 = (j15 & (~(j2 << i44))) | (j << i44);
                jArr6[i43] = j16;
                jArr6[(((iA - 7) & i45) + (i45 & 7)) >> 3] = j16;
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            h63Var2 = h63Var;
            i3 = i17;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = h63Var;
        this.c[iNumberOfTrailingZeros] = f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[LOOP:0: B:14:0x0023->B:29:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qy40)) {
            return false;
        }
        qy40 qy40Var = (qy40) obj;
        if (qy40Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.f29517a;
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
                            float f = fArr[i4];
                            int iB = qy40Var.b(obj2);
                            if (iB < 0 || f != qy40Var.c[iB]) {
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

    public final int hashCode() {
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.f29517a;
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
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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
        float[] fArr = this.c;
        long[] jArr = this.f29517a;
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
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
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
}
