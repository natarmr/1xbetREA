package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ucq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35442a;
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
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public ucq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f35442a = z;
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
        this.n = z14;
        this.o = z15;
        this.p = z16;
        this.q = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucq)) {
            return false;
        }
        ucq ucqVar = (ucq) obj;
        return this.f35442a == ucqVar.f35442a && this.b == ucqVar.b && this.c == ucqVar.c && this.d == ucqVar.d && this.e == ucqVar.e && this.f == ucqVar.f && this.g == ucqVar.g && this.h == ucqVar.h && this.i == ucqVar.i && this.j == ucqVar.j && this.k == ucqVar.k && this.l == ucqVar.l && this.m == ucqVar.m && this.n == ucqVar.n && this.o == ucqVar.o && this.p == ucqVar.p && this.q == ucqVar.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f35442a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FinancialSecurityRemoteConfigModel(hasFinancialSecurityVivatEe=", ", hasFinancialSecurity=", ", hasFinancialSecurityCuracao=", this.f35442a, this.b);
        ua80.u(", hasFinancialSecurityIreland=", ", hasFinancialSecuritySerbia=", sbQ, this.c, this.d);
        ua80.u(", hasFinancialSecurityVivatBe=", ", hasFinancialSecurityKenya=", sbQ, this.e, this.f);
        ua80.u(", hasFinancialSecurityUBBF=", ", hasFinancialSecurityDepositLimits=", sbQ, this.g, this.h);
        ua80.u(", hasFinancialSecuritySessionTimeLimits=", ", hasFinancialSecuritySelfLimits=", sbQ, this.i, this.j);
        ua80.u(", hasFinancialSecurityBetsLimits=", ", hasFinancialSecurityLossLimits=", sbQ, this.k, this.l);
        ua80.u(", hasFinancialSecurityTimeoutLimits=", ", hasFinancialSecurityRealChkLimits=", sbQ, this.m, this.n);
        ua80.u(", hasFinancialSecurityKz=", ", hasFinancialSecurityNiger=", sbQ, this.o, this.p);
        return rw2.p(sbQ, this.q, Separators.RPAREN);
    }
}
