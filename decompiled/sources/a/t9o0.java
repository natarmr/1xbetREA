package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class t9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33576a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public t9o0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f33576a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9o0)) {
            return false;
        }
        t9o0 t9o0Var = (t9o0) obj;
        return ycl.b(this.f33576a, t9o0Var.f33576a) && ycl.b(this.b, t9o0Var.b) && ycl.b(this.c, t9o0Var.c) && ycl.b(this.d, t9o0Var.d) && ycl.b(this.e, t9o0Var.e) && ycl.b(this.f, t9o0Var.f) && ycl.b(this.g, t9o0Var.g) && ycl.b(this.h, t9o0Var.h);
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.f33576a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f33576a);
        String strC2 = ycl.c(this.b);
        String strC3 = ycl.c(this.c);
        String strC4 = ycl.c(this.d);
        String strC5 = ycl.c(this.e);
        String strC6 = ycl.c(this.f);
        String strC7 = ycl.c(this.g);
        String strC8 = ycl.c(this.h);
        StringBuilder sbN = b1j.n("SystemInsets(statusBarTop=", strC, ", navigationBarBottom=", strC2, ", navigationBarLeft=");
        f140.v(sbN, strC3, ", navigationBarRight=", strC4, ", cutoutTop=");
        f140.v(sbN, strC5, ", cutoutBottom=", strC6, ", cutoutLeft=");
        return ua80.m(sbN, strC7, ", cutoutRight=", strC8, Separators.RPAREN);
    }
}
