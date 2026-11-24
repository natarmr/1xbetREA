package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class px10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f27734a;
    public final int b;
    public final boolean c;

    public px10(iz30 iz30Var, int i, boolean z) {
        this.f27734a = iz30Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px10)) {
            return false;
        }
        px10 px10Var = (px10) obj;
        return this.f27734a == px10Var.f27734a && this.b == px10Var.b && this.c == px10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f27734a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuItemPromoCodesModel(menuItem=");
        sb.append(this.f27734a);
        sb.append(", promoPoints=");
        sb.append(this.b);
        sb.append(", enablePromoBalance=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
