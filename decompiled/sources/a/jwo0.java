package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17262a;
    public final String b;
    public final String c;
    public final boolean d;
    public final double e;
    public final List f;

    public jwo0(double d, String str, String str2, List list, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f17262a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = d;
        this.f = list;
    }

    public static jwo0 a(jwo0 jwo0Var, boolean z, boolean z2, double d, List list, int i) {
        String str = jwo0Var.b;
        String str2 = jwo0Var.c;
        if ((i & 8) != 0) {
            z2 = jwo0Var.d;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            d = jwo0Var.e;
        }
        double d2 = d;
        if ((i & 32) != 0) {
            list = jwo0Var.f;
        }
        List list2 = list;
        jwo0Var.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        return new jwo0(d2, str, str2, list2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwo0)) {
            return false;
        }
        jwo0 jwo0Var = (jwo0) obj;
        return this.f17262a == jwo0Var.f17262a && Intrinsics.d(this.b, jwo0Var.b) && Intrinsics.d(this.c, jwo0Var.c) && this.d == jwo0Var.d && Double.compare(this.e, jwo0Var.e) == 0 && Intrinsics.d(this.f, jwo0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.d(this.e, brm0.e(ua80.b(ua80.b(Boolean.hashCode(this.f17262a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("TaxStateModel(isVisible=", ", taxTitle=", this.b, this.f17262a, ", betTooltipTitle=");
        brm0.C(this.c, ", isLoading=", ", taxPayDif=", sbQ, this.d);
        sbQ.append(this.e);
        sbQ.append(", values=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
