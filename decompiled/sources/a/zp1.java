package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zp1 implements dq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44739a;

    public zp1(long j) {
        this.f44739a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp1) && this.f44739a == ((zp1) obj).f44739a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44739a);
    }

    public final String toString() {
        return axq.h(this.f44739a, "Brand(brandId=", Separators.RPAREN);
    }
}
