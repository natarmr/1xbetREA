package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class la1 implements ya1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f19683a;

    public la1(ql5 ql5Var) {
        this.f19683a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la1) && this.f19683a.equals(((la1) obj).f19683a);
    }

    public final int hashCode() {
        return this.f19683a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f19683a, "BalanceChanged(balance=", Separators.RPAREN);
    }
}
