package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w500 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38563a;
    public final int b;
    public final double c;
    public final String d;
    public final double e;

    public w500(double d, double d2, int i, int i2, String str) {
        this.f38563a = i;
        this.b = i2;
        this.c = d;
        this.d = str;
        this.e = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w500)) {
            return false;
        }
        w500 w500Var = (w500) obj;
        return this.f38563a == w500Var.f38563a && this.b == w500Var.b && Double.compare(this.c, w500Var.c) == 0 && this.d.equals(w500Var.d) && Double.compare(this.e, w500Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + ua80.b(brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f38563a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LineGameEventModel(type=", this.f38563a, ", playerId=", ", cf=", this.b);
        hne.w(sbT, this.c, ", cfView=", this.d);
        return brm0.m(sbT, this.e, ", parameter=", Separators.RPAREN);
    }
}
