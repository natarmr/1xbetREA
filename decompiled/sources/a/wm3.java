package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wm3 implements zm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39385a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public wm3(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f39385a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm3)) {
            return false;
        }
        wm3 wm3Var = (wm3) obj;
        return this.f39385a == wm3Var.f39385a && this.b == wm3Var.b && this.c == wm3Var.c && this.d == wm3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f39385a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", downloadApkIsProgress=", Separators.RPAREN, f140.q("Buttons(isBackButtonEnable=", ", isWhatsNewBtnEnable=", ", isLoading=", this.f39385a, this.b), this.c, this.d);
    }
}
