package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class su6 implements Serializable {
    public final String A;
    public final String B;
    public final String Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32807a;
    public final String b;
    public final int c;
    public final double d;
    public final String e;
    public final long f;
    public final double f1;
    public final boolean g;
    public final long g1;
    public final long h;
    public final long h1;
    public final long i;
    public final String i1;
    public final String j;
    public final int j1;
    public final mvn k;
    public final int k1;
    public final boolean l;
    public final int l1;
    public final String m;
    public final double m1;
    public final long n;
    public final double n1;
    public final List o;
    public final String o1;
    public final String p;
    public final boolean p1;
    public final long q;
    public final String q1;
    public final List r;
    public final String r1;
    public final String s;
    public final boolean s1;
    public final long t;
    public final List t1;
    public final String u;
    public final List u1;
    public final int v;
    public final int w;
    public final String x;
    public final long y;
    public final boolean z;

    public su6(long j, String str, int i, double d, String str2, long j2, boolean z, long j3, long j4, String str3, mvn mvnVar, boolean z2, String str4, long j5, List list, String str5, long j6, List list2, String str6, long j7, String str7, int i2, int i3, String str8, long j8, boolean z3, String str9, String str10, String str11, boolean z4, double d2, long j9, long j10, String str12, int i4, int i5, int i6, double d3, double d4, String str13, boolean z5, String str14, String str15, boolean z6, List list3, List list4) {
        list.getClass();
        list2.getClass();
        str7.getClass();
        list3.getClass();
        list4.getClass();
        this.f32807a = j;
        this.b = str;
        this.c = i;
        this.d = d;
        this.e = str2;
        this.f = j2;
        this.g = z;
        this.h = j3;
        this.i = j4;
        this.j = str3;
        this.k = mvnVar;
        this.l = z2;
        this.m = str4;
        this.n = j5;
        this.o = list;
        this.p = str5;
        this.q = j6;
        this.r = list2;
        this.s = str6;
        this.t = j7;
        this.u = str7;
        this.v = i2;
        this.w = i3;
        this.x = str8;
        this.y = j8;
        this.z = z3;
        this.A = str9;
        this.B = str10;
        this.Y = str11;
        this.Z = z4;
        this.f1 = d2;
        this.g1 = j9;
        this.h1 = j10;
        this.i1 = str12;
        this.j1 = i4;
        this.k1 = i5;
        this.l1 = i6;
        this.m1 = d3;
        this.n1 = d4;
        this.o1 = str13;
        this.p1 = z5;
        this.q1 = str14;
        this.r1 = str15;
        this.s1 = z6;
        this.t1 = list3;
        this.u1 = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su6)) {
            return false;
        }
        su6 su6Var = (su6) obj;
        return this.f32807a == su6Var.f32807a && this.b.equals(su6Var.b) && this.c == su6Var.c && Double.compare(this.d, su6Var.d) == 0 && this.e.equals(su6Var.e) && this.f == su6Var.f && this.g == su6Var.g && this.h == su6Var.h && this.i == su6Var.i && this.j.equals(su6Var.j) && this.k == su6Var.k && this.l == su6Var.l && this.m.equals(su6Var.m) && this.n == su6Var.n && Intrinsics.d(this.o, su6Var.o) && this.p.equals(su6Var.p) && this.q == su6Var.q && Intrinsics.d(this.r, su6Var.r) && this.s.equals(su6Var.s) && this.t == su6Var.t && Intrinsics.d(this.u, su6Var.u) && this.v == su6Var.v && this.w == su6Var.w && this.x.equals(su6Var.x) && this.y == su6Var.y && this.z == su6Var.z && this.A.equals(su6Var.A) && this.B.equals(su6Var.B) && this.Y.equals(su6Var.Y) && this.Z == su6Var.Z && Double.compare(this.f1, su6Var.f1) == 0 && this.g1 == su6Var.g1 && this.h1 == su6Var.h1 && this.i1.equals(su6Var.i1) && this.j1 == su6Var.j1 && this.k1 == su6Var.k1 && this.l1 == su6Var.l1 && Double.compare(this.m1, su6Var.m1) == 0 && Double.compare(this.n1, su6Var.n1) == 0 && this.o1.equals(su6Var.o1) && this.p1 == su6Var.p1 && this.q1.equals(su6Var.q1) && this.r1.equals(su6Var.r1) && this.s1 == su6Var.s1 && Intrinsics.d(this.t1, su6Var.t1) && Intrinsics.d(this.u1, su6Var.u1);
    }

    public final int hashCode() {
        return this.u1.hashCode() + dw9.a(brm0.e(ua80.b(ua80.b(brm0.e(ua80.b(brm0.d(this.n1, brm0.d(this.m1, twn.a(this.l1, twn.a(this.k1, twn.a(this.j1, ua80.b(rw2.b(rw2.b(brm0.d(this.f1, brm0.e(ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(ua80.b(twn.a(this.w, twn.a(this.v, ua80.b(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(brm0.e((this.k.hashCode() + ua80.b(rw2.b(rw2.b(brm0.e(rw2.b(ua80.b(brm0.d(this.d, twn.a(this.c, ua80.b(Long.hashCode(this.f32807a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31), 31), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.Y), 31, this.Z), 31), 31, this.g1), 31, this.h1), 31, this.i1), 31), 31), 31), 31), 31), 31, this.o1), 31, this.p1), 31, this.q1), 31, this.r1), 31, this.s1), 31, this.t1);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32807a, "BetEventModel(champId=", ", champName=", this.b);
        rw2.x(sbO, ", globalChampId=", this.c, ", coefficient=");
        hne.w(sbO, this.d, ", coefficientString=", this.e);
        kng0.A(sbO, ", dateStart=", this.f, ", finish=");
        rw2.v(this.h, ", mainGameId=", sbO, this.g);
        kng0.A(sbO, ", gameId=", this.i, ", gameName=");
        sbO.append(this.j);
        sbO.append(", status=");
        sbO.append(this.k);
        sbO.append(", live=");
        f140.s(", teamOne=", this.m, ", teamOneId=", sbO, this.l);
        hne.x(sbO, this.n, ", teamOneImageList=", this.o);
        hne.B(sbO, ", teamSecond=", this.p, ", teamSecondId=");
        hne.x(sbO, this.q, ", teamSecondImageList=", this.r);
        hne.B(sbO, ", score=", this.s, ", sportId=");
        kng0.z(sbO, this.t, ", typeEventName=", this.u);
        rw2.s(this.v, this.w, ", typeEventId=", ", typeParam=", sbO);
        hne.B(sbO, ", periodName=", this.x, ", liveTime=");
        hne.t(this.y, ", hasAlternativeInfo=", sbO, this.z);
        f140.v(sbO, ", additionalGameInfo=", this.A, ", gameVidName=", this.B);
        w6x.z(", gameTypeName=", this.Y, ", playersDuel=", sbO, this.Z);
        ohs0.A(sbO, this.f1, ", betEventParam=", ", groupId=");
        sbO.append(this.g1);
        kng0.A(sbO, ", playerId=", this.h1, ", playerName=");
        twn.w(this.j1, this.i1, ", subSportId=", ", blockLevel=", sbO);
        axq.r(this.k1, this.l1, ", prevBlockLevel=", ", blockValue=", sbO);
        sbO.append(this.m1);
        ohs0.A(sbO, this.n1, ", total=", ", statId=");
        brm0.C(this.o1, ", optionBet=", ", eventStatus=", sbO, this.p1);
        f140.v(sbO, this.q1, ", returnedBetEventReasonName=", this.r1, ", hasAutoSub=");
        vqd.y(sbO, ", eventParamsList=", this.t1, ", eventParamsPlayerNames=", this.s1);
        return dw9.r(sbO, this.u1, Separators.RPAREN);
    }
}
