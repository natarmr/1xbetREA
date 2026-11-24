package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yfm implements cgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f42549a;
    public final d4d b;

    public yfm() {
        y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
        d4d d4dVar = d4d.TEXT_PRIMARY;
        this.f42549a = y9q0Var;
        this.b = d4dVar;
    }

    @Override // a.dgm
    public final y9q0 a() {
        return this.f42549a;
    }

    @Override // a.dgm
    public final float b() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfm)) {
            return false;
        }
        yfm yfmVar = (yfm) obj;
        return this.f42549a.equals(yfmVar.f42549a) && this.b == yfmVar.b && ycl.b(16.0f, 16.0f) && ycl.b(0.0f, 0.0f) && ycl.b(18.0f, 18.0f);
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
        return Float.hashCode(18.0f) + defpackage.c.a(defpackage.c.a(dw9.b(this.b, this.f42549a.hashCode() * 31, 31), 16.0f, 31), 0.0f, 31);
    }

    @Override // a.dgm
    public final float i() {
        return 16.0f;
    }

    public final String toString() {
        String strC = ycl.c(16.0f);
        String strC2 = ycl.c(0.0f);
        String strC3 = ycl.c(18.0f);
        StringBuilder sb = new StringBuilder("MarketDefault(headerTextStyle=");
        sb.append(this.f42549a);
        sb.append(", headerTextColorKey=");
        sb.append(this.b);
        sb.append(", popularIconSize=");
        f140.v(sb, strC, ", headerBottomPadding=", strC2, ", headerHeight=");
        return axq.n(sb, strC3, Separators.RPAREN);
    }
}
