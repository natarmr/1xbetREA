package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o19 implements t19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f24469a;

    public o19(ob0 ob0Var) {
        this.f24469a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o19) && this.f24469a.equals(((o19) obj).f24469a);
    }

    public final int hashCode() {
        return this.f24469a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f24469a + Separators.RPAREN;
    }
}
