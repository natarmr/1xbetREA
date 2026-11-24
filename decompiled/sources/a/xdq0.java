package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xdq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lgq0 f40708a;
    public final int b;
    public final int c;

    public xdq0(lgq0 lgq0Var, int i, int i2) {
        lgq0Var.getClass();
        this.f40708a = lgq0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdq0)) {
            return false;
        }
        xdq0 xdq0Var = (xdq0) obj;
        return this.f40708a == xdq0Var.f40708a && this.b == xdq0Var.b && this.c == xdq0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f40708a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileMatchingCellModel(type=");
        sb.append(this.f40708a);
        sb.append(", row=");
        sb.append(this.b);
        sb.append(", column=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
