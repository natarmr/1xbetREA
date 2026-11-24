package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class end extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f8089a;

    public end(zmk0 zmk0Var) {
        this.f8089a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof end) && this.f8089a.equals(((end) obj).f8089a);
    }

    public final int hashCode() {
        return this.f8089a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneTennisGameScore(score=", this.f8089a, Separators.RPAREN);
    }
}
