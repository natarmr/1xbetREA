package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wfm implements xfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f39078a;
    public final d4d b;
    public final y9q0 c;
    public final d4d d;
    public final d4d e;
    public final d4d f;

    public wfm() {
        qrq qrqVar = j1t0.b;
        long j = qmk.q;
        long j2 = qmk.D;
        y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646045);
        d4d d4dVar = d4d.SECONDARY;
        y9q0 y9q0Var2 = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646045);
        d4d d4dVar2 = d4d.PRIMARY;
        d4d d4dVar3 = d4d.BACKGROUND;
        this.f39078a = y9q0Var;
        this.b = d4dVar;
        this.c = y9q0Var2;
        this.d = d4dVar;
        this.e = d4dVar2;
        this.f = d4dVar3;
    }

    @Override // a.dgm
    public final y9q0 a() {
        return this.f39078a;
    }

    @Override // a.dgm
    public final float b() {
        return 2.0f;
    }

    @Override // a.xfm
    public final float c() {
        return 8.0f;
    }

    @Override // a.xfm
    public final float d() {
        return 24.0f;
    }

    @Override // a.xfm
    public final float e() {
        return 4.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfm)) {
            return false;
        }
        wfm wfmVar = (wfm) obj;
        return this.f39078a.equals(wfmVar.f39078a) && this.b == wfmVar.b && ycl.b(14.0f, 14.0f) && this.c.equals(wfmVar.c) && this.d == wfmVar.d && this.e == wfmVar.e && ycl.b(24.0f, 24.0f) && ycl.b(18.0f, 18.0f) && this.f == wfmVar.f && ycl.b(2.0f, 2.0f) && ycl.b(18.0f, 18.0f) && ycl.b(8.0f, 8.0f) && ycl.b(4.0f, 4.0f);
    }

    @Override // a.dgm
    public final d4d f() {
        return this.b;
    }

    @Override // a.dgm
    public final float g() {
        return 18.0f;
    }

    @Override // a.xfm
    public final d4d h() {
        return this.f;
    }

    public final int hashCode() {
        return Float.hashCode(4.0f) + defpackage.c.a(defpackage.c.a(defpackage.c.a(dw9.b(this.f, defpackage.c.a(defpackage.c.a(dw9.b(this.e, dw9.b(this.d, brm0.g(this.c, defpackage.c.a(dw9.b(this.b, this.f39078a.hashCode() * 31, 31), 14.0f, 31), 31), 31), 31), 24.0f, 31), 18.0f, 31), 31), 2.0f, 31), 18.0f, 31), 8.0f, 31);
    }

    @Override // a.dgm
    public final float i() {
        return 14.0f;
    }

    @Override // a.sfm
    public final y9q0 j() {
        return this.c;
    }

    @Override // a.xfm
    public final d4d k() {
        return this.e;
    }

    @Override // a.xfm
    public final float l() {
        return 18.0f;
    }

    @Override // a.sfm
    public final d4d m() {
        return this.d;
    }

    public final String toString() {
        String strC = ycl.c(14.0f);
        String strC2 = ycl.c(24.0f);
        String strC3 = ycl.c(18.0f);
        String strC4 = ycl.c(2.0f);
        String strC5 = ycl.c(18.0f);
        String strC6 = ycl.c(8.0f);
        String strC7 = ycl.c(4.0f);
        StringBuilder sb = new StringBuilder("MarketV3(headerTextStyle=");
        sb.append(this.f39078a);
        sb.append(", headerTextColorKey=");
        sb.append(this.b);
        sb.append(", popularIconSize=");
        sb.append(strC);
        sb.append(", additionalLabelTextStyle=");
        sb.append(this.c);
        sb.append(", additionalLabelTextColorKey=");
        sb.append(this.d);
        sb.append(", accordionBtnColorKey=");
        sb.append(this.e);
        sb.append(", accordionContainerWidth=");
        f140.v(sb, strC2, ", accordionContainerHeight=", strC3, ", accordionBackgroundColorKey=");
        sb.append(this.f);
        sb.append(", headerBottomPadding=");
        sb.append(strC4);
        sb.append(", headerHeight=");
        f140.v(sb, strC5, ", accordionStartPadding=", strC6, ", accordionEndPadding=");
        return axq.n(sb, strC7, Separators.RPAREN);
    }
}
