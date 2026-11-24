package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gz60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12166a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final pao0 h;
    public final boolean i;

    public gz60(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, pao0 pao0Var, boolean z7) {
        this.f12166a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = pao0Var;
        this.i = z7;
    }

    public static gz60 a(gz60 gz60Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            str = gz60Var.f12166a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = gz60Var.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = gz60Var.c;
        }
        boolean z7 = z2;
        boolean z8 = (i & 8) != 0 ? gz60Var.d : z3;
        boolean z9 = gz60Var.e;
        boolean z10 = (i & 32) != 0 ? gz60Var.f : z4;
        boolean z11 = gz60Var.g;
        pao0 pao0Var = gz60Var.h;
        boolean z12 = (i & 256) != 0 ? gz60Var.i : z5;
        gz60Var.getClass();
        str2.getClass();
        return new gz60(str2, z6, z7, z8, z9, z10, z11, pao0Var, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz60)) {
            return false;
        }
        gz60 gz60Var = (gz60) obj;
        return this.f12166a.equals(gz60Var.f12166a) && this.b == gz60Var.b && this.c == gz60Var.c && this.d == gz60Var.d && this.e == gz60Var.e && this.f == gz60Var.f && this.g == gz60Var.g && this.h == gz60Var.h && this.i == gz60Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(this.f12166a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("OneXGamesHolderStateModel(selectedTab=", this.f12166a, ", underMaintenance=", this.b, ", networkError=");
        ua80.u(", tabBarVisible=", ", promoSupported=", sbU, this.c, this.d);
        ua80.u(", cashbackSupported=", ", favoritesSupported=", sbU, this.e, this.f);
        sbU.append(this.g);
        sbU.append(", tabBarType=");
        sbU.append(this.h);
        sbU.append(", isAnimationDialogShown=");
        return rw2.p(sbU, this.i, Separators.RPAREN);
    }
}
