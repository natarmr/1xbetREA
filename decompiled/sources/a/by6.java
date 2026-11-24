package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class by6 implements dy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3401a;
    public final long b;
    public final y9q0 c;
    public final long d;
    public final long e;
    public final long f;
    public final o05 g;
    public final hzc h;

    public by6(y9q0 y9q0Var, int i) {
        y9q0 y9q0Var2;
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        long textPrimary = s6t0.b().f33626a.getTextPrimary();
        if ((i & 4) != 0) {
            y9q0Var2 = new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109);
        } else {
            y9q0Var2 = y9q0Var;
        }
        long secondary2 = s6t0.b().f33626a.getSecondary();
        long j = qmk.o;
        long j2 = new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109).f42262a.b;
        o05 o05Var = o05.f24405a;
        gy6 gy6Var = new gy6();
        this.f3401a = secondary;
        this.b = textPrimary;
        this.c = y9q0Var2;
        this.d = secondary2;
        this.e = j;
        this.f = j2;
        this.g = o05Var;
        this.h = gy6Var;
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
        if (!(obj instanceof by6)) {
            return false;
        }
        by6 by6Var = (by6) obj;
        long j = by6Var.f3401a;
        int i = y3d.h;
        return h2t0.a(this.f3401a, j) && h2t0.a(this.b, by6Var.b) && this.c.equals(by6Var.c) && h2t0.a(this.d, by6Var.d) && daq0.a(this.e, by6Var.e) && daq0.a(this.f, by6Var.f) && this.g == by6Var.g && ycl.b(0.0f, 0.0f) && this.h.equals(by6Var.h) && ycl.b(0.0f, 0.0f);
    }

    @Override // a.k43
    public final hzc f() {
        return this.h;
    }

    @Override // a.k43
    public final long g() {
        return this.f3401a;
    }

    @Override // a.k43
    public final float h() {
        return 0.0f;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(brm0.g(this.c, rw2.b(Long.hashCode(this.f3401a) * 31, 31, this.b), 31), 31, this.d);
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
        String strI = y3d.i(this.f3401a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.d);
        String strF = daq0.f(this.e);
        String strF2 = daq0.f(this.f);
        String strC = ycl.c(0.0f);
        String strC2 = ycl.c(0.0f);
        StringBuilder sbN = b1j.n("LiteNoTabsCoefficientParams(oldCoefficientInactiveColor=", strI, ", curCoefficientDefaultColor=", strI2, ", textStyle=");
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
