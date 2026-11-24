package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9e0 f26296a;

    public p3e0(c9e0 c9e0Var) {
        this.f26296a = c9e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3e0) && this.f26296a.equals(((p3e0) obj).f26296a);
    }

    public final int hashCode() {
        return this.f26296a.hashCode();
    }

    public final String toString() {
        return "TournamentCell(ratingTournamentModel=" + this.f26296a + Separators.RPAREN;
    }
}
