package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16321a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jdb0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f16321a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static jdb0 a(jdb0 jdb0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = jdb0Var.f16321a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = jdb0Var.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = jdb0Var.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = jdb0Var.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = jdb0Var.e;
        }
        jdb0Var.getClass();
        return new jdb0(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdb0)) {
            return false;
        }
        jdb0 jdb0Var = (jdb0) obj;
        return this.f16321a == jdb0Var.f16321a && this.b == jdb0Var.b && this.c == jdb0Var.c && this.d == jdb0Var.d && this.e == jdb0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f16321a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularMainInfoStateModel(isResponsibleGameShow=", ", isDeprecatedOsOnboardingShow=", ", isBonusInformationShow=", this.f16321a, this.b);
        ua80.u(", isAuthOfferShow=", ", isShowReady=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
