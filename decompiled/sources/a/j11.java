package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j11 implements p11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f15708a;

    public j11(ob0 ob0Var) {
        this.f15708a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j11) && this.f15708a.equals(((j11) obj).f15708a);
    }

    public final int hashCode() {
        return this.f15708a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f15708a + Separators.RPAREN;
    }
}
