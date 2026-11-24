package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uxc extends jl60 {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-', '.', ' ', '$', '/', '+', '%', 'a', 'b', 'c', 'd', '*'};
    public static final int[] d;
    public static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f36434a = new StringBuilder(20);
    public final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, Response.BAD_EXTENSION, 418, Response.NOT_FOUND, Response.PAYMENT_REQUIRED, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, Response.NOT_ACCEPTABLE, Response.GONE, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 350};
        d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i, int i2) throws q9c {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != c[iIndexOf % 47]) {
            throw q9c.a();
        }
    }

    public static int h(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound < 1 || iRound > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < iRound; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= iRound;
            }
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    @Override // a.jl60
    public final i0g0 b(int i, p68 p68Var, Map map) throws bwq, q9c, o660 {
        int i2;
        char c2;
        int i3 = p68Var.b;
        int iE = p68Var.e(0);
        int[] iArr = this.b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = iE;
        while (iE < i3) {
            if (p68Var.d(iE) != z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (h(iArr) == e) {
                    int[] iArr2 = {i5, iE};
                    int iE2 = p68Var.e(iArr2[1]);
                    int i6 = p68Var.b;
                    Arrays.fill(iArr, 0);
                    StringBuilder sb = this.f36434a;
                    sb.setLength(0);
                    while (true) {
                        jl60.e(iE2, p68Var, iArr);
                        int iH = h(iArr);
                        if (iH < 0) {
                            throw o660.a();
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= 48) {
                                throw o660.a();
                            }
                            if (d[i7] == iH) {
                                break;
                            }
                            i7++;
                        }
                        char c3 = c[i7];
                        sb.append(c3);
                        int i8 = iE2;
                        for (int i9 : iArr) {
                            i8 += i9;
                        }
                        int iE3 = p68Var.e(i8);
                        if (c3 == '*') {
                            sb.deleteCharAt(sb.length() - 1);
                            int i10 = 0;
                            for (int i11 : iArr) {
                                i10 += i11;
                            }
                            if (iE3 == i6 || !p68Var.d(iE3)) {
                                throw o660.a();
                            }
                            if (sb.length() < 2) {
                                throw o660.a();
                            }
                            int length2 = sb.length();
                            g(sb, length2 - 2, 20);
                            g(sb, length2 - 1, 15);
                            sb.setLength(sb.length() - 2);
                            int length3 = sb.length();
                            StringBuilder sb2 = new StringBuilder(length3);
                            int i12 = 0;
                            while (i12 < length3) {
                                char cCharAt = sb.charAt(i12);
                                if (cCharAt >= 'a' && cCharAt <= 'd') {
                                    if (i12 >= length3 - 1) {
                                        throw bwq.a();
                                    }
                                    i12++;
                                    char cCharAt2 = sb.charAt(i12);
                                    switch (cCharAt) {
                                        case 'a':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw bwq.a();
                                            }
                                            i2 = cCharAt2 - '@';
                                            c2 = (char) i2;
                                            sb2.append(c2);
                                            break;
                                            break;
                                        case 'b':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                                i2 = cCharAt2 - '&';
                                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                                i2 = cCharAt2 - 11;
                                            } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                                                if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                                                    i2 = cCharAt2 + '+';
                                                } else if (cCharAt2 == 'U') {
                                                    c2 = 0;
                                                } else if (cCharAt2 == 'V') {
                                                    c2 = '@';
                                                } else if (cCharAt2 == 'W') {
                                                    c2 = '`';
                                                } else {
                                                    if (cCharAt2 < 'X' || cCharAt2 > 'Z') {
                                                        throw bwq.a();
                                                    }
                                                    c2 = 127;
                                                }
                                                sb2.append(c2);
                                            } else {
                                                i2 = cCharAt2 + 16;
                                            }
                                            c2 = (char) i2;
                                            sb2.append(c2);
                                            break;
                                        case 'c':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                                i2 = cCharAt2 - ' ';
                                                c2 = (char) i2;
                                            } else {
                                                if (cCharAt2 != 'Z') {
                                                    throw bwq.a();
                                                }
                                                c2 = ':';
                                            }
                                            sb2.append(c2);
                                            break;
                                        case Response.TRYING /* 100 */:
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw bwq.a();
                                            }
                                            i2 = cCharAt2 + ' ';
                                            c2 = (char) i2;
                                            sb2.append(c2);
                                            break;
                                            break;
                                        default:
                                            c2 = 0;
                                            sb2.append(c2);
                                            break;
                                    }
                                } else {
                                    sb2.append(cCharAt);
                                }
                                i12++;
                            }
                            float f = i;
                            i0g0 i0g0Var = new i0g0(sb2.toString(), null, new d3g0[]{new d3g0((iArr2[1] + iArr2[0]) / 2.0f, f), new d3g0((i10 / 2.0f) + iE2, f)}, ju5.d);
                            i0g0Var.b(a3g0.m, "]G0");
                            return i0g0Var;
                        }
                        iE2 = iE3;
                    }
                } else {
                    i5 += iArr[0] + iArr[1];
                    int i13 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i4] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z = !z;
            }
            iE++;
        }
        throw o660.a();
    }
}
