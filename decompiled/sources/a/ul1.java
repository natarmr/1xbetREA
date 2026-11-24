package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ul1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35852a;
    public final int b;
    public final long c;

    public ul1(int i, long j, long j2) {
        rj1 rj1Var = rj1.f30569a;
        this.f35852a = j;
        this.b = i;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul1)) {
            return false;
        }
        ul1 ul1Var = (ul1) obj;
        if (this.f35852a != ul1Var.f35852a || this.b != ul1Var.b || this.c != ul1Var.c) {
            return false;
        }
        rj1 rj1Var = rj1.f30569a;
        return true;
    }

    public final int hashCode() {
        return rj1.b.hashCode() + brm0.e(rw2.b(twn.a(this.b, Long.hashCode(this.f35852a) * 31, 31), 31, this.c), 31, false);
    }

    public final String toString() {
        rj1 rj1Var = rj1.b;
        StringBuilder sbQ = brm0.q(this.b, this.f35852a, "AggregatorPublishersScreen(partitionId=", ", bonusId=");
        kng0.A(sbQ, ", accountId=", this.c, ", showFavorites=false, openedFromType=");
        sbQ.append(rj1Var);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
