package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ri50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30523a;
    public final String b;

    public ri50(String str, String str2) {
        this.f30523a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri50)) {
            return false;
        }
        ri50 ri50Var = (ri50) obj;
        return this.f30523a.equals(ri50Var.f30523a) && this.b.equals(ri50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30523a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("NearestGameDetailsWicketScoreModel(teamOneScore=", this.f30523a, ", teamTwoScore=", this.b, Separators.RPAREN);
    }
}
