package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ihw0 implements jlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f14801a;

    public ihw0(Double d) {
        if (d == null) {
            this.f14801a = Double.valueOf(Double.NaN);
        } else {
            this.f14801a = d;
        }
    }

    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new slw0(zzc());
        }
        jf4.o(kng0.m(zzc(), Separators.DOT, str, " is not a function."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihw0) {
            return this.f14801a.equals(((ihw0) obj).f14801a);
        }
        return false;
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return new ihw0(this.f14801a);
    }

    public final int hashCode() {
        return this.f14801a.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // a.jlw0
    public final String zzc() {
        Double d = this.f14801a;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf(TokenNames.E);
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace(TokenNames.E, "e+") : bigDecimal.toPlainString();
    }

    @Override // a.jlw0
    public final Double zzd() {
        return this.f14801a;
    }

    @Override // a.jlw0
    public final Boolean zze() {
        Double d = this.f14801a;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return null;
    }
}
