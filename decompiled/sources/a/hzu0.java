package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hzu0 implements pzu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13922a;

    public hzu0(long j) {
        this.f13922a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzu0) && this.f13922a == ((hzu0) obj).f13922a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13922a);
    }

    public final String toString() {
        return axq.h(this.f13922a, "OnActiveActionSelected(balanceId=", Separators.RPAREN);
    }
}
