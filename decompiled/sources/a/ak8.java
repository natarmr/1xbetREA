package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ak8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1010a;
    public final String b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final long h;
    public final String i;
    public final int j;

    public ak8(int i, String str, int i2, double d, double d2, double d3, double d4, long j, String str2, int i3) {
        this.f1010a = i;
        this.b = str;
        this.c = i2;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = j;
        this.i = str2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak8)) {
            return false;
        }
        ak8 ak8Var = (ak8) obj;
        return this.f1010a == ak8Var.f1010a && this.b.equals(ak8Var.b) && this.c == ak8Var.c && Double.compare(this.d, ak8Var.d) == 0 && Double.compare(this.e, ak8Var.e) == 0 && Double.compare(this.f, ak8Var.f) == 0 && Double.compare(this.g, ak8Var.g) == 0 && this.h == ak8Var.h && this.i.equals(ak8Var.i) && Double.compare(0.0d, 0.0d) == 0 && this.j == ak8Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + brm0.d(0.0d, twn.a(0, ua80.b(rw2.b(rw2.b(brm0.d(this.g, brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, twn.a(this.c, ua80.b(Integer.hashCode(this.f1010a) * 31, 31, this.b), 31), 31), 31), 31), 31), 31, 0L), 31, this.h), 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f1010a, "BonusesModel(id=", ", bonusName=", this.b, ", typeBonus=");
        sbR.append(this.c);
        sbR.append(", bonusStart=");
        sbR.append(this.d);
        ohs0.A(sbR, this.e, ", bonusFact=", ", bonusFinish=");
        sbR.append(this.f);
        ohs0.A(sbR, this.g, ", bonusLeft=", ", timeStart=0, timeFinish=");
        kng0.z(sbR, this.h, ", currencyCode=", this.i);
        return vqd.p(sbR, ", progress=0, money=0.0, bonusClosed=", this.j, Separators.RPAREN);
    }
}
