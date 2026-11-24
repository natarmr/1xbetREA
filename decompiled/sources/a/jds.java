package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16343a;

    public jds(int i) {
        this.f16343a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jds) && this.f16343a == ((jds) obj).f16343a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16343a);
    }

    public final String toString() {
        return ua80.e(this.f16343a, "TeamOneFavoriteChanged(teamOneFavoriteDrawRes=", Separators.RPAREN);
    }
}
