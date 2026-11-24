package kotlin.text;

import a.brm0;
import a.iun;
import a.jf4;
import a.n6k;
import a.ohs0;
import a.q900;
import a.r3d;
import a.rx3;
import a.ttm0;
import a.tx3;
import a.ua80;
import a.v4i0;
import a.vqd;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"a/mtm0", "a/ntm0", "a/otm0", "a/ptm0", "a/qtm0", "a/rtm0", "kotlin/text/b", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/c", "kotlin/text/StringsKt__StringsKt", "kotlin/text/f", "a/ttm0"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
public final class StringsKt extends ttm0 {
    public static String N(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        int iMin = Math.min(charSequence.length(), str.length());
        int i = 0;
        while (i < iMin && a.b(charSequence.charAt(i), str.charAt(i), false)) {
            i++;
        }
        int i2 = i - 1;
        if (StringsKt__StringsKt.z(i2, charSequence) || StringsKt__StringsKt.z(i2, str)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (V(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.B(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean P(CharSequence charSequence, char c) {
        charSequence.getClass();
        return U(c, 0, 2, charSequence) >= 0;
    }

    public static boolean R(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && a.b(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean S(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        return charSequence instanceof String ? c.n((String) charSequence, str, false) : StringsKt__StringsKt.D(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int T(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int U(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? StringsKt__StringsKt.C(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.A(i, charSequence, str, z);
    }

    public static boolean W(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.d(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int X(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(tx3.V(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (a.b(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int Y(int i, String str, int i2, String str2) {
        if ((i2 & 2) != 0) {
            i = T(str);
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i);
    }

    public static List Z(CharSequence charSequence) {
        charSequence.getClass();
        q900 q900Var = new q900(charSequence);
        if (!q900Var.hasNext()) {
            return iun.f15405a;
        }
        Object next = q900Var.next();
        if (!q900Var.hasNext()) {
            return kotlin.collections.a.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (q900Var.hasNext()) {
            arrayList.add(q900Var.next());
        }
        return arrayList;
    }

    public static String a0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            jf4.o(ua80.e(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String b0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            jf4.o(ua80.e(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence c0(CharSequence charSequence) {
        charSequence.getClass();
        return l0(charSequence, Separators.SP) ? charSequence.subSequence(1, charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static String d0(CharSequence charSequence, String str) {
        str.getClass();
        return l0(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    public static String e0(String str, String str2) {
        str.getClass();
        return S(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String f0(String str) {
        return (str.length() >= 2 && l0(str, Separators.DOUBLE_QUOTE) && S(str, Separators.DOUBLE_QUOTE)) ? vqd.k(1, 1, str) : str;
    }

    public static String g0(char c, String str, String str2) {
        str.getClass();
        str.getClass();
        int iX = X(c, 0, 6, str);
        return iX == -1 ? str : h0(str, 0, iX, str2).toString();
    }

    public static StringBuilder h0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            v4i0.m(ohs0.m("End index (", i2, ") is less than start index (", ").", i));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static List i0(CharSequence charSequence, final char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (cArr.length == 1) {
            return StringsKt__StringsKt.F(i2, charSequence, String.valueOf(cArr[0]), false);
        }
        StringsKt__StringsKt.E(i2);
        n6k<IntRange> n6kVar = new n6k(charSequence, i2, new Function2() { // from class: kotlin.text.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int iC = StringsKt__StringsKt.C(charSequence2, cArr, iIntValue, false);
                if (iC < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iC), 1);
            }
        });
        ArrayList arrayList = new ArrayList(r3d.q(new rx3(n6kVar, (byte) 3), 10));
        for (IntRange intRange : n6kVar) {
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.f46068a, intRange.b + 1).toString());
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List j0(CharSequence charSequence, String[] strArr, int i, int i2) {
        return StringsKt__StringsKt.split$default(charSequence, strArr, false, i, i2, null);
    }

    public static boolean k0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && a.b(charSequence.charAt(0), c, false);
    }

    public static boolean l0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? c.x((String) charSequence, (String) charSequence2, false) : StringsKt__StringsKt.D(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static String m0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        int iV = V(str, str2, 0, false, 6);
        return iV == -1 ? str3 : str.substring(str2.length() + iV, str.length());
    }

    public static String n0(String str, char c) {
        int iU = U(c, 0, 6, str);
        return iU == -1 ? str : str.substring(iU + 1, str.length());
    }

    public static String o0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iX = X(c, 0, 6, str);
        return iX == -1 ? str2 : str.substring(iX + 1, str.length());
    }

    public static String p0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iY = Y(0, str, 6, str2);
        return iY == -1 ? str3 : str.substring(str2.length() + iY, str.length());
    }

    public static String q0(String str, char c) {
        str.getClass();
        str.getClass();
        int iU = U(c, 0, 6, str);
        return iU == -1 ? str : str.substring(0, iU);
    }

    public static String r0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iV = V(str, str2, 0, false, 6);
        return iV == -1 ? str : str.substring(0, iV);
    }

    public static String s0(String str, char c) {
        int iX = X(c, 0, 6, str);
        return iX == -1 ? str : str.substring(0, iX);
    }

    public static Long t0(String str) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cCharAt < '0') {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static CharSequence u0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zD = CharsKt.d(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zD) {
                    break;
                }
                length--;
            } else if (zD) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence v0(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!CharsKt.d(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String w0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!tx3.v(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence x0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.d(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static String y0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!tx3.v(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }
}
