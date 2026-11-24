package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jx8 implements px8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f17291a;

    public jx8(ob0 ob0Var) {
        this.f17291a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx8) && this.f17291a.equals(((jx8) obj).f17291a);
    }

    public final int hashCode() {
        return this.f17291a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f17291a + Separators.RPAREN;
    }
}
