package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gnd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f11579a;

    public gnd(zmk0 zmk0Var) {
        this.f11579a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnd) && this.f11579a.equals(((gnd) obj).f11579a);
    }

    public final int hashCode() {
        return this.f11579a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChanged(score=", this.f11579a, Separators.RPAREN);
    }
}
