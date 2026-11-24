package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h600 {
    public static final g600 Companion = new g600();
    public static final a8z[] H;
    public final j380 A;
    public final q480 B;
    public final List C;
    public final lfu0 D;
    public final ua30 E;
    public final Boolean F;
    public final Boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f12506a;
    public final Integer b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Long g;
    public final String h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final String l;
    public final String m;
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Boolean r;
    public final Long s;
    public final Integer t;
    public final Boolean u;
    public final Boolean v;
    public final okl0 w;
    public final hmz x;
    public final s3n0 y;
    public final j380 z;

    static {
        y280 y280Var = j380.Companion;
        H = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new jtz((byte) 23)), null, null, null, null};
    }

    public /* synthetic */ h600(int i, int i2, Long l, Integer num, Long l2, Long l3, String str, Long l4, Long l5, String str2, Integer num2, String str3, Integer num3, String str4, String str5, Integer num4, Boolean bool, Boolean bool2, Integer num5, Boolean bool3, Long l6, Integer num6, Boolean bool4, Boolean bool5, okl0 okl0Var, hmz hmzVar, s3n0 s3n0Var, j380 j380Var, j380 j380Var2, q480 q480Var, List list, lfu0 lfu0Var, ua30 ua30Var, Boolean bool6, Boolean bool7) {
        if ((i & 1) == 0) {
            this.f12506a = null;
        } else {
            this.f12506a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num3;
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
            this.n = num4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num5;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l6;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num6;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool5;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = okl0Var;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = hmzVar;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = s3n0Var;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = j380Var;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = j380Var2;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = q480Var;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = list;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = lfu0Var;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = ua30Var;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = bool6;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = bool7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h600)) {
            return false;
        }
        h600 h600Var = (h600) obj;
        return Intrinsics.d(this.f12506a, h600Var.f12506a) && Intrinsics.d(this.b, h600Var.b) && Intrinsics.d(this.c, h600Var.c) && Intrinsics.d(this.d, h600Var.d) && Intrinsics.d(this.e, h600Var.e) && Intrinsics.d(this.f, h600Var.f) && Intrinsics.d(this.g, h600Var.g) && Intrinsics.d(this.h, h600Var.h) && Intrinsics.d(this.i, h600Var.i) && Intrinsics.d(this.j, h600Var.j) && Intrinsics.d(this.k, h600Var.k) && Intrinsics.d(this.l, h600Var.l) && Intrinsics.d(this.m, h600Var.m) && Intrinsics.d(this.n, h600Var.n) && Intrinsics.d(this.o, h600Var.o) && Intrinsics.d(this.p, h600Var.p) && Intrinsics.d(this.q, h600Var.q) && Intrinsics.d(this.r, h600Var.r) && Intrinsics.d(this.s, h600Var.s) && Intrinsics.d(this.t, h600Var.t) && Intrinsics.d(this.u, h600Var.u) && Intrinsics.d(this.v, h600Var.v) && Intrinsics.d(this.w, h600Var.w) && Intrinsics.d(this.x, h600Var.x) && Intrinsics.d(this.y, h600Var.y) && Intrinsics.d(this.z, h600Var.z) && Intrinsics.d(this.A, h600Var.A) && Intrinsics.d(this.B, h600Var.B) && Intrinsics.d(this.C, h600Var.C) && Intrinsics.d(this.D, h600Var.D) && Intrinsics.d(this.E, h600Var.E) && Intrinsics.d(this.F, h600Var.F) && Intrinsics.d(this.G, h600Var.G);
    }

    public final int hashCode() {
        Long l = this.f12506a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.g;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.n;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.o;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.p;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.q;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool3 = this.r;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l6 = this.s;
        int iHashCode19 = (iHashCode18 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num6 = this.t;
        int iHashCode20 = (iHashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool4 = this.u;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.v;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        okl0 okl0Var = this.w;
        int iHashCode23 = (iHashCode22 + (okl0Var == null ? 0 : okl0Var.hashCode())) * 31;
        hmz hmzVar = this.x;
        int iHashCode24 = (iHashCode23 + (hmzVar == null ? 0 : hmzVar.hashCode())) * 31;
        s3n0 s3n0Var = this.y;
        int iHashCode25 = (iHashCode24 + (s3n0Var == null ? 0 : s3n0Var.hashCode())) * 31;
        j380 j380Var = this.z;
        int iHashCode26 = (iHashCode25 + (j380Var == null ? 0 : j380Var.hashCode())) * 31;
        j380 j380Var2 = this.A;
        int iHashCode27 = (iHashCode26 + (j380Var2 == null ? 0 : j380Var2.hashCode())) * 31;
        q480 q480Var = this.B;
        int iHashCode28 = (iHashCode27 + (q480Var == null ? 0 : q480Var.hashCode())) * 31;
        List list = this.C;
        int iHashCode29 = (iHashCode28 + (list == null ? 0 : list.hashCode())) * 31;
        lfu0 lfu0Var = this.D;
        int iHashCode30 = (iHashCode29 + (lfu0Var == null ? 0 : lfu0Var.hashCode())) * 31;
        ua30 ua30Var = this.E;
        int iHashCode31 = (iHashCode30 + (ua30Var == null ? 0 : ua30Var.hashCode())) * 31;
        Boolean bool6 = this.F;
        int iHashCode32 = (iHashCode31 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.G;
        return iHashCode32 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f12506a, "LineGameResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbQ, this.c, ", constId=", this.d, ", fullName=");
        h97.w(this.f, this.e, ", startTs=", ", countryId=", sbQ);
        rz4.v(this.g, ", gameTypeName=", this.h, ", gameTypeId=", sbQ);
        b1j.u(this.i, ", dopInfo=", this.j, ", period=", sbQ);
        b1j.u(this.k, ", periodName=", this.l, ", gameVidName=", sbQ);
        axq.x(this.n, this.m, ", menuSection=", ", isNewChamp=", sbQ);
        defpackage.c.j(sbQ, this.o, ", isFinal=", this.p, ", globalChampId=");
        brm0.z(this.r, this.q, ", isThirdPlace=", ", mainConstId=", sbQ);
        brm0.A(this.t, this.s, ", kind=", ", hasHeadToHead=", sbQ);
        defpackage.c.j(sbQ, this.u, ", subscriptionAvailable=", this.v, ", sport=");
        sbQ.append(this.w);
        sbQ.append(", liga=");
        sbQ.append(this.x);
        sbQ.append(", subSport=");
        sbQ.append(this.y);
        sbQ.append(", opponent1=");
        sbQ.append(this.z);
        sbQ.append(", opponent2=");
        sbQ.append(this.A);
        sbQ.append(", opponents=");
        sbQ.append(this.B);
        sbQ.append(", eventGroups=");
        sbQ.append(this.C);
        sbQ.append(", video=");
        sbQ.append(this.D);
        sbQ.append(", matchInfoObj=");
        sbQ.append(this.E);
        sbQ.append(", homeAwayFlag=");
        sbQ.append(this.F);
        sbQ.append(", isHeadline=");
        return defpackage.c.e(sbQ, this.G, Separators.RPAREN);
    }
}
