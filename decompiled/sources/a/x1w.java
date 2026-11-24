package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x1w extends b2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40139a;
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
    public final List m;
    public final a2w n;
    public final a2w o;
    public final String p;
    public final String q;
    public final String r;
    public final boolean s;
    public final boolean t;

    public x1w(long j, String str, String str2, long j2, int i, String str3, long j3, long j4, HashMap map, String str4, List list, long j5, List list2, a2w a2wVar, a2w a2wVar2, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        this.f40139a = j;
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
        this.m = list2;
        this.n = a2wVar;
        this.o = a2wVar2;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = !list2.isEmpty();
        this.t = a2wVar.c.size() == 2 && a2wVar2.c.size() == 2;
    }

    @Override // a.d2w
    public final int a() {
        return this.e;
    }

    @Override // a.d2w
    public final long b() {
        return this.f40139a;
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
        if (!(obj instanceof x1w)) {
            return false;
        }
        x1w x1wVar = (x1w) obj;
        return this.f40139a == x1wVar.f40139a && Intrinsics.d(this.b, x1wVar.b) && Intrinsics.d(this.c, x1wVar.c) && this.d == x1wVar.d && this.e == x1wVar.e && this.f.equals(x1wVar.f) && this.g == x1wVar.g && this.h == x1wVar.h && this.i.equals(x1wVar.i) && Intrinsics.d(this.j, x1wVar.j) && Intrinsics.d(this.k, x1wVar.k) && this.l == x1wVar.l && this.m.equals(x1wVar.m) && this.n.equals(x1wVar.n) && this.o.equals(x1wVar.o) && this.p.equals(x1wVar.p) && this.q.equals(x1wVar.q) && this.r.equals(x1wVar.r);
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
        return this.r.hashCode() + ua80.b(ua80.b(brm0.e((this.o.hashCode() + ((this.n.hashCode() + dw9.a(rw2.b(dw9.a(ua80.b((this.i.hashCode() + rw2.b(rw2.b(ua80.b(twn.a(this.e, rw2.b(ua80.b(ua80.b(Long.hashCode(this.f40139a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31, 31, false), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40139a, "MultiTeamHistoryGame(id=", ", title=", this.b);
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
        sbO.append(", subGames=");
        sbO.append(this.m);
        sbO.append(", teamOne=");
        sbO.append(this.n);
        sbO.append(", teamTwo=");
        sbO.append(this.o);
        sbO.append(", expanded=false, status=");
        sbO.append(this.p);
        f140.v(sbO, ", scoreTeamOne=", this.q, ", scoreTeamTwo=", this.r);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
