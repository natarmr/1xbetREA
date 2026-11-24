package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19307a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final long f;
    public final String g;
    public final long h;
    public final String i;
    public final List j;
    public final List k;
    public final String l;
    public final String m;
    public final List n;
    public final List o;
    public final String p;
    public final String q;
    public final String r;
    public final long s;
    public final Map t;
    public final String u;
    public final boolean v;
    public final int w;
    public final int x;
    public final List y;

    public l2g0(long j, long j2, long j3, long j4, String str, long j5, String str2, long j6, String str3, List list, List list2, String str4, String str5, List list3, List list4, String str6, String str7, String str8, long j7, Map map, String str9, boolean z, int i, int i2, List list5) {
        str2.getClass();
        list.getClass();
        list2.getClass();
        str4.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.f19307a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = j5;
        this.g = str2;
        this.h = j6;
        this.i = str3;
        this.j = list;
        this.k = list2;
        this.l = str4;
        this.m = str5;
        this.n = list3;
        this.o = list4;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.s = j7;
        this.t = map;
        this.u = str9;
        this.v = z;
        this.w = i;
        this.x = i2;
        this.y = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2g0)) {
            return false;
        }
        l2g0 l2g0Var = (l2g0) obj;
        return this.f19307a == l2g0Var.f19307a && this.b == l2g0Var.b && this.c == l2g0Var.c && this.d == l2g0Var.d && this.e.equals(l2g0Var.e) && this.f == l2g0Var.f && Intrinsics.d(this.g, l2g0Var.g) && this.h == l2g0Var.h && this.i.equals(l2g0Var.i) && Intrinsics.d(this.j, l2g0Var.j) && Intrinsics.d(this.k, l2g0Var.k) && Intrinsics.d(this.l, l2g0Var.l) && this.m.equals(l2g0Var.m) && Intrinsics.d(this.n, l2g0Var.n) && Intrinsics.d(this.o, l2g0Var.o) && this.p.equals(l2g0Var.p) && this.q.equals(l2g0Var.q) && this.r.equals(l2g0Var.r) && this.s == l2g0Var.s && this.t.equals(l2g0Var.t) && this.u.equals(l2g0Var.u) && this.v == l2g0Var.v && this.w == l2g0Var.w && this.x == l2g0Var.x && Intrinsics.d(this.y, l2g0Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + twn.a(this.x, twn.a(this.w, brm0.e(ua80.b(ohs0.f(this.t, rw2.b(ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(ua80.b(ua80.b(dw9.a(dw9.a(ua80.b(rw2.b(ua80.b(rw2.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f19307a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31), 31, this.u), 31, this.v), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19307a, "ResultGameModel(id=", ", constId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbQ, this.d, ", statId=", this.e);
        kng0.A(sbQ, ", countryId=", this.f, ", champName=");
        defpackage.c.i(sbQ, this.h, this.g, ", champId=");
        ua80.t(", champImage=", this.i, ", opponentOneIds=", sbQ, this.j);
        sbQ.append(", opponentTwoIds=");
        sbQ.append(this.k);
        sbQ.append(", opponentOne=");
        sbQ.append(this.l);
        ua80.t(", opponentTwo=", this.m, ", opponentOneImages=", sbQ, this.n);
        sbQ.append(", opponentTwoImages=");
        sbQ.append(this.o);
        sbQ.append(", score=");
        sbQ.append(this.p);
        f140.v(sbQ, ", scoreAdd=", this.q, ", extraInfo=", this.r);
        kng0.A(sbQ, ", timeStartSec=", this.s, ", matchInfos=");
        sbQ.append(this.t);
        sbQ.append(", status=");
        sbQ.append(this.u);
        sbQ.append(", homeAwayFlag=");
        ua80.q(this.w, ", globalChampId=", ", countSubGame=", sbQ, this.v);
        sbQ.append(this.x);
        sbQ.append(", subGames=");
        sbQ.append(this.y);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
