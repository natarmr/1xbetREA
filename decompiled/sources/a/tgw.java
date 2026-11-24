package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33934a;

    public tgw(long j) {
        this.f33934a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgw) && this.f33934a == ((tgw) obj).f33934a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33934a);
    }

    public final String toString() {
        return axq.h(this.f33934a, "OnChampDisciplineClick(champId=", Separators.RPAREN);
    }
}
