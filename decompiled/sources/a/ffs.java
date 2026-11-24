package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ffs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9461a;

    public ffs(int i) {
        this.f9461a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffs) && this.f9461a == ((ffs) obj).f9461a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9461a);
    }

    public final String toString() {
        return ua80.e(this.f9461a, "TeamTwoFavouriteChanged(teamTwoFavoriteDrawRes=", Separators.RPAREN);
    }
}
