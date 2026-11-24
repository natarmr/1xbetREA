package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dp20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6441a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public dp20(float f, float f2, float f3) {
        this.f6441a = f;
        this.b = f2;
        this.c = f3;
        zcl zclVar = qmk.f28987a;
        this.d = 24.0f * f3;
        this.e = 20.0f * f3;
        this.f = 16.0f * f3;
    }

    public final long a(float f, float f2) {
        float f3 = (f / 100.0f) * this.f6441a;
        float f4 = (f2 / 100.0f) * this.b;
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
    }

    public final long b(long j) {
        float fA = adl.a(j);
        float f = this.c;
        return (((long) Float.floatToRawIntBits(adl.b(j) * f)) & 4294967295L) | (Float.floatToRawIntBits(fA * f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp20)) {
            return false;
        }
        dp20 dp20Var = (dp20) obj;
        return ycl.b(this.f6441a, dp20Var.f6441a) && ycl.b(this.b, dp20Var.b) && Float.compare(this.c, dp20Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f6441a) * 31, this.b, 31);
    }

    public final String toString() {
        return kng0.o(b1j.n("MapGeometry(width=", ycl.c(this.f6441a), ", height=", ycl.c(this.b), ", scaleFactor="), this.c, Separators.RPAREN);
    }
}
