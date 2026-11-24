package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25004a;
    public final long b;
    public final int c;
    public final boolean d;
    public final int e;

    public oc0(long j, long j2, int i, boolean z, int i2) {
        this.f25004a = j;
        this.b = j2;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc0)) {
            return false;
        }
        oc0 oc0Var = (oc0) obj;
        return this.f25004a == oc0Var.f25004a && this.b == oc0Var.b && this.c == oc0Var.c && this.d == oc0Var.d && this.e == oc0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e(twn.a(this.c, rw2.b(Long.hashCode(this.f25004a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25004a, "AggregatorBetHistoryModel(timeFrom=", ", timeTo=");
        ua80.v(sbQ, this.b, ", typeGame=", this.c);
        cs0.v(this.e, ", possibleGainEnabled=", ", aggregatorHistoryType=", sbQ, this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
