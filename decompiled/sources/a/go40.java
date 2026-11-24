package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class go40 {
    public static final ao40 Companion = new ao40();
    public static final a8z[] t = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new ec40(9)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11612a;
    public final String b;
    public final String c;
    public final Double d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final Long i;
    public final Long j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Boolean n;
    public final Long o;
    public final Long p;
    public final List q;
    public final yl r;
    public final Boolean s;

    public /* synthetic */ go40(int i, Integer num, String str, String str2, Double d, Boolean bool, Boolean bool2, Boolean bool3, String str3, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool4, Long l6, Long l7, List list, yl ylVar, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f11612a = null;
        } else {
            this.f11612a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l7;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = ylVar;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = bool5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go40)) {
            return false;
        }
        go40 go40Var = (go40) obj;
        return Intrinsics.d(this.f11612a, go40Var.f11612a) && Intrinsics.d(this.b, go40Var.b) && Intrinsics.d(this.c, go40Var.c) && Intrinsics.d(this.d, go40Var.d) && Intrinsics.d(this.e, go40Var.e) && Intrinsics.d(this.f, go40Var.f) && Intrinsics.d(this.g, go40Var.g) && Intrinsics.d(this.h, go40Var.h) && Intrinsics.d(this.i, go40Var.i) && Intrinsics.d(this.j, go40Var.j) && Intrinsics.d(this.k, go40Var.k) && Intrinsics.d(this.l, go40Var.l) && Intrinsics.d(this.m, go40Var.m) && Intrinsics.d(this.n, go40Var.n) && Intrinsics.d(this.o, go40Var.o) && Intrinsics.d(this.p, go40Var.p) && Intrinsics.d(this.q, go40Var.q) && Intrinsics.d(this.r, go40Var.r) && Intrinsics.d(this.s, go40Var.s);
    }

    public final int hashCode() {
        Integer num = this.f11612a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.j;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.l;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.m;
        int iHashCode13 = (iHashCode12 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool4 = this.n;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l6 = this.o;
        int iHashCode15 = (iHashCode14 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.p;
        int iHashCode16 = (iHashCode15 + (l7 == null ? 0 : l7.hashCode())) * 31;
        List list = this.q;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        yl ylVar = this.r;
        int iHashCode18 = (iHashCode17 + (ylVar == null ? 0 : ylVar.hashCode())) * 31;
        Boolean bool5 = this.s;
        return iHashCode18 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f11612a, "MoneyLimitResponse(limitType=", ", currency=", this.b, ", limitMeasure=");
        sbN.append(this.c);
        sbN.append(", limitBalance=");
        sbN.append(this.d);
        sbN.append(", freeValue=");
        defpackage.c.j(sbN, this.e, ", changeAvailable=", this.f, ", deleteAvailable=");
        defpackage.c.h(this.g, ", limitState=", this.h, ", startedAt=", sbN);
        cs0.A(sbN, this.i, ", endsAt=", this.j, ", expiresAt=");
        cs0.A(sbN, this.k, ", createdAt=", this.l, ", limitValue=");
        sbN.append(this.m);
        sbN.append(", needApprove=");
        sbN.append(this.n);
        sbN.append(", pendingValue=");
        cs0.A(sbN, this.o, ", pendingEndsAt=", this.p, ", availableValues=");
        sbN.append(this.q);
        sbN.append(", activeLimitValue=");
        sbN.append(this.r);
        sbN.append(", setWithoutValue=");
        return defpackage.c.e(sbN, this.s, Separators.RPAREN);
    }
}
