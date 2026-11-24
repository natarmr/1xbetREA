package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pl50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27167a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pl50(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f27167a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl50)) {
            return false;
        }
        pl50 pl50Var = (pl50) obj;
        return this.f27167a == pl50Var.f27167a && this.b == pl50Var.b && this.c == pl50Var.c && this.d == pl50Var.d && this.e == pl50Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f27167a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NetworkState(isConnected=", ", isValidated=", ", isMetered=", this.f27167a, this.b);
        ua80.u(", isNotRoaming=", ", isBlocked=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
