package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tt8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34498a;
    public final int b;
    public final int c;
    public final int d;

    public tt8(int i, int i2, int i3, int i4) {
        this.f34498a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt8)) {
            return false;
        }
        tt8 tt8Var = (tt8) obj;
        return this.f34498a == tt8Var.f34498a && this.b == tt8Var.b && this.c == tt8Var.c && this.d == tt8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f34498a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", bottom=", Separators.RPAREN, dw9.t("BracketViewLine(left=", this.f34498a, ", top=", ", right=", this.b));
    }
}
