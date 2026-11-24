package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wkp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39318a;

    public final boolean equals(Object obj) {
        if (obj instanceof wkp) {
            return this.f39318a == ((wkp) obj).f39318a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39318a);
    }

    public final String toString() {
        return ua80.e(this.f39318a, "GamesCount(value=", Separators.RPAREN);
    }
}
