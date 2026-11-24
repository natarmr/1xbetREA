package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j650 implements o650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f15968a;

    public j650(ob0 ob0Var) {
        this.f15968a = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j650) && this.f15968a.equals(((j650) obj).f15968a);
    }

    public final int hashCode() {
        return this.f15968a.hashCode();
    }

    public final String toString() {
        return "AggregatorBalanceSideEffect(balanceSideEffect=" + this.f15968a + Separators.RPAREN;
    }
}
