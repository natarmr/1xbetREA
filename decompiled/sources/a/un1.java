package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class un1 implements ao1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f35940a;

    public un1(ob0 ob0Var) {
        this.f35940a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un1) && this.f35940a.equals(((un1) obj).f35940a);
    }

    public final int hashCode() {
        return this.f35940a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f35940a + Separators.RPAREN;
    }
}
