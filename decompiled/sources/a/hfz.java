package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hfz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12993a;

    public hfz(long j) {
        this.f12993a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfz) && this.f12993a == ((hfz) obj).f12993a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12993a);
    }

    public final String toString() {
        return axq.h(this.f12993a, "OnDisciplineSubSportSelect(subSportId=", Separators.RPAREN);
    }
}
