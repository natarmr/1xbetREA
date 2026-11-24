package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eic0 implements zrc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7853a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public eic0(int i, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.f7853a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
    }

    public static eic0 a(eic0 eic0Var, int i, boolean z, int i2) {
        boolean z2 = eic0Var.b;
        boolean z3 = eic0Var.c;
        if ((i2 & 8) != 0) {
            z = eic0Var.d;
        }
        boolean z4 = eic0Var.e;
        List list = eic0Var.f;
        eic0Var.getClass();
        list.getClass();
        return new eic0(i, list, z2, z3, z, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eic0)) {
            return false;
        }
        eic0 eic0Var = (eic0) obj;
        return this.f7853a == eic0Var.f7853a && this.b == eic0Var.b && this.c == eic0Var.c && this.d == eic0Var.d && this.e == eic0Var.e && Intrinsics.d(this.f, eic0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(Integer.hashCode(this.f7853a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f7853a, "PromoExtendedShopStateModel(promoValue=", ", promoBalanceVisible=", ", promoButtonVisible=", this.b);
        ua80.u(", promoButtonLoading=", ", promoItemsVisible=", sbL, this.c, this.d);
        sbL.append(this.e);
        sbL.append(", promoItems=");
        sbL.append(this.f);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
