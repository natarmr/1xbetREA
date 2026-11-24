package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ma30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21442a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public ma30(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f21442a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma30)) {
            return false;
        }
        ma30 ma30Var = (ma30) obj;
        return this.f21442a.equals(ma30Var.f21442a) && this.b.equals(ma30Var.b) && this.c.equals(ma30Var.c) && this.d.equals(ma30Var.d) && this.e.equals(ma30Var.e) && this.f.equals(ma30Var.f) && this.g.equals(ma30Var.g) && this.h.equals(ma30Var.h) && this.i.equals(ma30Var.i) && this.j.equals(ma30Var.j) && this.k.equals(ma30Var.k) && this.l.equals(ma30Var.l) && this.m.equals(ma30Var.m) && this.n.equals(ma30Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f21442a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MatchInfoModel(tournamentStage=", this.f21442a, ", location=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", seriesScore=", this.d, ", seedNumTeamOne=");
        f140.v(sbN, this.e, ", seedNumTeamTwo=", this.f, ", surface=");
        f140.v(sbN, this.g, ", locationCity=", this.h, ", temperature=");
        f140.v(sbN, this.i, ", locationCountry=", this.j, ", weatherCode=");
        f140.v(sbN, this.k, ", weatherWindParam=", this.l, ", weatherPressure=");
        return ua80.m(sbN, this.m, ", weatherHumidity=", this.n, Separators.RPAREN);
    }
}
