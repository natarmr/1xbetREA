package a;

import android.gov.nist.core.Separators;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public final class nnh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23821a;
    public final Paint b;
    public final boolean c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public nnh0(float f, Paint paint, boolean z, float f2, float f3, float f4, float f5) {
        this.f23821a = f;
        this.b = paint;
        this.c = z;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnh0)) {
            return false;
        }
        nnh0 nnh0Var = (nnh0) obj;
        return Float.compare(this.f23821a, nnh0Var.f23821a) == 0 && this.b.equals(nnh0Var.b) && this.c == nnh0Var.c && Float.compare(this.d, nnh0Var.d) == 0 && Float.compare(this.e, nnh0Var.e) == 0 && Float.compare(this.f, nnh0Var.f) == 0 && Float.compare(this.g, nnh0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + defpackage.c.a(defpackage.c.a(defpackage.c.a(brm0.e((this.b.hashCode() + (Float.hashCode(this.f23821a) * 31)) * 31, 31, this.c), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectorUiModel(startAngle=");
        sb.append(this.f23821a);
        sb.append(", paint=");
        sb.append(this.b);
        sb.append(", useCenter=");
        sb.append(this.c);
        sb.append(", radius=");
        sb.append(this.d);
        sb.append(", strokeWidthCoef=");
        vqd.v(sb, this.e, ", sweepAngle=", this.f, ", degreeCoef=");
        return kng0.o(sb, this.g, Separators.RPAREN);
    }
}
