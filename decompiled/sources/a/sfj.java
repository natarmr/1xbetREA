package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sfj implements xfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32120a;

    public sfj(long j) {
        this.f32120a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfj) && this.f32120a == ((sfj) obj).f32120a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32120a);
    }

    public final String toString() {
        return axq.h(this.f32120a, "OnAddExpressEventsToCouponClick(eventId=", Separators.RPAREN);
    }
}
