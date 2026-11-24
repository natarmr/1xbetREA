package a;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class m5v0 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f21236a = new fq80();
    public final StringBuilder b = new StringBuilder();

    public static String a(fq80 fq80Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = fq80Var.b;
        int i2 = fq80Var.c;
        while (i < i2 && !z) {
            char c2 = (char) fq80Var.f9961a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        fq80Var.N(i - fq80Var.b);
        return sb.toString();
    }

    public static String b(fq80 fq80Var, StringBuilder sb) {
        c(fq80Var);
        if (fq80Var.a() == 0) {
            return null;
        }
        String strA = a(fq80Var, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) fq80Var.z());
    }

    public static void c(fq80 fq80Var) {
        while (true) {
            for (boolean z = true; fq80Var.a() > 0 && z; z = false) {
                int i = fq80Var.b;
                byte[] bArr = fq80Var.f9961a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    fq80Var.N(1);
                } else {
                    int i2 = fq80Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            fq80Var.N(i2 - fq80Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
