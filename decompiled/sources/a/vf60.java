package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37317a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;

    public vf60(String str, String str2, String str3, double d, double d2) {
        brm0.B(str, str2, str3);
        this.f37317a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf60)) {
            return false;
        }
        vf60 vf60Var = (vf60) obj;
        return Intrinsics.d(this.f37317a, vf60Var.f37317a) && Intrinsics.d(this.b, vf60Var.b) && Intrinsics.d(this.c, vf60Var.c) && Double.compare(this.d, vf60Var.d) == 0 && Double.compare(this.e, vf60Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + brm0.d(this.d, ua80.b(ua80.b(this.f37317a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OldMarketModel(marketName=", this.f37317a, ", coefString=", this.b, ", viewCoefString=");
        hne.A(sbN, this.c, ", stake=", this.d);
        return brm0.m(sbN, this.e, ", possibleWin=", Separators.RPAREN);
    }
}
