package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bi50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2643a;
    public final String b;

    public bi50(String str, String str2) {
        this.f2643a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi50)) {
            return false;
        }
        bi50 bi50Var = (bi50) obj;
        return this.f2643a.equals(bi50Var.f2643a) && this.b.equals(bi50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2643a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("NearestGameDetailsSubScoreModel(teamOneScore=", this.f2643a, ", teamTwoScore=", this.b, Separators.RPAREN);
    }
}
