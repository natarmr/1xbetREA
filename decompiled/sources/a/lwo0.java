package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20774a;
    public final boolean b;
    public final String c;
    public final double d;
    public final String e;
    public final List f;

    public lwo0(double d, String str, String str2, List list, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f20774a = z;
        this.b = z2;
        this.c = str;
        this.d = d;
        this.e = str2;
        this.f = list;
    }

    public static lwo0 a(lwo0 lwo0Var, boolean z, boolean z2, double d, List list, int i) {
        String str = lwo0Var.c;
        if ((i & 8) != 0) {
            d = lwo0Var.d;
        }
        double d2 = d;
        String str2 = lwo0Var.e;
        if ((i & 32) != 0) {
            list = lwo0Var.f;
        }
        List list2 = list;
        str.getClass();
        str2.getClass();
        list2.getClass();
        return new lwo0(d2, str, str2, list2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwo0)) {
            return false;
        }
        lwo0 lwo0Var = (lwo0) obj;
        return this.f20774a == lwo0Var.f20774a && this.b == lwo0Var.b && Intrinsics.d(this.c, lwo0Var.c) && Double.compare(this.d, lwo0Var.d) == 0 && Intrinsics.d(this.e, lwo0Var.e) && Intrinsics.d(this.f, lwo0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f20774a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TaxStateModel(isVisible=", ", isLoading=", ", taxTitle=", this.f20774a, this.b);
        hne.A(sbQ, this.c, ", taxPayDif=", this.d);
        ua80.t(", betTooltipTitle=", this.e, ", values=", sbQ, this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
