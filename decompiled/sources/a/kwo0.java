package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19012a;
    public final boolean b;
    public final String c;
    public final double d;
    public final String e;
    public final List f;

    public kwo0(double d, String str, String str2, List list, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f19012a = z;
        this.b = z2;
        this.c = str;
        this.d = d;
        this.e = str2;
        this.f = list;
    }

    public static kwo0 a(kwo0 kwo0Var, boolean z, boolean z2, double d, List list, int i) {
        if ((i & 1) != 0) {
            z = kwo0Var.f19012a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = kwo0Var.b;
        }
        boolean z4 = z2;
        String str = kwo0Var.c;
        if ((i & 8) != 0) {
            d = kwo0Var.d;
        }
        double d2 = d;
        String str2 = kwo0Var.e;
        if ((i & 32) != 0) {
            list = kwo0Var.f;
        }
        List list2 = list;
        kwo0Var.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        return new kwo0(d2, str, str2, list2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwo0)) {
            return false;
        }
        kwo0 kwo0Var = (kwo0) obj;
        return this.f19012a == kwo0Var.f19012a && this.b == kwo0Var.b && Intrinsics.d(this.c, kwo0Var.c) && Double.compare(this.d, kwo0Var.d) == 0 && Intrinsics.d(this.e, kwo0Var.e) && Intrinsics.d(this.f, kwo0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f19012a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TaxStateModel(isVisible=", ", isLoading=", ", taxTitle=", this.f19012a, this.b);
        hne.A(sbQ, this.c, ", taxPayDif=", this.d);
        ua80.t(", betTooltipTitle=", this.e, ", values=", sbQ, this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
