package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class epa extends fpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f8175a;

    public epa(zmk0 zmk0Var) {
        this.f8175a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epa) && this.f8175a.equals(((epa) obj).f8175a);
    }

    public final int hashCode() {
        return this.f8175a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChange(score=", this.f8175a, Separators.RPAREN);
    }
}
