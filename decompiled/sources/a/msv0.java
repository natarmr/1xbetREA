package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class msv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22342a;

    public msv0(float f) {
        this.f22342a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msv0) && ycl.b(this.f22342a, ((msv0) obj).f22342a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f22342a);
    }

    public final String toString() {
        return kng0.l("XBottomSheetBehavior(maxBounceDistance=", ycl.c(this.f22342a), Separators.RPAREN);
    }
}
