package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cgf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4309a;
    public final int b;
    public final nhf c;
    public final bgf d;

    public cgf(int i, int i2, nhf nhfVar, bgf bgfVar) {
        nhfVar.getClass();
        this.f4309a = i;
        this.b = i2;
        this.c = nhfVar;
        this.d = bgfVar;
    }

    public static cgf a(cgf cgfVar, int i) {
        int i2 = cgfVar.f4309a;
        nhf nhfVar = cgfVar.c;
        bgf bgfVar = cgfVar.d;
        cgfVar.getClass();
        nhfVar.getClass();
        return new cgf(i2, i, nhfVar, bgfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgf)) {
            return false;
        }
        cgf cgfVar = (cgf) obj;
        return this.f4309a == cgfVar.f4309a && this.b == cgfVar.b && this.c == cgfVar.c && this.d == cgfVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f4309a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CrystalItemUiModel(column=", this.f4309a, ", row=", ", type=", this.b);
        sbT.append(this.c);
        sbT.append(", status=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
