package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class umv0 extends v8b implements xmv0 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;

    public umv0(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        super(22, Integer.valueOf(i3), null, q3d.j(new h9b(str), new g9b(i2), new f9b(i), new g9b(i2), new h9b(str2)));
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umv0)) {
            return false;
        }
        umv0 umv0Var = (umv0) obj;
        return this.d.equals(umv0Var.d) && this.e.equals(umv0Var.e) && this.f.equals(umv0Var.f) && this.g.equals(umv0Var.g) && this.h == umv0Var.h && this.i == umv0Var.i && this.j == umv0Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(ua80.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NameWithFlagCell(index=", this.d, ", name=", this.e, ", countryImage=");
        f140.v(sbN, this.f, ", playerId=", this.g, ", iconWidth=");
        axq.r(this.h, this.i, ", spaceWidth=", ", maxCellWidth=", sbN);
        return rz4.j(this.j, Separators.RPAREN, sbN);
    }
}
