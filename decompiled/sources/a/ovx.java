package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ovx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25946a;
    public final float b;

    public ovx(float f, float f2) {
        this.f25946a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovx)) {
            return false;
        }
        ovx ovxVar = (ovx) obj;
        return ycl.b(this.f25946a, ovxVar.f25946a) && ycl.b(this.b, ovxVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f25946a) * 31);
    }

    public final String toString() {
        return b1j.k("ItemInfo(locationX=", ycl.c(this.f25946a), ", containerWidth=", ycl.c(this.b), Separators.RPAREN);
    }
}
