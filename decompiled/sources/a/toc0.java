package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class toc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34278a;
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
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public toc0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25) {
        this.f34278a = z;
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
        this.r = z18;
        this.s = z19;
        this.t = z20;
        this.u = z21;
        this.v = z22;
        this.w = z23;
        this.x = z24;
        this.y = z25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toc0)) {
            return false;
        }
        toc0 toc0Var = (toc0) obj;
        return this.f34278a == toc0Var.f34278a && this.b == toc0Var.b && this.c == toc0Var.c && this.d == toc0Var.d && this.e == toc0Var.e && this.f == toc0Var.f && this.g == toc0Var.g && this.h == toc0Var.h && this.i == toc0Var.i && this.j == toc0Var.j && this.k == toc0Var.k && this.l == toc0Var.l && this.m == toc0Var.m && this.n == toc0Var.n && this.o == toc0Var.o && this.p == toc0Var.p && this.q == toc0Var.q && this.r == toc0Var.r && this.s == toc0Var.s && this.t == toc0Var.t && this.u == toc0Var.u && this.v == toc0Var.v && this.w == toc0Var.w && this.x == toc0Var.x && this.y == toc0Var.y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f34278a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoSettingsModel(hasBonusGames=", ", hasPromoParticipation=", ", hasPromoPoints=", this.f34278a, this.b);
        ua80.u(", hasPromoRecommends=", ", hasPromoRequest=", sbQ, this.c, this.d);
        ua80.u(", hasPromoShop=", ", hasPromocodes=", sbQ, this.e, this.f);
        ua80.u(", hasPromotions=", ", hasSectionPromo=", sbQ, this.g, this.h);
        ua80.u(", hasSectionPromoCashback=", ", hasSectionPromocodes=", sbQ, this.i, this.j);
        ua80.u(", hasSectionWelcomeBonus=", ", hasSectionBonuses=", sbQ, this.k, this.l);
        ua80.u(", hasVipCashback=", ", hasCashbackAccountBalance=", sbQ, this.m, this.n);
        ua80.u(", hasCashbackPlacedBets=", ", hasReferralProgram=", sbQ, this.o, this.p);
        ua80.u(", hasBonusGamesForPTSOnly=", ", hasPromotionsTop=", sbQ, this.q, this.r);
        ua80.u(", hasSectionPromoTop=", ", hasListPromoPoints=", sbQ, this.s, this.t);
        ua80.u(", hasListPromoRequest=", ", hasPromotionsBySMS=", sbQ, this.u, this.v);
        ua80.u(", hasNewPromoService=", ", hasLoyaltyProgram=", sbQ, this.w, this.x);
        return rw2.p(sbQ, this.y, Separators.RPAREN);
    }
}
