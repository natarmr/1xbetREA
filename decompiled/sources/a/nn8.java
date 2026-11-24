package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23808a;
    public final float b;
    public final float c;
    public final float d;

    public nn8(float f, float f2, float f3, float f4) {
        this.f23808a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn8)) {
            return false;
        }
        nn8 nn8Var = (nn8) obj;
        return Float.compare(this.f23808a, nn8Var.f23808a) == 0 && Float.compare(this.b, nn8Var.b) == 0 && Float.compare(this.c, nn8Var.c) == 0 && Float.compare(this.d, nn8Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f23808a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f23808a, this.b, "BottomContentAnimationState(dropProgress=", ", riseProgress=", ", alpha=");
        sbS.append(this.c);
        sbS.append(", cornerRadiusPx=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
