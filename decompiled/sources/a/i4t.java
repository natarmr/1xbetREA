package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f14161a;

    /* JADX WARN: Multi-variable type inference failed */
    public i4t(int i) {
        this.f14161a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4t) && this.f14161a == ((i4t) obj).f14161a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14161a);
    }

    public final String toString() {
        return ua80.e(this.f14161a, "AggregatorLive(limit=", Separators.RPAREN);
    }
}
