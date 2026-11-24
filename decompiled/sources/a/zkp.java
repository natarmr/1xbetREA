package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zkp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44543a;

    public final boolean equals(Object obj) {
        if (obj instanceof zkp) {
            return this.f44543a == ((zkp) obj).f44543a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44543a);
    }

    public final String toString() {
        return ua80.e(this.f44543a, "GamesCount(value=", Separators.RPAREN);
    }
}
