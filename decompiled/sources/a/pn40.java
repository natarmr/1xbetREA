package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class pn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pn40 f27267a = new pn40();
    public static final DecimalFormat b;

    static {
        p3u0 p3u0Var = p3u0.c;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        b = new DecimalFormat("#.#####", decimalFormatSymbols);
    }

    public static double a(double d, p3u0 p3u0Var) {
        if (p3u0Var != p3u0.i || d >= 0.01d) {
            return s(d, p3u0Var);
        }
        return 0.01d;
    }

    public static String b(double d, int i, boolean z) {
        String string = z ? "#,##0" : Separators.POUND;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(string);
            sb.append('.');
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("0");
            }
            string = sb.toString();
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        if (z) {
            decimalFormatSymbols.setGroupingSeparator(' ');
        }
        String str = new DecimalFormat(string, decimalFormatSymbols).format(d);
        str.getClass();
        return str;
    }

    public static String c(double d, p3u0 p3u0Var) {
        String str = p3u0Var.f26317a;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        String str2 = new DecimalFormat(str, decimalFormatSymbols).format(a(d, p3u0Var));
        str2.getClass();
        return str2;
    }

    public static String d(double d, String str, p3u0 p3u0Var) {
        str.getClass();
        return String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{c(d, p3u0Var), str}, 2));
    }

    public static String f(double d) {
        String str = b.format(s(d, p3u0.e));
        str.getClass();
        return str;
    }

    public static String g(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        p3u0 p3u0Var = p3u0.f;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator((char) 160);
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###,###,###.###", decimalFormatSymbols);
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        String str = decimalFormat.format(new BigDecimal(r(plainString, p3u0Var)));
        str.getClass();
        return str;
    }

    public static String h(double d, p3u0 p3u0Var, boolean z) {
        String str = p3u0Var.f26317a;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        String str2 = new DecimalFormat(str, decimalFormatSymbols).format(a(d, p3u0Var));
        str2.getClass();
        return z ? str2.concat(Separators.DOT) : str2;
    }

    public static String i(double d, int i) {
        return d % 1.0d == 0.0d ? b(d, 0, true) : b(d, i, true);
    }

    public static String j(double d, int i, boolean z) {
        if (d % 1.0d == 0.0d) {
            return b(d, 0, z);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        return b(d, Math.min((bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).scale(), i), z);
    }

    public static String k(String str, double d) {
        double dS = s(d, p3u0.c);
        return kotlin.text.c.r(String.format(Locale.ENGLISH, ua80.e(dS == 0.0d ? 0 : 2, "%,.", "f %s"), Arrays.copyOf(new Object[]{Double.valueOf(dS), str}, 2)), Separators.COMMA, "", false);
    }

    public static String l(double d) {
        p3u0 p3u0Var = p3u0.k;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator((char) 160);
        String str = new DecimalFormat("###,###,##0.##", decimalFormatSymbols).format(a(d, p3u0Var));
        str.getClass();
        return str;
    }

    public static double m(double d, p3u0 p3u0Var, RoundingMode roundingMode) {
        roundingMode.getClass();
        return new BigDecimal(String.valueOf(d)).setScale(p3u0Var.b, roundingMode).doubleValue();
    }

    public static /* synthetic */ double n(double d, int i) {
        RoundingMode roundingMode = RoundingMode.UP;
        p3u0 p3u0Var = p3u0.c;
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_DOWN;
        }
        return m(d, p3u0Var, roundingMode);
    }

    public static String o(double d) {
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        Locale locale = Locale.ENGLISH;
        plainString.getClass();
        return String.format(locale, plainString, Arrays.copyOf(new Object[0], 0));
    }

    public static String p(String str, double d) {
        str.getClass();
        BigDecimal scale = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        return String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{(scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString(), str}, 2));
    }

    public static double q(double d) {
        return new BigDecimal(a(d, p3u0.c)).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    public static String r(String str, p3u0 p3u0Var) {
        int iV = StringsKt.V(str, Separators.DOT, 0, false, 6);
        if (iV == -1) {
            return str;
        }
        int i = iV + p3u0Var.b + 1;
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static double s(double d, p3u0 p3u0Var) {
        String strValueOf;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            strValueOf = String.valueOf(d);
        } else {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
            strValueOf = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
            strValueOf.getClass();
        }
        return wvb.O(r(strValueOf, p3u0Var));
    }
}
