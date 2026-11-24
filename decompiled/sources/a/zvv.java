package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zvv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f45075a;
    public static final int[] b;
    public static final int[] c;
    public static final long[] d;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f45075a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        c = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        d = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        ohq.k(h2t0.b(j), "The resulting string length is too big: ");
        return 0;
    }

    public static final int b(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static byte[] c(String str) {
        byte[] bArr;
        fwv.d.getClass();
        fwv fwvVar = fwv.e;
        str.getClass();
        fwvVar.getClass();
        int length = str.length();
        x2 x2Var = b3.f1878a;
        int length2 = str.length();
        x2Var.getClass();
        x2.a(0, length, length2);
        if (length == 0) {
            return new byte[0];
        }
        bwv bwvVar = fwvVar.b;
        if (bwvVar.f3346a) {
            if (!bwvVar.b) {
                long j = length;
                int i = (int) (j / 2);
                if (((long) i) * 2 != j) {
                    bArr = null;
                } else {
                    bArr = new byte[i];
                    int i2 = i - 1;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr[i4] = d(i3, str);
                        i3 += 2;
                    }
                    bArr[i2] = d(i3, str);
                }
            } else if ((length & 1) != 0) {
                bArr = null;
            } else {
                int i5 = length >> 1;
                bArr = new byte[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = d(i6, str);
                    i6 += 2;
                }
            }
            if (bArr != null) {
                return bArr;
            }
        }
        boolean z = bwvVar.c;
        if (length <= 0) {
            jf4.o("Failed requirement.");
            return null;
        }
        long j2 = length;
        long jH = h(1, j2, 4294967294L);
        long j3 = j2 - (4294967295L * jH);
        long jH2 = h(2, j3, 4294967294L);
        long j4 = j3 - (4294967296L * jH2);
        long jH3 = h(0, j4, 2L);
        int i8 = (int) ((jH2 * 2147483647L) + (jH * 2147483647L) + jH3 + ((long) (j4 - (2 * jH3) > 0 ? 1 : 0)));
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            if (i11 == Integer.MAX_VALUE) {
                if (str.charAt(i9) == '\r') {
                    int i13 = i9 + 1;
                    i9 = (i13 >= length || str.charAt(i13) != '\n') ? i13 : i9 + 2;
                } else {
                    if (str.charAt(i9) != '\n') {
                        StringBuilder sbM = b1j.m(i9, "Expected a new line at index ", ", but was ");
                        sbM.append(str.charAt(i9));
                        throw new NumberFormatException(sbM.toString());
                    }
                    i9++;
                }
                i11 = 0;
                i12 = 0;
            } else if (i12 == Integer.MAX_VALUE) {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (!kotlin.text.a.b("  ".charAt(i14), str.charAt(i9 + i14), z)) {
                        int i15 = 2 + i9;
                        if (i15 <= length) {
                            length = i15;
                        }
                        throw new NumberFormatException("Expected group separator \"  \" at index " + i9 + ", but was " + str.substring(i9, length));
                    }
                }
                i9 += 2;
                i12 = 0;
            }
            i11++;
            i12++;
            if (length - 2 < i9) {
                StringBuilder sbR = vqd.r(i9, "Expected exactly 2 hexadecimal digits at index ", ", but was \"", str.substring(i9, length), "\" of length ");
                sbR.append(length - i9);
                throw new NumberFormatException(sbR.toString());
            }
            bArr2[i10] = d(i9, str);
            i9 += 2;
            i10++;
        }
        return i10 == i8 ? bArr2 : Arrays.copyOf(bArr2, i10);
    }

    public static final byte d(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = c)[cCharAt]) < 0) {
            e(i, str);
            throw null;
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        e(i4, str);
        throw null;
    }

    public static final void e(int i, String str) {
        StringBuilder sbM = b1j.m(i, "Expected a hexadecimal digit at index ", ", but was ");
        sbM.append(str.charAt(i));
        throw new NumberFormatException(sbM.toString());
    }

    public static final int f(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String g(byte[] bArr) {
        fwv.d.getClass();
        fwv fwvVar = fwv.e;
        bArr.getClass();
        fwvVar.getClass();
        int length = bArr.length;
        x2 x2Var = b3.f1878a;
        int length2 = bArr.length;
        x2Var.getClass();
        x2.a(0, length, length2);
        if (length == 0) {
            return "";
        }
        int[] iArr = fwvVar.f10279a ? b : f45075a;
        bwv bwvVar = fwvVar.b;
        if (bwvVar.f3346a) {
            if (bwvVar.b) {
                char[] cArr = new char[a(((long) length) * 2)];
                int iB = 0;
                for (int i = 0; i < length; i++) {
                    iB = b(bArr, i, iArr, cArr, iB);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                jf4.o("Failed requirement.");
                return null;
            }
            char[] cArr2 = new char[a(((long) length) * 2)];
            int iF = f("", cArr2, b(bArr, 0, iArr, cArr2, f("", cArr2, 0)));
            for (int i2 = 1; i2 < length; i2++) {
                iF = f("", cArr2, b(bArr, i2, iArr, cArr2, f("", cArr2, f("", cArr2, iF))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            jf4.o("Failed requirement.");
            return null;
        }
        int i3 = (length - 1) / Integer.MAX_VALUE;
        int i4 = length % Integer.MAX_VALUE;
        if (i4 == 0) {
            i4 = Integer.MAX_VALUE;
        }
        int iA = a((2 * ((long) length)) + (((long) ((i4 - 1) / Integer.MAX_VALUE)) * 2) + ((long) i3));
        char[] cArr3 = new char[iA];
        int iF2 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 == Integer.MAX_VALUE) {
                cArr3[iF2] = '\n';
                i6 = 0;
                iF2++;
                i5 = 0;
            } else if (i6 == Integer.MAX_VALUE) {
                iF2 = f("  ", cArr3, iF2);
                i6 = 0;
            }
            if (i6 != 0) {
                iF2 = f("", cArr3, iF2);
            }
            iF2 = f("", cArr3, b(bArr, i7, iArr, cArr3, f("", cArr3, iF2)));
            i6++;
            i5++;
        }
        if (iF2 == iA) {
            return new String(cArr3);
        }
        jf4.n("Check failed.");
        return null;
    }

    public static final long h(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
