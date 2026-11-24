package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33170a;

    public final boolean equals(Object obj) {
        if (obj instanceof t1k) {
            return this.f33170a.equals(((t1k) obj).f33170a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33170a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnWinBackBannerShown(winBackAnalytics=", this.f33170a, Separators.RPAREN);
    }
}
