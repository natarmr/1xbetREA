package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class qd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f28522a;
    public final float b;
    public final float c;
    public final int d;

    public qd8(Bitmap bitmap, float f, float f2, int i) {
        this.f28522a = bitmap;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd8)) {
            return false;
        }
        qd8 qd8Var = (qd8) obj;
        return this.f28522a.equals(qd8Var.f28522a) && Float.compare(this.b, qd8Var.b) == 0 && Float.compare(this.c, qd8Var.c) == 0 && this.d == qd8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + defpackage.c.a(defpackage.c.a(this.f28522a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "BonusCellUiModel(bonusIcon=" + this.f28522a + ", iconStartX=" + this.b + ", iconStartY=" + this.c + ", iconBonusType=" + this.d + Separators.RPAREN;
    }
}
