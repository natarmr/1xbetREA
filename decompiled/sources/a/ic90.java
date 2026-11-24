package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ic90 implements nc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14525a;

    public final boolean equals(Object obj) {
        if (obj instanceof ic90) {
            return this.f14525a == ((ic90) obj).f14525a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14525a);
    }

    public final String toString() {
        return ua80.e(this.f14525a, "PenaltyHappened(drawableRes=", Separators.RPAREN);
    }
}
