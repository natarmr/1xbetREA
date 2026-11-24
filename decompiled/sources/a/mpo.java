package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22187a;
    public final float b;
    public final qil0 c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final y9q0 h;
    public final float i;
    public final y9q0 j;
    public final float k;
    public final boolean l;
    public final boolean m;

    public mpo(float f, float f2, qil0 qil0Var, float f3, float f4, float f5, float f6, y9q0 y9q0Var, float f7, y9q0 y9q0Var2, float f8, boolean z, boolean z2) {
        this.f22187a = f;
        this.b = f2;
        this.c = qil0Var;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = y9q0Var;
        this.i = f7;
        this.j = y9q0Var2;
        this.k = f8;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpo)) {
            return false;
        }
        mpo mpoVar = (mpo) obj;
        return ycl.b(this.f22187a, mpoVar.f22187a) && ycl.b(this.b, mpoVar.b) && this.c.equals(mpoVar.c) && ycl.b(this.d, mpoVar.d) && ycl.b(this.e, mpoVar.e) && ycl.b(this.f, mpoVar.f) && ycl.b(this.g, mpoVar.g) && this.h.equals(mpoVar.h) && ycl.b(this.i, mpoVar.i) && this.j.equals(mpoVar.j) && ycl.b(this.k, mpoVar.k) && this.l == mpoVar.l && this.m == mpoVar.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(defpackage.c.a(brm0.g(this.j, defpackage.c.a(brm0.g(this.h, defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a((this.c.hashCode() + defpackage.c.a(Float.hashCode(this.f22187a) * 31, this.b, 31)) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31), this.i, 31), 31), this.k, 31), 31, this.l);
    }

    public final String toString() {
        String strC = ycl.c(this.f22187a);
        String strC2 = ycl.c(this.b);
        String strC3 = ycl.c(this.d);
        String strC4 = ycl.c(this.e);
        String strC5 = ycl.c(this.f);
        String strC6 = ycl.c(this.g);
        String strC7 = ycl.c(this.i);
        String strC8 = ycl.c(this.k);
        StringBuilder sbN = b1j.n("ExpressCardConfigModel(height=", strC, ", radius=", strC2, ", marketStyle=");
        sbN.append(this.c);
        sbN.append(", headerTopPadding=");
        sbN.append(strC3);
        sbN.append(", headerBottomPadding=");
        f140.v(sbN, strC4, ", cardBottomPadding=", strC5, ", eventListHeight=");
        sbN.append(strC6);
        sbN.append(", headerTextStyle=");
        sbN.append(this.h);
        sbN.append(", eventIconSize=");
        sbN.append(strC7);
        sbN.append(", eventCoefStyle=");
        sbN.append(this.j);
        sbN.append(", eventTopPadding=");
        brm0.C(strC8, ", showCircleCanvas=", ", showWatermarkRect=", sbN, this.l);
        return rw2.p(sbN, this.m, Separators.RPAREN);
    }
}
