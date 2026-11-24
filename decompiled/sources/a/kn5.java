package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18566a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public kn5(String str, String str2, String str3, boolean z, String str4) {
        brm0.B(str, str2, str4);
        this.f18566a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn5)) {
            return false;
        }
        kn5 kn5Var = (kn5) obj;
        return Intrinsics.d(this.f18566a, kn5Var.f18566a) && Intrinsics.d(this.b, kn5Var.b) && this.c.equals(kn5Var.c) && Intrinsics.d(this.d, kn5Var.d) && this.e == kn5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(this.f18566a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BalanceUiState(balanceLabel=", this.f18566a, ", refillAccountLabel=", this.b, ", balanceValue=");
        f140.v(sbN, this.c, ", currency=", this.d, ", isMultiCurrencyAvailable=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
