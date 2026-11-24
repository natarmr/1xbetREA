package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zje0 extends v8b implements bke0 {
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;

    public zje0(String str, int i, int i2, int i3, String str2) {
        super(22, Integer.valueOf(i3), null, q3d.j(new f9b(i), new g9b(i2), new h9b(str)));
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zje0)) {
            return false;
        }
        zje0 zje0Var = (zje0) obj;
        return this.d.equals(zje0Var.d) && this.e.equals(zje0Var.e) && this.f == zje0Var.f && this.g == zje0Var.g && this.h == zje0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, twn.a(this.f, ua80.b(this.d.hashCode() * 31, 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamRowHeader(title=", this.d, ", image=", this.e, ", iconWidth=");
        axq.r(this.f, this.g, ", spaceWidth=", ", maxCellWidth=", sbN);
        return rz4.j(this.h, Separators.RPAREN, sbN);
    }
}
