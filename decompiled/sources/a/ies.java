package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ies extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14649a;

    public ies(int i) {
        this.f14649a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ies) && this.f14649a == ((ies) obj).f14649a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14649a);
    }

    public final String toString() {
        return ua80.e(this.f14649a, "TeamTwoFavoriteChanged(teamTwoFavoriteDrawRes=", Separators.RPAREN);
    }
}
