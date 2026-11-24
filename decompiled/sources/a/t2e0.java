package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33211a;
    public final boolean b;
    public final String c;

    public t2e0(String str, int i, boolean z) {
        this.f33211a = i;
        this.b = z;
        this.c = str;
    }

    public static t2e0 a(t2e0 t2e0Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = t2e0Var.f33211a;
        }
        if ((i2 & 2) != 0) {
            z = t2e0Var.b;
        }
        String str = t2e0Var.c;
        t2e0Var.getClass();
        return new t2e0(str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2e0)) {
            return false;
        }
        t2e0 t2e0Var = (t2e0) obj;
        return this.f33211a == t2e0Var.f33211a && this.b == t2e0Var.b && this.c.equals(t2e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f33211a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(h97.l(this.f33211a, "RateAppStateModel(rating=", ", isVisible=", ", linkToRateApp=", this.b), this.c, Separators.RPAREN);
    }
}
