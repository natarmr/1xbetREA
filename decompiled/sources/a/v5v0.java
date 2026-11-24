package a;

import android.gov.nist.core.Separators;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class v5v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f36845a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(fq80 fq80Var) {
        String strN = fq80Var.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith(Separators.PERCENT)) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = vtt0.f38024a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(Separators.COLON, -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                jf4.o("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(fq80 fq80Var) {
        int i = fq80Var.b;
        if (a(fq80Var)) {
            return;
        }
        fq80Var.M(i);
        throw kq80.a("Expected WEBVTT. Got " + fq80Var.n(StandardCharsets.UTF_8), null);
    }
}
