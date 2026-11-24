package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zyu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f45222a;
    public final String b;
    public final double c;

    public zyu0(double d, double d2, String str) {
        this.f45222a = d;
        this.b = str;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyu0)) {
            return false;
        }
        zyu0 zyu0Var = (zyu0) obj;
        return Double.compare(this.f45222a, zyu0Var.f45222a) == 0 && this.b.equals(zyu0Var.b) && Double.compare(this.c, zyu0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ua80.b(Double.hashCode(this.f45222a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.m(vqd.s("WalletWithdrawSumModel(amountConverted=", this.f45222a, ", currency=", this.b), this.c, ", minTransferAmount=", Separators.RPAREN);
    }
}
