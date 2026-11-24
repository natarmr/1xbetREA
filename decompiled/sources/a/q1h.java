package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q1h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27952a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;

    public q1h(String str, String str2, String str3, int i, int i2, long j, String str4, String str5) {
        this.f27952a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1h)) {
            return false;
        }
        q1h q1hVar = (q1h) obj;
        return this.f27952a.equals(q1hVar.f27952a) && this.b.equals(q1hVar.b) && this.c.equals(q1hVar.c) && this.d == q1hVar.d && this.e == q1hVar.e && znq0.e(this.f, q1hVar.f) && this.g.equals(q1hVar.g) && this.h.equals(q1hVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(rw2.b(twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(this.f27952a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strH = znq0.h(this.f);
        StringBuilder sbN = b1j.n("CyberLastMatchInfoModel(id=", this.f27952a, ", firstTeamId=", this.b, ", secondTeamId=");
        twn.w(this.d, this.c, ", firstTeamScore=", ", secondTeamScore=", sbN);
        kng0.w(this.e, ", dateStart=", strH, ", tournamentTitle=", sbN);
        return ua80.m(sbN, this.g, ", description=", this.h, Separators.RPAREN);
    }
}
