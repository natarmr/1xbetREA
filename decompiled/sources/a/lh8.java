package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f20042a;

    public lh8(ql5 ql5Var) {
        this.f20042a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh8) && this.f20042a.equals(((lh8) obj).f20042a);
    }

    public final int hashCode() {
        return this.f20042a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f20042a, "OnBalanceSelect(balanceModel=", Separators.RPAREN);
    }
}
