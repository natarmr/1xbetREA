package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fy3 implements iy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10342a;

    public /* synthetic */ fy3(float f) {
        this.f10342a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fy3) {
            return Float.compare(this.f10342a, ((fy3) obj).f10342a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10342a);
    }

    public final String toString() {
        return rw2.j(this.f10342a, "NearSquare(ratio=", Separators.RPAREN);
    }
}
