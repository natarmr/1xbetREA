package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fxe implements k43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10305a;
    public final long b;
    public final y9q0 c;
    public final long d;
    public final long e;
    public final long f;
    public final o05 g;
    public final hzc h;

    public fxe() {
        pz40 pz40Var = s6t0.f31722a;
        long secondary60 = s6t0.b().f33626a.getSecondary60();
        long textPrimary = s6t0.b().f33626a.getTextPrimary();
        y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
        long secondary = s6t0.b().f33626a.getSecondary();
        long j = qmk.o;
        long j2 = qmk.q;
        o05 o05Var = o05.b;
        hxe hxeVar = new hxe();
        this.f10305a = secondary60;
        this.b = textPrimary;
        this.c = y9q0Var;
        this.d = secondary;
        this.e = j;
        this.f = j2;
        this.g = o05Var;
        this.h = hxeVar;
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
        if (!(obj instanceof fxe)) {
            return false;
        }
        fxe fxeVar = (fxe) obj;
        long j = fxeVar.f10305a;
        int i = y3d.h;
        return h2t0.a(this.f10305a, j) && h2t0.a(this.b, fxeVar.b) && this.c.equals(fxeVar.c) && h2t0.a(this.d, fxeVar.d) && daq0.a(this.e, fxeVar.e) && daq0.a(this.f, fxeVar.f) && ycl.b(4.0f, 4.0f) && ycl.b(2.0f, 2.0f) && this.g == fxeVar.g && this.h.equals(fxeVar.h);
    }

    @Override // a.k43
    public final hzc f() {
        return this.h;
    }

    @Override // a.k43
    public final long g() {
        return this.f10305a;
    }

    @Override // a.k43
    public final float h() {
        return 4.0f;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(brm0.g(this.c, rw2.b(Long.hashCode(this.f10305a) * 31, 31, this.b), 31), 31, this.d);
        eaq0[] eaq0VarArr = daq0.b;
        return this.h.hashCode() + ((this.g.hashCode() + defpackage.c.a(defpackage.c.a(rw2.b(rw2.b(iB, 31, this.e), 31, this.f), 4.0f, 31), 2.0f, 31)) * 31);
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
        String strI = y3d.i(this.f10305a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.d);
        String strF = daq0.f(this.e);
        String strF2 = daq0.f(this.f);
        String strC = ycl.c(4.0f);
        String strC2 = ycl.c(2.0f);
        StringBuilder sbN = b1j.n("MediumCustomBackgroundCoefficientParams(oldCoefficientInactiveColor=", strI, ", curCoefficientDefaultColor=", strI2, ", textStyle=");
        sbN.append(this.c);
        sbN.append(", blockedCoefficientColor=");
        sbN.append(strI3);
        sbN.append(", minFontSize=");
        f140.v(sbN, strF, ", oldCoefInactiveTextSize=", strF2, ", spaceBetweenOldCoefAndIcon=");
        f140.v(sbN, strC, ", spaceBetweenCurCoefAndIcon=", strC2, ", autoSizeStrategy=");
        sbN.append(this.g);
        sbN.append(", coefIconsAppearanceStyle=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
