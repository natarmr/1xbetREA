package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dkp0 implements gkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6244a;

    public dkp0(long j) {
        this.f6244a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkp0) && this.f6244a == ((dkp0) obj).f6244a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6244a);
    }

    public final String toString() {
        return axq.h(this.f6244a, "OnChipsSelected(chipsId=", Separators.RPAREN);
    }
}
