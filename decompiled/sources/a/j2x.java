package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j2x implements k2x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15803a;

    public j2x(int i) {
        this.f15803a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2x) && this.f15803a == ((j2x) obj).f15803a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15803a);
    }

    public final String toString() {
        return ua80.e(this.f15803a, "RoundedCorners(roundingRadius=", Separators.RPAREN);
    }
}
