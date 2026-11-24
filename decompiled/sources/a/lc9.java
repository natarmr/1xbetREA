package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class lc9 implements oc9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19789a;

    public lc9(long j) {
        this.f19789a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc9) && this.f19789a == ((lc9) obj).f19789a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19789a);
    }

    public final String toString() {
        return axq.h(this.f19789a, "OnCancelMarketClick(builderId=", Separators.RPAREN);
    }
}
