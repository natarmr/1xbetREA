package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class omd extends qmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f25497a;

    public omd(zmk0 zmk0Var) {
        this.f25497a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omd) && this.f25497a.equals(((omd) obj).f25497a);
    }

    public final int hashCode() {
        return this.f25497a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChanged(score=", this.f25497a, Separators.RPAREN);
    }
}
