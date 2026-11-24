package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14357a;

    public i8t0(int i) {
        this.f14357a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8t0) && this.f14357a == ((i8t0) obj).f14357a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14357a);
    }

    public final String toString() {
        return ua80.e(this.f14357a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
