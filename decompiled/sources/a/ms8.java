package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ms8 implements os8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22306a;
    public final float b;

    public ms8(float f, float f2) {
        this.f22306a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms8)) {
            return false;
        }
        ms8 ms8Var = (ms8) obj;
        return Float.compare(this.f22306a, ms8Var.f22306a) == 0 && Float.compare(this.b, ms8Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f22306a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f22306a, this.b, "ContainerSizePercent(percent=", ", percentForTablet=", Separators.RPAREN);
    }
}
