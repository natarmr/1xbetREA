package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36755a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public v40(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f36755a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v40)) {
            return false;
        }
        v40 v40Var = (v40) obj;
        return this.f36755a == v40Var.f36755a && this.b == v40Var.b && this.c == v40Var.c && this.d == v40Var.d && this.e == v40Var.e && this.f == v40Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f36755a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("AdviceModel(sport=", this.f36755a, ", subSport=", ", period=", this.b);
        axq.r(this.c, this.d, ", group=", ", gap=", sbT);
        return w6x.o(this.e, this.f, ", probe=", Separators.RPAREN, sbT);
    }
}
