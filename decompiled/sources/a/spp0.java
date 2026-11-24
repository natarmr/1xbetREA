package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class spp0 extends ohm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32598a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final String q;
    public final String r;

    public spp0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6) {
        str5.getClass();
        str6.getClass();
        this.f32598a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = str5;
        this.r = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spp0)) {
            return false;
        }
        spp0 spp0Var = (spp0) obj;
        return this.f32598a == spp0Var.f32598a && this.b == spp0Var.b && this.c == spp0Var.c && this.d == spp0Var.d && this.e == spp0Var.e && this.f == spp0Var.f && this.g == spp0Var.g && this.h == spp0Var.h && this.i.equals(spp0Var.i) && this.j.equals(spp0Var.j) && this.k.equals(spp0Var.k) && this.l.equals(spp0Var.l) && this.m == spp0Var.m && this.n == spp0Var.n && this.o == spp0Var.o && this.p == spp0Var.p && Intrinsics.d(this.q, spp0Var.q) && Intrinsics.d(this.r, spp0Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + ua80.b(twn.a(this.p, twn.a(this.o, twn.a(this.n, twn.a(this.m, ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f32598a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31), 31), 31), 31, this.q);
    }

    @Override // a.ohm0
    public final boolean n() {
        return this.e;
    }

    @Override // a.ohm0
    public final int o() {
        return this.m;
    }

    @Override // a.ohm0
    public final long p() {
        return this.f32598a;
    }

    @Override // a.ohm0
    public final String q() {
        return this.i;
    }

    @Override // a.ohm0
    public final String r() {
        return this.q;
    }

    @Override // a.ohm0
    public final boolean s() {
        return this.g;
    }

    @Override // a.ohm0
    public final int t() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32598a, "PairTeamsUiModel(teamOneFirstPlayerId=", ", teamOneSecondPlayerId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", teamTwoFirstPlayerId=", this.c, ", teamTwoSecondPlayerId=");
        hne.t(this.d, ", teamOneFirstPlayerFavorite=", sbQ, this.e);
        w6x.A(", teamOneSecondPlayerFavorite=", ", teamTwoFirstPlayerFavorite=", sbQ, this.f, this.g);
        hne.u(", teamTwoSecondPlayerFavorite=", ", teamOneFirstPlayerImageUrl=", this.i, sbQ, this.h);
        f140.v(sbQ, ", teamOneSecondPlayerImageUrl=", this.j, ", teamTwoFirstPlayerImageUrl=", this.k);
        axq.s(this.m, ", teamTwoSecondPlayerImageUrl=", this.l, ", teamOneFirstPlayerFavoriteDrawRes=", sbQ);
        rw2.s(this.n, this.o, ", teamOneSecondPlayerFavoriteDrawRes=", ", teamTwoFirstPlayerFavoriteDrawRes=", sbQ);
        w6x.w(this.p, ", teamTwoSecondPlayerFavoriteDrawRes=", ", teamOneName=", this.q, sbQ);
        return rw2.o(sbQ, ", teamTwoName=", this.r, Separators.RPAREN);
    }

    @Override // a.ohm0
    public final long u() {
        return this.c;
    }

    @Override // a.ohm0
    public final String v() {
        return this.k;
    }

    @Override // a.ohm0
    public final String w() {
        return this.r;
    }
}
