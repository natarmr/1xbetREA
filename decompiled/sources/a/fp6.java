package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fp6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9913a;
    public final long b;
    public final double c;
    public final String d;
    public final double e;
    public final String f;
    public final boolean g;

    public fp6(String str, long j, double d, String str2, double d2, String str3, boolean z) {
        str3.getClass();
        this.f9913a = str;
        this.b = j;
        this.c = d;
        this.d = str2;
        this.e = d2;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp6)) {
            return false;
        }
        fp6 fp6Var = (fp6) obj;
        return this.f9913a.equals(fp6Var.f9913a) && this.b == fp6Var.b && Double.compare(this.c, fp6Var.c) == 0 && this.d.equals(fp6Var.d) && Double.compare(this.e, fp6Var.e) == 0 && Intrinsics.d(this.f, fp6Var.f) && this.g == fp6Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.d(this.e, ua80.b(brm0.d(this.c, rw2.b(this.f9913a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ShowSuccessBet(betId=", this.f9913a, ", balanceId=");
        ohs0.A(sbO, this.c, ", betSum=", ", betCoefficient=");
        hne.A(sbO, this.d, ", possibleWin=", this.e);
        w6x.z(", symbol=", this.f, ", isAvailablePossibleWinTax=", sbO, this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
