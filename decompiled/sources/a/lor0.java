package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lor0 {
    public static final jor0 Companion = new jor0();
    public static final a8z[] u = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new dfr0(23)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20406a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Double h;
    public final Double i;
    public final String j;
    public final Integer k;
    public final Double l;
    public final String m;
    public final Boolean n;
    public final Boolean o;
    public final Long p;
    public final Long q;
    public final List r;
    public final pxu s;
    public final Long t;

    public /* synthetic */ lor0(int i, Long l, Long l2, String str, String str2, String str3, String str4, Integer num, Double d, Double d2, String str5, Integer num2, Double d3, String str6, Boolean bool, Boolean bool2, Long l3, Long l4, List list, pxu pxuVar, Long l5) {
        if ((i & 1) == 0) {
            this.f20406a = null;
        } else {
            this.f20406a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = d3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str6;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l4;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = list;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = pxuVar;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = l5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lor0)) {
            return false;
        }
        lor0 lor0Var = (lor0) obj;
        return Intrinsics.d(this.f20406a, lor0Var.f20406a) && Intrinsics.d(this.b, lor0Var.b) && Intrinsics.d(this.c, lor0Var.c) && Intrinsics.d(this.d, lor0Var.d) && Intrinsics.d(this.e, lor0Var.e) && Intrinsics.d(this.f, lor0Var.f) && Intrinsics.d(this.g, lor0Var.g) && Intrinsics.d(this.h, lor0Var.h) && Intrinsics.d(this.i, lor0Var.i) && Intrinsics.d(this.j, lor0Var.j) && Intrinsics.d(this.k, lor0Var.k) && Intrinsics.d(this.l, lor0Var.l) && Intrinsics.d(this.m, lor0Var.m) && Intrinsics.d(this.n, lor0Var.n) && Intrinsics.d(this.o, lor0Var.o) && Intrinsics.d(this.p, lor0Var.p) && Intrinsics.d(this.q, lor0Var.q) && Intrinsics.d(this.r, lor0Var.r) && Intrinsics.d(this.s, lor0Var.s) && Intrinsics.d(this.t, lor0Var.t);
    }

    public final int hashCode() {
        Long l = this.f20406a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.h;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.i;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d3 = this.l;
        int iHashCode12 = (iHashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.p;
        int iHashCode16 = (iHashCode15 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.q;
        int iHashCode17 = (iHashCode16 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.r;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        pxu pxuVar = this.s;
        int iHashCode19 = (iHashCode18 + (pxuVar == null ? 0 : pxuVar.hashCode())) * 31;
        Long l5 = this.t;
        return iHashCode19 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f20406a, this.b, "TotoHistoryItemResponse(betId=", ", betDate=", ", betCurrencyCode=");
        f140.v(sbO, this.c, ", couponNumber=", this.d, ", totoWord=");
        f140.v(sbO, this.e, ", totoName=", this.f, ", totoType=");
        hne.z(sbO, this.g, ", betSum=", this.h, ", winSum=");
        ua80.w(sbO, this.i, ", curISO=", this.j, ", betStatus=");
        hne.z(sbO, this.k, ", coef=", this.l, ", coefView=");
        h97.v(this.n, this.m, ", approved=", ", promoBet=", sbO);
        sbO.append(this.o);
        sbO.append(", payOutDate=");
        sbO.append(this.p);
        sbO.append(", countOutcomes=");
        twn.z(sbO, this.q, ", eventList=", this.r, ", taxInfo=");
        sbO.append(this.s);
        sbO.append(", betApproveId=");
        sbO.append(this.t);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
