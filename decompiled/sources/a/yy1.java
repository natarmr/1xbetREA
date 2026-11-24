package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yy1 implements cz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f43447a;

    public yy1(ob0 ob0Var) {
        this.f43447a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy1) && this.f43447a.equals(((yy1) obj).f43447a);
    }

    public final int hashCode() {
        return this.f43447a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f43447a + Separators.RPAREN;
    }
}
