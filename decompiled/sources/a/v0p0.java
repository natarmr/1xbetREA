package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class v0p0 {
    public static final u0p0 Companion = new u0p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36592a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Integer k;
    public final String l;
    public final String m;
    public final Integer n;
    public final Double o;
    public final Double p;
    public final Double q;
    public final Double r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;

    public /* synthetic */ v0p0(int i, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, Integer num7, Integer num8, String str4, String str5, Integer num9, Double d, Double d2, Double d3, Double d4, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14) {
        if ((i & 1) == 0) {
            this.f36592a = null;
        } else {
            this.f36592a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num8;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num9;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = d;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = d2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = d3;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = d4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = num10;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num11;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = num12;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = num13;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = num14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0p0)) {
            return false;
        }
        v0p0 v0p0Var = (v0p0) obj;
        return Intrinsics.d(this.f36592a, v0p0Var.f36592a) && Intrinsics.d(this.b, v0p0Var.b) && Intrinsics.d(this.c, v0p0Var.c) && Intrinsics.d(this.d, v0p0Var.d) && Intrinsics.d(this.e, v0p0Var.e) && Intrinsics.d(this.f, v0p0Var.f) && Intrinsics.d(this.g, v0p0Var.g) && Intrinsics.d(this.h, v0p0Var.h) && Intrinsics.d(this.i, v0p0Var.i) && Intrinsics.d(this.j, v0p0Var.j) && Intrinsics.d(this.k, v0p0Var.k) && Intrinsics.d(this.l, v0p0Var.l) && Intrinsics.d(this.m, v0p0Var.m) && Intrinsics.d(this.n, v0p0Var.n) && Intrinsics.d(this.o, v0p0Var.o) && Intrinsics.d(this.p, v0p0Var.p) && Intrinsics.d(this.q, v0p0Var.q) && Intrinsics.d(this.r, v0p0Var.r) && Intrinsics.d(this.s, v0p0Var.s) && Intrinsics.d(this.t, v0p0Var.t) && Intrinsics.d(this.u, v0p0Var.u) && Intrinsics.d(this.v, v0p0Var.v) && Intrinsics.d(this.w, v0p0Var.w);
    }

    public final int hashCode() {
        Integer num = this.f36592a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num7 = this.j;
        int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.k;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num9 = this.n;
        int iHashCode14 = (iHashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Double d = this.o;
        int iHashCode15 = (iHashCode14 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.p;
        int iHashCode16 = (iHashCode15 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.q;
        int iHashCode17 = (iHashCode16 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.r;
        int iHashCode18 = (iHashCode17 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num10 = this.s;
        int iHashCode19 = (iHashCode18 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.t;
        int iHashCode20 = (iHashCode19 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.u;
        int iHashCode21 = (iHashCode20 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.v;
        int iHashCode22 = (iHashCode21 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.w;
        return iHashCode22 + (num14 != null ? num14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f36592a, "TeamBetIndicatorsResponse(diffGoals=", ", teamsScored=", this.b, ", totalGoals3=");
        rz4.y(sbN, this.c, ", totalCorners10=", this.d, ", totalYellowCards5=");
        rz4.y(sbN, this.e, ", goals5=", this.f, ", totalGoals2=");
        b1j.u(this.g, ", winFirst=", this.h, ", lossFirst=", sbN);
        axq.x(this.j, this.i, ", holdServe=", ", twoSetRate=", sbN);
        b1j.u(this.k, ", winCount3Set=", this.l, ", winCountLossOneSet=", sbN);
        axq.x(this.n, this.m, ", countSet95=", ", teamRunRate=", sbN);
        vqd.w(sbN, this.o, ", teamBatAvg=", this.p, ", teamBowlAvg=");
        vqd.w(sbN, this.q, ", netPro=", this.r, ", diffScore=");
        rz4.y(sbN, this.s, ", totalAvgQuarter=", this.t, ", totalAvgTeamQuarter=");
        rz4.y(sbN, this.u, ", winCountHalf1=", this.v, ", win3QuarterPlus=");
        return dw9.q(sbN, this.w, Separators.RPAREN);
    }
}
