package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class z6k implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43872a;
    public final float b;

    public z6k(float f, float f2) {
        this.f43872a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6k)) {
            return false;
        }
        z6k z6kVar = (z6k) obj;
        return Float.compare(this.f43872a, z6kVar.f43872a) == 0 && Float.compare(this.b, z6kVar.b) == 0;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f43872a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f43872a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f43872a, this.b, "DensityImpl(density=", ", fontScale=", Separators.RPAREN);
    }

    @Override // a.w6k
    public final float v0() {
        return this.b;
    }
}
