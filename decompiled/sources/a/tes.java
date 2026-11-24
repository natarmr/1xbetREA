package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tes extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33836a;

    public tes(int i) {
        this.f33836a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tes) && this.f33836a == ((tes) obj).f33836a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33836a);
    }

    public final String toString() {
        return ua80.e(this.f33836a, "TeamTwoFavoriteChanged(teamTwoFavoriteDrawRes=", Separators.RPAREN);
    }
}
