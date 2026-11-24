package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f13792a;
    public final boolean b;
    public final boolean c;

    public hx10(iz30 iz30Var, boolean z, boolean z2) {
        this.f13792a = iz30Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx10)) {
            return false;
        }
        hx10 hx10Var = (hx10) obj;
        return this.f13792a == hx10Var.f13792a && this.b == hx10Var.b && this.c == hx10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f13792a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(w6x.s("MenuItemAuthenticatorModel(menuItem=", this.f13792a, ", enabled=", this.b, ", bettingDisabled="), this.c, Separators.RPAREN);
    }
}
