package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ic9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14524a;
    public final int b;
    public final int c;
    public final uyc d;

    public ic9(int i, int i2, int i3, uyc uycVar) {
        this.f14524a = i;
        this.b = i2;
        this.c = i3;
        this.d = uycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic9)) {
            return false;
        }
        ic9 ic9Var = (ic9) obj;
        return this.f14524a == ic9Var.f14524a && this.b == ic9Var.b && this.c == ic9Var.c && this.d == ic9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f14524a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BuilderInfoModel(gameType=", this.f14524a, ", gameVid=", ", period=", this.b);
        sbT.append(this.c);
        sbT.append(", coefAvailable=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
