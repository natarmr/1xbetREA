package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class icw implements scw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14555a;

    public icw(int i) {
        this.f14555a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icw) && this.f14555a == ((icw) obj).f14555a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14555a);
    }

    public final String toString() {
        return ua80.e(this.f14555a, "OnAnotherAwardsBannerClick(bannerId=", Separators.RPAREN);
    }
}
