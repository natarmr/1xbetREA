package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dpk implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6471a;

    public dpk(long j) {
        this.f6471a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpk) && this.f6471a == ((dpk) obj).f6471a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6471a);
    }

    public final String toString() {
        return axq.h(this.f6471a, "OnRealChampionshipClick(id=", Separators.RPAREN);
    }
}
