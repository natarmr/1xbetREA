package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mbs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21523a;
    public final uoy b;
    public final izc c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    public final double k;
    public final double l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final long t;
    public final long u;
    public final zfa0 v;
    public final boolean w;

    public mbs0(long j, uoy uoyVar, izc izcVar, boolean z, boolean z2, long j2, String str, long j3, long j4, String str2, double d, double d2, String str3, String str4, String str5, String str6, boolean z3, boolean z4, boolean z5, long j5, long j6, zfa0 zfa0Var, boolean z6) {
        izcVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        zfa0Var.getClass();
        this.f21523a = j;
        this.b = uoyVar;
        this.c = izcVar;
        this.d = z;
        this.e = z2;
        this.f = j2;
        this.g = str;
        this.h = j3;
        this.i = j4;
        this.j = str2;
        this.k = d;
        this.l = d2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = j5;
        this.u = j6;
        this.v = zfa0Var;
        this.w = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbs0)) {
            return false;
        }
        mbs0 mbs0Var = (mbs0) obj;
        return this.f21523a == mbs0Var.f21523a && this.b == mbs0Var.b && this.c == mbs0Var.c && this.d == mbs0Var.d && this.e == mbs0Var.e && this.f == mbs0Var.f && Intrinsics.d(this.g, mbs0Var.g) && this.h == mbs0Var.h && this.i == mbs0Var.i && Intrinsics.d(this.j, mbs0Var.j) && Double.compare(this.k, mbs0Var.k) == 0 && Double.compare(this.l, mbs0Var.l) == 0 && Intrinsics.d(this.m, mbs0Var.m) && Intrinsics.d(this.n, mbs0Var.n) && Intrinsics.d(this.o, mbs0Var.o) && Intrinsics.d(this.p, mbs0Var.p) && this.q == mbs0Var.q && this.r == mbs0Var.r && this.s == mbs0Var.s && this.t == mbs0Var.t && this.u == mbs0Var.u && Intrinsics.d(this.v, mbs0Var.v) && this.w == mbs0Var.w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + ((this.v.hashCode() + rw2.b(rw2.b(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(brm0.d(this.l, brm0.d(this.k, ua80.b(rw2.b(rw2.b(ua80.b(rw2.b(brm0.e(brm0.e((this.c.hashCode() + twn.d(this.b, Long.hashCode(this.f21523a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackBetInfoModel(gameId=");
        sb.append(this.f21523a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append(", coefState=");
        sb.append(this.c);
        sb.append(", blocked=");
        sb.append(this.d);
        rz4.A(sb, ", relation=", this.e, ", playerId=");
        kng0.z(sb, this.f, ", playerName=", this.g);
        kng0.A(sb, ", betId=", this.h, ", groupId=");
        kng0.z(sb, this.i, ", betParam=", this.j);
        ohs0.A(sb, this.k, ", param=", ", betCoef=");
        hne.w(sb, this.l, ", betCoefV=", this.m);
        f140.v(sb, ", coefViewName=", this.n, ", betName=", this.o);
        w6x.z(", groupName=", this.p, ", startingPrice=", sb, this.q);
        w6x.A(", isTracked=", ", finishedGame=", sb, this.r, this.s);
        kng0.A(sb, ", subSportId=", this.t, ", gameTypeId=");
        sb.append(this.u);
        sb.append(", playersDuelModel=");
        sb.append(this.v);
        return f140.n(sb, ", bannedExpress=", this.w, Separators.RPAREN);
    }
}
