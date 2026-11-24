package a;

import java.io.EOFException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1743a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        f1743a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(f99 f99Var, qg9 qg9Var, long j, long j2, int i) {
        uvh0 uvh0Var;
        long j3 = j;
        long j4 = j2;
        qg9Var.getClass();
        long j5 = i;
        cy2.x(qg9Var.e(), 0L, j5);
        if (i <= 0) {
            jf4.o("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            c99.s(h97.h(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbQ = kng0.q(j3, "fromIndex > toIndex: ", " > ");
            sbQ.append(j4);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        long j6 = f99Var.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (uvh0Var = f99Var.f9145a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                uvh0Var = uvh0Var.g;
                uvh0Var.getClass();
                j6 -= (long) (uvh0Var.c - uvh0Var.b);
            }
            byte[] bArrK = qg9Var.k();
            byte b2 = bArrK[0];
            long jMin = Math.min(j4, (f99Var.b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = uvh0Var.f36348a;
                int iMin = (int) Math.min(uvh0Var.c, (((long) uvh0Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) uvh0Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(uvh0Var, i2 + 1, bArrK, 1, i)) {
                        return ((long) (i2 - uvh0Var.b)) + j6;
                    }
                }
                j6 += (long) (uvh0Var.c - uvh0Var.b);
                uvh0Var = uvh0Var.f;
                uvh0Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (uvh0Var.c - uvh0Var.b));
            if (j8 > j3) {
                break;
            }
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j7 = j8;
        }
        byte[] bArrK2 = qg9Var.k();
        byte b3 = bArrK2[0];
        long jMin2 = Math.min(j4, (f99Var.b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = uvh0Var.f36348a;
            int iMin2 = (int) Math.min(uvh0Var.c, (((long) uvh0Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) uvh0Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(uvh0Var, i3 + 1, bArrK2, 1, i)) {
                    return ((long) (i3 - uvh0Var.b)) + j7;
                }
            }
            j7 += (long) (uvh0Var.c - uvh0Var.b);
            uvh0Var = uvh0Var.f;
            uvh0Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(uvh0 uvh0Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = uvh0Var.c;
        byte[] bArr2 = uvh0Var.f36348a;
        while (i2 < i3) {
            if (i == i4) {
                uvh0Var = uvh0Var.f;
                uvh0Var.getClass();
                byte[] bArr3 = uvh0Var.f36348a;
                bArr2 = bArr3;
                i = uvh0Var.b;
                i4 = uvh0Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(f99 f99Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (f99Var.n(j2) == 13) {
                String strL = f99Var.L(j2, Charsets.UTF_8);
                f99Var.skip(2L);
                return strL;
            }
        }
        String strL2 = f99Var.L(j, Charsets.UTF_8);
        f99Var.skip(1L);
        return strL2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(f99 f99Var, z680 z680Var, boolean z) {
        int i;
        int i2;
        int i3;
        uvh0 uvh0Var;
        int i4;
        z680Var.getClass();
        uvh0 uvh0Var2 = f99Var.f9145a;
        if (uvh0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = uvh0Var2.f36348a;
        int i5 = uvh0Var2.b;
        int i6 = uvh0Var2.c;
        int[] iArr = z680Var.c;
        uvh0 uvh0Var3 = uvh0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (uvh0Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            uvh0Var3 = uvh0Var3.f;
                            uvh0Var3.getClass();
                            int i16 = uvh0Var3.b;
                            byte[] bArr2 = uvh0Var3.f36348a;
                            i2 = uvh0Var3.c;
                            if (uvh0Var3 == uvh0Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                uvh0Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        uvh0Var3.getClass();
                        uvh0 uvh0Var4 = uvh0Var3.f;
                        uvh0Var4.getClass();
                        i3 = uvh0Var4.b;
                        byte[] bArr3 = uvh0Var4.f36348a;
                        i4 = uvh0Var4.c;
                        if (uvh0Var4 != uvh0Var2) {
                            uvh0Var = uvh0Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            uvh0Var = null;
                        }
                    } else {
                        uvh0Var = uvh0Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        uvh0Var3 = uvh0Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    uvh0Var3 = uvh0Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
