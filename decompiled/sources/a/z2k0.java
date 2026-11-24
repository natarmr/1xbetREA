package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43674a;
    public final String b;
    public final int c;
    public final String d;
    public final j83 e;
    public final xds0 f;

    public z2k0(long j, String str, int i, String str2, j83 j83Var, xds0 xds0Var) {
        str.getClass();
        this.f43674a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = j83Var;
        this.f = xds0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2k0)) {
            return false;
        }
        z2k0 z2k0Var = (z2k0) obj;
        return this.f43674a == z2k0Var.f43674a && Intrinsics.d(this.b, z2k0Var.b) && this.c == z2k0Var.c && this.d.equals(z2k0Var.d) && this.e.equals(z2k0Var.e) && this.f == z2k0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.f(this.e, ua80.b(twn.a(this.c, ua80.b(Long.hashCode(this.f43674a) * 31, 31, this.b), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43674a, "SinglePageTransactionCellUiModel(transactionId=", ", time=", this.b);
        w6x.w(this.c, ", transactionTypeIconRes=", ", transactionDescription=", this.d, sbO);
        sbO.append(", transactionAmountAnnotatedString=");
        sbO.append((Object) this.e);
        sbO.append(", transactionCellPositionType=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
