package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q5m0 implements u5m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28158a;
    public final float b;
    public final float c;
    public final float d;

    public q5m0(float f, float f2, float f3, float f4) {
        this.f28158a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5m0)) {
            return false;
        }
        q5m0 q5m0Var = (q5m0) obj;
        return Float.compare(this.f28158a, q5m0Var.f28158a) == 0 && Float.compare(this.b, q5m0Var.b) == 0 && Float.compare(this.c, q5m0Var.c) == 0 && Float.compare(this.d, q5m0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f28158a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f28158a, this.b, "ChangeBlockedCoefficient(curCoefficientInitialTranslationX=", ", curCoefficientFinalTranslationX=", ", oldCoefficientTranslationX=");
        sbS.append(this.c);
        sbS.append(", blockedIconTranslationX=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
