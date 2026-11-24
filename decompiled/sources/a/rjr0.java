package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class rjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f30610a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public rjr0(a8q0 a8q0Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, boolean z, boolean z2) {
        this.f30610a = a8q0Var;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = bigDecimal3;
        this.e = bigDecimal4;
        this.f = str;
        this.g = z;
        this.h = z2;
    }

    public static rjr0 a(rjr0 rjr0Var, a8q0 a8q0Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            a8q0Var = rjr0Var.f30610a;
        }
        a8q0 a8q0Var2 = a8q0Var;
        if ((i & 2) != 0) {
            bigDecimal = rjr0Var.b;
        }
        BigDecimal bigDecimal5 = bigDecimal;
        if ((i & 4) != 0) {
            bigDecimal2 = rjr0Var.c;
        }
        BigDecimal bigDecimal6 = bigDecimal2;
        if ((i & 8) != 0) {
            bigDecimal3 = rjr0Var.d;
        }
        BigDecimal bigDecimal7 = bigDecimal3;
        if ((i & 16) != 0) {
            bigDecimal4 = rjr0Var.e;
        }
        BigDecimal bigDecimal8 = bigDecimal4;
        if ((i & 32) != 0) {
            str = rjr0Var.f;
        }
        String str2 = str;
        boolean z3 = (i & 64) != 0 ? rjr0Var.g : z;
        boolean z4 = (i & 128) != 0 ? rjr0Var.h : z2;
        rjr0Var.getClass();
        bigDecimal5.getClass();
        str2.getClass();
        return new rjr0(a8q0Var2, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, str2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjr0)) {
            return false;
        }
        rjr0 rjr0Var = (rjr0) obj;
        return this.f30610a.equals(rjr0Var.f30610a) && this.b.equals(rjr0Var.b) && this.c.equals(rjr0Var.c) && this.d.equals(rjr0Var.d) && this.e.equals(rjr0Var.e) && this.f.equals(rjr0Var.f) && this.g == rjr0Var.g && this.h == rjr0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(ua80.b(axq.a(axq.a(axq.a(axq.a(this.f30610a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoBetFieldState(textFieldValue=");
        sb.append(this.f30610a);
        sb.append(", curBetSumValue=");
        sb.append(this.b);
        sb.append(", changeStepValue=");
        sb.append(this.c);
        sb.append(", minBetSum=");
        sb.append(this.d);
        sb.append(", maxBetSum=");
        sb.append(this.e);
        sb.append(", currencySymbol=");
        sb.append(this.f);
        sb.append(", isNeedResetOnFocus=");
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.g, this.h);
    }
}
