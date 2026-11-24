package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33271a;
    public final boolean b;
    public final boolean c;

    public t3j0(boolean z, boolean z2, boolean z3) {
        this.f33271a = z;
        this.b = z2;
        this.c = z3;
    }

    public static t3j0 a(t3j0 t3j0Var, boolean z, boolean z2, int i) {
        boolean z3 = t3j0Var.f33271a;
        if ((i & 2) != 0) {
            z = t3j0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = t3j0Var.c;
        }
        return new t3j0(z3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3j0)) {
            return false;
        }
        t3j0 t3j0Var = (t3j0) obj;
        return this.f33271a == t3j0Var.f33271a && this.b == t3j0Var.b && this.c == t3j0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f33271a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("SettingsMakeBetExactCoefStateModel(hasSectionEnabled=", ", hasResetCoefOnScoreChangeToggleEnabled=", ", hasConfirmTransactionFromLineToLive=", this.f33271a, this.b), this.c, Separators.RPAREN);
    }
}
