package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jfe0 implements mfe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f16422a;

    public jfe0(ob0 ob0Var) {
        this.f16422a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfe0) && this.f16422a.equals(((jfe0) obj).f16422a);
    }

    public final int hashCode() {
        return this.f16422a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f16422a + Separators.RPAREN;
    }
}
