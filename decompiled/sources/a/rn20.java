package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rn20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30767a;
    public final boolean b;
    public final boolean c;

    public rn20(boolean z, boolean z2, boolean z3) {
        this.f30767a = z;
        this.b = z2;
        this.c = z3;
    }

    public static rn20 a(rn20 rn20Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = rn20Var.f30767a;
        }
        if ((i & 2) != 0) {
            z2 = rn20Var.b;
        }
        if ((i & 4) != 0) {
            z3 = rn20Var.c;
        }
        rn20Var.getClass();
        return new rn20(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn20)) {
            return false;
        }
        rn20 rn20Var = (rn20) obj;
        return this.f30767a == rn20Var.f30767a && this.b == rn20Var.b && this.c == rn20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f30767a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("MakeBetWithoutEditStateModel(isEnabled=", ", isVisible=", ", taxAvailable=", this.f30767a, this.b), this.c, Separators.RPAREN);
    }
}
