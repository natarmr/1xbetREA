package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vkq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37587a;
    public final int b;
    public final uhq0 c;

    public vkq0(int i, int i2, uhq0 uhq0Var) {
        uhq0Var.getClass();
        this.f37587a = i;
        this.b = i2;
        this.c = uhq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkq0)) {
            return false;
        }
        vkq0 vkq0Var = (vkq0) obj;
        return this.f37587a == vkq0Var.f37587a && this.b == vkq0Var.b && this.c == vkq0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f37587a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("TimeModel(hour=", this.f37587a, ", minute=", ", timeFrame=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
