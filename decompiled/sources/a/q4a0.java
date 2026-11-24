package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q4a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final znq0 f28088a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ufp0 f;
    public final ufp0 g;
    public final int h;
    public final String i;
    public final int j;
    public final String k;

    public q4a0(znq0 znq0Var, int i, int i2, int i3, int i4, ufp0 ufp0Var, ufp0 ufp0Var2, int i5, String str, int i6, String str2) {
        this.f28088a = znq0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = ufp0Var;
        this.g = ufp0Var2;
        this.h = i5;
        this.i = str;
        this.j = i6;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4a0)) {
            return false;
        }
        q4a0 q4a0Var = (q4a0) obj;
        return this.f28088a.equals(q4a0Var.f28088a) && this.b == q4a0Var.b && this.c == q4a0Var.c && this.d == q4a0Var.d && this.e == q4a0Var.e && this.f.equals(q4a0Var.f) && this.g.equals(q4a0Var.g) && this.h == q4a0Var.h && this.i.equals(q4a0Var.i) && this.j == q4a0Var.j && this.k.equals(q4a0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + twn.a(this.j, ua80.b(twn.a(this.h, twn.f(this.g, twn.f(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f28088a.f44687a) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerLastGameModel(dateStart=");
        sb.append(this.f28088a);
        sb.append(", goals=");
        sb.append(this.b);
        sb.append(", redCards=");
        axq.r(this.c, this.d, ", scoreTeamOne=", ", scoreTeamTwo=", sb);
        sb.append(this.e);
        sb.append(", teamOne=");
        sb.append(this.f);
        sb.append(", teamTwo=");
        sb.append(this.g);
        sb.append(", time=");
        sb.append(this.h);
        sb.append(", tournamentTitle=");
        twn.w(this.j, this.i, ", yellowCards=", ", gameId=", sb);
        return axq.n(sb, this.k, Separators.RPAREN);
    }
}
