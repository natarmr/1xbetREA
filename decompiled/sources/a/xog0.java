package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41218a;
    public final int b;
    public final int c;

    public xog0(int i, int i2, int i3) {
        this.f41218a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xog0)) {
            return false;
        }
        xog0 xog0Var = (xog0) obj;
        return this.f41218a == xog0Var.f41218a && this.b == xog0Var.b && this.c == xog0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f41218a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("RussianLottoParamsModel(positionX=", this.f41218a, ", positionY=", ", num=", this.b));
    }
}
