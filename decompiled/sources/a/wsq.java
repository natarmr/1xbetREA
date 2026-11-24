package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wsq extends xsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f39704a;

    public wsq(zmk0 zmk0Var) {
        this.f39704a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsq) && this.f39704a.equals(((wsq) obj).f39704a);
    }

    public final int hashCode() {
        return this.f39704a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChange(score=", this.f39704a, Separators.RPAREN);
    }
}
