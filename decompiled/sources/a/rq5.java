package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rq5 implements sq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr5 f30915a;
    public final int b;
    public final boolean c;

    public rq5(lr5 lr5Var, int i, boolean z) {
        this.f30915a = lr5Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq5)) {
            return false;
        }
        rq5 rq5Var = (rq5) obj;
        return this.f30915a.equals(rq5Var.f30915a) && this.b == rq5Var.b && this.c == rq5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f30915a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnBannerClick(bannerModel=");
        sb.append(this.f30915a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", showNavBar=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
