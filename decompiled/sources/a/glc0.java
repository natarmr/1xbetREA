package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class glc0 implements klc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11485a;

    public final boolean equals(Object obj) {
        if (obj instanceof glc0) {
            return this.f11485a == ((glc0) obj).f11485a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11485a);
    }

    public final String toString() {
        return ua80.e(this.f11485a, "GiftsCount(count=", Separators.RPAREN);
    }
}
