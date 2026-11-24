package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class axu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1639a;
    public final double b;
    public final String c;
    public final double d;
    public final String e;
    public final double f;

    public axu0(boolean z, double d, String str, double d2, String str2, double d3) {
        str.getClass();
        str2.getClass();
        this.f1639a = z;
        this.b = d;
        this.c = str;
        this.d = d2;
        this.e = str2;
        this.f = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axu0)) {
            return false;
        }
        axu0 axu0Var = (axu0) obj;
        return this.f1639a == axu0Var.f1639a && Double.compare(this.b, axu0Var.b) == 0 && Intrinsics.d(this.c, axu0Var.c) && Double.compare(this.d, axu0Var.d) == 0 && Intrinsics.d(this.e, axu0Var.e) && Double.compare(this.f, axu0Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + ua80.b(brm0.d(this.d, ua80.b(brm0.d(this.b, Boolean.hashCode(this.f1639a) * 31, 31), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletMoneyInfoState(isLoaded=");
        sb.append(this.f1639a);
        sb.append(", balanceAmount=");
        sb.append(this.b);
        hne.B(sb, ", balanceCurrency=", this.c, ", convertedAmount=");
        hne.w(sb, this.d, ", convertedCurrency=", this.e);
        return brm0.m(sb, this.f, ", minTransferAmount=", Separators.RPAREN);
    }
}
