package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vg50 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37366a;
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
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public vg50(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        this.f37366a = str;
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
        this.o = str15;
        this.p = str16;
        this.q = str17;
        this.r = str18;
        this.s = str19;
        this.t = str20;
        this.u = str21;
        this.v = str22;
        this.w = str23;
        this.x = str24;
        this.y = str25;
        this.z = str26;
        this.A = str27;
        this.B = str28;
        this.C = str29;
        this.D = str30;
        this.E = str31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg50)) {
            return false;
        }
        vg50 vg50Var = (vg50) obj;
        return this.f37366a.equals(vg50Var.f37366a) && this.b.equals(vg50Var.b) && this.c.equals(vg50Var.c) && this.d.equals(vg50Var.d) && this.e.equals(vg50Var.e) && this.f.equals(vg50Var.f) && this.g.equals(vg50Var.g) && this.h.equals(vg50Var.h) && this.i.equals(vg50Var.i) && this.j.equals(vg50Var.j) && this.k.equals(vg50Var.k) && this.l.equals(vg50Var.l) && this.m.equals(vg50Var.m) && this.n.equals(vg50Var.n) && this.o.equals(vg50Var.o) && this.p.equals(vg50Var.p) && this.q.equals(vg50Var.q) && this.r.equals(vg50Var.r) && this.s.equals(vg50Var.s) && this.t.equals(vg50Var.t) && this.u.equals(vg50Var.u) && this.v.equals(vg50Var.v) && this.w.equals(vg50Var.w) && this.x.equals(vg50Var.x) && this.y.equals(vg50Var.y) && this.z.equals(vg50Var.z) && this.A.equals(vg50Var.A) && this.B.equals(vg50Var.B) && this.C.equals(vg50Var.C) && this.D.equals(vg50Var.D) && this.E.equals(vg50Var.E);
    }

    public final int hashCode() {
        return this.E.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f37366a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NearestGameDetailsMatchInfoModel(tournamentStage=", this.f37366a, ", location=", this.b, ", stadiumId=");
        f140.v(sbN, this.c, ", matchFormat=", this.d, ", seriesScore=");
        f140.v(sbN, this.e, ", seedNum1=", this.f, ", seedNum2=");
        f140.v(sbN, this.g, ", locationCity=", this.h, ", weather=");
        f140.v(sbN, this.i, ", temperature=", this.j, ", surface=");
        f140.v(sbN, this.k, ", locationCountry=", this.l, ", locationCityId=");
        f140.v(sbN, this.m, ", h2HLastScore=", this.n, ", weatherCode=");
        f140.v(sbN, this.o, ", weatherDescription=", this.p, ", weatherWindCode=");
        f140.v(sbN, this.q, ", weatherWindParam=", this.r, ", weatherWindDescription=");
        f140.v(sbN, this.s, ", weatherPressure=", this.t, ", weatherPressureDescription=");
        f140.v(sbN, this.u, ", weatherHumidity=", this.v, ", weatherHumidityDescription=");
        f140.v(sbN, this.w, ", weatherWaveHeight=", this.x, ", weatherWaveHeightDescription=");
        f140.v(sbN, this.y, ", weatherWaterTemperature=", this.z, ", weatherWaterTemperatureDescription=");
        f140.v(sbN, this.A, ", unplayedBalls=", this.B, ", weatherPrecipitationChance=");
        f140.v(sbN, this.C, ", weatherPrecipitationChanceDescription=", this.D, ", tennisSetsCountDescription=");
        return axq.n(sbN, this.E, Separators.RPAREN);
    }
}
