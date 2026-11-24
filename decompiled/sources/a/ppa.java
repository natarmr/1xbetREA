package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ppa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27367a;

    public ppa(int i) {
        this.f27367a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppa) && this.f27367a == ((ppa) obj).f27367a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27367a);
    }

    public final String toString() {
        return ua80.e(this.f27367a, "TeamTwoFavouriteStateChanged(teamTwoFavoriteDrawRes=", Separators.RPAREN);
    }
}
