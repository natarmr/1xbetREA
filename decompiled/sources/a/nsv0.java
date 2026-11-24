package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nsv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24069a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;

    public nsv0(int i, int i2, int i3, float f, float f2, float f3) {
        this.f24069a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsv0)) {
            return false;
        }
        nsv0 nsv0Var = (nsv0) obj;
        return this.f24069a == nsv0Var.f24069a && this.b == nsv0Var.b && this.c == nsv0Var.c && ycl.b(this.d, nsv0Var.d) && ycl.b(this.e, nsv0Var.e) && ycl.b(this.f, nsv0Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + defpackage.c.a(defpackage.c.a(twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f24069a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.d);
        String strC2 = ycl.c(this.e);
        String strC3 = ycl.c(this.f);
        StringBuilder sbT = dw9.t("XBottomSheetBlockRect(heightPx=", this.f24069a, ", topPx=", ", bottomPx=", this.b);
        kng0.w(this.c, ", height=", strC, ", top=", sbT);
        return ua80.m(sbT, strC2, ", bottom=", strC3, Separators.RPAREN);
    }
}
