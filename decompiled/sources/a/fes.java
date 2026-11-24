package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9419a;

    public fes(int i) {
        this.f9419a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fes) && this.f9419a == ((fes) obj).f9419a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9419a);
    }

    public final String toString() {
        return ua80.e(this.f9419a, "TeamPairOneSecondPlayerFavoriteChanged(teamPairOneSecondPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
