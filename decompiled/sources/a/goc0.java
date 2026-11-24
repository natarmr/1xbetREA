package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class goc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11624a;
    public final String b;
    public final int c;
    public final int d;

    public goc0(int i, int i2, int i3, String str) {
        this.f11624a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goc0)) {
            return false;
        }
        goc0 goc0Var = (goc0) obj;
        return this.f11624a == goc0Var.f11624a && this.b.equals(goc0Var.b) && this.c == goc0Var.c && this.d == goc0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(Integer.hashCode(this.f11624a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", skip=", Separators.RPAREN, vqd.r(this.f11624a, "PromoProductPageKey(bonusId=", ", searchQuery=", this.b, ", currentCountryId="));
    }
}
