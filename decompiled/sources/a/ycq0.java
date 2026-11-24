package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ycq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42394a;
    public final float b;

    public ycq0(float f, float f2) {
        this.f42394a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycq0)) {
            return false;
        }
        ycq0 ycq0Var = (ycq0) obj;
        return Float.compare(this.f42394a, ycq0Var.f42394a) == 0 && Float.compare(this.b, ycq0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f42394a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f42394a, this.b, "ThrowPositionUiModel(positionX=", ", positionY=", Separators.RPAREN);
    }
}
