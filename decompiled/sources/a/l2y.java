package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class l2y {
    public static final j2y Companion = new j2y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19334a;
    public final Long b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Double f;
    public final Double g;
    public final String h;
    public final Integer i;
    public final Double j;
    public final String k;
    public final String l;
    public final pxu m;

    public /* synthetic */ l2y(int i, Long l, Long l2, String str, String str2, Integer num, Double d, Double d2, String str3, Integer num2, Double d3, String str4, String str5, pxu pxuVar) {
        if ((i & 1) == 0) {
            this.f19334a = null;
        } else {
            this.f19334a = l;
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
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = pxuVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2y)) {
            return false;
        }
        l2y l2yVar = (l2y) obj;
        return Intrinsics.d(this.f19334a, l2yVar.f19334a) && Intrinsics.d(this.b, l2yVar.b) && Intrinsics.d(this.c, l2yVar.c) && Intrinsics.d(this.d, l2yVar.d) && Intrinsics.d(this.e, l2yVar.e) && Intrinsics.d(this.f, l2yVar.f) && Intrinsics.d(this.g, l2yVar.g) && Intrinsics.d(this.h, l2yVar.h) && Intrinsics.d(this.i, l2yVar.i) && Intrinsics.d(this.j, l2yVar.j) && Intrinsics.d(this.k, l2yVar.k) && Intrinsics.d(this.l, l2yVar.l) && Intrinsics.d(this.m, l2yVar.m);
    }

    public final int hashCode() {
        Long l = this.f19334a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.f;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d3 = this.j;
        int iHashCode10 = (iHashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        pxu pxuVar = this.m;
        return iHashCode12 + (pxuVar != null ? pxuVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f19334a, this.b, "JackpotHistoryItemResponse(betId=", ", betDate=", ", couponNumber=");
        f140.v(sbO, this.c, ", jackpotWord=", this.d, ", jackpotType=");
        hne.z(sbO, this.e, ", betSum=", this.f, ", winSum=");
        ua80.w(sbO, this.g, ", curISO=", this.h, ", betStatus=");
        hne.z(sbO, this.i, ", coef=", this.j, ", coefView=");
        f140.v(sbO, this.k, ", payoutType=", this.l, ", taxInfo=");
        sbO.append(this.m);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
