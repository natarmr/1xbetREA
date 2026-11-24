package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gy3 implements iy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12105a;

    public /* synthetic */ gy3(float f) {
        this.f12105a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gy3) {
            return Float.compare(this.f12105a, ((gy3) obj).f12105a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12105a);
    }

    public final String toString() {
        return rw2.j(this.f12105a, "Rectangle(ratio=", Separators.RPAREN);
    }
}
