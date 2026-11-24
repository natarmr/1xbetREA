package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cw80 {
    public static final bw80 Companion = new bw80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5069a;

    public /* synthetic */ cw80(int i, long j) {
        if (1 == (i & 1)) {
            this.f5069a = j;
        } else {
            m2x.I(i, 1, aw80.f1561a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw80) && this.f5069a == ((cw80) obj).f5069a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5069a);
    }

    public final String toString() {
        return axq.h(this.f5069a, "ParticipateTournamentRequest(tournamentId=", Separators.RPAREN);
    }

    public cw80(long j) {
        this.f5069a = j;
    }
}
