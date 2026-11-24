package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3958a;
    public final String b;

    public c9e0(String str, String str2) {
        this.f3958a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9e0)) {
            return false;
        }
        c9e0 c9e0Var = (c9e0) obj;
        return this.f3958a.equals(c9e0Var.f3958a) && this.b.equals(c9e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3958a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("RatingTournamentModel(tournamentId=", this.f3958a, ", tournamentName=", this.b, Separators.RPAREN);
    }
}
