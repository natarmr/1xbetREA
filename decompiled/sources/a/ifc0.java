package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ifc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azc0 f14680a;
    public final wyc0 b;
    public final plc0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ifc0(azc0 azc0Var, wyc0 wyc0Var, plc0 plc0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f14680a = azc0Var;
        this.b = wyc0Var;
        this.c = plc0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static ifc0 a(ifc0 ifc0Var, azc0 azc0Var, plc0 plc0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        wyc0 wyc0Var = wyc0.f39969a;
        azc0 azc0Var2 = (i & 1) != 0 ? ifc0Var.f14680a : azc0Var;
        if ((i & 2) != 0) {
            wyc0Var = ifc0Var.b;
        }
        return new ifc0(azc0Var2, wyc0Var, (i & 4) != 0 ? ifc0Var.c : plc0Var, (i & 8) != 0 ? ifc0Var.d : z, (i & 16) != 0 ? ifc0Var.e : z2, (i & 32) != 0 ? ifc0Var.f : z3, (i & 64) != 0 ? ifc0Var.g : z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifc0)) {
            return false;
        }
        ifc0 ifc0Var = (ifc0) obj;
        return this.f14680a.equals(ifc0Var.f14680a) && this.b == ifc0Var.b && this.c.equals(ifc0Var.c) && this.d == ifc0Var.d && this.e == ifc0Var.e && this.f == ifc0Var.f && this.g == ifc0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f14680a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeStateModel(promoCodeFieldUiState=");
        sb.append(this.f14680a);
        sb.append(", promoCodeFieldStyle=");
        sb.append(this.b);
        sb.append(", promoInfoStateModel=");
        sb.append(this.c);
        sb.append(", hasMultiBalanceInfoLineText=");
        sb.append(this.d);
        sb.append(", makeBetBtnEnabled=");
        ua80.u(", marketIsOpen=", ", isVisibleState=", sb, this.e, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
