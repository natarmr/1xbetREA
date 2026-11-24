package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ttm0 extends kotlin.text.f {
    public static ArrayList G(int i, CharSequence charSequence) {
        charSequence.getClass();
        h8x.x(i, i);
        int length = charSequence.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            CharSequence charSequenceSubSequence = charSequence.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i2 = i3;
        }
        return arrayList;
    }

    public static String H(int i, String str) {
        str.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return L(length, str);
    }

    public static Character I(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static char J(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        v4i0.o("Char sequence is empty.");
        return (char) 0;
    }

    public static CharSequence K(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String L(int i, String str) {
        str.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String M(int i, String str) {
        str.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }
}
