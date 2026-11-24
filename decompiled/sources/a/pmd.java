package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pmd extends qmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f27226a;

    public pmd(zmk0 zmk0Var) {
        this.f27226a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmd) && this.f27226a.equals(((pmd) obj).f27226a);
    }

    public final int hashCode() {
        return this.f27226a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChanged(score=", this.f27226a, Separators.RPAREN);
    }
}
