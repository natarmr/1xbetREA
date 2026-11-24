package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cpa extends fpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f4736a;

    public cpa(zmk0 zmk0Var) {
        this.f4736a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpa) && this.f4736a.equals(((cpa) obj).f4736a);
    }

    public final int hashCode() {
        return this.f4736a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChange(score=", this.f4736a, Separators.RPAREN);
    }
}
