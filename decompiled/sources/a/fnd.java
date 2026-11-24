package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fnd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f9830a;

    public fnd(zmk0 zmk0Var) {
        this.f9830a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnd) && this.f9830a.equals(((fnd) obj).f9830a);
    }

    public final int hashCode() {
        return this.f9830a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoGamePointsScore(score=", this.f9830a, Separators.RPAREN);
    }
}
