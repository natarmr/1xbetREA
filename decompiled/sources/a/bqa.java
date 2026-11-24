package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bqa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f3018a;

    public bqa(zmk0 zmk0Var) {
        this.f3018a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqa) && this.f3018a.equals(((bqa) obj).f3018a);
    }

    public final int hashCode() {
        return this.f3018a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChange(score=", this.f3018a, Separators.RPAREN);
    }
}
