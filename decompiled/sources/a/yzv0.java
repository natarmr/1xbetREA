package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yzv0 implements j0w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43535a;
    public final float b;
    public final float c;

    public yzv0(float f, float f2, float f3, int i) {
        f = (i & 1) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        this.f43535a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzv0)) {
            return false;
        }
        yzv0 yzv0Var = (yzv0) obj;
        return ycl.b(this.f43535a, yzv0Var.f43535a) && ycl.b(0.0f, 0.0f) && ycl.b(this.b, yzv0Var.b) && ycl.b(this.c, yzv0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f43535a) * 31, 0.0f, 31), this.b, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f43535a);
        String strC2 = ycl.c(0.0f);
        return ua80.m(b1j.n("Custom(left=", strC, ", top=", strC2, ", right="), ycl.c(this.b), ", bottom=", ycl.c(this.c), Separators.RPAREN);
    }
}
