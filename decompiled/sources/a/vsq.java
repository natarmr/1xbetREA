package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vsq extends xsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f37963a;

    public vsq(zmk0 zmk0Var) {
        this.f37963a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsq) && this.f37963a.equals(((vsq) obj).f37963a);
    }

    public final int hashCode() {
        return this.f37963a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChange(score=", this.f37963a, Separators.RPAREN);
    }
}
