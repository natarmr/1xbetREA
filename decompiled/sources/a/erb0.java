package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class erb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8272a;
    public final String b;
    public final double c;
    public final double d;

    public erb0(double d, double d2, String str, String str2) {
        str2.getClass();
        this.f8272a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erb0)) {
            return false;
        }
        erb0 erb0Var = (erb0) obj;
        return this.f8272a.equals(erb0Var.f8272a) && Intrinsics.d(this.b, erb0Var.b) && Double.compare(this.c, erb0Var.c) == 0 && Double.compare(this.d, erb0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + brm0.d(this.c, ua80.b(this.f8272a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PowerbetMarketModel(marketName=", this.f8272a, ", coefficient=", this.b, ", stake=");
        sbN.append(this.c);
        return brm0.m(sbN, this.d, ", possibleWin=", Separators.RPAREN);
    }
}
