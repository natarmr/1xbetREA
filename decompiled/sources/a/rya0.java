package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31304a;

    public rya0(long j) {
        this.f31304a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rya0) && this.f31304a == ((rya0) obj).f31304a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31304a);
    }

    public final String toString() {
        return axq.h(this.f31304a, "OnCategoryClick(partitionId=", Separators.RPAREN);
    }
}
