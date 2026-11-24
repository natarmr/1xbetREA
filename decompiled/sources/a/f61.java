package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8987a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public f61(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f8987a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f61)) {
            return false;
        }
        f61 f61Var = (f61) obj;
        return this.f8987a == f61Var.f8987a && this.b == f61Var.b && this.c == f61Var.c && this.d == f61Var.d && this.e == f61Var.e && this.f == f61Var.f && this.g == f61Var.g && this.h == f61Var.h && this.i == f61Var.i && this.j == f61Var.j && this.k == f61Var.k && this.l == f61Var.l && this.m == f61Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f8987a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AggregatorModel(hasSectionVirtual=", ", hasSectionAggregator=", ", hasTournamentsAggregator=", this.f8987a, this.b);
        ua80.u(", hasPromoAggregator=", ", hasTvBetAggregatorMenu=", sbQ, this.c, this.d);
        ua80.u(", hasProvidersAggregator=", ", hasSocialsAggregator=", sbQ, this.e, this.f);
        ua80.u(", hasSlotsAggregatorMenu=", ", hasLiveAggregatorMenu=", sbQ, this.g, this.h);
        ua80.u(", hasAggregatorSingleGame=", ", hasAggregatorBrandsFullInfo=", sbQ, this.i, this.j);
        ua80.u(", hasCategoryAggregator=", ", hasFastBet=", sbQ, this.k, this.l);
        return rw2.p(sbQ, this.m, Separators.RPAREN);
    }
}
