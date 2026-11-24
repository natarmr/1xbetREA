package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eka0 extends v8b {
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public eka0(int i, int i2, int i3, String str) {
        super(6, Integer.valueOf(i2), Integer.valueOf(i), q3d.j(new h9b(str), new g9b(i3)));
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eka0)) {
            return false;
        }
        eka0 eka0Var = (eka0) obj;
        return this.d.equals(eka0Var.d) && this.e == eka0Var.e && this.f == eka0Var.f && this.g == eka0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, this.d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", spaceWidth=", Separators.RPAREN, kng0.p(this.e, "PlayersStatisticsColumnHeader(title=", this.d, ", minWidthCell=", ", maxWidthCell="));
    }
}
