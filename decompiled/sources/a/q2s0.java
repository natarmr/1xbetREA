package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1s0 f28018a;

    public q2s0(r1s0 r1s0Var) {
        this.f28018a = r1s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2s0) && this.f28018a.equals(((q2s0) obj).f28018a);
    }

    public final int hashCode() {
        return this.f28018a.hashCode();
    }

    public final String toString() {
        return "TournamentModel(tournamentInfo=" + this.f28018a + Separators.RPAREN;
    }
}
