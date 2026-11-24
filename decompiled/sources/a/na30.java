package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class na30 {
    public final String A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23172a;
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

    public na30(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27) {
        str.getClass();
        this.f23172a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na30)) {
            return false;
        }
        na30 na30Var = (na30) obj;
        return Intrinsics.d(this.f23172a, na30Var.f23172a) && this.b.equals(na30Var.b) && this.c.equals(na30Var.c) && this.d.equals(na30Var.d) && this.e.equals(na30Var.e) && this.f.equals(na30Var.f) && this.g.equals(na30Var.g) && this.h.equals(na30Var.h) && this.i.equals(na30Var.i) && this.j.equals(na30Var.j) && this.k.equals(na30Var.k) && this.l.equals(na30Var.l) && this.m.equals(na30Var.m) && this.n.equals(na30Var.n) && this.o.equals(na30Var.o) && this.p.equals(na30Var.p) && this.q.equals(na30Var.q) && this.r.equals(na30Var.r) && this.s.equals(na30Var.s) && this.t.equals(na30Var.t) && this.u.equals(na30Var.u) && this.v.equals(na30Var.v) && this.w.equals(na30Var.w) && this.x.equals(na30Var.x) && this.y.equals(na30Var.y) && this.z.equals(na30Var.z) && this.A.equals(na30Var.A);
    }

    public final int hashCode() {
        return this.A.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f23172a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MatchInfoModel(tournamentStage=", this.f23172a, ", location=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", seriesScore=", this.d, ", seedNum1=");
        f140.v(sbN, this.e, ", seedNum2=", this.f, ", locationCity=");
        f140.v(sbN, this.g, ", weather=", this.h, ", temperature=");
        f140.v(sbN, this.i, ", surface=", this.j, ", locationCountry=");
        f140.v(sbN, this.k, ", locationCityId=", this.l, ", stadiumId=");
        f140.v(sbN, this.m, ", h2HLastScore=", this.n, ", weatherCode=");
        f140.v(sbN, this.o, ", weatherDescription=", this.p, ", weatherWindCode=");
        f140.v(sbN, this.q, ", weatherWindParam=", this.r, ", weatherWindDescription=");
        f140.v(sbN, this.s, ", weatherPressure=", this.t, ", weatherPressureDescription=");
        f140.v(sbN, this.u, ", weatherHumidity=", this.v, ", weatherHumidityDescription=");
        f140.v(sbN, this.w, ", unplayedBalls=", this.x, ", weatherPrecipitationChance=");
        f140.v(sbN, this.y, ", weatherPrecipitationChanceDescription=", this.z, ", tennisSetsCountDescription=");
        return axq.n(sbN, this.A, Separators.RPAREN);
    }
}
