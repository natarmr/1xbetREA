package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ggf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11251a;
    public final int b;
    public final int c;
    public final boolean d;

    public ggf(int i, int i2, int i3, boolean z) {
        this.f11251a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggf)) {
            return false;
        }
        ggf ggfVar = (ggf) obj;
        return this.f11251a == ggfVar.f11251a && this.b == ggfVar.b && this.c == ggfVar.c && this.d == ggfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f11251a) * 31, 31), 31);
    }

    public final String toString() {
        return ohs0.k(this.c, ", winCombination=", Separators.RPAREN, dw9.t("CrystalMatrixModel(color=", this.f11251a, ", row=", ", column=", this.b), this.d);
    }
}
