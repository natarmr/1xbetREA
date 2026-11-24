package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z42 implements b52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43747a;
    public final int b;

    public z42(long j, int i) {
        this.f43747a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z42)) {
            return false;
        }
        z42 z42Var = (z42) obj;
        return this.f43747a == z42Var.f43747a && this.b == z42Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f43747a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f43747a, "ShowDatePicker(startDate=", ", maxPeriod=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
