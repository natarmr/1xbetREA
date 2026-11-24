package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rok implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30842a;

    public rok(long j) {
        this.f30842a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rok) && this.f30842a == ((rok) obj).f30842a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30842a);
    }

    public final String toString() {
        return axq.h(this.f30842a, "OnChampAllLivesClick(champId=", Separators.RPAREN);
    }
}
