package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yrp implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43132a;
    public final int b;

    public yrp(long j, int i) {
        this.f43132a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrp)) {
            return false;
        }
        yrp yrpVar = (yrp) obj;
        return this.f43132a == yrpVar.f43132a && this.b == yrpVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f43132a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f43132a, "FifaModel(tournamentId=", ", iteration=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
