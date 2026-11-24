package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class um4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35903a;
    public final boolean b;
    public final boolean c;

    public um4(boolean z, boolean z2, boolean z3) {
        this.f35903a = z;
        this.b = z2;
        this.c = z3;
    }

    public static um4 a(um4 um4Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = um4Var.f35903a;
        }
        if ((i & 2) != 0) {
            z2 = um4Var.b;
        }
        if ((i & 4) != 0) {
            z3 = um4Var.c;
        }
        um4Var.getClass();
        return new um4(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um4)) {
            return false;
        }
        um4 um4Var = (um4) obj;
        return this.f35903a == um4Var.f35903a && this.b == um4Var.b && this.c == um4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f35903a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("AuthProcessDelegateState(isLoading=", ", isNewApi=", ", isActivatePhoneNecessarily=", this.f35903a, this.b), this.c, Separators.RPAREN);
    }
}
