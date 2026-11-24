package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40859a;

    public xgw(long j) {
        this.f40859a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgw) && this.f40859a == ((xgw) obj).f40859a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40859a);
    }

    public final String toString() {
        return axq.h(this.f40859a, "OnChampionshipClick(id=", Separators.RPAREN);
    }
}
