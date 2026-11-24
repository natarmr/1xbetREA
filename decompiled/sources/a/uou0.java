package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uou0 implements cpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36031a;

    public uou0(long j) {
        this.f36031a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uou0) && this.f36031a == ((uou0) obj).f36031a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36031a);
    }

    public final String toString() {
        return axq.h(this.f36031a, "OnChampionshipClick(id=", Separators.RPAREN);
    }
}
