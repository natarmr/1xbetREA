package a;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class crr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4860a;
    public final Date b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;
    public final String m;
    public final int n;
    public final String o;
    public final List p;
    public final List q;
    public final long r;
    public final long s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final long x;

    public crr0(int i, Date date, String str, long j, String str2, String str3, String str4, int i2, String str5, int i3, int i4, String str6, String str7, int i5, String str8, List list, iun iunVar, long j2, long j3, String str9, String str10, long j4, long j5, long j6) {
        str2.getClass();
        str6.getClass();
        str7.getClass();
        list.getClass();
        iunVar.getClass();
        this.f4860a = i;
        this.b = date;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i2;
        this.i = str5;
        this.j = i3;
        this.k = i4;
        this.l = str6;
        this.m = str7;
        this.n = i5;
        this.o = str8;
        this.p = list;
        this.q = iunVar;
        this.r = j2;
        this.s = j3;
        this.t = str9;
        this.u = str10;
        this.v = j4;
        this.w = j5;
        this.x = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crr0)) {
            return false;
        }
        crr0 crr0Var = (crr0) obj;
        return this.f4860a == crr0Var.f4860a && this.b.equals(crr0Var.b) && this.c.equals(crr0Var.c) && this.d == crr0Var.d && Intrinsics.d(this.e, crr0Var.e) && this.f.equals(crr0Var.f) && this.g.equals(crr0Var.g) && this.h == crr0Var.h && this.i.equals(crr0Var.i) && this.j == crr0Var.j && this.k == crr0Var.k && Intrinsics.d(this.l, crr0Var.l) && Intrinsics.d(this.m, crr0Var.m) && this.n == crr0Var.n && this.o.equals(crr0Var.o) && Intrinsics.d(this.p, crr0Var.p) && Intrinsics.d(this.q, crr0Var.q) && this.r == crr0Var.r && this.s == crr0Var.s && this.t.equals(crr0Var.t) && this.u.equals(crr0Var.u) && this.v == crr0Var.v && this.w == crr0Var.w && this.x == crr0Var.x;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + rw2.b(rw2.b(rw2.b(rw2.b(ua80.b(ua80.b(rw2.b(rw2.b(dw9.a(dw9.a(ua80.b(twn.a(this.n, ua80.b(ua80.b(twn.a(this.k, twn.a(this.j, ua80.b(twn.a(this.h, ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(brm0.i(this.b, Integer.hashCode(this.f4860a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoJackpotTiragGameModel(gameNumber=");
        sb.append(this.f4860a);
        sb.append(", startDate=");
        sb.append(this.b);
        sb.append(", gameName=");
        defpackage.c.i(sb, this.d, this.c, ", champInfoId=");
        f140.v(sb, ", champInfoName=", this.e, ", champInfoCountryImage=", this.f);
        axq.s(this.h, ", champInfoImage=", this.g, ", champInfoCountryId=", sb);
        axq.s(this.j, ", score=", this.i, ", sportId=", sb);
        w6x.w(this.k, ", bukGameId=", ", opponent1Name=", this.l, sb);
        axq.s(this.n, ", opponent2Name=", this.m, ", periodInt=", sb);
        ua80.t(", periodString=", this.o, ", betsPercents=", sb, this.p);
        sb.append(", chosenOutcomes=");
        sb.append(this.q);
        sb.append(", opponent1TranslateId=");
        sb.append(this.r);
        kng0.A(sb, ", opponent2TranslateId=", this.s, ", opponentImg1=");
        f140.v(sb, this.t, ", opponentImg2=", this.u, ", opponentCountryId1=");
        sb.append(this.v);
        kng0.A(sb, ", opponentCountryId2=", this.w, ", constId=");
        return brm0.k(this.x, ", vidId=0, typeId=0)", sb);
    }
}
