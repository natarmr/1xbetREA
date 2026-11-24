package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dfs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6014a;

    public dfs(int i) {
        this.f6014a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfs) && this.f6014a == ((dfs) obj).f6014a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6014a);
    }

    public final String toString() {
        return ua80.e(this.f6014a, "TeamOneFavouriteChanged(teamOneFavoriteDrawRes=", Separators.RPAREN);
    }
}
