package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41642a;

    public xx7(float f) {
        this.f41642a = f;
    }

    public final int a(int i, int i2, k6z k6zVar) {
        float f = (i2 - i) / 2.0f;
        k6z k6zVar2 = k6z.f17794a;
        float f2 = this.f41642a;
        if (k6zVar != k6zVar2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx7) && Float.compare(this.f41642a, ((xx7) obj).f41642a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41642a);
    }

    public final String toString() {
        return rw2.j(this.f41642a, "Horizontal(bias=", Separators.RPAREN);
    }
}
