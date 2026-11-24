package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f8c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9098a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final esr f;
    public final long g;
    public final boolean h;
    public final double i;

    public f8c0(int i, String str, int i2, String str2, int i3, esr esrVar, long j, boolean z, double d) {
        this.f9098a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = esrVar;
        this.g = j;
        this.h = z;
        this.i = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8c0)) {
            return false;
        }
        f8c0 f8c0Var = (f8c0) obj;
        return this.f9098a == f8c0Var.f9098a && this.b.equals(f8c0Var.b) && this.c == f8c0Var.c && this.d.equals(f8c0Var.d) && this.e == f8c0Var.e && this.f == f8c0Var.f && this.g == f8c0Var.g && this.h == f8c0Var.h && Double.compare(this.i, f8c0Var.i) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.i) + brm0.e(rw2.b((this.f.hashCode() + twn.a(this.e, ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f9098a) * 31, 31, this.b), 31), 31, this.d), 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f9098a, "PromoBuyModel(errorCode=", ", message=", this.b, ", coinsBalance=");
        kng0.w(this.c, ", promoCode=", this.d, ", numFs=", sbR);
        sbR.append(this.e);
        sbR.append(", type=");
        sbR.append(this.f);
        sbR.append(", gameId=");
        hne.t(this.g, ", forceIFrame=", sbR, this.h);
        return brm0.m(sbR, this.i, ", freeBetSumEur=", Separators.RPAREN);
    }
}
