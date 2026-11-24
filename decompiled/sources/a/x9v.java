package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40527a;
    public final float b;
    public final int c;
    public final int d;
    public final eav e;

    public x9v(float f, float f2, int i, int i2, eav eavVar) {
        this.f40527a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = eavVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9v)) {
            return false;
        }
        x9v x9vVar = (x9v) obj;
        return Float.compare(this.f40527a, x9vVar.f40527a) == 0 && Float.compare(this.b, x9vVar.b) == 0 && this.c == x9vVar.c && this.d == x9vVar.d && this.e.equals(x9vVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, defpackage.c.a(Float.hashCode(this.f40527a) * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f40527a, this.b, "GoldRushGameFieldPlayerUiModel(playerY=", ", playerX=", ", cubeCount=");
        axq.r(this.c, this.d, ", dopCubeValue=", ", playerImages=", sbS);
        sbS.append(this.e);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
