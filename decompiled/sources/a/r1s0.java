package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29698a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public r1s0(int i, long j, String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f29698a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1s0)) {
            return false;
        }
        r1s0 r1s0Var = (r1s0) obj;
        return this.f29698a == r1s0Var.f29698a && this.b == r1s0Var.b && this.c.equals(r1s0Var.c) && this.d.equals(r1s0Var.d) && this.e == r1s0Var.e && this.f.equals(r1s0Var.f) && this.g.equals(r1s0Var.g) && this.h.equals(r1s0Var.h) && this.i.equals(r1s0Var.i) && this.j.equals(r1s0Var.j) && this.k.equals(r1s0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f29698a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f29698a, this.b, "TournamentInfoModel(eventId=", ", tournamentFeedId=");
        f140.v(sbQ, ", name=", this.c, ", countryImage=", this.d);
        kng0.A(sbQ, ", startTime=", this.e, ", status=");
        f140.v(sbQ, this.f, ", city=", this.g, ", state=");
        f140.v(sbQ, this.h, ", country=", this.i, ", triCode=");
        return ua80.m(sbQ, this.j, ", venue=", this.k, Separators.RPAREN);
    }
}
