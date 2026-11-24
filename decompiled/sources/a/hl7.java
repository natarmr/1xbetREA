package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hl7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13243a;
    public final String b;
    public final double c;

    public hl7(double d, String str, String str2) {
        str.getClass();
        this.f13243a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl7)) {
            return false;
        }
        hl7 hl7Var = (hl7) obj;
        return Intrinsics.d(this.f13243a, hl7Var.f13243a) && this.b.equals(hl7Var.b) && Double.compare(this.c, hl7Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ua80.b(this.f13243a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.l(b1j.n("ShowSaleDialog(betId=", this.f13243a, ", currency=", this.b, ", saleSum="), this.c, Separators.RPAREN);
    }
}
