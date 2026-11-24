package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nrd0 implements prd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23997a;

    public nrd0(long j) {
        this.f23997a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrd0) && this.f23997a == ((nrd0) obj).f23997a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23997a);
    }

    public final String toString() {
        return axq.h(this.f23997a, "OnPeriodClick(chipsId=", Separators.RPAREN);
    }
}
