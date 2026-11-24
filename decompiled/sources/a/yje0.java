package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yje0 extends v8b implements bke0 {
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public yje0(int i, int i2, int i3, int i4) {
        super(14, null, Integer.valueOf(i4), q3d.j(new f9b(i2), new g9b(i3)));
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yje0)) {
            return false;
        }
        yje0 yje0Var = (yje0) obj;
        return this.d == yje0Var.d && this.e == yje0Var.e && this.f == yje0Var.f && this.g == yje0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, Integer.hashCode(this.d) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", minWidthCell=", Separators.RPAREN, dw9.t("RefereeTeamsColumnHeaderImage(iconRes=", this.d, ", iconWidth=", ", spaceWidth=", this.e));
    }
}
