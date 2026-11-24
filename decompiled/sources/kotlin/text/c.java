package kotlin.text;

import a.brm0;
import a.c99;

/* JADX INFO: loaded from: classes2.dex */
public class c extends StringsKt__StringNumberConversionsKt {
    public static boolean l(String str, String str2) {
        if (str != null && str2 != null) {
            return str.equalsIgnoreCase(str2);
        }
        if (str != str2) {
            if (str != null && str2 != null && str.length() == str2.length()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (a.b(str.charAt(i), str2.charAt(i), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String m(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }

    public static boolean n(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean o(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean p(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String q(int i, String str) {
        str.getClass();
        if (i < 0) {
            c99.s(brm0.l("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    public static String r(String str, String str2, String str3, boolean z) {
        brm0.B(str, str2, str3);
        int i = 0;
        int iA = StringsKt__StringsKt.A(0, str, str2, z);
        if (iA < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iA);
            sb.append(str3);
            i = iA + length;
            if (iA >= str.length()) {
                break;
            }
            iA = StringsKt__StringsKt.A(iA + i2, str, str2, z);
        } while (iA > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String s(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static String u(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        int iV = StringsKt.V(str, str2, 0, z, 2);
        return iV < 0 ? str : StringsKt.h0(str, iV, str2.length() + iV, str3).toString();
    }

    public static boolean w(int i, String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : p(i, 0, str2.length(), str, str2, z);
    }

    public static boolean x(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : p(0, 0, str2.length(), str, str2, z);
    }
}
