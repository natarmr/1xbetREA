package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ho40 {
    public static final bo40 Companion = new bo40();
    public static final a8z[] q = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new ec40(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13377a;
    public final String b;
    public final Double c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Integer k;
    public final Boolean l;
    public final Integer m;
    public final Long n;
    public final List o;
    public final Boolean p;

    public /* synthetic */ ho40(int i, Integer num, String str, Double d, Boolean bool, Boolean bool2, Boolean bool3, String str2, Long l, Long l2, Long l3, Integer num2, Boolean bool4, Integer num3, Long l4, List list, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f13377a = null;
        } else {
            this.f13377a = num;
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
            this.k = num2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = bool5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho40)) {
            return false;
        }
        ho40 ho40Var = (ho40) obj;
        return Intrinsics.d(this.f13377a, ho40Var.f13377a) && Intrinsics.d(this.b, ho40Var.b) && Intrinsics.d(this.c, ho40Var.c) && Intrinsics.d(this.d, ho40Var.d) && Intrinsics.d(this.e, ho40Var.e) && Intrinsics.d(this.f, ho40Var.f) && Intrinsics.d(this.g, ho40Var.g) && Intrinsics.d(this.h, ho40Var.h) && Intrinsics.d(this.i, ho40Var.i) && Intrinsics.d(this.j, ho40Var.j) && Intrinsics.d(this.k, ho40Var.k) && Intrinsics.d(this.l, ho40Var.l) && Intrinsics.d(this.m, ho40Var.m) && Intrinsics.d(this.n, ho40Var.n) && Intrinsics.d(this.o, ho40Var.o) && Intrinsics.d(this.p, ho40Var.p);
    }

    public final int hashCode() {
        Integer num = this.f13377a;
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
        Integer num2 = this.k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.l;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l4 = this.n;
        int iHashCode14 = (iHashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.o;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool5 = this.p;
        return iHashCode15 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f13377a, "MoneyLimitResponse(limitType=", ", currency=", this.b, ", limitBalance=");
        sbN.append(this.c);
        sbN.append(", freeValue=");
        sbN.append(this.d);
        sbN.append(", changeAvailable=");
        defpackage.c.j(sbN, this.e, ", deleteAvailable=", this.f, ", limitState=");
        h97.w(this.h, this.g, ", startedAt=", ", endsAt=", sbN);
        cs0.A(sbN, this.i, ", createdAt=", this.j, ", limitValue=");
        brm0.z(this.l, this.k, ", needApprove=", ", pendingValue=", sbN);
        cs0.w(this.m, this.n, ", pendingEndsAt=", ", availableValues=", sbN);
        sbN.append(this.o);
        sbN.append(", setWithoutValue=");
        sbN.append(this.p);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
