package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26821a;

    public pds(int i) {
        this.f26821a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pds) && this.f26821a == ((pds) obj).f26821a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26821a);
    }

    public final String toString() {
        return ua80.e(this.f26821a, "TeamPairTwoFirstPlayerFavoriteChanged(teamPairTwoFirstPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
