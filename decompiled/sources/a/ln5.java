package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ln5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20327a;
    public final String b;
    public final boolean c;

    public ln5(String str, String str2, boolean z) {
        str2.getClass();
        this.f20327a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln5)) {
            return false;
        }
        ln5 ln5Var = (ln5) obj;
        return this.f20327a.equals(ln5Var.f20327a) && Intrinsics.d(this.b, ln5Var.b) && this.c == ln5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f20327a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("BalanceUiState(balanceValue=", this.f20327a, ", currency=", this.b, ", isMultiCurrencyAvailable="), this.c, Separators.RPAREN);
    }
}
