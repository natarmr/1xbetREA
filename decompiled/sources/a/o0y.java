package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class o0y {
    public static final m0y Companion = new m0y();
    public static final a8z[] q = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new qgx(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24452a;
    public final Integer b;
    public final String c;
    public final Double d;
    public final Double e;
    public final Long f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final Double j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;
    public final List o;
    public final pxu p;

    public /* synthetic */ o0y(int i, Long l, Integer num, String str, Double d, Double d2, Long l2, String str2, Integer num2, Integer num3, Double d3, String str3, Integer num4, String str4, String str5, List list, pxu pxuVar) {
        if ((i & 1) == 0) {
            this.f24452a = null;
        } else {
            this.f24452a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = pxuVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0y)) {
            return false;
        }
        o0y o0yVar = (o0y) obj;
        return Intrinsics.d(this.f24452a, o0yVar.f24452a) && Intrinsics.d(this.b, o0yVar.b) && Intrinsics.d(this.c, o0yVar.c) && Intrinsics.d(this.d, o0yVar.d) && Intrinsics.d(this.e, o0yVar.e) && Intrinsics.d(this.f, o0yVar.f) && Intrinsics.d(this.g, o0yVar.g) && Intrinsics.d(this.h, o0yVar.h) && Intrinsics.d(this.i, o0yVar.i) && Intrinsics.d(this.j, o0yVar.j) && Intrinsics.d(this.k, o0yVar.k) && Intrinsics.d(this.l, o0yVar.l) && Intrinsics.d(this.m, o0yVar.m) && Intrinsics.d(this.n, o0yVar.n) && Intrinsics.d(this.o, o0yVar.o) && Intrinsics.d(this.p, o0yVar.p);
    }

    public final int hashCode() {
        Long l = this.f24452a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d3 = this.j;
        int iHashCode10 = (iHashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.l;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.o;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        pxu pxuVar = this.p;
        return iHashCode15 + (pxuVar != null ? pxuVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f24452a, "JackpotCouponResponse(betDate=", ", betStatus=", ", couponNumber=");
        sbQ.append(this.c);
        sbQ.append(", betSum=");
        sbQ.append(this.d);
        sbQ.append(", winSum=");
        sbQ.append(this.e);
        sbQ.append(", payoutDate=");
        sbQ.append(this.f);
        sbQ.append(", jackpotWord=");
        axq.x(this.h, this.g, ", jackpotType=", ", tiragNumber=", sbQ);
        hne.z(sbQ, this.i, ", coef=", this.j, ", convertedCoef=");
        axq.x(this.l, this.k, ", countOutcomes=", ", payoutType=", sbQ);
        f140.v(sbQ, this.m, ", payoutPromoCode=", this.n, ", champWithGamesList=");
        sbQ.append(this.o);
        sbQ.append(", taxInfo=");
        sbQ.append(this.p);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
