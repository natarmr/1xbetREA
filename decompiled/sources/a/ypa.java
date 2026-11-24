package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ypa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f43022a;

    public ypa(zmk0 zmk0Var) {
        this.f43022a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypa) && this.f43022a.equals(((ypa) obj).f43022a);
    }

    public final int hashCode() {
        return this.f43022a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChange(score=", this.f43022a, Separators.RPAREN);
    }
}
