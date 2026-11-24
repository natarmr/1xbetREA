package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f438a;

    public a8p0(long j) {
        this.f438a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8p0) && this.f438a == ((a8p0) obj).f438a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f438a);
    }

    public final String toString() {
        return axq.h(this.f438a, "OnDisciplineSubSportSelect(subSportId=", Separators.RPAREN);
    }
}
