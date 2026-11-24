package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ef1 implements nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f7701a;

    public ef1(ob0 ob0Var) {
        this.f7701a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef1) && this.f7701a.equals(((ef1) obj).f7701a);
    }

    public final int hashCode() {
        return this.f7701a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f7701a + Separators.RPAREN;
    }
}
