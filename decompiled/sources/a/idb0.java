package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class idb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14577a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public idb0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f14577a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public static idb0 a(idb0 idb0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = idb0Var.f14577a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = idb0Var.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = idb0Var.c;
        }
        boolean z9 = z3;
        boolean z10 = (i & 8) != 0 ? idb0Var.d : true;
        if ((i & 16) != 0) {
            z4 = idb0Var.e;
        }
        boolean z11 = z4;
        if ((i & 32) != 0) {
            z5 = idb0Var.f;
        }
        boolean z12 = z5;
        if ((i & 64) != 0) {
            z6 = idb0Var.g;
        }
        return new idb0(z7, z8, z9, z10, z11, z12, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idb0)) {
            return false;
        }
        idb0 idb0Var = (idb0) obj;
        return this.f14577a == idb0Var.f14577a && this.b == idb0Var.b && this.c == idb0Var.c && this.d == idb0Var.d && this.e == idb0Var.e && this.f == idb0Var.f && this.g == idb0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f14577a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularInfoConditions(isResponsibleGameShow=", ", isBonusInformationShow=", ", isAuthOfferReadyToShow=", this.f14577a, this.b);
        ua80.u(", isAuthOfferShown=", ", isDeprecatedOsOnboardingShow=", sbQ, this.c, this.d);
        ua80.u(", isPopularPersonalizationShow=", ", isDeprecatedDeviceOnboardingShow=", sbQ, this.e, this.f);
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
