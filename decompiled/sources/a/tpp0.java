package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tpp0 extends ohm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34345a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;

    public tpp0(long j, long j2, boolean z, boolean z2, String str, String str2, int i, int i2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f34345a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = i2;
        this.i = str3;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpp0)) {
            return false;
        }
        tpp0 tpp0Var = (tpp0) obj;
        return this.f34345a == tpp0Var.f34345a && this.b == tpp0Var.b && this.c == tpp0Var.c && this.d == tpp0Var.d && this.e.equals(tpp0Var.e) && this.f.equals(tpp0Var.f) && this.g == tpp0Var.g && this.h == tpp0Var.h && Intrinsics.d(this.i, tpp0Var.i) && Intrinsics.d(this.j, tpp0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(twn.a(this.h, twn.a(this.g, ua80.b(ua80.b(brm0.e(brm0.e(rw2.b(Long.hashCode(this.f34345a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i);
    }

    @Override // a.ohm0
    public final boolean n() {
        return this.c;
    }

    @Override // a.ohm0
    public final int o() {
        return this.g;
    }

    @Override // a.ohm0
    public final long p() {
        return this.f34345a;
    }

    @Override // a.ohm0
    public final String q() {
        return this.e;
    }

    @Override // a.ohm0
    public final String r() {
        return this.i;
    }

    @Override // a.ohm0
    public final boolean s() {
        return this.d;
    }

    @Override // a.ohm0
    public final int t() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34345a, "SingleTeamsUiModel(teamOneFirstPlayerId=", ", teamTwoFirstPlayerId=");
        hne.t(this.b, ", teamOneFirstPlayerFavorite=", sbQ, this.c);
        hne.u(", teamTwoFirstPlayerFavorite=", ", teamOneFirstPlayerImageUrl=", this.e, sbQ, this.d);
        axq.s(this.g, ", teamTwoFirstPlayerImageUrl=", this.f, ", teamOneFirstPlayerFavoriteDrawRes=", sbQ);
        w6x.w(this.h, ", teamTwoFirstPlayerFavoriteDrawRes=", ", teamOneName=", this.i, sbQ);
        return rw2.o(sbQ, ", teamTwoName=", this.j, Separators.RPAREN);
    }

    @Override // a.ohm0
    public final long u() {
        return this.b;
    }

    @Override // a.ohm0
    public final String v() {
        return this.f;
    }

    @Override // a.ohm0
    public final String w() {
        return this.j;
    }
}
