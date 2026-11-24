package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class frb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10011a;
    public final String b;
    public final double c;
    public final double d;

    public frb0(double d, double d2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10011a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frb0)) {
            return false;
        }
        frb0 frb0Var = (frb0) obj;
        return Intrinsics.d(this.f10011a, frb0Var.f10011a) && Intrinsics.d(this.b, frb0Var.b) && Double.compare(this.c, frb0Var.c) == 0 && Double.compare(this.d, frb0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, ua80.b(this.f10011a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PowerbetMarketUiModel(marketName=", this.f10011a, ", coefficient=", this.b, ", stake=");
        sbN.append(this.c);
        return brm0.m(sbN, this.d, ", possibleWin=", Separators.RPAREN);
    }
}
