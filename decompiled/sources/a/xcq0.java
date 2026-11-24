package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xcq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40659a;
    public final int b;
    public final int c;
    public final int d;
    public final tcq0 e;

    public xcq0(int i, int i2, int i3, int i4, tcq0 tcq0Var) {
        this.f40659a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = tcq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcq0)) {
            return false;
        }
        xcq0 xcq0Var = (xcq0) obj;
        return this.f40659a == xcq0Var.f40659a && this.b == xcq0Var.b && this.c == xcq0Var.c && this.d == xcq0Var.d && this.e == xcq0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f40659a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ThrowModel(x=", this.f40659a, ", y=", ", sector=", this.b);
        axq.r(this.c, this.d, ", value=", ", factor=", sbT);
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
