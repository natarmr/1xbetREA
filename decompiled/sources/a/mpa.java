package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mpa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22168a;

    public mpa(int i) {
        this.f22168a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpa) && this.f22168a == ((mpa) obj).f22168a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22168a);
    }

    public final String toString() {
        return ua80.e(this.f22168a, "TeamOneFavouriteStateChanged(teamOneFavoriteDrawRes=", Separators.RPAREN);
    }
}
