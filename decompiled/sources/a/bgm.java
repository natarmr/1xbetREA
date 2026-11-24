package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bgm implements cgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f2561a;
    public final d4d b;

    public bgm() {
        y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
        d4d d4dVar = d4d.SECONDARY;
        this.f2561a = y9q0Var;
        this.b = d4dVar;
    }

    @Override // a.dgm
    public final y9q0 a() {
        return this.f2561a;
    }

    @Override // a.dgm
    public final float b() {
        return 2.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgm)) {
            return false;
        }
        bgm bgmVar = (bgm) obj;
        return this.f2561a.equals(bgmVar.f2561a) && this.b == bgmVar.b && ycl.b(14.0f, 14.0f) && ycl.b(2.0f, 2.0f) && ycl.b(18.0f, 18.0f);
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
        return Float.hashCode(18.0f) + defpackage.c.a(defpackage.c.a(dw9.b(this.b, this.f2561a.hashCode() * 31, 31), 14.0f, 31), 2.0f, 31);
    }

    @Override // a.dgm
    public final float i() {
        return 14.0f;
    }

    public final String toString() {
        String strC = ycl.c(14.0f);
        String strC2 = ycl.c(2.0f);
        String strC3 = ycl.c(18.0f);
        StringBuilder sb = new StringBuilder("MarketV3(headerTextStyle=");
        sb.append(this.f2561a);
        sb.append(", headerTextColorKey=");
        sb.append(this.b);
        sb.append(", popularIconSize=");
        f140.v(sb, strC, ", headerBottomPadding=", strC2, ", headerHeight=");
        return axq.n(sb, strC3, Separators.RPAREN);
    }
}
