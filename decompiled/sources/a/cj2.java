package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cj2 implements dj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4440a;
    public final boolean b;

    public cj2(boolean z, long j) {
        this.f4440a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj2)) {
            return false;
        }
        cj2 cj2Var = (cj2) obj;
        return this.f4440a == cj2Var.f4440a && this.b == cj2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f4440a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f4440a, "OnTournamentClick(id=", ", favorite=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
