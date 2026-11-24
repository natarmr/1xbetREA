package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ay6 implements dy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1656a;
    public final long b;
    public final y9q0 c;
    public final long d;
    public final long e;
    public final long f;
    public final o05 g;
    public final hzc h;

    public ay6(y9q0 y9q0Var, fy6 fy6Var, int i) {
        o05 o05Var = o05.b;
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        long textPrimary = s6t0.b().f33626a.getTextPrimary();
        y9q0 y9q0Var2 = (i & 4) != 0 ? new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109) : y9q0Var;
        long secondary2 = s6t0.b().f33626a.getSecondary();
        long j = qmk.o;
        long j2 = new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109).f42262a.b;
        o05Var = (i & 64) != 0 ? o05.f24405a : o05Var;
        hzc ey6Var = (i & 256) != 0 ? new ey6() : fy6Var;
        this.f1656a = secondary;
        this.b = textPrimary;
        this.c = y9q0Var2;
        this.d = secondary2;
        this.e = j;
        this.f = j2;
        this.g = o05Var;
        this.h = ey6Var;
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
        if (!(obj instanceof ay6)) {
            return false;
        }
        ay6 ay6Var = (ay6) obj;
        long j = ay6Var.f1656a;
        int i = y3d.h;
        return h2t0.a(this.f1656a, j) && h2t0.a(this.b, ay6Var.b) && this.c.equals(ay6Var.c) && h2t0.a(this.d, ay6Var.d) && daq0.a(this.e, ay6Var.e) && daq0.a(this.f, ay6Var.f) && this.g == ay6Var.g && ycl.b(0.0f, 0.0f) && this.h.equals(ay6Var.h) && ycl.b(0.0f, 0.0f);
    }

    @Override // a.k43
    public final hzc f() {
        return this.h;
    }

    @Override // a.k43
    public final long g() {
        return this.f1656a;
    }

    @Override // a.k43
    public final float h() {
        return 0.0f;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(brm0.g(this.c, rw2.b(Long.hashCode(this.f1656a) * 31, 31, this.b), 31), 31, this.d);
        eaq0[] eaq0VarArr = daq0.b;
        return Float.hashCode(0.0f) + ((this.h.hashCode() + defpackage.c.a((this.g.hashCode() + rw2.b(rw2.b(iB, 31, this.e), 31, this.f)) * 31, 0.0f, 31)) * 31);
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
        return 0.0f;
    }

    public final String toString() {
        String strI = y3d.i(this.f1656a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.d);
        String strF = daq0.f(this.e);
        String strF2 = daq0.f(this.f);
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(0.0f);
        StringBuilder sbN = b1j.n("FullScreenSlideCoefficientParams(oldCoefficientInactiveColor=", strI, ", curCoefficientDefaultColor=", strI2, ", textStyle=");
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
