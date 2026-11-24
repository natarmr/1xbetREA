package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class en7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8078a;
    public final int b;
    public final int c;
    public final double d;
    public final boolean e;

    public en7(int i, int i2, int i3, double d, boolean z) {
        this.f8078a = i;
        this.b = i2;
        this.c = i3;
        this.d = d;
        this.e = z;
    }

    public static en7 a(en7 en7Var, boolean z, int i) {
        int i2 = en7Var.f8078a;
        int i3 = en7Var.b;
        int i4 = (i & 4) != 0 ? en7Var.c : 2;
        double d = en7Var.d;
        if ((i & 16) != 0) {
            z = en7Var.e;
        }
        en7Var.getClass();
        return new en7(i2, i3, i4, d, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en7)) {
            return false;
        }
        en7 en7Var = (en7) obj;
        return this.f8078a == en7Var.f8078a && this.b == en7Var.b && this.c == en7Var.c && Double.compare(this.d, en7Var.d) == 0 && this.e == en7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.d(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f8078a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BetSystemModel(betCount=", this.f8078a, ", countExpress=", ", dimension=", this.b);
        sbT.append(this.c);
        sbT.append(", sum=");
        sbT.append(this.d);
        return f140.n(sbT, ", changedByUser=", this.e, Separators.RPAREN);
    }
}
