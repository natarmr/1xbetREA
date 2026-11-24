package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final b2s0 f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;

    public a2s0(String str, String str2, int i, float f, int i2, b2s0 b2s0Var, int i3, int i4, int i5, float f2) {
        this.f140a = str;
        this.b = str2;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = b2s0Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2s0)) {
            return false;
        }
        a2s0 a2s0Var = (a2s0) obj;
        return this.f140a.equals(a2s0Var.f140a) && this.b.equals(a2s0Var.b) && this.c == a2s0Var.c && Float.compare(this.d, a2s0Var.d) == 0 && this.e == a2s0Var.e && this.f == a2s0Var.f && this.g == a2s0Var.g && this.h == a2s0Var.h && this.i == a2s0Var.i && Float.compare(this.j, a2s0Var.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + twn.a(this.i, twn.a(this.h, twn.a(this.g, (this.f.hashCode() + twn.a(this.e, defpackage.c.a(twn.a(this.c, ua80.b(this.f140a.hashCode() * 31, 31, this.b), 31), this.d, 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentLolFeedStatisticHeroModel(name=", this.f140a, ", imageS3=", this.b, ", tier=");
        sbN.append(this.c);
        sbN.append(", presence=");
        sbN.append(this.d);
        sbN.append(", picks=");
        sbN.append(this.e);
        sbN.append(", position=");
        sbN.append(this.f);
        sbN.append(", bans=");
        axq.r(this.g, this.h, ", wins=", ", loses=", sbN);
        sbN.append(this.i);
        sbN.append(", winrate=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
