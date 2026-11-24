package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23803a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public nn5(String str, String str2, String str3, boolean z, String str4) {
        brm0.B(str, str2, str4);
        this.f23803a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn5)) {
            return false;
        }
        nn5 nn5Var = (nn5) obj;
        return Intrinsics.d(this.f23803a, nn5Var.f23803a) && Intrinsics.d(this.b, nn5Var.b) && this.c.equals(nn5Var.c) && Intrinsics.d(this.d, nn5Var.d) && this.e == nn5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(this.f23803a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BalanceUiState(balanceLabel=", this.f23803a, ", refillAccountLabel=", this.b, ", balanceValue=");
        f140.v(sbN, this.c, ", currency=", this.d, ", isMultiCurrencyAvailable=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
