package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z2m implements a3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43676a;

    public /* synthetic */ z2m(float f) {
        this.f43676a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z2m) {
            return Float.compare(this.f43676a, ((z2m) obj).f43676a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43676a);
    }

    public final String toString() {
        return rw2.j(this.f43676a, "Shimmer(widthRatio=", Separators.RPAREN);
    }
}
