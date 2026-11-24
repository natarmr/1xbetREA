package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9248a;
    public final int b;
    public final tna0 c;
    public final boolean d;

    public fba(int i, int i2, tna0 tna0Var, boolean z) {
        this.f9248a = i;
        this.b = i2;
        this.c = tna0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fba)) {
            return false;
        }
        fba fbaVar = (fba) obj;
        return this.f9248a == fbaVar.f9248a && this.b == fbaVar.b && this.c.equals(fbaVar.c) && this.d == fbaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f9248a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CardBasketballPlayerInfoModel(quarter=", this.f9248a, ", points=", ", card=", this.b);
        sbT.append(this.c);
        sbT.append(", success=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
