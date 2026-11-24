package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30304a;

    public rds(int i) {
        this.f30304a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rds) && this.f30304a == ((rds) obj).f30304a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30304a);
    }

    public final String toString() {
        return ua80.e(this.f30304a, "TeamTwoFavoriteChanged(teamTwoFavoriteDrawRes=", Separators.RPAREN);
    }
}
