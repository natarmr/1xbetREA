package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3037a;
    public final int b;
    public final cql0 c;

    public bql0(long j, int i, cql0 cql0Var) {
        this.f3037a = j;
        this.b = i;
        this.c = cql0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bql0)) {
            return false;
        }
        bql0 bql0Var = (bql0) obj;
        return this.f3037a == bql0Var.f3037a && this.b == bql0Var.b && this.c == bql0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f3037a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f3037a, "SportTab(sportId=", ", position=");
        sbQ.append(", type=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
