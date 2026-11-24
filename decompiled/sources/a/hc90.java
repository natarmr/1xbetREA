package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hc90 implements mc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12810a;

    public /* synthetic */ hc90(int i) {
        this.f12810a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hc90) {
            return this.f12810a == ((hc90) obj).f12810a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12810a);
    }

    public final String toString() {
        return ua80.e(this.f12810a, "PenaltyHappened(drawableRes=", Separators.RPAREN);
    }
}
