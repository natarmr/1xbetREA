package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qfm implements sfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f28641a;
    public final d4d b;
    public final y9q0 c;
    public final d4d d;

    public qfm() {
        qrq qrqVar = j1t0.b;
        long j = qmk.q;
        long j2 = qmk.D;
        y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646045);
        d4d d4dVar = d4d.SECONDARY;
        y9q0 y9q0Var2 = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646045);
        this.f28641a = y9q0Var;
        this.b = d4dVar;
        this.c = y9q0Var2;
        this.d = d4dVar;
    }

    @Override // a.dgm
    public final y9q0 a() {
        return this.f28641a;
    }

    @Override // a.dgm
    public final float b() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfm)) {
            return false;
        }
        qfm qfmVar = (qfm) obj;
        return this.f28641a.equals(qfmVar.f28641a) && this.b == qfmVar.b && ycl.b(14.0f, 14.0f) && this.c.equals(qfmVar.c) && this.d == qfmVar.d && ycl.b(0.0f, 0.0f) && ycl.b(18.0f, 18.0f);
    }

    @Override // a.dgm
    public final d4d f() {
        return this.b;
    }

    @Override // a.dgm
    public final float g() {
        return 18.0f;
    }

    public final int hashCode() {
        return Float.hashCode(18.0f) + defpackage.c.a(dw9.b(this.d, brm0.g(this.c, defpackage.c.a(dw9.b(this.b, this.f28641a.hashCode() * 31, 31), 14.0f, 31), 31), 31), 0.0f, 31);
    }

    @Override // a.dgm
    public final float i() {
        return 14.0f;
    }

    @Override // a.sfm
    public final y9q0 j() {
        return this.c;
    }

    @Override // a.sfm
    public final d4d m() {
        return this.d;
    }

    public final String toString() {
        String strC = ycl.c(14.0f);
        String strC2 = ycl.c(0.0f);
        String strC3 = ycl.c(18.0f);
        StringBuilder sb = new StringBuilder("MarketV2(headerTextStyle=");
        sb.append(this.f28641a);
        sb.append(", headerTextColorKey=");
        sb.append(this.b);
        sb.append(", popularIconSize=");
        sb.append(strC);
        sb.append(", additionalLabelTextStyle=");
        sb.append(this.c);
        sb.append(", additionalLabelTextColorKey=");
        sb.append(this.d);
        sb.append(", headerBottomPadding=");
        sb.append(strC2);
        sb.append(", headerHeight=");
        return axq.n(sb, strC3, Separators.RPAREN);
    }
}
