package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10388a;
    public final float b;

    public fz2(float f, float f2) {
        this.f10388a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz2)) {
            return false;
        }
        fz2 fz2Var = (fz2) obj;
        return Float.compare(this.f10388a, fz2Var.f10388a) == 0 && Float.compare(this.b, fz2Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f10388a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f10388a, this.b, "FlingResult(distanceCoefficient=", ", velocityCoefficient=", Separators.RPAREN);
    }
}
