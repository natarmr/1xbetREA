package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qxp {
    public static final pxp Companion = new pxp();
    public final Float A;
    public final String B;
    public final Float C;
    public final Integer D;
    public final Integer E;
    public final Float F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final Integer J;
    public final uxp K;
    public final yxp L;
    public final iyp M;
    public final Integer N;
    public final Float O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29496a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final e8v0 g;
    public final Float h;
    public final Float i;
    public final Float j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Float u;
    public final Float v;
    public final Float w;
    public final Float x;
    public final Float y;
    public final Float z;

    public /* synthetic */ qxp(int i, int i2, Long l, Integer num, String str, String str2, String str3, Integer num2, e8v0 e8v0Var, Float f, Float f2, Float f3, String str4, String str5, String str6, String str7, String str8, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, String str9, Float f11, Integer num8, Integer num9, Float f12, Integer num10, Integer num11, Integer num12, Integer num13, uxp uxpVar, yxp yxpVar, iyp iypVar, Integer num14, Float f13) {
        if ((i & 1) == 0) {
            this.f29496a = null;
        } else {
            this.f29496a = l;
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
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = e8v0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = f2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f3;
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
            this.m = str6;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str8;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num4;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num5;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = num6;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num7;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = f4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = f5;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = f6;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = f7;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = f8;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = f9;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = f10;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = str9;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = f11;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = num8;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = num9;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = f12;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = num10;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = num11;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = num12;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = num13;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = uxpVar;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = yxpVar;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = iypVar;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = num14;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxp)) {
            return false;
        }
        qxp qxpVar = (qxp) obj;
        return Intrinsics.d(this.f29496a, qxpVar.f29496a) && Intrinsics.d(this.b, qxpVar.b) && Intrinsics.d(this.c, qxpVar.c) && Intrinsics.d(this.d, qxpVar.d) && Intrinsics.d(this.e, qxpVar.e) && Intrinsics.d(this.f, qxpVar.f) && this.g == qxpVar.g && Intrinsics.d(this.h, qxpVar.h) && Intrinsics.d(this.i, qxpVar.i) && Intrinsics.d(this.j, qxpVar.j) && Intrinsics.d(this.k, qxpVar.k) && Intrinsics.d(this.l, qxpVar.l) && Intrinsics.d(this.m, qxpVar.m) && Intrinsics.d(this.n, qxpVar.n) && Intrinsics.d(this.o, qxpVar.o) && Intrinsics.d(this.p, qxpVar.p) && Intrinsics.d(this.q, qxpVar.q) && Intrinsics.d(this.r, qxpVar.r) && Intrinsics.d(this.s, qxpVar.s) && Intrinsics.d(this.t, qxpVar.t) && Intrinsics.d(this.u, qxpVar.u) && Intrinsics.d(this.v, qxpVar.v) && Intrinsics.d(this.w, qxpVar.w) && Intrinsics.d(this.x, qxpVar.x) && Intrinsics.d(this.y, qxpVar.y) && Intrinsics.d(this.z, qxpVar.z) && Intrinsics.d(this.A, qxpVar.A) && Intrinsics.d(this.B, qxpVar.B) && Intrinsics.d(this.C, qxpVar.C) && Intrinsics.d(this.D, qxpVar.D) && Intrinsics.d(this.E, qxpVar.E) && Intrinsics.d(this.F, qxpVar.F) && Intrinsics.d(this.G, qxpVar.G) && Intrinsics.d(this.H, qxpVar.H) && Intrinsics.d(this.I, qxpVar.I) && Intrinsics.d(this.J, qxpVar.J) && Intrinsics.d(this.K, qxpVar.K) && Intrinsics.d(this.L, qxpVar.L) && Intrinsics.d(this.M, qxpVar.M) && Intrinsics.d(this.N, qxpVar.N) && Intrinsics.d(this.O, qxpVar.O);
    }

    public final int hashCode() {
        Long l = this.f29496a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        e8v0 e8v0Var = this.g;
        int iHashCode7 = (iHashCode6 + (e8v0Var == null ? 0 : e8v0Var.hashCode())) * 31;
        Float f = this.h;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.i;
        int iHashCode9 = (iHashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.j;
        int iHashCode10 = (iHashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.p;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.q;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.r;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.s;
        int iHashCode19 = (iHashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.t;
        int iHashCode20 = (iHashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Float f4 = this.u;
        int iHashCode21 = (iHashCode20 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.v;
        int iHashCode22 = (iHashCode21 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.w;
        int iHashCode23 = (iHashCode22 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.x;
        int iHashCode24 = (iHashCode23 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.y;
        int iHashCode25 = (iHashCode24 + (f8 == null ? 0 : f8.hashCode())) * 31;
        Float f9 = this.z;
        int iHashCode26 = (iHashCode25 + (f9 == null ? 0 : f9.hashCode())) * 31;
        Float f10 = this.A;
        int iHashCode27 = (iHashCode26 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str9 = this.B;
        int iHashCode28 = (iHashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Float f11 = this.C;
        int iHashCode29 = (iHashCode28 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num8 = this.D;
        int iHashCode30 = (iHashCode29 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.E;
        int iHashCode31 = (iHashCode30 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Float f12 = this.F;
        int iHashCode32 = (iHashCode31 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num10 = this.G;
        int iHashCode33 = (iHashCode32 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.H;
        int iHashCode34 = (iHashCode33 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.I;
        int iHashCode35 = (iHashCode34 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.J;
        int iHashCode36 = (iHashCode35 + (num13 == null ? 0 : num13.hashCode())) * 31;
        uxp uxpVar = this.K;
        int iHashCode37 = (iHashCode36 + (uxpVar == null ? 0 : uxpVar.hashCode())) * 31;
        yxp yxpVar = this.L;
        int iHashCode38 = (iHashCode37 + (yxpVar == null ? 0 : yxpVar.hashCode())) * 31;
        iyp iypVar = this.M;
        int iHashCode39 = (iHashCode38 + (iypVar == null ? 0 : iypVar.hashCode())) * 31;
        Integer num14 = this.N;
        int iHashCode40 = (iHashCode39 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Float f13 = this.O;
        return iHashCode40 + (f13 != null ? f13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f29496a, "FighterStatisticResponse(feedId=", ", fighterID=", ", feedName=");
        f140.v(sbQ, this.c, ", firstName=", this.d, ", lastName=");
        axq.x(this.f, this.e, ", age=", ", weightClass=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", heightMetric=");
        sbQ.append(this.h);
        sbQ.append(", weightMetric=");
        vqd.x(sbQ, this.i, ", armReachMetric=", this.j, ", cityOfBirth=");
        f140.v(sbQ, this.k, ", countryOfBirth=", this.l, ", countryImageS3=");
        f140.v(sbQ, this.m, ", rank=", this.n, ", imageS3=");
        axq.x(this.p, this.o, ", wins=", ", losses=", sbQ);
        rz4.y(sbQ, this.q, ", draws=", this.r, ", winsByKo=");
        rz4.y(sbQ, this.s, ", winsBySubmission=", this.t, ", sigStrikesAccuracy=");
        vqd.x(sbQ, this.u, ", sigStrikesPerMin=", this.v, ", sigStrikesAbsorbed=");
        vqd.x(sbQ, this.w, ", sigStrikeDefence=", this.x, ", takedownAccuracy=");
        vqd.x(sbQ, this.y, ", takedownAvg=", this.z, ", takedownDefence=");
        sbQ.append(this.A);
        sbQ.append(", fightingStyle=");
        sbQ.append(this.B);
        sbQ.append(", legReachMetric=");
        sbQ.append(this.C);
        sbQ.append(", sigStrikesLanded=");
        sbQ.append(this.D);
        sbQ.append(", sigStrikesAttempted=");
        sbQ.append(this.E);
        sbQ.append(", knockdownAvg=");
        sbQ.append(this.F);
        sbQ.append(", takedownLanded=");
        rz4.y(sbQ, this.G, ", takedownAttempted=", this.H, ", avgFightTime=");
        rz4.y(sbQ, this.I, ", firstRoundFinishes=", this.J, ", strikePosition=");
        sbQ.append(this.K);
        sbQ.append(", strikeTarget=");
        sbQ.append(this.L);
        sbQ.append(", winMethods=");
        sbQ.append(this.M);
        sbQ.append(", pfpRank=");
        sbQ.append(this.N);
        sbQ.append(", submissionAvg=");
        sbQ.append(this.O);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
