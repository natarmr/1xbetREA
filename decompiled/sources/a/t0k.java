package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfs0 f33123a;

    public t0k(xfs0 xfs0Var) {
        this.f33123a = xfs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0k) && this.f33123a.equals(((t0k) obj).f33123a);
    }

    public final int hashCode() {
        return this.f33123a.hashCode();
    }

    public final String toString() {
        return "OnTransactionClickedOld(transactionItem=" + this.f33123a + Separators.RPAREN;
    }
}
