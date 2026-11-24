package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12937a;

    public hes(int i) {
        this.f12937a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hes) && this.f12937a == ((hes) obj).f12937a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12937a);
    }

    public final String toString() {
        return ua80.e(this.f12937a, "TeamPairTwoSecondPlayerFavoriteChanged(teamPairTwoSecondPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
