package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tpd extends vpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f34327a;

    public tpd(zmk0 zmk0Var) {
        this.f34327a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpd) && this.f34327a.equals(((tpd) obj).f34327a);
    }

    public final int hashCode() {
        return this.f34327a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChanged(score=", this.f34327a, Separators.RPAREN);
    }
}
