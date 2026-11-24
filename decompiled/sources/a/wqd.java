package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f39585a;
    public final String b;
    public final double c;
    public final double d;
    public final double e;

    public wqd(double d, String str, double d2, double d3, double d4) {
        this.f39585a = d;
        this.b = str;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqd)) {
            return false;
        }
        wqd wqdVar = (wqd) obj;
        return Double.compare(this.f39585a, wqdVar.f39585a) == 0 && this.b.equals(wqdVar.b) && Double.compare(this.c, wqdVar.c) == 0 && Double.compare(this.d, wqdVar.d) == 0 && Double.compare(this.e, wqdVar.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + brm0.d(this.d, brm0.d(this.c, ua80.b(Double.hashCode(this.f39585a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("Amount(minAmountOperation=", this.f39585a, ", currency=", this.b);
        ohs0.A(sbS, this.c, ", percentCompleted=", ", currentAmount=");
        sbS.append(this.d);
        return brm0.m(sbS, this.e, ", necessaryAmount=", Separators.RPAREN);
    }
}
