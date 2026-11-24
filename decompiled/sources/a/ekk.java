package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ekk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7956a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ekk(float f, float f2, float f3, float f4, float f5) {
        this.f7956a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekk)) {
            return false;
        }
        ekk ekkVar = (ekk) obj;
        return Float.compare(this.f7956a, ekkVar.f7956a) == 0 && Float.compare(this.b, ekkVar.b) == 0 && Float.compare(this.c, ekkVar.c) == 0 && Float.compare(this.d, ekkVar.d) == 0 && Float.compare(this.e, ekkVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.f7956a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f7956a, this.b, "DicePokerCubeCoordinatesUiModel(startRotation=", ", startXCoef=", ", startYCoef=");
        vqd.v(sbS, this.c, ", translationXCoef=", this.d, ", translationYCoef=");
        return kng0.o(sbS, this.e, Separators.RPAREN);
    }
}
