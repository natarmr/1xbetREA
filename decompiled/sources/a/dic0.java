package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6131a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public dic0(int i, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f6131a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dic0)) {
            return false;
        }
        dic0 dic0Var = (dic0) obj;
        return this.f6131a == dic0Var.f6131a && this.b == dic0Var.b && this.c == dic0Var.c && this.d == dic0Var.d && Intrinsics.d(this.e, dic0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Integer.hashCode(this.f6131a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f6131a, "PromoExtendedShopModel(promoValue=", ", promoBalanceVisible=", ", promoButtonVisible=", this.b);
        ua80.u(", promoItemsVisible=", ", promoItems=", sbL, this.c, this.d);
        return dw9.r(sbL, this.e, Separators.RPAREN);
    }
}
