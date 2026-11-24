package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jc7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16261a;
    public final String b;
    public final double c;

    public jc7(double d, String str, String str2) {
        str.getClass();
        this.f16261a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc7)) {
            return false;
        }
        jc7 jc7Var = (jc7) obj;
        return Intrinsics.d(this.f16261a, jc7Var.f16261a) && this.b.equals(jc7Var.b) && Double.compare(this.c, jc7Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ua80.b(this.f16261a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.l(b1j.n("ShowSaleDialog(betId=", this.f16261a, ", currency=", this.b, ", saleSum="), this.c, Separators.RPAREN);
    }
}
