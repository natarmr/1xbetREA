package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ez9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8661a;

    public final boolean equals(Object obj) {
        if (obj instanceof ez9) {
            return this.f8661a == ((ez9) obj).f8661a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8661a);
    }

    public final String toString() {
        return ua80.e(this.f8661a, "CameraFacingSelector(selector=", Separators.RPAREN);
    }
}
