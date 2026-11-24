package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tqf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34378a;

    public final boolean equals(Object obj) {
        if (obj instanceof tqf) {
            return this.f34378a == ((tqf) obj).f34378a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34378a);
    }

    public final String toString() {
        return ua80.e(this.f34378a, "ColorRoundStatsIndicator(value=", Separators.RPAREN);
    }
}
