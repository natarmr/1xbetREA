package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ge90 extends ie90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f11142a;

    public ge90(zmk0 zmk0Var) {
        this.f11142a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge90) && this.f11142a.equals(((ge90) obj).f11142a);
    }

    public final int hashCode() {
        return this.f11142a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneScoreChanged(score=", this.f11142a, Separators.RPAREN);
    }
}
