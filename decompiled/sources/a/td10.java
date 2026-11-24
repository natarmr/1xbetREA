package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class td10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33743a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public td10(String str, boolean z, boolean z2, boolean z3) {
        this.f33743a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static td10 a(td10 td10Var, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = td10Var.f33743a;
        }
        boolean z3 = td10Var.b;
        td10Var.getClass();
        str.getClass();
        return new td10(str, z3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td10)) {
            return false;
        }
        td10 td10Var = (td10) obj;
        return this.f33743a.equals(td10Var.f33743a) && this.b == td10Var.b && this.c == td10Var.c && this.d == td10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f33743a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isLoadingError=", Separators.RPAREN, brm0.u("LottoStateModel(gameUrl=", this.f33743a, ", debugAllowed=", this.b, ", isLoading="), this.c, this.d);
    }
}
