package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nv70 implements pv70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24178a;
    public final int b;
    public final int c;

    public nv70(int i, int i2, int i3) {
        this.f24178a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv70)) {
            return false;
        }
        nv70 nv70Var = (nv70) obj;
        return this.f24178a == nv70Var.f24178a && this.b == nv70Var.b && this.c == nv70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f24178a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("WithBannerId(bannerId=", this.f24178a, ", position=", ", categoryTypeId=", this.b));
    }
}
