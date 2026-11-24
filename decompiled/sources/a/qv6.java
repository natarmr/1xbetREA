package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qv6 {
    public static final lv6 Companion = new lv6();
    public final Integer A;
    public final Integer B;
    public final Integer C;
    public final String D;
    public final Boolean E;
    public final Integer F;
    public final Double G;
    public final String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f29373a;
    public final String b;
    public final String c;
    public final Double d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final Long h;
    public final Integer i;
    public final Long j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Integer r;
    public final String s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final String w;
    public final String x;
    public final String y;
    public final Double z;

    public /* synthetic */ qv6(int i, int i2, Double d, String str, String str2, Double d2, String str3, Long l, Integer num, Long l2, Integer num2, Long l3, Boolean bool, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool2, Integer num8, String str4, Integer num9, Integer num10, Integer num11, String str5, String str6, String str7, Double d3, Integer num12, Integer num13, Integer num14, String str8, Boolean bool3, Integer num15, Double d4, String str9) {
        if ((i & 1) == 0) {
            this.f29373a = null;
        } else {
            this.f29373a = d;
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
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num7;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num8;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str4;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num9;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = num10;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = num11;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str5;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str6;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = str7;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = d3;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = num12;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = num13;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = num14;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = str8;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = bool3;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = num15;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = d4;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv6)) {
            return false;
        }
        qv6 qv6Var = (qv6) obj;
        return Intrinsics.d(this.f29373a, qv6Var.f29373a) && Intrinsics.d(this.b, qv6Var.b) && Intrinsics.d(this.c, qv6Var.c) && Intrinsics.d(this.d, qv6Var.d) && Intrinsics.d(this.e, qv6Var.e) && Intrinsics.d(this.f, qv6Var.f) && Intrinsics.d(this.g, qv6Var.g) && Intrinsics.d(this.h, qv6Var.h) && Intrinsics.d(this.i, qv6Var.i) && Intrinsics.d(this.j, qv6Var.j) && Intrinsics.d(this.k, qv6Var.k) && Intrinsics.d(this.l, qv6Var.l) && Intrinsics.d(this.m, qv6Var.m) && Intrinsics.d(this.n, qv6Var.n) && Intrinsics.d(this.o, qv6Var.o) && Intrinsics.d(this.p, qv6Var.p) && Intrinsics.d(this.q, qv6Var.q) && Intrinsics.d(this.r, qv6Var.r) && Intrinsics.d(this.s, qv6Var.s) && Intrinsics.d(this.t, qv6Var.t) && Intrinsics.d(this.u, qv6Var.u) && Intrinsics.d(this.v, qv6Var.v) && Intrinsics.d(this.w, qv6Var.w) && Intrinsics.d(this.x, qv6Var.x) && Intrinsics.d(this.y, qv6Var.y) && Intrinsics.d(this.z, qv6Var.z) && Intrinsics.d(this.A, qv6Var.A) && Intrinsics.d(this.B, qv6Var.B) && Intrinsics.d(this.C, qv6Var.C) && Intrinsics.d(this.D, qv6Var.D) && Intrinsics.d(this.E, qv6Var.E) && Intrinsics.d(this.F, qv6Var.F) && Intrinsics.d(this.G, qv6Var.G) && Intrinsics.d(this.H, qv6Var.H);
    }

    public final int hashCode() {
        Double d = this.f29373a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.l;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.m;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.n;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.o;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.p;
        int iHashCode16 = (iHashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool2 = this.q;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num8 = this.r;
        int iHashCode18 = (iHashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str4 = this.s;
        int iHashCode19 = (iHashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num9 = this.t;
        int iHashCode20 = (iHashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.u;
        int iHashCode21 = (iHashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.v;
        int iHashCode22 = (iHashCode21 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str5 = this.w;
        int iHashCode23 = (iHashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.x;
        int iHashCode24 = (iHashCode23 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.y;
        int iHashCode25 = (iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d3 = this.z;
        int iHashCode26 = (iHashCode25 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num12 = this.A;
        int iHashCode27 = (iHashCode26 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.B;
        int iHashCode28 = (iHashCode27 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.C;
        int iHashCode29 = (iHashCode28 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str8 = this.D;
        int iHashCode30 = (iHashCode29 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool3 = this.E;
        int iHashCode31 = (iHashCode30 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num15 = this.F;
        int iHashCode32 = (iHashCode31 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Double d4 = this.G;
        int iHashCode33 = (iHashCode32 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str9 = this.H;
        return iHashCode33 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetEventResponse(coef=");
        sb.append(this.f29373a);
        sb.append(", cv=");
        sb.append(this.b);
        sb.append(", pv=");
        sb.append(this.c);
        sb.append(", param=");
        sb.append(this.d);
        sb.append(", paramMobile=");
        h97.w(this.f, this.e, ", type=", ", uiFeature=", sb);
        cs0.w(this.g, this.h, ", gameId=", ", kind=", sb);
        cs0.w(this.i, this.j, ", playerId=", ", block=", sb);
        h97.u(this.k, this.l, ", seconds=", ", expired=", sb);
        rz4.y(sb, this.m, ", price=", this.n, ", instrumentId=");
        rz4.y(sb, this.o, ", isRelation=", this.p, ", isBannedExpress=");
        h97.u(this.q, this.r, ", fullScore=", ", periodScores=", sb);
        axq.x(this.t, this.s, ", extraKind=", ", ms1=", sb);
        rz4.y(sb, this.u, ", ms2=", this.v, ", fs1=");
        f140.v(sb, this.w, ", fs2=", this.x, ", ps=");
        sb.append(this.y);
        sb.append(", specialCoef=");
        sb.append(this.z);
        sb.append(", timeSec=");
        rz4.y(sb, this.A, ", timeDirection=", this.B, ", originalPlayerId=");
        b1j.u(this.C, ", fullName=", this.D, ", finish=", sb);
        h97.u(this.E, this.F, ", gameConstId=", ", optionLowerCf=", sb);
        sb.append(this.G);
        sb.append(", optionLowerCfView=");
        sb.append(this.H);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
