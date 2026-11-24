package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ykn implements k43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42799a;
    public final long b;
    public final y9q0 c;
    public final long d;
    public final long e;
    public final long f;
    public final o05 g;
    public final hzc h;

    public ykn() {
        pz40 pz40Var = s6t0.f31722a;
        long jC = y3d.c(0.5f, s6t0.b().f33626a.getTextPrimary());
        long textPrimary = s6t0.b().f33626a.getTextPrimary();
        qrq qrqVar = j1t0.b;
        long j = qmk.r;
        long j2 = qmk.F;
        y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646109);
        long jC2 = y3d.c(0.5f, s6t0.b().f33626a.getTextPrimary());
        long j3 = qmk.o;
        long j4 = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646109).f42262a.b;
        o05 o05Var = o05.b;
        kln klnVar = new kln();
        this.f42799a = jC;
        this.b = textPrimary;
        this.c = y9q0Var;
        this.d = jC2;
        this.e = j3;
        this.f = j4;
        this.g = o05Var;
        this.h = klnVar;
    }

    @Override // a.k43
    public final y9q0 b() {
        return this.c;
    }

    @Override // a.k43
    public final long c() {
        return this.f;
    }

    @Override // a.k43
    public final long d() {
        return this.b;
    }

    @Override // a.k43
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykn)) {
            return false;
        }
        ykn yknVar = (ykn) obj;
        long j = yknVar.f42799a;
        int i = y3d.h;
        return h2t0.a(this.f42799a, j) && h2t0.a(this.b, yknVar.b) && this.c.equals(yknVar.c) && h2t0.a(this.d, yknVar.d) && daq0.a(this.e, yknVar.e) && daq0.a(this.f, yknVar.f) && this.g == yknVar.g && ycl.b(2.0f, 2.0f) && this.h.equals(yknVar.h) && ycl.b(2.0f, 2.0f);
    }

    @Override // a.k43
    public final hzc f() {
        return this.h;
    }

    @Override // a.k43
    public final long g() {
        return this.f42799a;
    }

    @Override // a.k43
    public final float h() {
        return 2.0f;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(brm0.g(this.c, rw2.b(Long.hashCode(this.f42799a) * 31, 31, this.b), 31), 31, this.d);
        eaq0[] eaq0VarArr = daq0.b;
        return Float.hashCode(2.0f) + ((this.h.hashCode() + defpackage.c.a((this.g.hashCode() + rw2.b(rw2.b(iB, 31, this.e), 31, this.f)) * 31, 2.0f, 31)) * 31);
    }

    @Override // a.k43
    public final long i() {
        return this.d;
    }

    @Override // a.k43
    public final o05 j() {
        return this.g;
    }

    @Override // a.k43
    public final float k() {
        return 2.0f;
    }

    public final String toString() {
        String strI = y3d.i(this.f42799a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.d);
        String strF = daq0.f(this.e);
        String strF2 = daq0.f(this.f);
        String strC = ycl.c(2.0f);
        String strC2 = ycl.c(2.0f);
        StringBuilder sbN = b1j.n("EditCouponAnimatedCoefficientTypeParams(oldCoefficientInactiveColor=", strI, ", curCoefficientDefaultColor=", strI2, ", textStyle=");
        sbN.append(this.c);
        sbN.append(", blockedCoefficientColor=");
        sbN.append(strI3);
        sbN.append(", minFontSize=");
        f140.v(sbN, strF, ", oldCoefInactiveTextSize=", strF2, ", autoSizeStrategy=");
        sbN.append(this.g);
        sbN.append(", spaceBetweenOldCoefAndIcon=");
        sbN.append(strC);
        sbN.append(", coefIconsAppearanceStyle=");
        sbN.append(this.h);
        sbN.append(", spaceBetweenCurCoefAndIcon=");
        sbN.append(strC2);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
