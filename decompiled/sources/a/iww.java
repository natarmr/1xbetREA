package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iww implements ep80 {
    public final float b;
    public final float c;

    public iww(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // a.ep80
    public final Object d(w6k w6kVar) {
        w6kVar.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iww)) {
            return false;
        }
        iww iwwVar = (iww) obj;
        return ycl.b(this.b, iwwVar.b) && ycl.b(this.c, iwwVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        return b1j.k("IconRequiredCoordinatesParentData(startCoordinateX=", ycl.c(this.b), ", startCoordinateY=", ycl.c(this.c), Separators.RPAREN);
    }
}
