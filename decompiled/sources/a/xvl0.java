package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41566a;
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
    public final List t;
    public final List u;
    public final boolean v;
    public final boolean w;

    public xvl0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, boolean z, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f41566a = str;
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
        this.t = list;
        this.u = list2;
        this.v = z;
        this.w = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvl0)) {
            return false;
        }
        xvl0 xvl0Var = (xvl0) obj;
        return this.f41566a.equals(xvl0Var.f41566a) && this.b.equals(xvl0Var.b) && this.c.equals(xvl0Var.c) && this.d.equals(xvl0Var.d) && this.e.equals(xvl0Var.e) && this.f.equals(xvl0Var.f) && this.g.equals(xvl0Var.g) && this.h.equals(xvl0Var.h) && this.i.equals(xvl0Var.i) && this.j.equals(xvl0Var.j) && this.k.equals(xvl0Var.k) && this.l.equals(xvl0Var.l) && this.m.equals(xvl0Var.m) && this.n.equals(xvl0Var.n) && this.o.equals(xvl0Var.o) && this.p.equals(xvl0Var.p) && this.q.equals(xvl0Var.q) && this.r.equals(xvl0Var.r) && this.s.equals(xvl0Var.s) && Intrinsics.d(this.t, xvl0Var.t) && Intrinsics.d(this.u, xvl0Var.u) && this.v == xvl0Var.v && this.w == xvl0Var.w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + brm0.e(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f41566a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StadiumInfoModel(name=", this.f41566a, ", architect=", this.b, ", covering=");
        f140.v(sbN, this.c, ", address=", this.d, ", zipCode=");
        f140.v(sbN, this.e, ", phone=", this.f, ", email=");
        f140.v(sbN, this.g, ", website=", this.h, ", opened=");
        f140.v(sbN, this.i, ", capacity=", this.j, ", owner=");
        f140.v(sbN, this.k, ", developer=", this.l, ", homeTeams=");
        f140.v(sbN, this.m, ", cost=", this.n, ", category=");
        f140.v(sbN, this.o, ", city=", this.p, ", history=");
        f140.v(sbN, this.q, ", oldName=", this.r, ", majorEvents=");
        cs0.y(this.s, ", circuits=", ", images=", sbN, this.t);
        rz4.z(sbN, ", hasInfo=", this.u, ", isHideImages=", this.v);
        return rw2.p(sbN, this.w, Separators.RPAREN);
    }
}
