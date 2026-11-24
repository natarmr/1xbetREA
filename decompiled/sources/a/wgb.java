package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wgb implements ygb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39106a;

    public final boolean equals(Object obj) {
        if (obj instanceof wgb) {
            return this.f39106a == ((wgb) obj).f39106a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39106a);
    }

    public final String toString() {
        return ua80.e(this.f39106a, "CountGames(value=", Separators.RPAREN);
    }
}
