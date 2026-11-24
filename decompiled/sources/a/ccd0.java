package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ccd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4105a;

    public ccd0(int i) {
        this.f4105a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccd0) && this.f4105a == ((ccd0) obj).f4105a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4105a);
    }

    public final String toString() {
        return ua80.e(this.f4105a, "PromoGroup(bannerIdToOpen=", Separators.RPAREN);
    }
}
