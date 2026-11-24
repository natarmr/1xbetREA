package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r5m0 implements u5m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29894a;
    public final float b;
    public final float c;

    public r5m0(float f, float f2, float f3) {
        this.f29894a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5m0)) {
            return false;
        }
        r5m0 r5m0Var = (r5m0) obj;
        return Float.compare(this.f29894a, r5m0Var.f29894a) == 0 && Float.compare(this.b, r5m0Var.b) == 0 && Float.compare(this.c, r5m0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f29894a) * 31, this.b, 31);
    }

    public final String toString() {
        return kng0.o(dw9.s(this.f29894a, this.b, "ChangeCoefficient(curCoefficientInitialTranslationX=", ", curCoefficientFinalTranslationX=", ", arrowTranslationX="), this.c, Separators.RPAREN);
    }
}
