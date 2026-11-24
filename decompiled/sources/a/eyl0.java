package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eyl0 extends v8b {
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public eyl0(int i, String str, int i2, String str2) {
        super(30, null, null, q3d.j(new f9b(i), new g9b(i2), new h9b(str)));
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyl0)) {
            return false;
        }
        eyl0 eyl0Var = (eyl0) obj;
        return this.d.equals(eyl0Var.d) && this.e.equals(eyl0Var.e) && this.f == eyl0Var.f && this.g == eyl0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, ua80.b(this.d.hashCode() * 31, 31, this.e), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", spaceWidth=", Separators.RPAREN, b1j.n("StageCell(stageTitle=", this.d, ", countryImage=", this.e, ", iconWidth="));
    }
}
