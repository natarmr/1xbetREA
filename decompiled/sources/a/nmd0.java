package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nmd0 implements qmd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh7 f23766a;
    public final String b;
    public final int c;
    public final double d;
    public final long e;
    public final boolean f;
    public final String g;

    public nmd0(zh7 zh7Var, String str, int i, double d, long j, boolean z, String str2) {
        zh7Var.getClass();
        str.getClass();
        this.f23766a = zh7Var;
        this.b = str;
        this.c = i;
        this.d = d;
        this.e = j;
        this.f = z;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd0)) {
            return false;
        }
        nmd0 nmd0Var = (nmd0) obj;
        return Intrinsics.d(this.f23766a, nmd0Var.f23766a) && Intrinsics.d(this.b, nmd0Var.b) && this.c == nmd0Var.c && Double.compare(this.d, nmd0Var.d) == 0 && this.e == nmd0Var.e && this.f == nmd0Var.f && this.g.equals(nmd0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(rw2.b(brm0.d(this.d, twn.a(this.c, ua80.b(this.f23766a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowQuickBetSuccessAlert(betResult=");
        sb.append(this.f23766a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", potentialWinningTitle=");
        sb.append(this.c);
        sb.append(", potentialWinningSum=");
        sb.append(this.d);
        kng0.A(sb, ", balanceId=", this.e, ", isAvailablePossibleWinTax=");
        return twn.q(", optiCoef=", this.g, Separators.RPAREN, sb, this.f);
    }
}
