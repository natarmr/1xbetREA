package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dqd extends fqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f6508a;

    public dqd(zmk0 zmk0Var) {
        this.f6508a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqd) && this.f6508a.equals(((dqd) obj).f6508a);
    }

    public final int hashCode() {
        return this.f6508a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChanged(score=", this.f6508a, Separators.RPAREN);
    }
}
