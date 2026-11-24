package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class su80 implements xu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f32809a;

    public su80(ob0 ob0Var) {
        this.f32809a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su80) && this.f32809a.equals(((su80) obj).f32809a);
    }

    public final int hashCode() {
        return this.f32809a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f32809a + Separators.RPAREN;
    }
}
