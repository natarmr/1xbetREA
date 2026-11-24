package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class sgt implements vgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32178a;

    public final boolean equals(Object obj) {
        if (obj instanceof sgt) {
            return this.f32178a == ((sgt) obj).f32178a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32178a);
    }

    public final String toString() {
        return ua80.e(this.f32178a, "OnTypeSelectionClick(couponId=", Separators.RPAREN);
    }
}
