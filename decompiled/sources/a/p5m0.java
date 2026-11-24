package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p5m0 implements u5m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26411a;

    public p5m0(float f) {
        this.f26411a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5m0) && Float.compare(this.f26411a, ((p5m0) obj).f26411a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26411a);
    }

    public final String toString() {
        return rw2.j(this.f26411a, "BlockCoefficient(curCoefficientTranslationX=", Separators.RPAREN);
    }
}
