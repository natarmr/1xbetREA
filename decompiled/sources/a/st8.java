package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class st8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32761a;
    public final int b;
    public final int c;
    public final int d;

    public st8(int i, int i2, int i3, int i4) {
        this.f32761a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st8)) {
            return false;
        }
        st8 st8Var = (st8) obj;
        return this.f32761a == st8Var.f32761a && this.b == st8Var.b && this.c == st8Var.c && this.d == st8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f32761a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", bottom=", Separators.RPAREN, dw9.t("BracketViewLine(left=", this.f32761a, ", top=", ", right=", this.b));
    }
}
