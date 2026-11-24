package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class j61 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f15961a;

    public j61(ql5 ql5Var) {
        this.f15961a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j61) && this.f15961a.equals(((j61) obj).f15961a);
    }

    public final int hashCode() {
        return this.f15961a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f15961a, "BalanceChosen(balance=", Separators.RPAREN);
    }
}
