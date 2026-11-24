package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o8n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24839a;
    public final boolean b;
    public final long c;

    public o8n0(long j, boolean z, long j2) {
        this.f24839a = j;
        this.b = z;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8n0)) {
            return false;
        }
        o8n0 o8n0Var = (o8n0) obj;
        return this.f24839a == o8n0Var.f24839a && this.b == o8n0Var.b && this.c == o8n0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(Long.hashCode(this.f24839a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(kng0.r(this.f24839a, "SubscriptionPendingTeamModel(teamId=", ", adding=", this.b), this.c, ", lockTimestamp=", Separators.RPAREN);
    }
}
