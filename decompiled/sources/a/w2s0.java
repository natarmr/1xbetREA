package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38467a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public w2s0(long j, long j2, boolean z, boolean z2) {
        this.f38467a = j;
        this.b = z;
        this.c = j2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2s0)) {
            return false;
        }
        w2s0 w2s0Var = (w2s0) obj;
        return this.f38467a == w2s0Var.f38467a && this.b == w2s0Var.b && this.c == w2s0Var.c && this.d == w2s0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.b(brm0.e(Long.hashCode(this.f38467a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f38467a, "TournamentPersonalInfoModel(id=", ", meParticipating=", this.b);
        kng0.A(sbR, ", crmParticipantCurrentStage=", this.c, ", blocked=");
        return rw2.p(sbR, this.d, Separators.RPAREN);
    }
}
