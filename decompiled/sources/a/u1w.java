package a;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u1w extends b2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34920a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;
    public final long g;
    public final long h;
    public final HashMap i;
    public final String j;
    public final List k;
    public final long l;
    public final int m;
    public final List n;
    public final a2w o;
    public final a2w p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;

    public u1w(long j, String str, String str2, long j2, int i, String str3, long j3, long j4, HashMap map, String str4, List list, long j5, int i2, List list2, a2w a2wVar, a2w a2wVar2, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        this.f34920a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
        this.f = str3;
        this.g = j3;
        this.h = j4;
        this.i = map;
        this.j = str4;
        this.k = list;
        this.l = j5;
        this.m = i2;
        this.n = list2;
        this.o = a2wVar;
        this.p = a2wVar2;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.t = !list2.isEmpty();
    }

    @Override // a.d2w
    public final int a() {
        return this.e;
    }

    @Override // a.d2w
    public final long b() {
        return this.f34920a;
    }

    @Override // a.d2w
    public final String c() {
        return this.c;
    }

    @Override // a.d2w
    public final long d() {
        return this.d;
    }

    @Override // a.d2w
    public final long e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1w)) {
            return false;
        }
        u1w u1wVar = (u1w) obj;
        return this.f34920a == u1wVar.f34920a && Intrinsics.d(this.b, u1wVar.b) && Intrinsics.d(this.c, u1wVar.c) && this.d == u1wVar.d && this.e == u1wVar.e && this.f.equals(u1wVar.f) && this.g == u1wVar.g && this.h == u1wVar.h && this.i.equals(u1wVar.i) && Intrinsics.d(this.j, u1wVar.j) && Intrinsics.d(this.k, u1wVar.k) && this.l == u1wVar.l && this.m == u1wVar.m && this.n.equals(u1wVar.n) && this.o.equals(u1wVar.o) && this.p.equals(u1wVar.p) && this.q.equals(u1wVar.q) && this.r.equals(u1wVar.r) && this.s.equals(u1wVar.s);
    }

    @Override // a.d2w
    public final String f() {
        return this.f;
    }

    @Override // a.d2w
    public final long g() {
        return this.g;
    }

    @Override // a.d2w
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ua80.b(ua80.b(ua80.b((this.p.hashCode() + ((this.o.hashCode() + dw9.a(twn.a(this.m, rw2.b(dw9.a(ua80.b((this.i.hashCode() + rw2.b(rw2.b(ua80.b(twn.a(this.e, rw2.b(ua80.b(ua80.b(Long.hashCode(this.f34920a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n)) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34920a, "CricketHistoryGame(id=", ", title=", this.b);
        hne.B(sbO, ", score=", this.c, ", sportId=");
        ua80.v(sbO, this.d, ", globalChampId=", this.e);
        hne.B(sbO, ", statId=", this.f, ", subSportId=");
        sbO.append(this.g);
        kng0.A(sbO, ", stadiumId=", this.h, ", matchInfos=");
        sbO.append(this.i);
        sbO.append(", extraInfo=");
        sbO.append(this.j);
        sbO.append(", videoUrls=");
        sbO.append(this.k);
        sbO.append(", startDate=");
        sbO.append(this.l);
        sbO.append(", countSubGame=");
        sbO.append(this.m);
        sbO.append(", subGames=");
        sbO.append(this.n);
        sbO.append(", teamOne=");
        sbO.append(this.o);
        sbO.append(", teamTwo=");
        sbO.append(this.p);
        f140.v(sbO, ", status=", this.q, ", scoreTeamOne=", this.r);
        return rw2.o(sbO, ", scoreTeamTwo=", this.s, ", expanded=false)");
    }
}
