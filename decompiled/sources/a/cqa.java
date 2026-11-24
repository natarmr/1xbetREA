package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cqa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f4783a;

    public cqa(zmk0 zmk0Var) {
        this.f4783a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqa) && this.f4783a.equals(((cqa) obj).f4783a);
    }

    public final int hashCode() {
        return this.f4783a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoTennisGameScore(score=", this.f4783a, Separators.RPAREN);
    }
}
