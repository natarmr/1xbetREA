package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class su1 implements xu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f32799a;

    public su1(ob0 ob0Var) {
        this.f32799a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su1) && this.f32799a.equals(((su1) obj).f32799a);
    }

    public final int hashCode() {
        return this.f32799a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffectAggregator(balanceSideEffect=" + this.f32799a + Separators.RPAREN;
    }
}
