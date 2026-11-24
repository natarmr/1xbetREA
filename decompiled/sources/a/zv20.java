package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f45035a = new BigDecimal("100");
    public static final BigDecimal b = new BigDecimal("1000");
    public static final BigDecimal c = new BigDecimal("10000");
    public static final BigDecimal d = new BigDecimal("100000");

    public static final String a(Number number) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        return kng0.l("\u2066", new DecimalFormat("####.######", decimalFormatSymbols).format(number), "\u2069");
    }

    public static final String b(int i, int i2) {
        return a(Double.valueOf(((double) i) / ((double) i2)));
    }

    public static final BigDecimal c(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal scale = bigDecimal.divide(bigDecimal2).setScale(0, RoundingMode.DOWN);
        scale.getClass();
        return scale;
    }

    public static final Pair d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalC = c(bigDecimal, bigDecimal2);
        return new Pair(bigDecimalC, e(bigDecimal, bigDecimal2, bigDecimalC));
    }

    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal scale = bigDecimal.divide(bigDecimal2).subtract(bigDecimal3).multiply(bigDecimal2).setScale(0, RoundingMode.DOWN);
        scale.getClass();
        return scale;
    }

    public static final String f(int i, int i2, BigDecimal bigDecimal) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        bigDecimalValueOf.getClass();
        return String.valueOf(bigDecimalValueOf.divide(bigDecimal).subtract(new BigDecimal(i2)).multiply(bigDecimal).intValue());
    }

    public static final String g(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2) {
        Pair pairS = s(bigDecimal);
        int iIntValue = ((Number) pairS.f46059a).intValue();
        BigDecimal bigDecimal3 = (BigDecimal) pairS.b;
        if (iIntValue < 0) {
            bigDecimal2 = bigDecimal2.negate();
        }
        BigDecimal bigDecimalMultiply = bigDecimal3.multiply(bigDecimal2);
        String strU = kotlin.text.c.u(str, "()", String.valueOf(Math.abs(iIntValue)), false);
        bigDecimalMultiply.getClass();
        return kotlin.text.c.u(strU, "()", a(bigDecimalMultiply), false);
    }

    public static final String h(BigDecimal bigDecimal, boolean z, String str, int i) {
        int i2;
        Pair pairS = s(bigDecimal);
        int iIntValue = ((Number) pairS.f46059a).intValue();
        int iIntValue2 = ((BigDecimal) pairS.b).multiply(b).setScale(0, RoundingMode.HALF_UP).intValue();
        return kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", b(iIntValue, 100), false), "(1)", iIntValue2 + ":00", false), ua80.e(i, Separators.LPAREN, Separators.RPAREN), (z && ((i2 = iIntValue2 + i) == 45 || i2 == 90)) ? f140.i((i - 1) + iIntValue2, ":59+") : f140.i((i - 1) + iIntValue2, ":59"), false);
    }

    public static final String i(String str, String str2) {
        if (str2 == null) {
            return kotlin.text.c.r(str, "[]", "", false);
        }
        Iterator it = (StringsKt.V(str2, Separators.SLASH, 0, false, 6) != -1 ? StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null) : StringsKt__StringsKt.split$default(str2, new String[]{"-"}, false, 0, 6, null)).iterator();
        while (it.hasNext()) {
            str = kotlin.text.c.u(str, "[]", (String) it.next(), false);
        }
        return kotlin.text.c.r(str, "[]", "", false);
    }

    public static final DecimalFormat j(int i) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        return new DecimalFormat(kotlin.text.c.q(i, "0"), decimalFormatSymbols);
    }

    public static final String k(Integer num, String str, BigDecimal bigDecimal, String str2, Long l) {
        String strU;
        String str3;
        String str4;
        BigDecimal bigDecimal2 = bigDecimal;
        String str5 = str2;
        str.getClass();
        if (num != null) {
            try {
                if (num.intValue() != 1) {
                    if (num.intValue() == 3) {
                        if (bigDecimal2 == null) {
                            bigDecimal2 = BigDecimal.ZERO;
                        }
                        bigDecimal2.getClass();
                        strU = kotlin.text.c.u(str, "()", Separators.LPAREN + a(bigDecimal2) + Separators.RPAREN, false);
                    } else {
                        int iIntValue = num.intValue();
                        BigDecimal bigDecimal3 = b;
                        if (iIntValue == 5) {
                            Pair pairS = s(bigDecimal2);
                            strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS.f46059a).intValue()), false), "()", p((BigDecimal) pairS.b, bigDecimal3), false);
                        } else {
                            String str6 = "";
                            if (num.intValue() == 7) {
                                if (str5 == null) {
                                    str5 = "";
                                }
                                strU = kotlin.text.c.r(str, "[]", str5, false);
                            } else if (num.intValue() == 9) {
                                if (bigDecimal2 == null) {
                                    bigDecimal2 = BigDecimal.ZERO;
                                }
                                bigDecimal2.getClass();
                                String strU2 = kotlin.text.c.u(str, "()", a(bigDecimal2), false);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                strU = kotlin.text.c.u(strU2, "[]", str5, false);
                            } else if (num.intValue() == 11) {
                                Pair pairS2 = s(bigDecimal2);
                                String strU3 = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS2.f46059a).intValue()), false), "()", r((BigDecimal) pairS2.b, bigDecimal3), false);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                strU = kotlin.text.c.u(strU3, "[]", str5, false);
                            } else {
                                int iIntValue2 = num.intValue();
                                BigDecimal bigDecimal4 = f45035a;
                                if (iIntValue2 == 13) {
                                    Pair pairS3 = s(bigDecimal2);
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", b(((Number) pairS3.f46059a).intValue(), 100), false), "()", p((BigDecimal) pairS3.b, bigDecimal4), false);
                                } else if (num.intValue() == 15) {
                                    Pair pairS4 = s(bigDecimal2);
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", b(((Number) pairS4.f46059a).intValue(), 1000), false), "()", r((BigDecimal) pairS4.b, bigDecimal3), false);
                                } else if (num.intValue() == 17) {
                                    Pair pairS5 = s(bigDecimal2);
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", b(((Number) pairS5.f46059a).intValue(), 100), false), "()", r((BigDecimal) pairS5.b, bigDecimal3), false);
                                } else if (num.intValue() == 21) {
                                    strU = h(bigDecimal2, l != null && l.longValue() == 1, str, 2);
                                } else if (num.intValue() == 23) {
                                    strU = h(bigDecimal2, l != null && l.longValue() == 1, str, 5);
                                } else if (num.intValue() == 25) {
                                    strU = h(bigDecimal2, l != null && l.longValue() == 1, str, 10);
                                } else if (num.intValue() == 27) {
                                    strU = h(bigDecimal2, l != null && l.longValue() == 1, str, 15);
                                } else if (num.intValue() == 29) {
                                    strU = h(bigDecimal2, l != null && l.longValue() == 1, str, 30);
                                } else if (num.intValue() == 31) {
                                    Pair pairS6 = s(bigDecimal2);
                                    int iIntValue3 = ((Number) pairS6.f46059a).intValue();
                                    BigDecimal bigDecimal5 = (BigDecimal) pairS6.b;
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", iIntValue3 + ":00", false), "()", r(bigDecimal5, bigDecimal3) + ":59", false);
                                } else if (num.intValue() == 33) {
                                    int iIntValue4 = ((Number) s(bigDecimal2).f46059a).intValue();
                                    if (iIntValue4 != 0) {
                                        str6 = iIntValue4 + ":00";
                                    }
                                    strU = kotlin.text.c.u(str, "()", str6, false);
                                } else if (num.intValue() == 35) {
                                    Pair pairS7 = s(bigDecimal2);
                                    int iIntValue5 = ((Number) pairS7.f46059a).intValue();
                                    int i = iIntValue5 / 100;
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", f(iIntValue5, i, bigDecimal4), false), "()", r((BigDecimal) pairS7.b, bigDecimal3), false), "()", String.valueOf(i), false);
                                } else if (num.intValue() == 37) {
                                    strU = kotlin.text.c.u(str, "()", String.valueOf(((Number) s(bigDecimal2).f46059a).intValue()), false);
                                } else if (num.intValue() == 39) {
                                    Pair pairS8 = s(bigDecimal2);
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", r((BigDecimal) pairS8.b, bigDecimal3), false), "()", String.valueOf(((Number) pairS8.f46059a).intValue()), false);
                                } else if (num.intValue() == 41) {
                                    int iIntValue6 = ((Number) s(bigDecimal2).f46059a).intValue();
                                    if (iIntValue6 > 0) {
                                        str4 = Separators.LPAREN + iIntValue6 + ":0)";
                                    } else {
                                        str4 = "(0:" + Math.abs(iIntValue6) + Separators.RPAREN;
                                    }
                                    strU = kotlin.text.c.u(str, "()", str4, false);
                                } else if (num.intValue() == 43) {
                                    strU = g(bigDecimal2, str, bigDecimal4);
                                } else if (num.intValue() == 45) {
                                    strU = g(bigDecimal2, str, bigDecimal3);
                                } else if (num.intValue() == 49) {
                                    Pair pairS9 = s(bigDecimal2);
                                    int iIntValue7 = ((Number) pairS9.f46059a).intValue();
                                    BigDecimal bigDecimal6 = (BigDecimal) pairS9.b;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "[]", str5, false), "()", b(iIntValue7, 100), false), "()", p(bigDecimal6, bigDecimal3), false);
                                } else if (num.intValue() == 51) {
                                    Pair pairS10 = s(bigDecimal2);
                                    int iIntValue8 = ((Number) pairS10.f46059a).intValue();
                                    BigDecimal bigDecimal7 = (BigDecimal) pairS10.b;
                                    int i2 = iIntValue8 / 1000;
                                    String strF = f(iIntValue8, i2, bigDecimal3);
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "[]", str5, false), "()", String.valueOf(i2), false), "()", strF, false), "()", r(bigDecimal7, bigDecimal3), false);
                                } else if (num.intValue() == 53) {
                                    Pair pairS11 = s(bigDecimal2);
                                    int iIntValue9 = ((Number) pairS11.f46059a).intValue();
                                    int i3 = iIntValue9 / 100;
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(i3), false), "()", f(iIntValue9, i3, bigDecimal4), false), "()", p((BigDecimal) pairS11.b, bigDecimal3), false);
                                } else if (num.intValue() == 55) {
                                    Pair pairS12 = s(bigDecimal2);
                                    int iIntValue10 = ((Number) pairS12.f46059a).intValue();
                                    BigDecimal bigDecimal8 = (BigDecimal) pairS12.b;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "[]", str5, false), "()", String.valueOf(iIntValue10), false), "()", p(bigDecimal8, bigDecimal4), false);
                                } else if (num.intValue() == 59) {
                                    Pair pairS13 = s(bigDecimal2);
                                    int iIntValue11 = ((Number) pairS13.f46059a).intValue();
                                    BigDecimal bigDecimal9 = (BigDecimal) pairS13.b;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "[]", str5, false), "()", String.valueOf(iIntValue11), false), "()", p(bigDecimal9, bigDecimal3), false);
                                } else if (num.intValue() == 65) {
                                    Pair pairS14 = s(bigDecimal2);
                                    int iIntValue12 = ((Number) pairS14.f46059a).intValue();
                                    int i4 = iIntValue12 / 1000;
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(i4), false), "()", f(iIntValue12, i4, bigDecimal3), false), "()", p((BigDecimal) pairS14.b, bigDecimal3), false);
                                } else if (num.intValue() == 69) {
                                    Pair pairS15 = s(bigDecimal2);
                                    int iIntValue13 = ((Number) pairS15.f46059a).intValue();
                                    BigDecimal bigDecimal10 = (BigDecimal) pairS15.b;
                                    int i5 = iIntValue13 / 100;
                                    String strF2 = f(iIntValue13, i5, bigDecimal4);
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "[]", str5, false), "()", String.valueOf(i5), false), "()", strF2, false), "()", p(bigDecimal10, bigDecimal3), false);
                                } else if (num.intValue() == 71) {
                                    Pair pairS16 = s(bigDecimal2);
                                    int iIntValue14 = ((Number) pairS16.f46059a).intValue();
                                    int iIntValue15 = ((BigDecimal) pairS16.b).multiply(BigDecimal.TEN).intValue();
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(iIntValue14 - iIntValue15), false), "()", String.valueOf(iIntValue14 + iIntValue15), false);
                                } else if (num.intValue() == 75) {
                                    Pair pairS17 = s(bigDecimal2);
                                    int iIntValue16 = ((Number) pairS17.f46059a).intValue();
                                    BigDecimal bigDecimal11 = (BigDecimal) pairS17.b;
                                    BigDecimal scale = bigDecimal11.multiply(bigDecimal4).setScale(0, RoundingMode.DOWN);
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", b(iIntValue16, 100), false), "()", String.valueOf(scale.intValue()), false), "()", String.valueOf(bigDecimal11.multiply(bigDecimal4).subtract(scale).multiply(bigDecimal4).intValue()), false);
                                } else if (num.intValue() == 77) {
                                    int iIntValue17 = ((Number) s(bigDecimal2).f46059a).intValue();
                                    if (iIntValue17 > 0) {
                                        str3 = iIntValue17 + ":0";
                                    } else {
                                        str3 = "0:" + Math.abs(iIntValue17);
                                    }
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "[]", str5, false), "()", str3, false);
                                } else if (num.intValue() == 81) {
                                    strU = n(str, bigDecimal);
                                } else if (num.intValue() == 83) {
                                    Pair pairS18 = s(bigDecimal2);
                                    int iIntValue18 = ((Number) pairS18.f46059a).intValue();
                                    int i6 = iIntValue18 / 100;
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(i6), false), "()", f(iIntValue18, i6, bigDecimal4), false), "()", p((BigDecimal) pairS18.b, bigDecimal4), false);
                                } else if (num.intValue() == 85) {
                                    strU = o(str, bigDecimal);
                                } else if (num.intValue() == 87) {
                                    Pair pairS19 = s(bigDecimal2);
                                    int iIntValue19 = ((Number) pairS19.f46059a).intValue();
                                    BigDecimal bigDecimal12 = (BigDecimal) pairS19.b;
                                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iIntValue19);
                                    bigDecimalValueOf.getClass();
                                    Pair pairD = d(bigDecimalValueOf, bigDecimal4);
                                    BigDecimal bigDecimal13 = (BigDecimal) pairD.f46059a;
                                    BigDecimal bigDecimal14 = (BigDecimal) pairD.b;
                                    Pair pairQ = q(bigDecimal12, bigDecimal4);
                                    BigDecimal bigDecimal15 = (BigDecimal) pairQ.f46059a;
                                    BigDecimal bigDecimal16 = (BigDecimal) pairQ.b;
                                    BigDecimal bigDecimalDivide = bigDecimal13.divide(BigDecimal.TEN);
                                    bigDecimalDivide.getClass();
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", a(bigDecimalDivide), false), "()", t(bigDecimal14), false), "()", t(bigDecimal15), false), "()", t(bigDecimal16), false);
                                } else if (num.intValue() == 89) {
                                    Pair pairS20 = s(bigDecimal2);
                                    int iIntValue20 = ((Number) pairS20.f46059a).intValue();
                                    BigDecimal bigDecimal17 = (BigDecimal) pairS20.b;
                                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(iIntValue20);
                                    bigDecimalValueOf2.getClass();
                                    Pair pairD2 = d(bigDecimalValueOf2, bigDecimal4);
                                    String strU4 = kotlin.text.c.u(kotlin.text.c.u(str, "()", t((BigDecimal) pairD2.f46059a), false), "()", t((BigDecimal) pairD2.b), false);
                                    BigDecimal bigDecimalMultiply = bigDecimal17.multiply(bigDecimal3);
                                    bigDecimalMultiply.getClass();
                                    strU = kotlin.text.c.u(strU4, "()", a(bigDecimalMultiply), false);
                                } else if (num.intValue() == 91) {
                                    strU = i(str, str5);
                                } else if (num.intValue() == 93) {
                                    Pair pairS21 = s(bigDecimal2);
                                    int iIntValue21 = ((Number) pairS21.f46059a).intValue();
                                    BigDecimal bigDecimal18 = (BigDecimal) pairS21.b;
                                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(iIntValue21);
                                    bigDecimalValueOf3.getClass();
                                    Pair pairD3 = d(bigDecimalValueOf3, bigDecimal4);
                                    BigDecimal bigDecimal19 = (BigDecimal) pairD3.f46059a;
                                    BigDecimal bigDecimal20 = (BigDecimal) pairD3.b;
                                    Pair pairQ2 = q(bigDecimal18, bigDecimal4);
                                    BigDecimal bigDecimal21 = (BigDecimal) pairQ2.f46059a;
                                    BigDecimal bigDecimal22 = (BigDecimal) pairQ2.b;
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimal19) + Separators.COLON + t(bigDecimal20), false), "()", t(bigDecimal21), false), "()", t(bigDecimal22), false);
                                } else if (num.intValue() == 95) {
                                    Pair pairS22 = s(bigDecimal2);
                                    int iIntValue22 = ((Number) pairS22.f46059a).intValue();
                                    BigDecimal bigDecimalNegate = (BigDecimal) pairS22.b;
                                    if (iIntValue22 < 0) {
                                        bigDecimalNegate = bigDecimalNegate.negate();
                                        bigDecimalNegate.getClass();
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", b(iIntValue22, 100), false), "()", p(bigDecimalNegate, bigDecimal4), false);
                                } else if (num.intValue() == 97) {
                                    Pair pairS23 = s(bigDecimal2);
                                    int iIntValue23 = ((Number) pairS23.f46059a).intValue();
                                    BigDecimal bigDecimalNegate2 = (BigDecimal) pairS23.b;
                                    if (iIntValue23 < 0) {
                                        bigDecimalNegate2 = bigDecimalNegate2.negate();
                                        bigDecimalNegate2.getClass();
                                    }
                                    String strU5 = kotlin.text.c.u(str, "()", b(iIntValue23, 1000), false);
                                    BigDecimal bigDecimal23 = BigDecimal.TEN;
                                    bigDecimal23.getClass();
                                    strU = kotlin.text.c.u(strU5, "()", p(bigDecimalNegate2, bigDecimal23), false);
                                } else if (num.intValue() == 99) {
                                    strU = i(str, str5);
                                } else if (num.intValue() == 101) {
                                    Pair pairS24 = s(bigDecimal2);
                                    int iIntValue24 = ((Number) pairS24.f46059a).intValue();
                                    BigDecimal bigDecimal24 = (BigDecimal) pairS24.b;
                                    String strU6 = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(iIntValue24), false), "()", p(bigDecimal24, bigDecimal3), false);
                                    BigDecimal bigDecimalAdd = bigDecimal24.multiply(bigDecimal3).add(new BigDecimal("0.5"));
                                    bigDecimalAdd.getClass();
                                    strU = kotlin.text.c.u(strU6, "()", a(bigDecimalAdd), false);
                                } else if (num.intValue() == 103) {
                                    Pair pairS25 = s(bigDecimal2);
                                    int iIntValue25 = ((Number) pairS25.f46059a).intValue();
                                    BigDecimal bigDecimalNegate3 = (BigDecimal) pairS25.b;
                                    if (iIntValue25 < 0) {
                                        bigDecimalNegate3 = bigDecimalNegate3.negate();
                                        bigDecimalNegate3.getClass();
                                    }
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(iIntValue25), false), "()", p(bigDecimalNegate3, bigDecimal3), false), "()", a(Double.valueOf(((double) iIntValue25) - 0.5d)), false);
                                } else if (num.intValue() == 105) {
                                    Pair pairS26 = s(bigDecimal2);
                                    int iIntValue26 = ((Number) pairS26.f46059a).intValue();
                                    BigDecimal bigDecimal25 = (BigDecimal) pairS26.b;
                                    BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(iIntValue26);
                                    bigDecimalValueOf4.getClass();
                                    Pair pairD4 = d(bigDecimalValueOf4, bigDecimal4);
                                    strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t((BigDecimal) pairD4.f46059a), false), "()", t((BigDecimal) pairD4.b), false), "()", p(bigDecimal25, bigDecimal3), false);
                                } else if (num.intValue() == 107) {
                                    Pair pairS27 = s(bigDecimal2);
                                    strU = i(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS27.f46059a).intValue()), false), "()", r((BigDecimal) pairS27.b, bigDecimal3), false), str5);
                                } else {
                                    int iIntValue27 = num.intValue();
                                    BigDecimal bigDecimal26 = c;
                                    if (iIntValue27 == 111) {
                                        Pair pairS28 = s(bigDecimal2);
                                        int iIntValue28 = ((Number) pairS28.f46059a).intValue();
                                        BigDecimal bigDecimal27 = (BigDecimal) pairS28.b;
                                        long j = iIntValue28;
                                        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j);
                                        bigDecimalValueOf5.getClass();
                                        BigDecimal bigDecimalC = c(bigDecimalValueOf5, bigDecimal26);
                                        BigDecimal bigDecimalC2 = c(bigDecimalC, bigDecimal4);
                                        BigDecimal bigDecimalE = e(bigDecimalC, bigDecimal4, bigDecimalC2);
                                        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(j);
                                        bigDecimalValueOf6.getClass();
                                        Pair pairD5 = d(e(bigDecimalValueOf6, bigDecimal26, bigDecimalC), bigDecimal4);
                                        BigDecimal bigDecimal28 = (BigDecimal) pairD5.f46059a;
                                        BigDecimal bigDecimal29 = (BigDecimal) pairD5.b;
                                        Pair pairQ3 = q(bigDecimal27, bigDecimal4);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimalC2), false), "()", t(bigDecimalE), false), "()", t(bigDecimal28), false), "()", t(bigDecimal29), false), "()", t((BigDecimal) pairQ3.f46059a), false), "()", t((BigDecimal) pairQ3.b), false), str5);
                                    } else if (num.intValue() == 113) {
                                        if (bigDecimal2 == null) {
                                            bigDecimal2 = BigDecimal.ZERO;
                                        }
                                        bigDecimal2.getClass();
                                        strU = i(kotlin.text.c.u(str, "()", Separators.LPAREN + a(bigDecimal2) + Separators.RPAREN, false), str5);
                                    } else if (num.intValue() == 115) {
                                        Pair pairS29 = s(bigDecimal2);
                                        int iIntValue29 = ((Number) pairS29.f46059a).intValue();
                                        BigDecimal bigDecimal30 = (BigDecimal) pairS29.b;
                                        BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(iIntValue29);
                                        bigDecimalValueOf7.getClass();
                                        Pair pairD6 = d(bigDecimalValueOf7, bigDecimal4);
                                        BigDecimal bigDecimal31 = (BigDecimal) pairD6.f46059a;
                                        BigDecimal bigDecimal32 = (BigDecimal) pairD6.b;
                                        Pair pairQ4 = q(bigDecimal30, bigDecimal4);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimal31), false), "()", t(bigDecimal32), false), "()", t((BigDecimal) pairQ4.f46059a), false), "()", t((BigDecimal) pairQ4.b), false), str5);
                                    } else if (num.intValue() == 117) {
                                        Pair pairS30 = s(bigDecimal2);
                                        strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", b(((Number) pairS30.f46059a).intValue(), 1000), false), "()", p((BigDecimal) pairS30.b, bigDecimal3), false);
                                    } else if (num.intValue() == 119) {
                                        strU = l(str, bigDecimal);
                                    } else if (num.intValue() == 121) {
                                        Pair pairS31 = s(bigDecimal2);
                                        strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS31.f46059a).intValue()), false), "()", r((BigDecimal) pairS31.b, bigDecimal26), false);
                                    } else if (num.intValue() == 123) {
                                        Pair pairS32 = s(bigDecimal2);
                                        int iIntValue30 = ((Number) pairS32.f46059a).intValue();
                                        BigDecimal bigDecimal33 = (BigDecimal) pairS32.b;
                                        long j2 = iIntValue30;
                                        BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(j2);
                                        bigDecimalValueOf8.getClass();
                                        BigDecimal bigDecimalC3 = c(bigDecimalValueOf8, bigDecimal26);
                                        BigDecimal bigDecimalC4 = c(bigDecimalC3, bigDecimal4);
                                        BigDecimal bigDecimalE2 = e(bigDecimalC3, bigDecimal4, bigDecimalC4);
                                        BigDecimal bigDecimalValueOf9 = BigDecimal.valueOf(j2);
                                        bigDecimalValueOf9.getClass();
                                        Pair pairD7 = d(e(bigDecimalValueOf9, bigDecimal26, bigDecimalC3), bigDecimal4);
                                        BigDecimal bigDecimal34 = (BigDecimal) pairD7.f46059a;
                                        BigDecimal bigDecimal35 = (BigDecimal) pairD7.b;
                                        Pair pairQ5 = q(bigDecimal33, bigDecimal4);
                                        strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimalC4), false), "()", t(bigDecimalE2), false), "()", t(bigDecimal34), false), "()", t(bigDecimal35), false), "()", t((BigDecimal) pairQ5.f46059a), false), "()", t((BigDecimal) pairQ5.b), false);
                                    } else if (num.intValue() == 125) {
                                        Pair pairS33 = s(bigDecimal2);
                                        int iIntValue31 = ((Number) pairS33.f46059a).intValue();
                                        BigDecimal bigDecimal36 = (BigDecimal) pairS33.b;
                                        BigDecimal bigDecimalValueOf10 = BigDecimal.valueOf(iIntValue31);
                                        bigDecimalValueOf10.getClass();
                                        Pair pairD8 = d(bigDecimalValueOf10, bigDecimal4);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t((BigDecimal) pairD8.b), false), "()", r(bigDecimal36, bigDecimal3), false), "()", t((BigDecimal) pairD8.f46059a), false), str5);
                                    } else if (num.intValue() == 127) {
                                        Pair pairS34 = s(bigDecimal2);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS34.f46059a).intValue()), false), "()", p((BigDecimal) pairS34.b, bigDecimal26), false), str5);
                                    } else if (num.intValue() == 129) {
                                        Pair pairS35 = s(bigDecimal2);
                                        int iIntValue32 = ((Number) pairS35.f46059a).intValue();
                                        BigDecimal bigDecimal37 = (BigDecimal) pairS35.b;
                                        BigDecimal bigDecimalValueOf11 = BigDecimal.valueOf(iIntValue32);
                                        bigDecimalValueOf11.getClass();
                                        Pair pairD9 = d(bigDecimalValueOf11, bigDecimal3);
                                        BigDecimal bigDecimal38 = (BigDecimal) pairD9.f46059a;
                                        BigDecimal bigDecimal39 = (BigDecimal) pairD9.b;
                                        Pair pairQ6 = q(bigDecimal37, bigDecimal3);
                                        strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimal38), false), "()", t(bigDecimal39), false), "()", t((BigDecimal) pairQ6.f46059a), false), "()", t((BigDecimal) pairQ6.b), false);
                                    } else if (num.intValue() == 131) {
                                        Pair pairS36 = s(bigDecimal2);
                                        int iIntValue33 = ((Number) pairS36.f46059a).intValue();
                                        BigDecimal bigDecimal40 = (BigDecimal) pairS36.b;
                                        BigDecimal bigDecimalValueOf12 = BigDecimal.valueOf(iIntValue33);
                                        bigDecimalValueOf12.getClass();
                                        Pair pairD10 = d(bigDecimalValueOf12, bigDecimal4);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t((BigDecimal) pairD10.b), false), "()", r(bigDecimal40, bigDecimal3), false), "()", t((BigDecimal) pairD10.f46059a), false), str5);
                                    } else if (num.intValue() == 133) {
                                        if (bigDecimal2 == null) {
                                            bigDecimal2 = BigDecimal.ZERO;
                                        }
                                        bigDecimal2.getClass();
                                        strU = i(kotlin.text.c.u(str, "()", a(bigDecimal2), false), str5);
                                    } else if (num.intValue() == 134) {
                                        Pair pairS37 = s(bigDecimal2);
                                        strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", b(((Number) pairS37.f46059a).intValue(), 1000), false), "()", p((BigDecimal) pairS37.b, bigDecimal4), false);
                                    } else if (num.intValue() == 135) {
                                        Pair pairS38 = s(bigDecimal2);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS38.f46059a).intValue()), false), "()", r((BigDecimal) pairS38.b, bigDecimal3), false), str5);
                                    } else if (num.intValue() == 136) {
                                        Pair pairS39 = s(bigDecimal2);
                                        int iIntValue34 = ((Number) pairS39.f46059a).intValue();
                                        BigDecimal bigDecimal41 = (BigDecimal) pairS39.b;
                                        BigDecimal bigDecimalValueOf13 = BigDecimal.valueOf(iIntValue34);
                                        bigDecimalValueOf13.getClass();
                                        Pair pairD11 = d(bigDecimalValueOf13, bigDecimal4);
                                        BigDecimal bigDecimal42 = (BigDecimal) pairD11.f46059a;
                                        BigDecimal bigDecimal43 = (BigDecimal) pairD11.b;
                                        Pair pairQ7 = q(bigDecimal41, bigDecimal4);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimal42), false), "()", t(bigDecimal43), false), "()", t((BigDecimal) pairQ7.f46059a), false), "()", t((BigDecimal) pairQ7.b), false), str5);
                                    } else if (num.intValue() == 137) {
                                        Pair pairS40 = s(bigDecimal2);
                                        int iIntValue35 = ((Number) pairS40.f46059a).intValue();
                                        BigDecimal bigDecimal44 = (BigDecimal) pairS40.b;
                                        long j3 = iIntValue35;
                                        BigDecimal bigDecimalValueOf14 = BigDecimal.valueOf(j3);
                                        bigDecimalValueOf14.getClass();
                                        BigDecimal bigDecimalC5 = c(bigDecimalValueOf14, bigDecimal26);
                                        BigDecimal bigDecimalC6 = c(bigDecimalC5, bigDecimal4);
                                        BigDecimal bigDecimalE3 = e(bigDecimalC5, bigDecimal4, bigDecimalC6);
                                        BigDecimal bigDecimalValueOf15 = BigDecimal.valueOf(j3);
                                        bigDecimalValueOf15.getClass();
                                        Pair pairD12 = d(e(bigDecimalValueOf15, bigDecimal26, bigDecimalC5), bigDecimal4);
                                        BigDecimal bigDecimal45 = (BigDecimal) pairD12.f46059a;
                                        BigDecimal bigDecimal46 = (BigDecimal) pairD12.b;
                                        Pair pairQ8 = q(bigDecimal44, bigDecimal4);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimalC6), false), "()", t(bigDecimalE3), false), "()", t(bigDecimal45), false), "()", t(bigDecimal46), false), "()", t((BigDecimal) pairQ8.f46059a), false), "()", t((BigDecimal) pairQ8.b), false), str5);
                                    } else if (num.intValue() == 138) {
                                        Pair pairS41 = s(bigDecimal2);
                                        int iIntValue36 = ((Number) pairS41.f46059a).intValue();
                                        BigDecimal bigDecimal47 = (BigDecimal) pairS41.b;
                                        String strU7 = kotlin.text.c.u(str, "()", b(iIntValue36, 1000), false);
                                        BigDecimal bigDecimalAbs = bigDecimal47.abs();
                                        bigDecimalAbs.getClass();
                                        strU = kotlin.text.c.u(strU7, "()", p(bigDecimalAbs, bigDecimal3), false);
                                    } else if (num.intValue() == 139) {
                                        if (bigDecimal2 == null) {
                                            bigDecimal2 = BigDecimal.ZERO;
                                        }
                                        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
                                        BigDecimal scale2 = bigDecimal2.setScale(1, roundingMode);
                                        boolean z = bigDecimal2.abs().subtract(scale2.abs()).multiply(bigDecimal4).setScale(0, roundingMode).compareTo(BigDecimal.ZERO) != 0;
                                        BigDecimal bigDecimalMultiply2 = bigDecimal2.abs().subtract(bigDecimal2.abs().setScale(2, roundingMode)).multiply(bigDecimal26);
                                        if (z) {
                                            bigDecimalMultiply2 = bigDecimalMultiply2.negate();
                                        }
                                        String strU8 = kotlin.text.c.u(str, "()", a(scale2), false);
                                        bigDecimalMultiply2.getClass();
                                        strU = kotlin.text.c.u(strU8, "()", a(bigDecimalMultiply2), false);
                                    } else if (num.intValue() == 140) {
                                        Pair pairS42 = s(bigDecimal2);
                                        int iIntValue37 = ((Number) pairS42.f46059a).intValue();
                                        BigDecimal bigDecimal48 = (BigDecimal) pairS42.b;
                                        String strU9 = kotlin.text.c.u(str, "()", b(iIntValue37, 100), false);
                                        BigDecimal bigDecimalAbs2 = bigDecimal48.abs();
                                        bigDecimalAbs2.getClass();
                                        strU = i(kotlin.text.c.u(strU9, "()", p(bigDecimalAbs2, bigDecimal4), false), str5);
                                    } else if (num.intValue() == 143) {
                                        Pair pairS43 = s(bigDecimal2);
                                        int iIntValue38 = ((Number) pairS43.f46059a).intValue();
                                        BigDecimal bigDecimal49 = (BigDecimal) pairS43.b;
                                        BigDecimal bigDecimal50 = new BigDecimal("100000000");
                                        BigDecimal bigDecimalValueOf16 = BigDecimal.valueOf(iIntValue38);
                                        bigDecimalValueOf16.getClass();
                                        BigDecimal bigDecimalC7 = c(bigDecimalValueOf16, bigDecimal50);
                                        BigDecimal scale3 = bigDecimalValueOf16.divide(bigDecimal50).subtract(bigDecimalC7).multiply(bigDecimal26).setScale(0, RoundingMode.DOWN);
                                        scale3.getClass();
                                        Pair pairD13 = d(scale3, bigDecimal4);
                                        BigDecimal bigDecimal51 = (BigDecimal) pairD13.f46059a;
                                        BigDecimal bigDecimal52 = (BigDecimal) pairD13.b;
                                        Pair pairD14 = d(e(bigDecimalValueOf16, bigDecimal3, c(bigDecimalValueOf16, bigDecimal3)), bigDecimal4);
                                        BigDecimal bigDecimal53 = (BigDecimal) pairD14.f46059a;
                                        BigDecimal bigDecimal54 = (BigDecimal) pairD14.b;
                                        Pair pairQ9 = q(bigDecimal49, bigDecimal4);
                                        strU = kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimalC7), false), "()", t(bigDecimal51), false), "()", t(bigDecimal52), false), "()", t(bigDecimal53), false), "()", t(bigDecimal54), false), "()", t((BigDecimal) pairQ9.f46059a), false), "()", t((BigDecimal) pairQ9.b), false);
                                    } else if (num.intValue() == 144) {
                                        Pair pairS44 = s(bigDecimal2);
                                        int iIntValue39 = ((Number) pairS44.f46059a).intValue();
                                        BigDecimal bigDecimalNegate4 = (BigDecimal) pairS44.b;
                                        if (iIntValue39 < 0) {
                                            bigDecimalNegate4 = bigDecimalNegate4.negate();
                                            bigDecimalNegate4.getClass();
                                        }
                                        strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(Math.abs(iIntValue39)), false), "()", p(bigDecimalNegate4, bigDecimal3), false);
                                    } else if (num.intValue() == 145) {
                                        strU = i(str, str5);
                                    } else if (num.intValue() == 146) {
                                        if (bigDecimal2 == null) {
                                            bigDecimal2 = BigDecimal.ZERO;
                                        }
                                        bigDecimal2.getClass();
                                        strU = i(kotlin.text.c.u(str, "()", Separators.LPAREN + a(bigDecimal2) + Separators.RPAREN, false), str5);
                                    } else if (num.intValue() == 147) {
                                        Pair pairS45 = s(bigDecimal2);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS45.f46059a).intValue()), false), "()", p((BigDecimal) pairS45.b, bigDecimal3), false), str5);
                                    } else if (num.intValue() == 148) {
                                        strU = i(n(str, bigDecimal), str5);
                                    } else if (num.intValue() == 149) {
                                        strU = i(o(str, bigDecimal), str5);
                                    } else if (num.intValue() == 150) {
                                        strU = i(str, str5);
                                    } else if (num.intValue() == 151) {
                                        strU = i(o(str, bigDecimal), str5);
                                    } else if (num.intValue() == 152) {
                                        strU = i(l(str, bigDecimal), str5);
                                    } else if (num.intValue() == 153) {
                                        strU = m(str, bigDecimal);
                                    } else if (num.intValue() == 154) {
                                        strU = i(m(str, bigDecimal), str5);
                                    } else if (num.intValue() == 155) {
                                        Pair pairS46 = s(bigDecimal2);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(((Number) pairS46.f46059a).intValue()), false), "()", p((BigDecimal) pairS46.b, new BigDecimal("1000000")), false), str5);
                                    } else if (num.intValue() == 156) {
                                        Pair pairS47 = s(bigDecimal2);
                                        int iIntValue40 = ((Number) pairS47.f46059a).intValue();
                                        BigDecimal bigDecimal55 = (BigDecimal) pairS47.b;
                                        BigDecimal bigDecimalValueOf17 = BigDecimal.valueOf(iIntValue40);
                                        bigDecimalValueOf17.getClass();
                                        Pair pairD15 = d(bigDecimalValueOf17, bigDecimal26);
                                        strU = i(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t((BigDecimal) pairD15.f46059a), false), "()", t((BigDecimal) pairD15.b), false), "()", p(bigDecimal55, bigDecimal26), false), str5);
                                    } else if (num.intValue() == 157) {
                                        Pair pairS48 = s(bigDecimal2);
                                        int iIntValue41 = ((Number) pairS48.f46059a).intValue();
                                        BigDecimal bigDecimal56 = (BigDecimal) pairS48.b;
                                        BigDecimal bigDecimalValueOf18 = BigDecimal.valueOf(iIntValue41);
                                        bigDecimalValueOf18.getClass();
                                        BigDecimal bigDecimal57 = d;
                                        BigDecimal bigDecimalC8 = c(bigDecimalValueOf18, bigDecimal57);
                                        BigDecimal bigDecimalDivide2 = bigDecimalValueOf18.subtract(bigDecimalC8.multiply(bigDecimal57)).divide(bigDecimal3);
                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                        BigDecimal scale4 = bigDecimalDivide2.setScale(0, roundingMode2);
                                        BigDecimal scale5 = bigDecimalValueOf18.subtract(bigDecimalC8.multiply(bigDecimal57)).subtract(scale4.multiply(bigDecimal3)).setScale(0, roundingMode2);
                                        BigDecimal scale6 = bigDecimal56.multiply(bigDecimal4).setScale(0, roundingMode2);
                                        BigDecimal scale7 = bigDecimal56.multiply(bigDecimal26).subtract(scale6.multiply(bigDecimal4)).setScale(0, roundingMode2);
                                        BigDecimal scale8 = bigDecimal56.multiply(new BigDecimal("10000000")).subtract(scale6.multiply(bigDecimal57)).subtract(scale7.multiply(bigDecimal3)).setScale(0, roundingMode2);
                                        String str7 = j(2).format(bigDecimalC8);
                                        str7.getClass();
                                        String strU10 = kotlin.text.c.u(str, "()", str7, false);
                                        String str8 = j(2).format(scale4);
                                        str8.getClass();
                                        String strU11 = kotlin.text.c.u(strU10, "()", str8, false);
                                        String str9 = j(3).format(scale5);
                                        str9.getClass();
                                        String strU12 = kotlin.text.c.u(strU11, "()", str9, false);
                                        String str10 = j(2).format(scale6);
                                        str10.getClass();
                                        String strU13 = kotlin.text.c.u(strU12, "()", str10, false);
                                        String str11 = j(2).format(scale7);
                                        str11.getClass();
                                        String strU14 = kotlin.text.c.u(strU13, "()", str11, false);
                                        String str12 = j(3).format(scale8);
                                        str12.getClass();
                                        strU = i(kotlin.text.c.u(strU14, "()", str12, false), str5);
                                    } else if (num.intValue() == 158) {
                                        Pair pairS49 = s(bigDecimal2);
                                        int iIntValue42 = ((Number) pairS49.f46059a).intValue();
                                        BigDecimal bigDecimal58 = (BigDecimal) pairS49.b;
                                        BigDecimal bigDecimalValueOf19 = BigDecimal.valueOf(iIntValue42);
                                        bigDecimalValueOf19.getClass();
                                        Pair pairD16 = d(bigDecimalValueOf19, bigDecimal4);
                                        BigDecimal bigDecimal59 = (BigDecimal) pairD16.f46059a;
                                        BigDecimal bigDecimal60 = (BigDecimal) pairD16.b;
                                        String str13 = j(2).format(bigDecimal59);
                                        str13.getClass();
                                        String strU15 = kotlin.text.c.u(str, "()", str13, false);
                                        String str14 = j(2).format(bigDecimal60);
                                        str14.getClass();
                                        String strU16 = kotlin.text.c.u(strU15, "()", str14, false);
                                        String str15 = j(3).format(bigDecimal58.multiply(bigDecimal26));
                                        str15.getClass();
                                        strU = i(kotlin.text.c.u(strU16, "()", str15, false), str5);
                                    } else if (num.intValue() == 159) {
                                        if (bigDecimal2 == null) {
                                            bigDecimal2 = BigDecimal.ZERO;
                                        }
                                        bigDecimal2.getClass();
                                        String strU17 = kotlin.text.c.u(str, "()", a(bigDecimal2), false);
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        strU = kotlin.text.c.u(strU17, "[]", str5, false);
                                    } else if (num.intValue() == 160) {
                                        Pair pairS50 = s(bigDecimal2);
                                        int iIntValue43 = ((Number) pairS50.f46059a).intValue();
                                        BigDecimal bigDecimal61 = (BigDecimal) pairS50.b;
                                        BigDecimal bigDecimalValueOf20 = BigDecimal.valueOf(iIntValue43);
                                        bigDecimalValueOf20.getClass();
                                        Pair pairD17 = d(bigDecimalValueOf20, bigDecimal3);
                                        BigDecimal bigDecimal62 = (BigDecimal) pairD17.f46059a;
                                        BigDecimal bigDecimal63 = (BigDecimal) pairD17.b;
                                        BigDecimal scale9 = bigDecimal61.multiply(bigDecimal3).setScale(0, RoundingMode.DOWN);
                                        BigDecimal bigDecimalMultiply3 = bigDecimal61.multiply(bigDecimal3).subtract(scale9).multiply(bigDecimal4);
                                        String strU18 = kotlin.text.c.u(kotlin.text.c.u(str, "()", t(bigDecimal62), false), "()", b(bigDecimal63.intValue(), 10), false);
                                        scale9.getClass();
                                        String strU19 = kotlin.text.c.u(strU18, "()", t(scale9), false);
                                        bigDecimalMultiply3.getClass();
                                        strU = kotlin.text.c.u(strU19, "()", a(bigDecimalMultiply3), false);
                                    }
                                }
                            }
                        }
                    }
                }
                strU = str;
            } catch (Exception e) {
                e.printStackTrace();
                return num + ": " + str;
            }
        } else {
            strU = str;
        }
        return "\u200e" + strU + "\u200e";
    }

    public static final String l(String str, BigDecimal bigDecimal) {
        Pair pairS = s(bigDecimal);
        int iIntValue = ((Number) pairS.f46059a).intValue();
        BigDecimal bigDecimal2 = (BigDecimal) pairS.b;
        long j = iIntValue;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal3 = b;
        BigDecimal bigDecimalC = c(bigDecimalValueOf, bigDecimal3);
        BigDecimal bigDecimalDivide = bigDecimalC.divide(BigDecimal.TEN);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j);
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalSubtract = bigDecimalValueOf2.divide(bigDecimal3).subtract(bigDecimalC);
        BigDecimal bigDecimal4 = f45035a;
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimal4);
        bigDecimalDivide.getClass();
        String strU = kotlin.text.c.u(str, "()", a(bigDecimalDivide), false);
        bigDecimalMultiply.getClass();
        return kotlin.text.c.u(kotlin.text.c.u(strU, "()", a(bigDecimalMultiply), false), "()", p(bigDecimal2, bigDecimal4), false);
    }

    public static final String m(String str, BigDecimal bigDecimal) {
        Pair pairS = s(bigDecimal);
        int iIntValue = ((Number) pairS.f46059a).intValue();
        BigDecimal bigDecimal2 = (BigDecimal) pairS.b;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iIntValue);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal3 = b;
        Pair pairD = d(bigDecimalValueOf, bigDecimal3);
        return kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", t((BigDecimal) pairD.f46059a), false), "()", t((BigDecimal) pairD.b), false), "()", r(bigDecimal2, bigDecimal3), false);
    }

    public static final String n(String str, BigDecimal bigDecimal) {
        Pair pairS = s(bigDecimal);
        int iIntValue = ((Number) pairS.f46059a).intValue();
        BigDecimal bigDecimal2 = (BigDecimal) pairS.b;
        int i = iIntValue / 100;
        BigDecimal bigDecimal3 = f45035a;
        String strF = f(iIntValue, i, bigDecimal3);
        BigDecimal scale = bigDecimal2.multiply(bigDecimal3).setScale(0, RoundingMode.DOWN);
        String strValueOf = String.valueOf(bigDecimal2.multiply(bigDecimal3).subtract(scale).multiply(bigDecimal3).intValue());
        String strU = kotlin.text.c.u(kotlin.text.c.u(str, "()", String.valueOf(i), false), "()", strF, false);
        scale.getClass();
        return kotlin.text.c.u(kotlin.text.c.u(strU, "()", String.valueOf(scale.intValue()), false), "()", strValueOf, false);
    }

    public static final String o(String str, BigDecimal bigDecimal) {
        Pair pairS = s(bigDecimal);
        int iIntValue = ((Number) pairS.f46059a).intValue();
        BigDecimal bigDecimal2 = (BigDecimal) pairS.b;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iIntValue);
        bigDecimalValueOf.getClass();
        Pair pairD = d(bigDecimalValueOf, c);
        BigDecimal bigDecimal3 = (BigDecimal) pairD.f46059a;
        BigDecimal bigDecimal4 = (BigDecimal) pairD.b;
        BigDecimal bigDecimal5 = f45035a;
        Pair pairD2 = d(bigDecimal4, bigDecimal5);
        BigDecimal bigDecimal6 = (BigDecimal) pairD2.f46059a;
        BigDecimal bigDecimal7 = (BigDecimal) pairD2.b;
        Pair pairQ = q(bigDecimal2, bigDecimal5);
        BigDecimal bigDecimal8 = (BigDecimal) pairQ.f46059a;
        BigDecimal bigDecimal9 = (BigDecimal) pairQ.b;
        BigDecimal bigDecimalDivide = bigDecimal3.divide(BigDecimal.TEN);
        bigDecimalDivide.getClass();
        return kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(kotlin.text.c.u(str, "()", a(bigDecimalDivide), false), "()", t(bigDecimal6), false), "()", t(bigDecimal7), false), "()", t(bigDecimal8), false), "()", t(bigDecimal9), false);
    }

    public static String p(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        bigDecimal3.getClass();
        BigDecimal bigDecimalAdd = bigDecimal.multiply(bigDecimal2).add(bigDecimal3);
        bigDecimalAdd.getClass();
        return a(bigDecimalAdd);
    }

    public static final Pair q(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimalMultiply.setScale(0, roundingMode);
        return new Pair(scale, bigDecimal.multiply(bigDecimal2).subtract(scale).multiply(bigDecimal2).setScale(0, roundingMode));
    }

    public static final String r(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String string = bigDecimal.multiply(bigDecimal2).setScale(0, RoundingMode.HALF_EVEN).toString();
        string.getClass();
        return string;
    }

    public static final Pair s(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return new Pair(0, BigDecimal.ZERO);
        }
        int iIntValue = bigDecimal.intValue();
        return new Pair(Integer.valueOf(iIntValue), bigDecimal.subtract(new BigDecimal(iIntValue)).abs());
    }

    public static final String t(BigDecimal bigDecimal) {
        return String.valueOf(bigDecimal.intValue());
    }
}
