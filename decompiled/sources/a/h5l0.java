package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12486a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
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

    public h5l0(long j, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        ohs0.z(str, str2, str3, str4, str5);
        ohs0.z(str6, str7, str8, str9, str10);
        ohs0.z(str11, str12, str13, str14, str15);
        ohs0.z(str16, str17, str18, str19, str20);
        str21.getClass();
        str22.getClass();
        this.f12486a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = str13;
        this.p = str14;
        this.q = str15;
        this.r = str16;
        this.s = str17;
        this.t = str18;
        this.u = str19;
        this.v = str20;
        this.w = str21;
        this.x = str22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5l0)) {
            return false;
        }
        h5l0 h5l0Var = (h5l0) obj;
        return this.f12486a == h5l0Var.f12486a && Intrinsics.d(this.b, h5l0Var.b) && Intrinsics.d(this.c, h5l0Var.c) && Intrinsics.d(this.d, h5l0Var.d) && this.e == h5l0Var.e && Intrinsics.d(this.f, h5l0Var.f) && Intrinsics.d(this.g, h5l0Var.g) && Intrinsics.d(this.h, h5l0Var.h) && Intrinsics.d(this.i, h5l0Var.i) && Intrinsics.d(this.j, h5l0Var.j) && Intrinsics.d(this.k, h5l0Var.k) && Intrinsics.d(this.l, h5l0Var.l) && Intrinsics.d(this.m, h5l0Var.m) && Intrinsics.d(this.n, h5l0Var.n) && Intrinsics.d(this.o, h5l0Var.o) && Intrinsics.d(this.p, h5l0Var.p) && Intrinsics.d(this.q, h5l0Var.q) && Intrinsics.d(this.r, h5l0Var.r) && Intrinsics.d(this.s, h5l0Var.s) && Intrinsics.d(this.t, h5l0Var.t) && Intrinsics.d(this.u, h5l0Var.u) && Intrinsics.d(this.v, h5l0Var.v) && Intrinsics.d(this.w, h5l0Var.w) && Intrinsics.d(this.x, h5l0Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f12486a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12486a, "SportEntity(id=", ", name=", this.b);
        f140.v(sbO, ", team=", this.c, ", shortName=", this.d);
        hne.u(", cyber=", ", background=", this.f, sbO, this.e);
        f140.v(sbO, ", imageSmall=", this.g, ", imagePopular=", this.h);
        f140.v(sbO, ", backgroundTablet=", this.i, ", backgroundChampionsDefault=", this.j);
        f140.v(sbO, ", backgroundChampionsTabletDefault=", this.k, ", backgroundChampionsHeaderDefault=", this.l);
        f140.v(sbO, ", backgroundChampionsHeaderTabletDefault=", this.m, ", gameBackground=", this.n);
        f140.v(sbO, ", subSports=", this.o, ", imageChampSmall=", this.p);
        f140.v(sbO, ", feedImageVertical=", this.q, ", feedImageHorizontal=", this.r);
        f140.v(sbO, ", feedImageSquare=", this.s, ", disciplineIcon3D=", this.t);
        f140.v(sbO, ", esportsEventFocusDisciplineHeader=", this.u, ", esportsHeaderFocusDisciplineHeader=", this.v);
        f140.v(sbO, ", defaultOpponentHeader=", this.w, ", defaultOpponentHeaderTablet=", this.x);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
