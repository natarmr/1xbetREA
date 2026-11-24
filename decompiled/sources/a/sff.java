package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class sff extends uff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f32116a;

    public sff(double d) {
        this.f32116a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sff) && Double.compare(this.f32116a, ((sff) obj).f32116a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f32116a);
    }

    public final String toString() {
        return "SetFinalSum(winSum=" + this.f32116a + Separators.RPAREN;
    }
}
