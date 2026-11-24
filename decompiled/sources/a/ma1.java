package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ma1 implements ya1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f21438a;

    public ma1(ql5 ql5Var) {
        this.f21438a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma1) && this.f21438a.equals(((ma1) obj).f21438a);
    }

    public final int hashCode() {
        return this.f21438a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f21438a, "BalanceChosen(balance=", Separators.RPAREN);
    }
}
