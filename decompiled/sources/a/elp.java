package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class elp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8012a;

    public final boolean equals(Object obj) {
        if (obj instanceof elp) {
            return this.f8012a == ((elp) obj).f8012a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8012a);
    }

    public final String toString() {
        return ua80.e(this.f8012a, "GamesCount(value=", Separators.RPAREN);
    }
}
