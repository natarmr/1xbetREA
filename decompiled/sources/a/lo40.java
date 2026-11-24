package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class lo40 {
    public static final fo40 Companion = new fo40();
    public static final a8z[] s = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new ec40(13)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20374a;
    public final String b;
    public final Double c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Long k;
    public final Double l;
    public final Boolean m;
    public final Double n;
    public final Long o;
    public final List p;
    public final zl q;
    public final Boolean r;

    public /* synthetic */ lo40(int i, Integer num, String str, Double d, Boolean bool, Boolean bool2, Boolean bool3, String str2, Long l, Long l2, Long l3, Long l4, Double d2, Boolean bool4, Double d3, Long l5, List list, zl zlVar, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f20374a = null;
        } else {
            this.f20374a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = d2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = d3;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = zlVar;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = bool5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo40)) {
            return false;
        }
        lo40 lo40Var = (lo40) obj;
        return Intrinsics.d(this.f20374a, lo40Var.f20374a) && Intrinsics.d(this.b, lo40Var.b) && Intrinsics.d(this.c, lo40Var.c) && Intrinsics.d(this.d, lo40Var.d) && Intrinsics.d(this.e, lo40Var.e) && Intrinsics.d(this.f, lo40Var.f) && Intrinsics.d(this.g, lo40Var.g) && Intrinsics.d(this.h, lo40Var.h) && Intrinsics.d(this.i, lo40Var.i) && Intrinsics.d(this.j, lo40Var.j) && Intrinsics.d(this.k, lo40Var.k) && Intrinsics.d(this.l, lo40Var.l) && Intrinsics.d(this.m, lo40Var.m) && Intrinsics.d(this.n, lo40Var.n) && Intrinsics.d(this.o, lo40Var.o) && Intrinsics.d(this.p, lo40Var.p) && Intrinsics.d(this.q, lo40Var.q) && Intrinsics.d(this.r, lo40Var.r);
    }

    public final int hashCode() {
        Integer num = this.f20374a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        int iHashCode11 = (iHashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d2 = this.l;
        int iHashCode12 = (iHashCode11 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool4 = this.m;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Double d3 = this.n;
        int iHashCode14 = (iHashCode13 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l5 = this.o;
        int iHashCode15 = (iHashCode14 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List list = this.p;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        zl zlVar = this.q;
        int iHashCode17 = (iHashCode16 + (zlVar == null ? 0 : zlVar.hashCode())) * 31;
        Boolean bool5 = this.r;
        return iHashCode17 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f20374a, "MoneyLimitResponse(limitType=", ", currency=", this.b, ", limitBalance=");
        sbN.append(this.c);
        sbN.append(", freeValue=");
        sbN.append(this.d);
        sbN.append(", changeAvailable=");
        defpackage.c.j(sbN, this.e, ", deleteAvailable=", this.f, ", limitState=");
        h97.w(this.h, this.g, ", startedAt=", ", endsAt=", sbN);
        cs0.A(sbN, this.i, ", expiresAt=", this.j, ", createdAt=");
        sbN.append(this.k);
        sbN.append(", limitValue=");
        sbN.append(this.l);
        sbN.append(", needApprove=");
        sbN.append(this.m);
        sbN.append(", pendingValue=");
        sbN.append(this.n);
        sbN.append(", pendingEndsAt=");
        twn.z(sbN, this.o, ", availableValues=", this.p, ", activeLimitValue=");
        sbN.append(this.q);
        sbN.append(", setWithoutValue=");
        sbN.append(this.r);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
