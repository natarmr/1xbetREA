package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qes extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28598a;

    public qes(int i) {
        this.f28598a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qes) && this.f28598a == ((qes) obj).f28598a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28598a);
    }

    public final String toString() {
        return ua80.e(this.f28598a, "TeamOneFavoriteChanged(teamOneFavoriteDrawRes=", Separators.RPAREN);
    }
}
