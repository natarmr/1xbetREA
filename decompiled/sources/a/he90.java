package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class he90 extends ie90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f12912a;

    public he90(zmk0 zmk0Var) {
        this.f12912a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he90) && this.f12912a.equals(((he90) obj).f12912a);
    }

    public final int hashCode() {
        return this.f12912a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChanged(score=", this.f12912a, Separators.RPAREN);
    }
}
