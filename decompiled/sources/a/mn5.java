package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22072a;
    public final String b;
    public final boolean c;

    public mn5(String str, String str2, boolean z) {
        str2.getClass();
        this.f22072a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn5)) {
            return false;
        }
        mn5 mn5Var = (mn5) obj;
        return this.f22072a.equals(mn5Var.f22072a) && Intrinsics.d(this.b, mn5Var.b) && this.c == mn5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f22072a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("BalanceUiState(balanceValue=", this.f22072a, ", currency=", this.b, ", isMultiCurrencyAvailable="), this.c, Separators.RPAREN);
    }
}
