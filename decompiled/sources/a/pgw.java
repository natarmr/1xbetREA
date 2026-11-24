package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pgw implements vhw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26970a;

    public pgw(long j) {
        this.f26970a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgw) && this.f26970a == ((pgw) obj).f26970a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26970a);
    }

    public final String toString() {
        return axq.h(this.f26970a, "OnBannerClick(bannerId=", Separators.RPAREN);
    }
}
