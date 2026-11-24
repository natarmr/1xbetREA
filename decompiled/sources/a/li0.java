package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class li0 {
    public static final ki0 Companion = new ki0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f20082a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final Boolean q;
    public final Boolean r;
    public final Boolean s;
    public final Integer t;
    public final Boolean u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final Boolean y;

    public /* synthetic */ li0(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Integer num, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24) {
        if ((i & 1) == 0) {
            this.f20082a = null;
        } else {
            this.f20082a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool11;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool12;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool13;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool14;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool15;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool16;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool17;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool18;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool19;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool20;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool21;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = bool22;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = bool23;
        }
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = bool24;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        return Intrinsics.d(this.f20082a, li0Var.f20082a) && Intrinsics.d(this.b, li0Var.b) && Intrinsics.d(this.c, li0Var.c) && Intrinsics.d(this.d, li0Var.d) && Intrinsics.d(this.e, li0Var.e) && Intrinsics.d(this.f, li0Var.f) && Intrinsics.d(this.g, li0Var.g) && Intrinsics.d(this.h, li0Var.h) && Intrinsics.d(this.i, li0Var.i) && Intrinsics.d(this.j, li0Var.j) && Intrinsics.d(this.k, li0Var.k) && Intrinsics.d(this.l, li0Var.l) && Intrinsics.d(this.m, li0Var.m) && Intrinsics.d(this.n, li0Var.n) && Intrinsics.d(this.o, li0Var.o) && Intrinsics.d(this.p, li0Var.p) && Intrinsics.d(this.q, li0Var.q) && Intrinsics.d(this.r, li0Var.r) && Intrinsics.d(this.s, li0Var.s) && Intrinsics.d(this.t, li0Var.t) && Intrinsics.d(this.u, li0Var.u) && Intrinsics.d(this.v, li0Var.v) && Intrinsics.d(this.w, li0Var.w) && Intrinsics.d(this.x, li0Var.x) && Intrinsics.d(this.y, li0Var.y);
    }

    public final int hashCode() {
        Boolean bool = this.f20082a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.g;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.h;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.i;
        int iHashCode9 = (iHashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.j;
        int iHashCode10 = (iHashCode9 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.k;
        int iHashCode11 = (iHashCode10 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.l;
        int iHashCode12 = (iHashCode11 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.m;
        int iHashCode13 = (iHashCode12 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.n;
        int iHashCode14 = (iHashCode13 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.o;
        int iHashCode15 = (iHashCode14 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.p;
        int iHashCode16 = (iHashCode15 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.q;
        int iHashCode17 = (iHashCode16 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.r;
        int iHashCode18 = (iHashCode17 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.s;
        int iHashCode19 = (iHashCode18 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Integer num = this.t;
        int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool20 = this.u;
        int iHashCode21 = (iHashCode20 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.v;
        int iHashCode22 = (iHashCode21 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.w;
        int iHashCode23 = (iHashCode22 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.x;
        int iHashCode24 = (iHashCode23 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.y;
        return iHashCode24 + (bool24 != null ? bool24.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorConfig(hasCategoryAggregator=");
        sb.append(this.f20082a);
        sb.append(", hasHistoryAggregator=");
        sb.append(this.b);
        sb.append(", hasHistoryHide=");
        defpackage.c.j(sb, this.c, ", hasAggregatorSingleGame=", this.d, ", hasPromoAggregator=");
        defpackage.c.j(sb, this.e, ", hasPromoParticipation=", this.f, ", hasPromoPoints=");
        defpackage.c.j(sb, this.g, ", hasPromoRecommends=", this.h, ", hasPromoRequest=");
        defpackage.c.j(sb, this.i, ", hasPromoShop=", this.j, ", hasListPromoPoints=");
        defpackage.c.j(sb, this.k, ", hasListPromoRequest=", this.l, ", hasProvidersAggregator=");
        defpackage.c.j(sb, this.m, ", hasAggregatorBanners=", this.n, ", hasAggregatorOnboarding=");
        defpackage.c.j(sb, this.o, ", hasAggregatorBonusMessage=", this.p, ", hasAggregatorCurrencyConvertToggle=");
        defpackage.c.j(sb, this.q, ", hasAggregatorPlayerTasks=", this.r, ", hasAggregatorPlayerTasksHistory=");
        h97.u(this.s, this.t, ", aggregatorPlayerTasksRequestsTimeout=", ", hasAggregatorJackpot=", sb);
        defpackage.c.j(sb, this.u, ", hasSocialsAggregator=", this.v, ", aggregatorMethodList=");
        defpackage.c.j(sb, this.w, ", aggregatorMethodSpecialBanners=", this.x, ", aggregatorMethodLayouts=");
        return defpackage.c.e(sb, this.y, Separators.RPAREN);
    }
}
