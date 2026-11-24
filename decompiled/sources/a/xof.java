package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41215a;
    public final int b;
    public final float c;
    public final float d;

    public xof(float f, float f2, int i, int i2) {
        this.f41215a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xof)) {
            return false;
        }
        xof xofVar = (xof) obj;
        return this.f41215a == xofVar.f41215a && this.b == xofVar.b && Float.compare(this.c, xofVar.c) == 0 && Float.compare(this.d, xofVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(twn.a(this.b, Integer.hashCode(this.f41215a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("Cs2MapMovementSplitUiModel(boundsTop=", this.f41215a, ", boundsBottom=", ", xOffset=", this.b);
        sbT.append(this.c);
        sbT.append(", yOffset=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
