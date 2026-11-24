package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class eg0 implements gg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f7738a;

    public eg0(ob0 ob0Var) {
        this.f7738a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg0) && this.f7738a.equals(((eg0) obj).f7738a);
    }

    public final int hashCode() {
        return this.f7738a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f7738a + Separators.RPAREN;
    }
}
