package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vfj implements xfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37335a;

    public vfj(long j) {
        this.f37335a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfj) && this.f37335a == ((vfj) obj).f37335a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37335a);
    }

    public final String toString() {
        return axq.h(this.f37335a, "OnOpenBottomSheetDayExpressCardClick(eventId=", Separators.RPAREN);
    }
}
