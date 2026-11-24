package kotlin.text;

import a.a2t0;
import a.b2t0;
import a.g2t0;
import a.h2t0;
import a.p1t0;
import a.q2t0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final byte a(String str) {
        p1t0 p1t0Var;
        str.getClass();
        b2t0 b2t0VarC = c(str);
        if (b2t0VarC != null) {
            int i = b2t0VarC.f1872a;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0) {
                p1t0Var = null;
            } else {
                p1t0Var = new p1t0((byte) i);
            }
        } else {
            p1t0Var = null;
        }
        if (p1t0Var != null) {
            return p1t0Var.f26221a;
        }
        StringsKt__StringNumberConversionsKt.k(str);
        throw null;
    }

    public static final int b(String str) {
        str.getClass();
        b2t0 b2t0VarC = c(str);
        if (b2t0VarC != null) {
            return b2t0VarC.f1872a;
        }
        StringsKt__StringNumberConversionsKt.k(str);
        throw null;
    }

    public static final b2t0 c(String str) {
        int i;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        a2t0 a2t0Var = b2t0.b;
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new b2t0(i2);
    }

    public static final long d(String str) {
        str.getClass();
        h2t0 h2t0VarE = e(str);
        if (h2t0VarE != null) {
            return h2t0VarE.f12353a;
        }
        StringsKt__StringNumberConversionsKt.k(str);
        throw null;
    }

    public static final h2t0 e(String str) {
        str.getClass();
        str.getClass();
        int i = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        g2t0 g2t0Var = h2t0.b;
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            a2t0 a2t0Var = b2t0.b;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new h2t0(j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final short f(String str) {
        q2t0 q2t0Var;
        str.getClass();
        b2t0 b2t0VarC = c(str);
        if (b2t0VarC != null) {
            int i = b2t0VarC.f1872a;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0) {
                q2t0Var = null;
            } else {
                q2t0Var = new q2t0((short) i);
            }
        } else {
            q2t0Var = null;
        }
        if (q2t0Var != null) {
            return q2t0Var.f28019a;
        }
        StringsKt__StringNumberConversionsKt.k(str);
        throw null;
    }
}
