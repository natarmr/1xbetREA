package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class blp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2806a;

    public final boolean equals(Object obj) {
        if (obj instanceof blp) {
            return this.f2806a == ((blp) obj).f2806a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2806a);
    }

    public final String toString() {
        return ua80.e(this.f2806a, "GamesCount(value=", Separators.RPAREN);
    }
}
