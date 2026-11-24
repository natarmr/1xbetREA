package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yd20 implements zd20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42413a;
    public final long b;
    public final double c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public yd20(double d, long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        str4.getClass();
        str5.getClass();
        this.f42413a = str;
        this.b = j;
        this.c = d;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd20)) {
            return false;
        }
        yd20 yd20Var = (yd20) obj;
        return this.f42413a.equals(yd20Var.f42413a) && this.b == yd20Var.b && Double.compare(this.c, yd20Var.c) == 0 && this.d.equals(yd20Var.d) && this.e.equals(yd20Var.e) && Intrinsics.d(this.f, yd20Var.f) && Intrinsics.d(this.g, yd20Var.g) && this.h == yd20Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(ua80.b(ua80.b(ua80.b(brm0.d(this.c, rw2.b(this.f42413a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "SuccessMakeBet(betId=", this.f42413a, ", balanceId=");
        ohs0.A(sbO, this.c, ", betSum=", ", betCoefficient=");
        f140.v(sbO, this.d, ", possibleWin=", this.e, ", possibleWinTitle=");
        f140.v(sbO, this.f, ", symbol=", this.g, ", isAvailablePossibleWinTax=");
        return rw2.p(sbO, this.h, Separators.RPAREN);
    }
}
