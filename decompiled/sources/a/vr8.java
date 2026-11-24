package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vr8 implements xr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f37886a;
    public final float b;

    public vr8(float f, float f2) {
        this.f37886a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr8)) {
            return false;
        }
        vr8 vr8Var = (vr8) obj;
        return Float.compare(this.f37886a, vr8Var.f37886a) == 0 && Float.compare(this.b, vr8Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f37886a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f37886a, this.b, "ContainerSizePercent(percent=", ", percentForTablet=", Separators.RPAREN);
    }
}
