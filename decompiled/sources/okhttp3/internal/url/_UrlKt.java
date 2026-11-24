package okhttp3.internal.url;

import a.f99;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _UrlKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f46223a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i, int i2, int i3, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return b(str, i4, i5, str2, z, z2, z3, z4, 128);
    }

    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || StringsKt.P(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                f99 f99Var = new f99();
                f99Var.b0(i4, iCharCount, str);
                f99 f99Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            f99Var.c0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            f99Var.c0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || StringsKt.P(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))))) {
                            if (f99Var2 == null) {
                                f99Var2 = new f99();
                            }
                            f99Var2.e0(iCodePointAt2);
                            while (!f99Var2.v0()) {
                                byte b = f99Var2.readByte();
                                f99Var.V(37);
                                char[] cArr = f46223a;
                                f99Var.V(cArr[((b & 255) >> 4) & 15]);
                                f99Var.V(cArr[b & 15]);
                            }
                        } else {
                            f99Var.e0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return f99Var.O();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static final boolean c(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.n(str.charAt(i + 1)) != -1 && _UtilCommonKt.n(str.charAt(i3)) != -1;
    }

    public static String d(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                f99 f99Var = new f99();
                f99Var.b0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iN = _UtilCommonKt.n(str.charAt(iCharCount + 1));
                        int iN2 = _UtilCommonKt.n(str.charAt(i4));
                        if (iN == -1 || iN2 == -1) {
                            f99Var.e0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            f99Var.V((iN << 4) + iN2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        f99Var.V(32);
                        iCharCount++;
                    } else {
                        f99Var.e0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return f99Var.O();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }
}
