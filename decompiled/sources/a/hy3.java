package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hy3 implements iy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13842a;

    public /* synthetic */ hy3(float f) {
        this.f13842a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hy3) {
            return Float.compare(this.f13842a, ((hy3) obj).f13842a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13842a);
    }

    public final String toString() {
        return rw2.j(this.f13842a, "Square(ratio=", Separators.RPAREN);
    }
}
