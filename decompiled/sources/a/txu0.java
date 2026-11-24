package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class txu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34721a;
    public final String b;
    public final boolean c;
    public final axu0 d;
    public final fwu0 e;
    public final dxu0 f;
    public final boolean g;
    public final boolean h;
    public final double i;

    public txu0(boolean z, String str, boolean z2, axu0 axu0Var, fwu0 fwu0Var, dxu0 dxu0Var, boolean z3, boolean z4, double d) {
        this.f34721a = z;
        this.b = str;
        this.c = z2;
        this.d = axu0Var;
        this.e = fwu0Var;
        this.f = dxu0Var;
        this.g = z3;
        this.h = z4;
        this.i = d;
    }

    public static txu0 a(txu0 txu0Var, String str, boolean z, axu0 axu0Var, fwu0 fwu0Var, dxu0 dxu0Var, boolean z2, boolean z3, double d, int i) {
        String str2 = str;
        boolean z4 = txu0Var.f34721a;
        if ((i & 2) != 0) {
            str2 = txu0Var.b;
        }
        if ((i & 4) != 0) {
            z = txu0Var.c;
        }
        if ((i & 8) != 0) {
            axu0Var = txu0Var.d;
        }
        if ((i & 16) != 0) {
            fwu0Var = txu0Var.e;
        }
        if ((i & 32) != 0) {
            dxu0Var = txu0Var.f;
        }
        if ((i & 64) != 0) {
            z2 = txu0Var.g;
        }
        if ((i & 128) != 0) {
            z3 = txu0Var.h;
        }
        if ((i & 256) != 0) {
            d = txu0Var.i;
        }
        double d2 = d;
        txu0Var.getClass();
        str2.getClass();
        boolean z5 = z3;
        boolean z6 = z2;
        dxu0 dxu0Var2 = dxu0Var;
        fwu0 fwu0Var2 = fwu0Var;
        axu0 axu0Var2 = axu0Var;
        return new txu0(z4, str2, z, axu0Var2, fwu0Var2, dxu0Var2, z6, z5, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txu0)) {
            return false;
        }
        txu0 txu0Var = (txu0) obj;
        return this.f34721a == txu0Var.f34721a && this.b.equals(txu0Var.b) && this.c == txu0Var.c && this.d.equals(txu0Var.d) && this.e.equals(txu0Var.e) && Intrinsics.d(this.f, txu0Var.f) && this.g == txu0Var.g && this.h == txu0Var.h && Double.compare(this.i, txu0Var.i) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + brm0.e(ua80.b(Boolean.hashCode(this.f34721a) * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        dxu0 dxu0Var = this.f;
        return Double.hashCode(this.i) + brm0.e(brm0.e((iHashCode + (dxu0Var == null ? 0 : dxu0Var.hashCode())) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("WalletMoneyState(payInOut=", ", inputSum=", this.b, this.f34721a, ", flowWithSms=");
        sbQ.append(this.c);
        sbQ.append(", walletInfo=");
        sbQ.append(this.d);
        sbQ.append(", actionButtonState=");
        sbQ.append(this.e);
        sbQ.append(", inputError=");
        sbQ.append(this.f);
        sbQ.append(", isLoading=");
        ua80.u(", isMainBalance=", ", lastConvertedValue=", sbQ, this.g, this.h);
        return axq.l(sbQ, this.i, Separators.RPAREN);
    }
}
