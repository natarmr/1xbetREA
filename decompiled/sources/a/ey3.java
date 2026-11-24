package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ey3 implements iy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8607a;

    public /* synthetic */ ey3(float f) {
        this.f8607a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ey3) {
            return Float.compare(this.f8607a, ((ey3) obj).f8607a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8607a);
    }

    public final String toString() {
        return rw2.j(this.f8607a, "NearRectangle(ratio=", Separators.RPAREN);
    }
}
