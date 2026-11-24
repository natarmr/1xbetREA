package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eig implements jig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7858a;

    public eig(long j) {
        this.f7858a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eig) && this.f7858a == ((eig) obj).f7858a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7858a);
    }

    public final String toString() {
        return axq.h(this.f7858a, "OnChampLongClick(champId=", Separators.RPAREN);
    }
}
