package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class o2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24529a;
    public final boolean b;
    public final int c;
    public final int d;

    public o2g0(int i, int i2, String str, boolean z) {
        this.f24529a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2g0)) {
            return false;
        }
        o2g0 o2g0Var = (o2g0) obj;
        return this.f24529a.equals(o2g0Var.f24529a) && this.b == o2g0Var.b && this.c == o2g0Var.c && this.d == o2g0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, brm0.e(this.f24529a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", points=", Separators.RPAREN, brm0.u("ResultItemModel(gamerId=", this.f24529a, ", me=", this.b, ", place="));
    }
}
