package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23350a;

    public nds(int i) {
        this.f23350a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nds) && this.f23350a == ((nds) obj).f23350a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23350a);
    }

    public final String toString() {
        return ua80.e(this.f23350a, "TeamPairOneFirstPlayerFavoriteChanged(teamPairOneFirstPlayerFavoriteDrawRes=", Separators.RPAREN);
    }
}
