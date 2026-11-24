package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16897a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final String l;
    public final String m;

    public jpf(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, String str4, String str5) {
        this.f16897a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = j;
        this.k = j2;
        this.l = str4;
        this.m = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf)) {
            return false;
        }
        jpf jpfVar = (jpf) obj;
        return this.f16897a.equals(jpfVar.f16897a) && this.b.equals(jpfVar.b) && this.c.equals(jpfVar.c) && this.d == jpfVar.d && this.e == jpfVar.e && this.f == jpfVar.f && this.g == jpfVar.g && this.h == jpfVar.h && this.i == jpfVar.i && this.j == jpfVar.j && this.k == jpfVar.k && this.l.equals(jpfVar.l) && this.m.equals(jpfVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ua80.b(rw2.b(rw2.b(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(this.f16897a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2MapsPicksModel(mapName=", this.f16897a, ", firstTeamWinrate=", this.b, ", secondTeamWinrate=");
        twn.w(this.d, this.c, ", firstTeamMapsCount=", ", secondTeamMapsCount=", sbN);
        brm0.w(this.e, ", firstTeamPick=", ", secondTeamPick=", sbN, this.f);
        ua80.u(", firstTeamBan=", ", secondTeamBan=", sbN, this.g, this.h);
        rw2.v(this.j, ", firstTeamClId=", sbN, this.i);
        kng0.A(sbN, ", secondTeamClId=", this.k, ", firstTeamName=");
        return ua80.m(sbN, this.l, ", secondTeamName=", this.m, Separators.RPAREN);
    }
}
