package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2127a;
    public final int b;

    public b7v0(long j, int i) {
        this.f2127a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7v0)) {
            return false;
        }
        b7v0 b7v0Var = (b7v0) obj;
        return this.f2127a == b7v0Var.f2127a && this.b == b7v0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f2127a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f2127a, "ShowTime(milliseconds=", ", position=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
