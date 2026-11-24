package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class txc extends jl60 {
    public static final int[] d = {52, 289, 97, 352, 49, WarningHeader.MEDIA_TYPE_NOT_AVAILABLE, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, Response.BAD_REQUEST, 208, 133, 388, 196, 168, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34690a;
    public final StringBuilder b = new StringBuilder(20);
    public final int[] c = new int[9];

    public txc(boolean z) {
        this.f34690a = z;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // a.jl60
    public final i0g0 b(int i, p68 p68Var, Map map) throws q9c, o660 {
        int i2;
        char c;
        char cCharAt;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.b;
        sb.setLength(0);
        int i3 = p68Var.b;
        int iE = p68Var.e(0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = iE;
        while (iE < i3) {
            char c2 = 1;
            if (p68Var.d(iE) != z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 == length - 1) {
                    int i6 = 148;
                    if (g(iArr) == 148 && p68Var.h(Math.max(0, i5 - ((iE - i5) / 2)), i5)) {
                        int[] iArr2 = {i5, iE};
                        int iE2 = p68Var.e(iArr2[1]);
                        int i7 = p68Var.b;
                        while (true) {
                            jl60.e(iE2, p68Var, iArr);
                            int iG = g(iArr);
                            if (iG < 0) {
                                throw o660.a();
                            }
                            int i8 = 0;
                            while (true) {
                                if (i8 >= 43) {
                                    c = c2;
                                    if (iG != i6) {
                                        throw o660.a();
                                    }
                                    cCharAt = '*';
                                    break;
                                }
                                c = c2;
                                if (d[i8] == iG) {
                                    cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8);
                                    break;
                                }
                                i8++;
                                c2 = c;
                            }
                            sb.append(cCharAt);
                            int i9 = iE2;
                            for (int i10 : iArr) {
                                i9 += i10;
                            }
                            int iE3 = p68Var.e(i9);
                            if (cCharAt == '*') {
                                sb.setLength(sb.length() - 1);
                                int i11 = 0;
                                for (int i12 : iArr) {
                                    i11 += i12;
                                }
                                int i13 = (iE3 - iE2) - i11;
                                if (iE3 != i7 && i13 * 2 < i11) {
                                    throw o660.a();
                                }
                                if (this.f34690a) {
                                    int length2 = sb.length() - 1;
                                    int iIndexOf = 0;
                                    for (int i14 = 0; i14 < length2; i14++) {
                                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i14));
                                    }
                                    if (sb.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                        throw q9c.a();
                                    }
                                    sb.setLength(length2);
                                }
                                if (sb.length() == 0) {
                                    throw o660.a();
                                }
                                float f = i;
                                i0g0 i0g0Var = new i0g0(sb.toString(), null, new d3g0[]{new d3g0((iArr2[c] + iArr2[0]) / 2.0f, f), new d3g0((i11 / 2.0f) + iE2, f)}, ju5.c);
                                i0g0Var.b(a3g0.m, "]A0");
                                return i0g0Var;
                            }
                            c2 = c;
                            iE2 = iE3;
                            i6 = 148;
                        }
                    } else {
                        i2 = 1;
                        i5 += iArr[0] + iArr[1];
                        int i15 = i4 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i15);
                        iArr[i15] = 0;
                        iArr[i4] = 0;
                        i4--;
                    }
                } else {
                    i2 = 1;
                    i4++;
                }
                iArr[i4] = i2;
                z = !z;
            }
            iE++;
        }
        throw o660.a();
    }
}
