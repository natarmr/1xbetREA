package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f40658a;
    public final int b;
    public final String c;
    public final long d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final uoy i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final List n;
    public final String o;
    public final List p;
    public final double q;
    public final long r;
    public final long s;
    public final String t;
    public final long u;
    public final String v;
    public final String w;
    public final String x;
    public final yeo y;

    public xcq(double d, int i, String str, long j, int i2, int i3, long j2, long j3, uoy uoyVar, String str2, String str3, int i4, String str4, List list, String str5, List list2, double d2, long j4, long j5, String str6, long j6, String str7, String str8, String str9, yeo yeoVar) {
        list.getClass();
        list2.getClass();
        this.f40658a = d;
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = uoyVar;
        this.j = str2;
        this.k = str3;
        this.l = i4;
        this.m = str4;
        this.n = list;
        this.o = str5;
        this.p = list2;
        this.q = d2;
        this.r = j4;
        this.s = j5;
        this.t = str6;
        this.u = j6;
        this.v = str7;
        this.w = str8;
        this.x = str9;
        this.y = yeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcq)) {
            return false;
        }
        xcq xcqVar = (xcq) obj;
        return Double.compare(this.f40658a, xcqVar.f40658a) == 0 && this.b == xcqVar.b && this.c.equals(xcqVar.c) && this.d == xcqVar.d && this.e == xcqVar.e && this.f == xcqVar.f && this.g == xcqVar.g && this.h == xcqVar.h && this.i == xcqVar.i && this.j.equals(xcqVar.j) && this.k.equals(xcqVar.k) && this.l == xcqVar.l && this.m.equals(xcqVar.m) && Intrinsics.d(this.n, xcqVar.n) && this.o.equals(xcqVar.o) && Intrinsics.d(this.p, xcqVar.p) && Double.compare(this.q, xcqVar.q) == 0 && this.r == xcqVar.r && this.s == xcqVar.s && this.t.equals(xcqVar.t) && this.u == xcqVar.u && this.v.equals(xcqVar.v) && this.w.equals(xcqVar.w) && this.x.equals(xcqVar.x) && this.y.equals(xcqVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(rw2.b(rw2.b(brm0.d(this.q, dw9.a(ua80.b(dw9.a(ua80.b(twn.a(this.l, ua80.b(ua80.b(twn.d(this.i, rw2.b(rw2.b(twn.a(this.f, twn.a(this.e, rw2.b(ua80.b(twn.a(this.b, Double.hashCode(this.f40658a) * 31, 31), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FindCouponDescModel(coefficient=");
        sb.append(this.f40658a);
        sb.append(", period=");
        sb.append(this.b);
        hne.B(sb, ", coefficientView=", this.c, ", eventShortGroup=");
        ua80.v(sb, this.d, ", typeId=", this.e);
        rw2.x(sb, ", vidId=", this.f, ", gameId=");
        sb.append(this.g);
        kng0.A(sb, ", subGameId=", this.h, ", kind=");
        sb.append(this.i);
        sb.append(", league=");
        sb.append(this.j);
        sb.append(", eventView=");
        twn.w(this.l, this.k, ", name=", ", opponentOne=", sb);
        cs0.y(this.m, ", opponentOneImages=", ", opponentTwo=", sb, this.n);
        cs0.y(this.o, ", opponentTwoImages=", ", params=", sb, this.p);
        sb.append(this.q);
        kng0.A(sb, ", timeStart=", this.r, ", sportId=");
        kng0.z(sb, this.s, ", sportName=", this.t);
        kng0.A(sb, ", eventType=", this.u, ", type=");
        f140.v(sb, this.v, ", typeBetAdditional=", this.w, ", gameVidName=");
        sb.append(this.x);
        sb.append(", eventParams=");
        sb.append(this.y);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
