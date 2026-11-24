package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f450a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a8x(int i, int i2, int i3, int i4, int i5) {
        this.f450a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8x)) {
            return false;
        }
        a8x a8xVar = (a8x) obj;
        return this.f450a == a8xVar.f450a && this.b == a8xVar.b && this.c == a8xVar.c && this.d == a8xVar.d && this.e == a8xVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f450a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("InfinityConfig(baseCount=", this.f450a, ", repeatsOdd=", ", virtualCount=", this.b);
        axq.r(this.c, this.d, ", centerRingStart=", ", startVirtualIndex=", sbT);
        return rz4.j(this.e, Separators.RPAREN, sbT);
    }
}
