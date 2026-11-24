package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15566a;

    public final boolean equals(Object obj) {
        if (obj instanceof iy00) {
            return this.f15566a == ((iy00) obj).f15566a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15566a);
    }

    public final String toString() {
        return ua80.e(this.f15566a, "OnBanPicksCount(value=", Separators.RPAREN);
    }
}
