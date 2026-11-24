package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3585a;
    public final int b;
    public final int c;

    public c1p0(int i, int i2, int i3) {
        this.f3585a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1p0)) {
            return false;
        }
        c1p0 c1p0Var = (c1p0) obj;
        return this.f3585a == c1p0Var.f3585a && this.b == c1p0Var.b && this.c == c1p0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f3585a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("TeamBetOverallModel(winCount=", this.f3585a, ", drawCount=", ", lossesCount=", this.b));
    }
}
