package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ygs {
    public final String A;
    public final long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42600a;
    public final long b;
    public final boolean c;
    public final long d;
    public final String e;
    public final long f;
    public final boolean g;
    public final String h;
    public final ehs i;
    public final long j;
    public final long k;
    public final List l;
    public final List m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;
    public final List r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final List x;
    public final List y;
    public final long z;

    public ygs(long j, long j2, boolean z, long j3, String str, long j4, boolean z2, String str2, ehs ehsVar, long j5, long j6, List list, List list2, String str3, String str4, String str5, List list3, List list4, String str6, boolean z3, boolean z4, boolean z5, boolean z6, List list5, List list6, long j7, String str7, long j8) {
        hne.C(list, list2, list3, list4);
        this.f42600a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = str;
        this.f = j4;
        this.g = z2;
        this.h = str2;
        this.i = ehsVar;
        this.j = j5;
        this.k = j6;
        this.l = list;
        this.m = list2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = list3;
        this.r = list4;
        this.s = str6;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        this.w = z6;
        this.x = list5;
        this.y = list6;
        this.z = j7;
        this.A = str7;
        this.B = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygs)) {
            return false;
        }
        ygs ygsVar = (ygs) obj;
        return this.f42600a == ygsVar.f42600a && this.b == ygsVar.b && this.c == ygsVar.c && this.d == ygsVar.d && this.e.equals(ygsVar.e) && this.f == ygsVar.f && this.g == ygsVar.g && this.h.equals(ygsVar.h) && Intrinsics.d(this.i, ygsVar.i) && this.j == ygsVar.j && this.k == ygsVar.k && Intrinsics.d(this.l, ygsVar.l) && Intrinsics.d(this.m, ygsVar.m) && this.n.equals(ygsVar.n) && this.o.equals(ygsVar.o) && this.p.equals(ygsVar.p) && Intrinsics.d(this.q, ygsVar.q) && Intrinsics.d(this.r, ygsVar.r) && this.s.equals(ygsVar.s) && this.t == ygsVar.t && this.u == ygsVar.u && this.v == ygsVar.v && this.w == ygsVar.w && Intrinsics.d(this.x, ygsVar.x) && Intrinsics.d(this.y, ygsVar.y) && this.z == ygsVar.z && this.A.equals(ygsVar.A) && this.B == ygsVar.B;
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(rw2.b(ua80.b(rw2.b(brm0.e(rw2.b(Long.hashCode(this.f42600a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        ehs ehsVar = this.i;
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(rw2.b(rw2.b((iB + (ehsVar == null ? 0 : ehsVar.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        List list = this.x;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.y;
        return Long.hashCode(this.B) + ua80.b(rw2.b((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f42600a, "GameItem(id=", ", constId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", champName=");
        defpackage.c.i(sbQ, this.f, this.e, ", champId=");
        hne.u(", isFinished=", ", vid=", this.h, sbQ, this.g);
        sbQ.append(", scores=");
        sbQ.append(this.i);
        sbQ.append(", teamOneId=");
        sbQ.append(this.j);
        kng0.A(sbQ, ", teamTwoId=", this.k, ", teamOneIdsList=");
        b1j.y(", teamTwoIdsList=", ", teamOneName=", sbQ, this.l, this.m);
        f140.v(sbQ, this.n, ", teamTwoName=", this.o, ", teamsFullName=");
        cs0.y(this.p, ", teamOneImageList=", ", teamTwoImageList=", sbQ, this.q);
        h97.y(", dopInfo=", this.s, ", isHostGuest=", sbQ, this.r);
        ua80.u(", canSubscribe=", ", favorite=", sbQ, this.t, this.u);
        ua80.u(", showPreMatch=", ", betGroupZips=", sbQ, this.v, this.w);
        b1j.y(", betGroups=", ", timeStart=", sbQ, this.x, this.y);
        kng0.z(sbQ, this.z, ", sportName=", this.A);
        return rw2.n(sbQ, this.B, ", subSportId=", Separators.RPAREN);
    }
}
