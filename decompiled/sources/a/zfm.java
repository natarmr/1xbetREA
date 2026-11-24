package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zfm implements cgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f44306a;
    public final d4d b;

    public zfm() {
        y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
        d4d d4dVar = d4d.TEXT_PRIMARY;
        this.f44306a = y9q0Var;
        this.b = d4dVar;
    }

    @Override // a.dgm
    public final y9q0 a() {
        return this.f44306a;
    }

    @Override // a.dgm
    public final float b() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfm)) {
            return false;
        }
        zfm zfmVar = (zfm) obj;
        return this.f44306a.equals(zfmVar.f44306a) && this.b == zfmVar.b && ycl.b(14.0f, 14.0f) && ycl.b(0.0f, 0.0f) && ycl.b(20.0f, 20.0f);
    }

    @Override // a.dgm
    public final d4d f() {
        return this.b;
    }

    @Override // a.dgm
    public final float g() {
        return 20.0f;
    }

    public final int hashCode() {
        return Float.hashCode(20.0f) + defpackage.c.a(defpackage.c.a(dw9.b(this.b, this.f44306a.hashCode() * 31, 31), 14.0f, 31), 0.0f, 31);
    }

    @Override // a.dgm
    public final float i() {
        return 14.0f;
    }

    public final String toString() {
        String strC = ycl.c(14.0f);
        String strC2 = ycl.c(0.0f);
        String strC3 = ycl.c(20.0f);
        StringBuilder sb = new StringBuilder("MarketV1(headerTextStyle=");
        sb.append(this.f44306a);
        sb.append(", headerTextColorKey=");
        sb.append(this.b);
        sb.append(", popularIconSize=");
        f140.v(sb, strC, ", headerBottomPadding=", strC2, ", headerHeight=");
        return axq.n(sb, strC3, Separators.RPAREN);
    }
}
