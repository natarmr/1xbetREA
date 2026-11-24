package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hnd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f13346a;

    public hnd(zmk0 zmk0Var) {
        this.f13346a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnd) && this.f13346a.equals(((hnd) obj).f13346a);
    }

    public final int hashCode() {
        return this.f13346a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoTennisGameScore(score=", this.f13346a, Separators.RPAREN);
    }
}
