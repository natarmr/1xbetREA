package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ysv0 implements atv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43188a;
    public final int b;
    public final int c;

    public ysv0(int i, int i2, int i3) {
        this.f43188a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysv0)) {
            return false;
        }
        ysv0 ysv0Var = (ysv0) obj;
        return this.f43188a == ysv0Var.f43188a && this.b == ysv0Var.b && this.c == ysv0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f43188a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("Latched(middleHeightPx=", this.f43188a, ", itemCount=", ", trailingEmptyPx=", this.b));
    }
}
