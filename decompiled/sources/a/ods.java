package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ods extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25091a;

    public ods(int i) {
        this.f25091a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ods) && this.f25091a == ((ods) obj).f25091a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25091a);
    }

    public final String toString() {
        return ua80.e(this.f25091a, "TeamPairOneSecondPlayerFavoriteChanged(teamPairOneSecondPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
