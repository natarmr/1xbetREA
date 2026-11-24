package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ao70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1189a;
    public final boolean b;
    public final String c;

    public ao70(double d, String str, boolean z) {
        str.getClass();
        this.f1189a = d;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao70)) {
            return false;
        }
        ao70 ao70Var = (ao70) obj;
        return Double.compare(this.f1189a, ao70Var.f1189a) == 0 && this.b == ao70Var.b && Intrinsics.d(this.c, ao70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Double.hashCode(this.f1189a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowAutoSpinGameResult(summ=");
        sb.append(this.f1189a);
        sb.append(", draw=");
        sb.append(this.b);
        return rw2.o(sb, ", currency=", this.c, Separators.RPAREN);
    }
}
