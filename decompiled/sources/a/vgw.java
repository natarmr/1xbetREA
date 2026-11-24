package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37402a;

    public vgw(long j) {
        this.f37402a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgw) && this.f37402a == ((vgw) obj).f37402a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37402a);
    }

    public final String toString() {
        return axq.h(this.f37402a, "OnChampLineGamesClick(champId=", Separators.RPAREN);
    }
}
