package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42307a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public yam0(int i, int i2, int i3, int i4, String str) {
        this.f42307a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yam0)) {
            return false;
        }
        yam0 yam0Var = (yam0) obj;
        return this.f42307a.equals(yam0Var.f42307a) && this.b == yam0Var.b && this.c == yam0Var.c && this.d == yam0Var.d && this.e == yam0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f42307a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "StatisticByYearModel(season=", this.f42307a, ", shootingPerc=", ", pronePerc=");
        axq.r(this.c, this.d, ", standingPerc=", ", skiingPerc=", sbP);
        return rz4.j(this.e, Separators.RPAREN, sbP);
    }
}
