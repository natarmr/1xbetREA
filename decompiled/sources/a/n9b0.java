package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n9b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23132a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final hab0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final hab0 j;

    public n9b0(int i, boolean z, boolean z2, boolean z3, boolean z4, hab0 hab0Var, boolean z5, boolean z6, boolean z7, hab0 hab0Var2) {
        this.f23132a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = hab0Var;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = hab0Var2;
    }

    public final boolean a() {
        return !this.b && !this.c && this.g && ((Boolean) this.f.invoke()).booleanValue();
    }

    public final boolean b() {
        return this.h && this.i && ((Boolean) this.j.invoke()).booleanValue() && !this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n9b0) {
            n9b0 n9b0Var = (n9b0) obj;
            return this.f23132a == n9b0Var.f23132a && this.b == n9b0Var.b && this.c == n9b0Var.c && this.d == n9b0Var.d && this.e == n9b0Var.e && this.f == n9b0Var.f && this.g == n9b0Var.g && this.h == n9b0Var.h && this.i == n9b0Var.i && this.j == n9b0Var.j;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.e(brm0.e(brm0.e((this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(Integer.hashCode(this.f23132a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f23132a, "PopularClassicScreenSettingsModel(filterCount=", ", isLowMemory=", ", isBettingDisable=", this.b);
        ua80.u(", hasStream=", ", isTablet=", sbL, this.c, this.d);
        sbL.append(this.e);
        sbL.append(", isBannersLocalEnable=");
        sbL.append(this.f);
        sbL.append(", isBannersEnable=");
        ua80.u(", isOneXGamesEnable=", ", isPopularGamesCaruselEnable=", sbL, this.g, this.h);
        sbL.append(this.i);
        sbL.append(", isOneXGamesLocalEnable=");
        sbL.append(this.j);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
