package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28387a;
    public final float b;

    public qab(float f, float f2) {
        this.f28387a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qab)) {
            return false;
        }
        qab qabVar = (qab) obj;
        return Float.compare(this.f28387a, qabVar.f28387a) == 0 && Float.compare(this.b, qabVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f28387a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f28387a, this.b, "CellValuePosition(positionX=", ", positionY=", Separators.RPAREN);
    }
}
