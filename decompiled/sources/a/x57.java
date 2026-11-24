package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x57 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40300a;
    public final int b;

    public x57(long j, int i) {
        this.f40300a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x57)) {
            return false;
        }
        x57 x57Var = (x57) obj;
        return this.f40300a == x57Var.f40300a && this.b == x57Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f40300a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f40300a, "ShowDatesPicker(startDate=", ", maxPeriod=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
