package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class fjq0 {
    public static final ziq0 Companion = new ziq0();
    public static final a8z[] o = {null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new ozp0(22)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9656a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final String i;
    public final Long j;
    public final Long k;
    public final List l;
    public final yl m;
    public final Boolean n;

    public /* synthetic */ fjq0(int i, Integer num, String str, String str2, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Long l3, Long l4, List list, yl ylVar, Boolean bool4) {
        if ((i & 1) == 0) {
            this.f9656a = null;
        } else {
            this.f9656a = num;
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
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
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
            this.l = list;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = ylVar;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjq0)) {
            return false;
        }
        fjq0 fjq0Var = (fjq0) obj;
        return Intrinsics.d(this.f9656a, fjq0Var.f9656a) && Intrinsics.d(this.b, fjq0Var.b) && Intrinsics.d(this.c, fjq0Var.c) && Intrinsics.d(this.d, fjq0Var.d) && Intrinsics.d(this.e, fjq0Var.e) && Intrinsics.d(this.f, fjq0Var.f) && Intrinsics.d(this.g, fjq0Var.g) && Intrinsics.d(this.h, fjq0Var.h) && Intrinsics.d(this.i, fjq0Var.i) && Intrinsics.d(this.j, fjq0Var.j) && Intrinsics.d(this.k, fjq0Var.k) && Intrinsics.d(this.l, fjq0Var.l) && Intrinsics.d(this.m, fjq0Var.m) && Intrinsics.d(this.n, fjq0Var.n);
    }

    public final int hashCode() {
        Integer num = this.f9656a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        int iHashCode11 = (iHashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.l;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        yl ylVar = this.m;
        int iHashCode13 = (iHashCode12 + (ylVar == null ? 0 : ylVar.hashCode())) * 31;
        Boolean bool4 = this.n;
        return iHashCode13 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f9656a, "TimeLimitResponse(limitType=", ", currency=", this.b, ", limitMeasure=");
        h97.w(this.d, this.c, ", endsAt=", ", limitValue=", sbN);
        sbN.append(this.e);
        sbN.append(", freeValue=");
        sbN.append(this.f);
        sbN.append(", changeAvailable=");
        defpackage.c.j(sbN, this.g, ", deleteAvailable=", this.h, ", limitState=");
        h97.w(this.j, this.i, ", pendingValue=", ", pendingEndsAt=", sbN);
        twn.z(sbN, this.k, ", availableValues=", this.l, ", activeLimitValue=");
        sbN.append(this.m);
        sbN.append(", setWithoutValue=");
        sbN.append(this.n);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
