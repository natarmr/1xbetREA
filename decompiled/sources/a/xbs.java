package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40614a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public xbs(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f40614a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbs)) {
            return false;
        }
        xbs xbsVar = (xbs) obj;
        return ycl.b(this.f40614a, xbsVar.f40614a) && ycl.b(this.b, xbsVar.b) && ycl.b(this.c, xbsVar.c) && Float.compare(this.d, xbsVar.d) == 0 && Float.compare(this.e, xbsVar.e) == 0 && ycl.b(this.f, xbsVar.f) && Float.compare(this.g, xbsVar.g) == 0 && Float.compare(this.h, xbsVar.h) == 0 && ycl.b(80.0f, 80.0f) && Float.compare(this.i, xbsVar.i) == 0 && Float.compare(this.j, xbsVar.j) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.f40614a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 80.0f, 31), this.i, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f40614a);
        String strC2 = ycl.c(this.b);
        String strC3 = ycl.c(this.c);
        String strC4 = ycl.c(this.f);
        String strC5 = ycl.c(80.0f);
        StringBuilder sbN = b1j.n("GameFieldConfig(fieldWidth=", strC, ", fieldHeight=", strC2, ", onePointSpace=");
        sbN.append(strC3);
        sbN.append(", onePointStartX=");
        sbN.append(this.d);
        sbN.append(", onePointStartY=");
        sbN.append(this.e);
        sbN.append(", twoPointSpace=");
        sbN.append(strC4);
        sbN.append(", twoPointStartX=");
        vqd.v(sbN, this.g, ", twoPointStartY=", this.h, ", threePointSpace=");
        sbN.append(strC5);
        sbN.append(", threePointStartX=");
        sbN.append(this.i);
        sbN.append(", threePointStartY=");
        return kng0.o(sbN, this.j, Separators.RPAREN);
    }
}
