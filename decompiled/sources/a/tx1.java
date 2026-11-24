package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tx1 implements by1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34676a;
    public final boolean b;

    public tx1(boolean z, long j) {
        this.f34676a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return this.f34676a == tx1Var.f34676a && this.b == tx1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f34676a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f34676a, "OnParticipateClick(tournamentId=", ", blocked=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
