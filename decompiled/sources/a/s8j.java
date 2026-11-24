package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s8j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31803a;
    public final float b;
    public final int c;
    public final int d;
    public final tcq0 e;

    public s8j(float f, float f2, int i, int i2, tcq0 tcq0Var) {
        this.f31803a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = tcq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8j)) {
            return false;
        }
        s8j s8jVar = (s8j) obj;
        return Float.compare(this.f31803a, s8jVar.f31803a) == 0 && Float.compare(this.b, s8jVar.b) == 0 && this.c == s8jVar.c && this.d == s8jVar.d && this.e == s8jVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, defpackage.c.a(Float.hashCode(this.f31803a) * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f31803a, this.b, "DartsLiveThrowUiModel(positionX=", ", positionY=", ", sector=");
        axq.r(this.c, this.d, ", value=", ", factor=", sbS);
        sbS.append(this.e);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
