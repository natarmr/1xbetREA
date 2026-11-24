package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fh80 implements hh80 {
    public final float b;
    public final float c;

    public fh80(float f, float f2, int i) {
        f = (i & 1) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        this.b = f;
        this.c = f2;
        if (!(f >= 0.0f) || !(f2 >= 0.0f)) {
            vcx.a("Padding must be non-negative");
        }
    }

    @Override // a.hh80
    public final float a() {
        return 0.0f;
    }

    @Override // a.hh80
    public final float b(k6z k6zVar) {
        return this.b;
    }

    @Override // a.hh80
    public final float c(k6z k6zVar) {
        return this.c;
    }

    @Override // a.hh80
    public final float d() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fh80)) {
            return false;
        }
        fh80 fh80Var = (fh80) obj;
        return ycl.b(this.b, fh80Var.b) && ycl.b(0.0f, 0.0f) && ycl.b(this.c, fh80Var.c) && ycl.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.b) * 31, 0.0f, 31), this.c, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(0.0f);
        return ua80.m(b1j.n("PaddingValues.Absolute(left=", strC, ", top=", strC2, ", right="), ycl.c(this.c), ", bottom=", ycl.c(0.0f), Separators.RPAREN);
    }
}
