package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z8b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43959a;
    public final float b;

    public z8b(float f, float f2) {
        this.f43959a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8b)) {
            return false;
        }
        z8b z8bVar = (z8b) obj;
        return Float.compare(this.f43959a, z8bVar.f43959a) == 0 && Float.compare(this.b, z8bVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f43959a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f43959a, this.b, "CellAnimationsUiModel(scale=", ", finalAlpha=", Separators.RPAREN);
    }
}
