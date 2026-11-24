package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gc90 extends lc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11048a;

    public gc90(int i) {
        this.f11048a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc90) && this.f11048a == ((gc90) obj).f11048a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11048a);
    }

    public final String toString() {
        return ua80.e(this.f11048a, "PenaltyHappened(drawableRes=", Separators.RPAREN);
    }
}
