package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3516a;
    public final boolean b;
    public final lq5 c;
    public final ot0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public c0b0(boolean z, boolean z2, lq5 lq5Var, ot0 ot0Var, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2) {
        this.f3516a = z;
        this.b = z2;
        this.c = lq5Var;
        this.d = ot0Var;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i;
        this.i = z6;
        this.j = z7;
        this.k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0b0)) {
            return false;
        }
        c0b0 c0b0Var = (c0b0) obj;
        return this.f3516a == c0b0Var.f3516a && this.b == c0b0Var.b && this.c.equals(c0b0Var.c) && this.d == c0b0Var.d && this.e == c0b0Var.e && this.f == c0b0Var.f && this.g == c0b0Var.g && this.h == c0b0Var.h && this.i == c0b0Var.i && this.j == c0b0Var.j && this.k == c0b0Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + brm0.e(brm0.e(twn.a(this.h, brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f3516a) * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Settings(isVirtual=", ", isNewBanners=", ", bannerCollectionStyle=", this.f3516a, this.b);
        sbQ.append(this.c);
        sbQ.append(", aggregatorGameCardCollectionStyle=");
        sbQ.append(this.d);
        sbQ.append(", hasProvidersAggregator=");
        ua80.u(", hasAggregatorBrandsFullInfo=", ", isBannersEnabled=", sbQ, this.e, this.f);
        ua80.q(this.h, ", lottieTypeId=", ", hasAggregatorPlayerTasks=", sbQ, this.g);
        ua80.u(", hasAggregatorPlayerTasksHistory=", ", aggregatorPlayerTasksRequestsTimeout=", sbQ, this.i, this.j);
        return rz4.j(this.k, Separators.RPAREN, sbQ);
    }
}
