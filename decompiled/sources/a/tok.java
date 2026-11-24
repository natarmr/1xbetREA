package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tok implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34288a;

    public tok(long j) {
        this.f34288a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tok) && this.f34288a == ((tok) obj).f34288a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34288a);
    }

    public final String toString() {
        return axq.h(this.f34288a, "OnChampionshipClick(id=", Separators.RPAREN);
    }
}
