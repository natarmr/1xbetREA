package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qok implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29076a;

    public qok(long j) {
        this.f29076a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qok) && this.f29076a == ((qok) obj).f29076a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29076a);
    }

    public final String toString() {
        return axq.h(this.f29076a, "OnChampAllLinesClick(champId=", Separators.RPAREN);
    }
}
