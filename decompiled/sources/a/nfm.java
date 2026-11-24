package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f23444a;
    public final d4d b;
    public final float c;
    public final float d;
    public final float e;

    public nfm(y9q0 y9q0Var, d4d d4dVar, float f, float f2, float f3) {
        y9q0Var.getClass();
        d4dVar.getClass();
        this.f23444a = y9q0Var;
        this.b = d4dVar;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfm)) {
            return false;
        }
        nfm nfmVar = (nfm) obj;
        return Intrinsics.d(this.f23444a, nfmVar.f23444a) && this.b == nfmVar.b && ycl.b(this.c, nfmVar.c) && ycl.b(this.d, nfmVar.d) && ycl.b(this.e, nfmVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + defpackage.c.a(defpackage.c.a(dw9.b(this.b, this.f23444a.hashCode() * 31, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        String strC2 = ycl.c(this.d);
        String strC3 = ycl.c(this.e);
        StringBuilder sb = new StringBuilder("DsEventCardMarketHeaderConfig(marketHeaderTextStyle=");
        sb.append(this.f23444a);
        sb.append(", marketHeaderTextColorKey=");
        sb.append(this.b);
        sb.append(", marketHeaderPopularIconSize=");
        f140.v(sb, strC, ", headerBottomPadding=", strC2, ", marketHeaderHeight=");
        return axq.n(sb, strC3, Separators.RPAREN);
    }
}
