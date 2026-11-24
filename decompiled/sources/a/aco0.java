package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aco0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f639a;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public aco0(long j) {
        this.f639a = (int) j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aco0) && ((long) this.f639a) == ((long) ((aco0) obj).f639a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f639a);
    }

    public final String toString() {
        return axq.h(this.f639a, "TabMapModel(tabId=", Separators.RPAREN);
    }
}
