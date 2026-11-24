package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26170a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;

    public p0u0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, String str2, int i11, int i12, int i13) {
        this.f26170a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = str;
        this.l = str2;
        this.m = i11;
        this.n = i12;
        this.o = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0u0)) {
            return false;
        }
        p0u0 p0u0Var = (p0u0) obj;
        return this.f26170a == p0u0Var.f26170a && this.b == p0u0Var.b && this.c == p0u0Var.c && this.d == p0u0Var.d && this.e == p0u0Var.e && this.f == p0u0Var.f && this.g == p0u0Var.g && this.h == p0u0Var.h && this.i == p0u0Var.i && this.j == p0u0Var.j && this.k.equals(p0u0Var.k) && this.l.equals(p0u0Var.l) && this.m == p0u0Var.m && this.n == p0u0Var.n && this.o == p0u0Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + twn.a(this.n, twn.a(this.m, ua80.b(ua80.b(twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f26170a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.k), 31, this.l), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ValorantStatisticMatchesMatchTeamPlayerModel(id=", this.f26170a, ", kills=", ", deaths=", this.b);
        axq.r(this.c, this.d, ", assists=", ", multiKills=", sbT);
        axq.r(this.e, this.f, ", clutches=", ", firstKills=", sbT);
        axq.r(this.g, this.h, ", firstDeaths=", ", damageAvg=", sbT);
        axq.r(this.i, this.j, ", combatScoreAvg=", ", heroName=", sbT);
        f140.v(sbT, this.k, ", heroImage=", this.l, ", numberOfHeadShots=");
        axq.r(this.m, this.n, ", numberOfBodyShots=", ", numberOfLegShots=", sbT);
        return rz4.j(this.o, Separators.RPAREN, sbT);
    }
}
