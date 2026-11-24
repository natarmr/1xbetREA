package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39603a;
    public final int b;
    public final int c;
    public final int d;

    public wqq(int i, int i2, int i3, int i4) {
        this.f39603a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqq)) {
            return false;
        }
        wqq wqqVar = (wqq) obj;
        return this.f39603a == wqqVar.f39603a && this.b == wqqVar.b && this.c == wqqVar.c && this.d == wqqVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f39603a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", bottom=", Separators.RPAREN, dw9.t("FoldBounds(left=", this.f39603a, ", top=", ", right=", this.b));
    }
}
