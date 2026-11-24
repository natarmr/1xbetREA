package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k5g0 implements n5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17718a;

    public k5g0(long j) {
        this.f17718a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5g0) && this.f17718a == ((k5g0) obj).f17718a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17718a);
    }

    public final String toString() {
        return axq.h(this.f17718a, "OnSportFilterClick(filterId=", Separators.RPAREN);
    }
}
