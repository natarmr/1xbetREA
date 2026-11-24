package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39538a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public wpc0(String str, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f39538a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public static wpc0 a(wpc0 wpc0Var, boolean z, boolean z2, boolean z3, List list, int i) {
        boolean z4 = z3;
        String str = wpc0Var.f39538a;
        if ((i & 8) != 0) {
            z4 = wpc0Var.d;
        }
        if ((i & 16) != 0) {
            list = wpc0Var.e;
        }
        wpc0Var.getClass();
        list.getClass();
        return new wpc0(str, list, z, z2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpc0)) {
            return false;
        }
        wpc0 wpc0Var = (wpc0) obj;
        return this.f39538a.equals(wpc0Var.f39538a) && this.b == wpc0Var.b && this.c == wpc0Var.c && this.d == wpc0Var.d && Intrinsics.d(this.e, wpc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(this.f39538a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("PromoShopCategoriesStateModel(title=", this.f39538a, ", isLoading=", this.b, ", showError=");
        ua80.u(", hasTimer=", ", categories=", sbU, this.c, this.d);
        return dw9.r(sbU, this.e, Separators.RPAREN);
    }
}
