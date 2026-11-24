package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f20792a;
    public final String b;
    public final boolean c;

    public lx10(iz30 iz30Var, String str, boolean z) {
        this.f20792a = iz30Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx10)) {
            return false;
        }
        lx10 lx10Var = (lx10) obj;
        return this.f20792a == lx10Var.f20792a && this.b.equals(lx10Var.b) && this.c == lx10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f20792a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuItemCustomTitleModel(menuItem=");
        sb.append(this.f20792a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", bettingDisabled=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
