package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ypr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43044a;
    public final long b;
    public final long c;
    public final long d;
    public final k1g e;
    public final String f;

    public ypr(long j, long j2, long j3, long j4, k1g k1gVar, String str) {
        k1gVar.getClass();
        this.f43044a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = k1gVar;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypr)) {
            return false;
        }
        ypr yprVar = (ypr) obj;
        return this.f43044a == yprVar.f43044a && this.b == yprVar.b && this.c == yprVar.c && this.d == yprVar.d && this.e == yprVar.e && this.f.equals(yprVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + rw2.b(rw2.b(rw2.b(Long.hashCode(this.f43044a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43044a, "GameAnalyticsParams(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champId=");
        sbQ.append(this.d);
        sbQ.append(", openScreenSubType=");
        sbQ.append(this.e);
        return rw2.o(sbQ, ", screenName=", this.f, Separators.RPAREN);
    }
}
