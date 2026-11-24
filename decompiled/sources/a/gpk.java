package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gpk implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11688a;
    public final long b;
    public final long c;

    public gpk(long j, long j2, long j3) {
        this.f11688a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpk)) {
            return false;
        }
        gpk gpkVar = (gpk) obj;
        return this.f11688a == gpkVar.f11688a && this.b == gpkVar.b && this.c == gpkVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f11688a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f11688a, "OnWidgetEventClick(sportId=", ", subSportId=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", eventId=", Separators.RPAREN);
    }
}
