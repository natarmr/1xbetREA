package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mfs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f21709a;
    public final l7m0 b;
    public final l7m0 c;

    public mfs0(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        this.f21709a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfs0)) {
            return false;
        }
        mfs0 mfs0Var = (mfs0) obj;
        return Intrinsics.d(this.f21709a, mfs0Var.f21709a) && Intrinsics.d(this.b, mfs0Var.b) && Intrinsics.d(this.c, mfs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h97.c(this.b, this.f21709a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TransactionHistoryUiState(historyHeaderUiState=" + this.f21709a + ", transactionUiState=" + this.b + ", pullToRefreshUiState=" + this.c + Separators.RPAREN;
    }
}
