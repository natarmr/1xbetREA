package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vf7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37318a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final double i;
    public final boolean j;

    public vf7(long j, double d, double d2, double d3, double d4, String str, boolean z, boolean z2, double d5, boolean z3) {
        str.getClass();
        this.f37318a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = d5;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf7)) {
            return false;
        }
        vf7 vf7Var = (vf7) obj;
        return this.f37318a == vf7Var.f37318a && Double.compare(this.b, vf7Var.b) == 0 && Double.compare(this.c, vf7Var.c) == 0 && Double.compare(this.d, vf7Var.d) == 0 && Double.compare(this.e, vf7Var.e) == 0 && Intrinsics.d(this.f, vf7Var.f) && this.g == vf7Var.g && Float.compare(1.01f, 1.01f) == 0 && this.h == vf7Var.h && Double.compare(this.i, vf7Var.i) == 0 && this.j == vf7Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + brm0.d(this.i, brm0.e(defpackage.c.a(brm0.e(ua80.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f37318a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 1.01f, 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f37318a, "BetLimitsModel(balanceId=", ", maxBetSum=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", minBetSum=", ", initialBet=");
        sbQ.append(this.d);
        ohs0.A(sbQ, this.e, ", betStep=", ", currencySymbol=");
        brm0.C(this.f, ", autoMaximum=", ", minCoefficient=1.01, unlimitedBet=", sbQ, this.g);
        sbQ.append(this.h);
        sbQ.append(", maxPayout=");
        sbQ.append(this.i);
        return f140.n(sbQ, ", negAsiaBetFlg=", this.j, Separators.RPAREN);
    }
}
