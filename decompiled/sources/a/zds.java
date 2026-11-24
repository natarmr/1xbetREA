package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zds extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44222a;

    public zds(int i) {
        this.f44222a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zds) && this.f44222a == ((zds) obj).f44222a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44222a);
    }

    public final String toString() {
        return ua80.e(this.f44222a, "TeamOneFavoriteChanged(teamOneFavoriteDrawRes=", Separators.RPAREN);
    }
}
