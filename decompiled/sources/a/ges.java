package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ges extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11170a;

    public ges(int i) {
        this.f11170a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ges) && this.f11170a == ((ges) obj).f11170a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11170a);
    }

    public final String toString() {
        return ua80.e(this.f11170a, "TeamPairTwoFirstPlayerFavoriteChanged(teamPairTwoFirstPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
