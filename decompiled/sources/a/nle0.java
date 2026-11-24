package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jle0 f23722a;
    public final int b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final int h;
    public final int i;
    public final int j;

    public nle0(jle0 jle0Var, int i, double d, double d2, double d3, double d4, double d5, int i2, int i3, int i4) {
        this.f23722a = jle0Var;
        this.b = i;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nle0)) {
            return false;
        }
        nle0 nle0Var = (nle0) obj;
        return this.f23722a.equals(nle0Var.f23722a) && this.b == nle0Var.b && Double.compare(this.c, nle0Var.c) == 0 && Double.compare(this.d, nle0Var.d) == 0 && Double.compare(this.e, nle0Var.e) == 0 && Double.compare(this.f, nle0Var.f) == 0 && Double.compare(this.g, nle0Var.g) == 0 && this.h == nle0Var.h && this.i == nle0Var.i && this.j == nle0Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, twn.a(this.h, brm0.d(this.g, brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, twn.a(this.b, this.f23722a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefereeTourInfoModel(tournament=");
        sb.append(this.f23722a);
        sb.append(", numGames=");
        sb.append(this.b);
        sb.append(", foulsPerGame=");
        sb.append(this.c);
        ohs0.A(sb, this.d, ", foulsPerTackle=", ", penaltiesAwardedAgainstPerGame=");
        sb.append(this.e);
        ohs0.A(sb, this.f, ", yellowCardsPerGame=", ", redCardsPerGame=");
        rz4.w(sb, this.g, ", yellowCards=", this.h);
        rw2.s(this.i, this.j, ", redCards=", ", penalties=", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
