package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wke0 extends v8b {
    public final int d;
    public final int e;
    public final int f;

    public wke0(int i, int i2, int i3) {
        super(30, null, null, q3d.j(new f9b(i2), new g9b(i3)));
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wke0)) {
            return false;
        }
        wke0 wke0Var = (wke0) obj;
        return this.d == wke0Var.d && this.e == wke0Var.e && this.f == wke0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, Integer.hashCode(this.d) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, dw9.t("IconColumnHeader(iconRes=", this.d, ", iconWidth=", ", spaceWidth=", this.e));
    }
}
