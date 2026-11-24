package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fka0 extends w8b {
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public fka0(int i, int i2, int i3, String str) {
        super(new h9b(str), Integer.valueOf(i3), Integer.valueOf(i2), 6);
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fka0)) {
            return false;
        }
        fka0 fka0Var = (fka0) obj;
        return this.d.equals(fka0Var.d) && this.e == fka0Var.e && this.f == fka0Var.f && this.g == fka0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, this.d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", maxWidthCell=", Separators.RPAREN, kng0.p(this.e, "PlayersStatisticsRowHeader(title=", this.d, ", spaceWidth=", ", minWidthCell="));
    }
}
