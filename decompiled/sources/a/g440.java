package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10646a;

    public g440(long j) {
        this.f10646a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g440) && this.f10646a == ((g440) obj).f10646a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10646a);
    }

    public final String toString() {
        return axq.h(this.f10646a, "AggregatorSubCategory(id=", Separators.RPAREN);
    }
}
