package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ees extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7687a;

    public ees(int i) {
        this.f7687a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ees) && this.f7687a == ((ees) obj).f7687a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7687a);
    }

    public final String toString() {
        return ua80.e(this.f7687a, "TeamPairOneFirstPlayerFavoriteChanged(teamPairOneFirstPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
