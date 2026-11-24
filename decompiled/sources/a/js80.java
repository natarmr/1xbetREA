package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class js80 implements qs80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f17039a;

    public js80(ob0 ob0Var) {
        this.f17039a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js80) && this.f17039a.equals(((js80) obj).f17039a);
    }

    public final int hashCode() {
        return this.f17039a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f17039a + Separators.RPAREN;
    }
}
