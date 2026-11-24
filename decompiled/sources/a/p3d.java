package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p3d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26294a;
    public final float b;

    public p3d(float f, float f2) {
        this.f26294a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3d)) {
            return false;
        }
        p3d p3dVar = (p3d) obj;
        return Float.compare(this.f26294a, p3dVar.f26294a) == 0 && Float.compare(this.b, p3dVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f26294a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f26294a, this.b, "CollectionScrollPadding(start=", ", end=", Separators.RPAREN);
    }
}
