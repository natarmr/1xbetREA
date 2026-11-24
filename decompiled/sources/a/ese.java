package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ese implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8323a;

    public final boolean equals(Object obj) {
        if (obj instanceof ese) {
            return this.f8323a == ((ese) obj).f8323a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8323a);
    }

    public final String toString() {
        return ua80.e(this.f8323a, "MarketStyle(value=", Separators.RPAREN);
    }
}
