package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wmr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39418a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final w0w f;
    public final String g;
    public final long h;
    public final List i;
    public final String j;
    public final long k;
    public final List l;
    public final String m;
    public final long n;
    public final String o;
    public final int p;
    public final double q;
    public final String r;
    public final String s;
    public final List t;
    public final List u;

    public wmr0(long j, String str, long j2, long j3, long j4, w0w w0wVar, String str2, long j5, List list, String str3, long j6, List list2, String str4, long j7, String str5, int i, double d, String str6, String str7, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f39418a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = w0wVar;
        this.g = str2;
        this.h = j5;
        this.i = list;
        this.j = str3;
        this.k = j6;
        this.l = list2;
        this.m = str4;
        this.n = j7;
        this.o = str5;
        this.p = i;
        this.q = d;
        this.r = str6;
        this.s = str7;
        this.t = list3;
        this.u = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmr0)) {
            return false;
        }
        wmr0 wmr0Var = (wmr0) obj;
        return this.f39418a == wmr0Var.f39418a && this.b.equals(wmr0Var.b) && this.c == wmr0Var.c && this.d == wmr0Var.d && this.e == wmr0Var.e && this.f == wmr0Var.f && this.g.equals(wmr0Var.g) && this.h == wmr0Var.h && Intrinsics.d(this.i, wmr0Var.i) && this.j.equals(wmr0Var.j) && this.k == wmr0Var.k && Intrinsics.d(this.l, wmr0Var.l) && this.m.equals(wmr0Var.m) && this.n == wmr0Var.n && this.o.equals(wmr0Var.o) && this.p == wmr0Var.p && Double.compare(this.q, wmr0Var.q) == 0 && this.r.equals(wmr0Var.r) && this.s.equals(wmr0Var.s) && Intrinsics.d(this.t, wmr0Var.t) && Intrinsics.d(this.u, wmr0Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + dw9.a(ua80.b(ua80.b(brm0.d(this.q, twn.a(this.p, ua80.b(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b((this.f.hashCode() + rw2.b(rw2.b(rw2.b(ua80.b(Long.hashCode(this.f39418a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39418a, "TotoGameModel(champId=", ", champName=", this.b);
        kng0.A(sbO, ", dateStart=", this.c, ", mainGameId=");
        sbO.append(this.d);
        kng0.A(sbO, ", gameId=", this.e, ", status=");
        sbO.append(this.f);
        sbO.append(", teamOne=");
        sbO.append(this.g);
        sbO.append(", teamOneId=");
        hne.x(sbO, this.h, ", teamOneImageList=", this.i);
        hne.B(sbO, ", teamSecond=", this.j, ", teamSecondId=");
        hne.x(sbO, this.k, ", teamSecondImageList=", this.l);
        hne.B(sbO, ", score=", this.m, ", sportId=");
        kng0.z(sbO, this.n, ", typeEventName=", this.o);
        rw2.x(sbO, ", typeEventId=", this.p, ", total=");
        hne.w(sbO, this.q, ", periodName=", this.r);
        ua80.t(", gameTypeName=", this.s, ", eventParamsList=", sbO, this.t);
        return ohs0.s(sbO, ", eventParamsPlayerNames=", this.u, Separators.RPAREN);
    }
}
