package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gn0 implements kn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f11565a;

    public gn0(ob0 ob0Var) {
        this.f11565a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn0) && this.f11565a.equals(((gn0) obj).f11565a);
    }

    public final int hashCode() {
        return this.f11565a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f11565a + Separators.RPAREN;
    }
}
