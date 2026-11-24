package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mje0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21893a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;

    public mje0(String str, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i, int i2, int i3, int i4) {
        this.f21893a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
        this.g = d6;
        this.h = d7;
        this.i = d8;
        this.j = d9;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mje0)) {
            return false;
        }
        mje0 mje0Var = (mje0) obj;
        return this.f21893a.equals(mje0Var.f21893a) && Double.compare(this.b, mje0Var.b) == 0 && Double.compare(this.c, mje0Var.c) == 0 && Double.compare(this.d, mje0Var.d) == 0 && Double.compare(this.e, mje0Var.e) == 0 && Double.compare(this.f, mje0Var.f) == 0 && Double.compare(this.g, mje0Var.g) == 0 && Double.compare(this.h, mje0Var.h) == 0 && Double.compare(this.i, mje0Var.i) == 0 && Double.compare(this.j, mje0Var.j) == 0 && this.k == mje0Var.k && this.l == mje0Var.l && this.m == mje0Var.m && this.n == mje0Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + twn.a(this.m, twn.a(this.l, twn.a(this.k, brm0.d(this.j, brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, this.f21893a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefereeTeamInfoModel(tournament=");
        sb.append(this.f21893a);
        sb.append(", winRatio=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", loseRatio=", ", drawRatio=");
        sb.append(this.d);
        ohs0.A(sb, this.e, ", pointsPerGame=", ", penaltiesAwardedAgainstPerGame=");
        sb.append(this.f);
        ohs0.A(sb, this.g, ", foulsAwardedAgainstPerGame=", ", foulsPerTackle=");
        sb.append(this.h);
        ohs0.A(sb, this.i, ", yellowCardsPerGame=", ", redCardsPerGame=");
        rz4.w(sb, this.j, ", numParticipation=", this.k);
        rw2.s(this.l, this.m, ", yellowCards=", ", redCards=", sb);
        return vqd.p(sb, ", penalties=", this.n, Separators.RPAREN);
    }
}
