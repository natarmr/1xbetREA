package kotlin.text;

/* JADX INFO: loaded from: classes2.dex */
public class a extends CharsKt__CharJVMKt {
    public static int a(char c) {
        int iDigit = Character.digit((int) c, 10);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static final boolean b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
