package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public enum rhx0 {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);

    public static final rhx0[] f = new rhx0[26];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f30511a;
    public final int b;
    public final int c;
    public final String d;

    static {
        for (rhx0 rhx0Var : values()) {
            f[(rhx0Var.f30511a | ' ') - 97] = rhx0Var;
        }
    }

    rhx0(char c, int i, String str, boolean z) {
        this.f30511a = c;
        this.b = i;
        uhx0 uhx0Var = uhx0.e;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iCharAt = ((int) ((uhx0.d >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                jf4.o("invalid flags: ".concat(str));
                throw null;
            }
            i2 |= 1 << iCharAt;
        }
        this.c = i2;
        this.d = axq.m(new StringBuilder(String.valueOf(c).length() + 1), Separators.PERCENT, c);
    }
}
