package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ov70 implements pv70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25912a;

    public ov70(int i) {
        this.f25912a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov70) && this.f25912a == ((ov70) obj).f25912a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25912a);
    }

    public final String toString() {
        return ua80.e(this.f25912a, "OnOpenBannerFromDeepLink(bannerId=", Separators.RPAREN);
    }
}
