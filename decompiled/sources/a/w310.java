package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38477a;
    public final a410 b;
    public final x310 c;
    public final int d;

    public w310(long j, a410 a410Var, x310 x310Var, int i) {
        this.f38477a = j;
        this.b = a410Var;
        this.c = x310Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w310)) {
            return false;
        }
        w310 w310Var = (w310) obj;
        return this.f38477a == w310Var.f38477a && this.b == w310Var.b && this.c == w310Var.c && this.d == w310Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f38477a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LolStatisticMatchesMatchObjectKillsModel(teamId=" + this.f38477a + ", objectType=" + this.b + ", objectSubType=" + this.c + ", timeSeconds=" + this.d + Separators.RPAREN;
    }
}
