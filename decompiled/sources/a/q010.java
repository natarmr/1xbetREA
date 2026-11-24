package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q010 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27872a;
    public final int b;
    public final int c;
    public final int d;

    public q010(int i, int i2, int i3, int i4) {
        this.f27872a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q010)) {
            return false;
        }
        q010 q010Var = (q010) obj;
        return this.f27872a == q010Var.f27872a && this.b == q010Var.b && this.c == q010Var.c && this.d == q010Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f27872a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", hitsCreepsCount=", Separators.RPAREN, dw9.t("LolHeroStatisticInfoModel(kills=", this.f27872a, ", deaths=", ", assists=", this.b));
    }
}
