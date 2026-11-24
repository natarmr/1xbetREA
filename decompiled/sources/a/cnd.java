package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cnd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f4647a;

    public cnd(zmk0 zmk0Var) {
        this.f4647a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnd) && this.f4647a.equals(((cnd) obj).f4647a);
    }

    public final int hashCode() {
        return this.f4647a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneGamePointsScore(score=", this.f4647a, Separators.RPAREN);
    }
}
