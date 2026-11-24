package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ki6 implements qi6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18322a;
    public final long b;
    public final double c;

    public ki6(double d, long j, long j2) {
        this.f18322a = j;
        this.b = j2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki6)) {
            return false;
        }
        ki6 ki6Var = (ki6) obj;
        return this.f18322a == ki6Var.f18322a && this.b == ki6Var.b && Double.compare(this.c, ki6Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + rw2.b(Long.hashCode(this.f18322a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f18322a, "BetChoiceClick(eventBetId=", ", groupId=");
        sbQ.append(this.b);
        return brm0.m(sbQ, this.c, ", param=", Separators.RPAREN);
    }
}
