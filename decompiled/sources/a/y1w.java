package a;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y1w extends d2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41880a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final long h;
    public final HashMap i;
    public final String j;
    public final List k;
    public final long l;
    public final int m;
    public final List n;
    public final a2w o;
    public final String p;
    public final boolean q;

    public y1w(long j, String str, String str2, long j2, int i, long j3, String str3, long j4, HashMap map, String str4, List list, long j5, int i2, List list2, a2w a2wVar, String str5) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f41880a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
        this.f = j3;
        this.g = str3;
        this.h = j4;
        this.i = map;
        this.j = str4;
        this.k = list;
        this.l = j5;
        this.m = i2;
        this.n = list2;
        this.o = a2wVar;
        this.p = str5;
        this.q = !list2.isEmpty();
    }

    @Override // a.d2w
    public final int a() {
        return this.e;
    }

    @Override // a.d2w
    public final long b() {
        return this.f41880a;
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
        if (!(obj instanceof y1w)) {
            return false;
        }
        y1w y1wVar = (y1w) obj;
        return this.f41880a == y1wVar.f41880a && Intrinsics.d(this.b, y1wVar.b) && this.c.equals(y1wVar.c) && this.d == y1wVar.d && this.e == y1wVar.e && this.f == y1wVar.f && this.g.equals(y1wVar.g) && this.h == y1wVar.h && this.i.equals(y1wVar.i) && this.j.equals(y1wVar.j) && Intrinsics.d(this.k, y1wVar.k) && this.l == y1wVar.l && this.m == y1wVar.m && this.n.equals(y1wVar.n) && this.o.equals(y1wVar.o) && this.p.equals(y1wVar.p);
    }

    @Override // a.d2w
    public final String f() {
        return this.g;
    }

    @Override // a.d2w
    public final long g() {
        return this.f;
    }

    @Override // a.d2w
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ua80.b((this.o.hashCode() + dw9.a(twn.a(this.m, rw2.b(dw9.a(ua80.b((this.i.hashCode() + rw2.b(ua80.b(rw2.b(twn.a(this.e, rw2.b(ua80.b(ua80.b(Long.hashCode(this.f41880a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n)) * 31, 31, this.p);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41880a, "SimpleHistoryGame(id=", ", title=", this.b);
        hne.B(sbO, ", score=", this.c, ", sportId=");
        ua80.v(sbO, this.d, ", globalChampId=", this.e);
        kng0.A(sbO, ", subSportId=", this.f, ", statId=");
        defpackage.c.i(sbO, this.h, this.g, ", stadiumId=");
        sbO.append(", matchInfos=");
        sbO.append(this.i);
        sbO.append(", extraInfo=");
        sbO.append(this.j);
        sbO.append(", videoUrls=");
        sbO.append(this.k);
        sbO.append(", startDate=");
        ua80.v(sbO, this.l, ", countSubGame=", this.m);
        sbO.append(", subGames=");
        sbO.append(this.n);
        sbO.append(", game=");
        sbO.append(this.o);
        return rw2.o(sbO, ", status=", this.p, ", expanded=false)");
    }
}
