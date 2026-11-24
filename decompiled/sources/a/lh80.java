package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class lh80 implements hh80 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public lh80(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            vcx.a("Padding must be non-negative");
        }
    }

    @Override // a.hh80
    public final float a() {
        return this.e;
    }

    @Override // a.hh80
    public final float b(k6z k6zVar) {
        return k6zVar == k6z.f17794a ? this.b : this.d;
    }

    @Override // a.hh80
    public final float c(k6z k6zVar) {
        return k6zVar == k6z.f17794a ? this.d : this.b;
    }

    @Override // a.hh80
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lh80)) {
            return false;
        }
        lh80 lh80Var = (lh80) obj;
        return ycl.b(this.b, lh80Var.b) && ycl.b(this.c, lh80Var.c) && ycl.b(this.d, lh80Var.d) && ycl.b(this.e, lh80Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(this.c);
        return ua80.m(b1j.n("PaddingValues(start=", strC, ", top=", strC2, ", end="), ycl.c(this.d), ", bottom=", ycl.c(this.e), Separators.RPAREN);
    }
}
