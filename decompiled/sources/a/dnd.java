package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dnd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f6363a;

    public dnd(zmk0 zmk0Var) {
        this.f6363a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnd) && this.f6363a.equals(((dnd) obj).f6363a);
    }

    public final int hashCode() {
        return this.f6363a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChanged(score=", this.f6363a, Separators.RPAREN);
    }
}
