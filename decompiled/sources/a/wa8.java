package a;

import android.gov.nist.core.Separators;
import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public final class wa8 extends p4 {
    public final float c;
    public final float d;
    public final int e;

    public wa8(float f, float f2, int i) {
        super((byte) 8, false);
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa8)) {
            return false;
        }
        wa8 wa8Var = (wa8) obj;
        return this.c == wa8Var.c && this.d == wa8Var.d && this.e == wa8Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31);
    }

    @Override // a.p4
    public final String toString() {
        return axq.n(dw9.s(this.c, this.d, "BlurEffect(renderEffect=null, radiusX=", ", radiusY=", ", edgeTreatment="), knm0.u(this.e), Separators.RPAREN);
    }

    @Override // a.p4
    public final RenderEffect u0() {
        float f = this.c;
        float f2 = this.d;
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, knx.R(this.e));
    }
}
