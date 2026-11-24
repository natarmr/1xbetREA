package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xpa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f41259a;

    public xpa(zmk0 zmk0Var) {
        this.f41259a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpa) && this.f41259a.equals(((xpa) obj).f41259a);
    }

    public final int hashCode() {
        return this.f41259a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneGamePointScore(score=", this.f41259a, Separators.RPAREN);
    }
}
