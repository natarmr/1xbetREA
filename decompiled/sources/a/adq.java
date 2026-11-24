package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class adq {
    public static final a8z[] A;
    public static final zcq Companion = new zcq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f692a;
    public final Integer b;
    public final String c;
    public final Long d;
    public final Integer e;
    public final Integer f;
    public final Long g;
    public final Long h;
    public final Integer i;
    public final String j;
    public final String k;
    public final Integer l;
    public final String m;
    public final List n;
    public final String o;
    public final List p;
    public final Double q;
    public final Long r;
    public final Long s;
    public final String t;
    public final Long u;
    public final String v;
    public final String w;
    public final String x;
    public final List y;
    public final List z;

    static {
        wez wezVar = wez.f39042a;
        A = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new v9q((byte) 6)), null, maz.a(wezVar, new v9q((byte) 7)), null, null, null, null, null, null, null, null, maz.a(wezVar, new v9q((byte) 8)), maz.a(wezVar, new v9q((byte) 9))};
    }

    public /* synthetic */ adq(int i, Double d, Integer num, String str, Long l, Integer num2, Integer num3, Long l2, Long l3, Integer num4, String str2, String str3, Integer num5, String str4, List list, String str5, List list2, Double d2, Long l4, Long l5, String str6, Long l6, String str7, String str8, String str9, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f692a = null;
        } else {
            this.f692a = d;
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
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = d2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l5;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str6;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = l6;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str7;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str8;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str9;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = list3;
        }
        if ((i & 33554432) == 0) {
            this.z = null;
        } else {
            this.z = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adq)) {
            return false;
        }
        adq adqVar = (adq) obj;
        return Intrinsics.d(this.f692a, adqVar.f692a) && Intrinsics.d(this.b, adqVar.b) && Intrinsics.d(this.c, adqVar.c) && Intrinsics.d(this.d, adqVar.d) && Intrinsics.d(this.e, adqVar.e) && Intrinsics.d(this.f, adqVar.f) && Intrinsics.d(this.g, adqVar.g) && Intrinsics.d(this.h, adqVar.h) && Intrinsics.d(this.i, adqVar.i) && Intrinsics.d(this.j, adqVar.j) && Intrinsics.d(this.k, adqVar.k) && Intrinsics.d(this.l, adqVar.l) && Intrinsics.d(this.m, adqVar.m) && Intrinsics.d(this.n, adqVar.n) && Intrinsics.d(this.o, adqVar.o) && Intrinsics.d(this.p, adqVar.p) && Intrinsics.d(this.q, adqVar.q) && Intrinsics.d(this.r, adqVar.r) && Intrinsics.d(this.s, adqVar.s) && Intrinsics.d(this.t, adqVar.t) && Intrinsics.d(this.u, adqVar.u) && Intrinsics.d(this.v, adqVar.v) && Intrinsics.d(this.w, adqVar.w) && Intrinsics.d(this.x, adqVar.x) && Intrinsics.d(this.y, adqVar.y) && Intrinsics.d(this.z, adqVar.z);
    }

    public final int hashCode() {
        Double d = this.f692a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.l;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.n;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list2 = this.p;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d2 = this.q;
        int iHashCode17 = (iHashCode16 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l4 = this.r;
        int iHashCode18 = (iHashCode17 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.s;
        int iHashCode19 = (iHashCode18 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str6 = this.t;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l6 = this.u;
        int iHashCode21 = (iHashCode20 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str7 = this.v;
        int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.w;
        int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.x;
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list3 = this.y;
        int iHashCode25 = (iHashCode24 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.z;
        return iHashCode25 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FindCouponDescResponse(coefficient=");
        sb.append(this.f692a);
        sb.append(", period=");
        sb.append(this.b);
        sb.append(", coefficientView=");
        h97.w(this.d, this.c, ", eventShortGroup=", ", typeId=", sb);
        rz4.y(sb, this.e, ", vidId=", this.f, ", gameId=");
        cs0.A(sb, this.g, ", subGameId=", this.h, ", kind=");
        b1j.u(this.i, ", league=", this.j, ", eventView=", sb);
        axq.x(this.l, this.k, ", name=", ", opponentOne=", sb);
        cs0.y(this.m, ", opponentOneImages=", ", opponentTwo=", sb, this.n);
        cs0.y(this.o, ", opponentTwoImages=", ", params=", sb, this.p);
        sb.append(this.q);
        sb.append(", timeStart=");
        sb.append(this.r);
        sb.append(", sportId=");
        rz4.v(this.s, ", sportName=", this.t, ", eventType=", sb);
        rz4.v(this.u, ", type=", this.v, ", typeBetAdditional=", sb);
        f140.v(sb, this.w, ", gameVidName=", this.x, ", eventParams=");
        return kng0.n(", eventPlayerNames=", Separators.RPAREN, sb, this.y, this.z);
    }
}
