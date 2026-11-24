package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uhw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35701a;
    public final long b;
    public final long c;

    public uhw(long j, long j2, long j3) {
        this.f35701a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhw)) {
            return false;
        }
        uhw uhwVar = (uhw) obj;
        return this.f35701a == uhwVar.f35701a && this.b == uhwVar.b && this.c == uhwVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f35701a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f35701a, "OnWidgetEventClick(sportId=", ", subSportId=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", eventId=", Separators.RPAREN);
    }
}
