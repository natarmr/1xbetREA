package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vyu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f38268a;
    public final String b;
    public final double c;

    public vyu0(double d, double d2, String str) {
        str.getClass();
        this.f38268a = d;
        this.b = str;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyu0)) {
            return false;
        }
        vyu0 vyu0Var = (vyu0) obj;
        return Double.compare(this.f38268a, vyu0Var.f38268a) == 0 && Intrinsics.d(this.b, vyu0Var.b) && Double.compare(this.c, vyu0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ua80.b(Double.hashCode(this.f38268a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.m(vqd.s("WalletSumTopUpModel(amountConverted=", this.f38268a, ", currency=", this.b), this.c, ", minTransferAmount=", Separators.RPAREN);
    }
}
