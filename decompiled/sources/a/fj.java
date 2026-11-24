package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fj extends hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9612a;

    public fj(int i) {
        this.f9612a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fj) && this.f9612a == ((fj) obj).f9612a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9612a);
    }

    public final String toString() {
        return ua80.e(this.f9612a, "ShowFavoriteError(message=", Separators.RPAREN);
    }
}
