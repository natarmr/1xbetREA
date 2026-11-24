package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vwh extends v8b implements xwh {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public vwh(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        super(22, Integer.valueOf(i4), null, q3d.j(new h9b(str), new g9b(i3), new f9b(i2), new g9b(i3), new h9b(str2)));
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwh)) {
            return false;
        }
        vwh vwhVar = (vwh) obj;
        return this.d.equals(vwhVar.d) && this.e.equals(vwhVar.e) && this.f.equals(vwhVar.f) && this.g.equals(vwhVar.g) && this.h == vwhVar.h && this.i == vwhVar.i && this.j == vwhVar.j && this.k == vwhVar.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + twn.a(this.j, twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(ua80.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NameWithFlagCell(index=", this.d, ", name=", this.e, ", countryImage=");
        f140.v(sbN, this.f, ", playerId=", this.g, ", tShirtImage=");
        axq.r(this.h, this.i, ", iconWidth=", ", spaceWidth=", sbN);
        return w6x.o(this.j, this.k, ", maxCellWidth=", Separators.RPAREN, sbN);
    }
}
