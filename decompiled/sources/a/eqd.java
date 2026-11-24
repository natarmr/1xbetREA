package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class eqd extends fqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f8232a;

    public eqd(zmk0 zmk0Var) {
        this.f8232a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqd) && this.f8232a.equals(((eqd) obj).f8232a);
    }

    public final int hashCode() {
        return this.f8232a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChanged(score=", this.f8232a, Separators.RPAREN);
    }
}
