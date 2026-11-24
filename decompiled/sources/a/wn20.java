package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wn20 implements xn20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39428a;
    public final long b;
    public final double c;
    public final String d;
    public final double e;
    public final String f;
    public final boolean g;

    public wn20(String str, long j, double d, String str2, double d2, String str3, boolean z) {
        str3.getClass();
        this.f39428a = str;
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
        if (!(obj instanceof wn20)) {
            return false;
        }
        wn20 wn20Var = (wn20) obj;
        return this.f39428a.equals(wn20Var.f39428a) && this.b == wn20Var.b && Double.compare(this.c, wn20Var.c) == 0 && this.d.equals(wn20Var.d) && Double.compare(this.e, wn20Var.e) == 0 && Intrinsics.d(this.f, wn20Var.f) && this.g == wn20Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.d(this.e, ua80.b(brm0.d(this.c, rw2.b(this.f39428a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Success(data=", this.f39428a, ", balanceId=");
        ohs0.A(sbO, this.c, ", betSum=", ", betCoefficient=");
        hne.A(sbO, this.d, ", possibleWin=", this.e);
        w6x.z(", symbol=", this.f, ", isAvailablePossibleWinTax=", sbO, this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
