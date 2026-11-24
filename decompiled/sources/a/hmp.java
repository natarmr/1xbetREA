package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13320a;

    public hmp(long j) {
        this.f13320a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmp) && this.f13320a == ((hmp) obj).f13320a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13320a);
    }

    public final String toString() {
        return axq.h(this.f13320a, "OnLongClickMultiselect(champId=", Separators.RPAREN);
    }
}
