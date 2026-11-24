package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31850a;
    public final float b;

    public s9h0(float f, float f2) {
        this.f31850a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9h0)) {
            return false;
        }
        s9h0 s9h0Var = (s9h0) obj;
        return Float.compare(this.f31850a, s9h0Var.f31850a) == 0 && Float.compare(this.b, s9h0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f31850a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f31850a, this.b, "ScrollAreaOffsets(start=", ", end=", Separators.RPAREN);
    }
}
