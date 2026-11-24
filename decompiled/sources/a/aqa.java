package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aqa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f1288a;

    public aqa(zmk0 zmk0Var) {
        this.f1288a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqa) && this.f1288a.equals(((aqa) obj).f1288a);
    }

    public final int hashCode() {
        return this.f1288a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoGamePointScore(score=", this.f1288a, Separators.RPAREN);
    }
}
