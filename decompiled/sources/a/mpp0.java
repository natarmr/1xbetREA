package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mpp0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22189a;

    public final boolean equals(Object obj) {
        if (obj instanceof mpp0) {
            return Float.compare(this.f22189a, ((mpp0) obj).f22189a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22189a);
    }

    public final String toString() {
        return rw2.j(this.f22189a, "RotationValue(value=", Separators.RPAREN);
    }
}
