package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class i61 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f14219a;

    public i61(ql5 ql5Var) {
        this.f14219a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i61) && this.f14219a.equals(((i61) obj).f14219a);
    }

    public final int hashCode() {
        return this.f14219a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f14219a, "BalanceChanged(balance=", Separators.RPAREN);
    }
}
