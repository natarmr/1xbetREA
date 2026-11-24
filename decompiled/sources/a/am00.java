package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class am00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1087a;
    public final double b;
    public final long c;
    public final long d;
    public final double e;
    public final boolean f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public final long o;
    public final String p;
    public final String q;
    public final List r;
    public final List s;
    public final long t;
    public final int u;
    public final String v;
    public final zfa0 w;
    public final yeo x;

    public am00(long j, double d, long j2, long j3, double d2, boolean z, long j4, String str, String str2, String str3, String str4, String str5, String str6, long j5, long j6, String str7, String str8, List list, List list2, long j7, int i, String str9, zfa0 zfa0Var, yeo yeoVar) {
        list.getClass();
        list2.getClass();
        zfa0Var.getClass();
        this.f1087a = j;
        this.b = d;
        this.c = j2;
        this.d = j3;
        this.e = d2;
        this.f = z;
        this.g = j4;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = j5;
        this.o = j6;
        this.p = str7;
        this.q = str8;
        this.r = list;
        this.s = list2;
        this.t = j7;
        this.u = i;
        this.v = str9;
        this.w = zfa0Var;
        this.x = yeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am00)) {
            return false;
        }
        am00 am00Var = (am00) obj;
        return this.f1087a == am00Var.f1087a && Double.compare(this.b, am00Var.b) == 0 && this.c == am00Var.c && this.d == am00Var.d && Double.compare(this.e, am00Var.e) == 0 && this.f == am00Var.f && this.g == am00Var.g && this.h.equals(am00Var.h) && this.i.equals(am00Var.i) && this.j.equals(am00Var.j) && this.k.equals(am00Var.k) && this.l.equals(am00Var.l) && this.m.equals(am00Var.m) && this.n == am00Var.n && this.o == am00Var.o && this.p.equals(am00Var.p) && this.q.equals(am00Var.q) && Intrinsics.d(this.r, am00Var.r) && Intrinsics.d(this.s, am00Var.s) && this.t == am00Var.t && this.u == am00Var.u && this.v.equals(am00Var.v) && Intrinsics.d(this.w, am00Var.w) && this.x.equals(am00Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + ((this.w.hashCode() + ua80.b(twn.a(this.u, rw2.b(dw9.a(dw9.a(ua80.b(ua80.b(rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(brm0.e(brm0.d(this.e, rw2.b(rw2.b(brm0.d(this.b, Long.hashCode(this.f1087a) * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31), 31, this.v)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f1087a, "LoadCouponEventModel(sportId=", ", coef=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", type=", this.c, ", groupId=");
        sbQ.append(this.d);
        ohs0.A(sbQ, this.e, ", param=", ", block=");
        rw2.v(this.g, ", playerId=", sbQ, this.f);
        f140.v(sbQ, ", playerName=", this.h, ", periodName=", this.i);
        f140.v(sbQ, ", sportName=", this.j, ", marketName=", this.k);
        f140.v(sbQ, ", champName=", this.l, ", fullName=", this.m);
        kng0.A(sbQ, ", gameId=", this.n, ", mainGameId=");
        kng0.z(sbQ, this.o, ", opp1=", this.p);
        ua80.t(", opp2=", this.q, ", opp1Images=", sbQ, this.r);
        sbQ.append(", opp2Images=");
        sbQ.append(this.s);
        sbQ.append(", start=");
        ua80.v(sbQ, this.t, ", kind=", this.u);
        sbQ.append(", gameType=");
        sbQ.append(this.v);
        sbQ.append(", playersDuelModel=");
        sbQ.append(this.w);
        sbQ.append(", eventParams=");
        sbQ.append(this.x);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
