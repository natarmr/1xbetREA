package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fsd0 extends v8b implements isd0 {
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;

    public fsd0(int i, int i2, int i3, String str, String str2, String str3) {
        super(22, Integer.valueOf(i3), null, q3d.j(new h9b(str), new g9b(i2), new f9b(i), new g9b(i2), new h9b(str2)));
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsd0)) {
            return false;
        }
        fsd0 fsd0Var = (fsd0) obj;
        return this.d.equals(fsd0Var.d) && this.e.equals(fsd0Var.e) && this.f.equals(fsd0Var.f) && this.g == fsd0Var.g && this.h == fsd0Var.h && this.i == fsd0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, twn.a(this.g, ua80.b(ua80.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PilotRowHeader(position=", this.d, ", pilotName=", this.e, ", countryImage=");
        twn.w(this.g, this.f, ", iconWidth=", ", spaceWidth=", sbN);
        return w6x.o(this.h, this.i, ", maxCellWidth=", Separators.RPAREN, sbN);
    }
}
