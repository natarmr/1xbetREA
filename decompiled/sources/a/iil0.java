package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14834a;
    public final float b;
    public final float c;
    public final float d;

    public iil0(float f, float f2, float f3, float f4) {
        this.f14834a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iil0)) {
            return false;
        }
        iil0 iil0Var = (iil0) obj;
        return ycl.b(this.f14834a, iil0Var.f14834a) && ycl.b(this.b, iil0Var.b) && ycl.b(this.c, iil0Var.c) && ycl.b(this.d, iil0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f14834a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f14834a);
        String strC2 = ycl.c(this.b);
        return ua80.m(b1j.n("CornersRadius(topStart=", strC, ", topEnd=", strC2, ", bottomEnd="), ycl.c(this.c), ", bottomStart=", ycl.c(this.d), Separators.RPAREN);
    }

    public iil0() {
        this(12.0f, 12.0f, 12.0f, 12.0f);
    }
}
