package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28549a;

    public qds(int i) {
        this.f28549a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qds) && this.f28549a == ((qds) obj).f28549a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28549a);
    }

    public final String toString() {
        return ua80.e(this.f28549a, "TeamPairTwoSecondPlayerFavoriteChanged(teamPairTwoSecondPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
