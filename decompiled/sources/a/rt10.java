package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rt10 {
    public static final qt10 Companion = new qt10();
    public static final a8z[] M;
    public final s3n0 A;
    public final hmz B;
    public final j380 C;
    public final j380 D;
    public final q480 E;
    public final List F;
    public final pem0 G;
    public final ua30 H;
    public final Boolean I;
    public final lfu0 J;
    public final h6h0 K;
    public final List L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31057a;
    public final Integer b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Long g;
    public final String h;
    public final Long i;
    public final String j;
    public final Long k;
    public final String l;
    public final String m;
    public final Long n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Boolean r;
    public final Long s;
    public final Long t;
    public final Boolean u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final Integer y;
    public final nkl0 z;

    static {
        d6h0 d6h0Var = h6h0.Companion;
        y280 y280Var = j380.Companion;
        wez wezVar = wez.f39042a;
        M = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new gf10((byte) 14)), null, null, null, null, null, maz.a(wezVar, new gf10((byte) 15))};
    }

    public /* synthetic */ rt10(int i, int i2, Long l, Integer num, Long l2, Long l3, String str, Long l4, Long l5, String str2, Long l6, String str3, Long l7, String str4, String str5, Long l8, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, Long l9, Long l10, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num3, nkl0 nkl0Var, s3n0 s3n0Var, hmz hmzVar, j380 j380Var, j380 j380Var2, q480 q480Var, List list, pem0 pem0Var, ua30 ua30Var, Boolean bool8, lfu0 lfu0Var, h6h0 h6h0Var, List list2) {
        if ((i & 1) == 0) {
            this.f31057a = null;
        } else {
            this.f31057a = l;
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
            this.i = l6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l7;
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
            this.n = l8;
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
            this.q = num2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l9;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = l10;
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
            this.w = bool6;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = bool7;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = num3;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = nkl0Var;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = s3n0Var;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = hmzVar;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = j380Var;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = j380Var2;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = q480Var;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = list;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = pem0Var;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = ua30Var;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = bool8;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = lfu0Var;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = h6h0Var;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt10)) {
            return false;
        }
        rt10 rt10Var = (rt10) obj;
        return Intrinsics.d(this.f31057a, rt10Var.f31057a) && Intrinsics.d(this.b, rt10Var.b) && Intrinsics.d(this.c, rt10Var.c) && Intrinsics.d(this.d, rt10Var.d) && Intrinsics.d(this.e, rt10Var.e) && Intrinsics.d(this.f, rt10Var.f) && Intrinsics.d(this.g, rt10Var.g) && Intrinsics.d(this.h, rt10Var.h) && Intrinsics.d(this.i, rt10Var.i) && Intrinsics.d(this.j, rt10Var.j) && Intrinsics.d(this.k, rt10Var.k) && Intrinsics.d(this.l, rt10Var.l) && Intrinsics.d(this.m, rt10Var.m) && Intrinsics.d(this.n, rt10Var.n) && Intrinsics.d(this.o, rt10Var.o) && Intrinsics.d(this.p, rt10Var.p) && Intrinsics.d(this.q, rt10Var.q) && Intrinsics.d(this.r, rt10Var.r) && Intrinsics.d(this.s, rt10Var.s) && Intrinsics.d(this.t, rt10Var.t) && Intrinsics.d(this.u, rt10Var.u) && Intrinsics.d(this.v, rt10Var.v) && Intrinsics.d(this.w, rt10Var.w) && Intrinsics.d(this.x, rt10Var.x) && Intrinsics.d(this.y, rt10Var.y) && Intrinsics.d(this.z, rt10Var.z) && Intrinsics.d(this.A, rt10Var.A) && Intrinsics.d(this.B, rt10Var.B) && Intrinsics.d(this.C, rt10Var.C) && Intrinsics.d(this.D, rt10Var.D) && Intrinsics.d(this.E, rt10Var.E) && Intrinsics.d(this.F, rt10Var.F) && Intrinsics.d(this.G, rt10Var.G) && Intrinsics.d(this.H, rt10Var.H) && Intrinsics.d(this.I, rt10Var.I) && Intrinsics.d(this.J, rt10Var.J) && Intrinsics.d(this.K, rt10Var.K) && Intrinsics.d(this.L, rt10Var.L);
    }

    public final int hashCode() {
        Long l = this.f31057a;
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
        Long l6 = this.i;
        int iHashCode9 = (iHashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l7 = this.k;
        int iHashCode11 = (iHashCode10 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l8 = this.n;
        int iHashCode14 = (iHashCode13 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Boolean bool = this.o;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.p;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.q;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.r;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l9 = this.s;
        int iHashCode19 = (iHashCode18 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.t;
        int iHashCode20 = (iHashCode19 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool4 = this.u;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.v;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.w;
        int iHashCode23 = (iHashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.x;
        int iHashCode24 = (iHashCode23 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num3 = this.y;
        int iHashCode25 = (iHashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        nkl0 nkl0Var = this.z;
        int iHashCode26 = (iHashCode25 + (nkl0Var == null ? 0 : nkl0Var.hashCode())) * 31;
        s3n0 s3n0Var = this.A;
        int iHashCode27 = (iHashCode26 + (s3n0Var == null ? 0 : s3n0Var.hashCode())) * 31;
        hmz hmzVar = this.B;
        int iHashCode28 = (iHashCode27 + (hmzVar == null ? 0 : hmzVar.hashCode())) * 31;
        j380 j380Var = this.C;
        int iHashCode29 = (iHashCode28 + (j380Var == null ? 0 : j380Var.hashCode())) * 31;
        j380 j380Var2 = this.D;
        int iHashCode30 = (iHashCode29 + (j380Var2 == null ? 0 : j380Var2.hashCode())) * 31;
        q480 q480Var = this.E;
        int iHashCode31 = (iHashCode30 + (q480Var == null ? 0 : q480Var.hashCode())) * 31;
        List list = this.F;
        int iHashCode32 = (iHashCode31 + (list == null ? 0 : list.hashCode())) * 31;
        pem0 pem0Var = this.G;
        int iHashCode33 = (iHashCode32 + (pem0Var == null ? 0 : pem0Var.hashCode())) * 31;
        ua30 ua30Var = this.H;
        int iHashCode34 = (iHashCode33 + (ua30Var == null ? 0 : ua30Var.hashCode())) * 31;
        Boolean bool8 = this.I;
        int iHashCode35 = (iHashCode34 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        lfu0 lfu0Var = this.J;
        int iHashCode36 = (iHashCode35 + (lfu0Var == null ? 0 : lfu0Var.hashCode())) * 31;
        h6h0 h6h0Var = this.K;
        int iHashCode37 = (iHashCode36 + (h6h0Var == null ? 0 : h6h0Var.hashCode())) * 31;
        List list2 = this.L;
        return iHashCode37 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f31057a, "MainFeedBestGamesResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbQ, this.c, ", constId=", this.d, ", fullName=");
        h97.w(this.f, this.e, ", startTs=", ", countryId=", sbQ);
        rz4.v(this.g, ", gameTypeName=", this.h, ", gameTypeId=", sbQ);
        rz4.v(this.i, ", dopInfo=", this.j, ", period=", sbQ);
        rz4.v(this.k, ", periodName=", this.l, ", gameVidName=", sbQ);
        h97.w(this.n, this.m, ", menuSection=", ", isNewChamp=", sbQ);
        defpackage.c.j(sbQ, this.o, ", isFinal=", this.p, ", globalChampId=");
        brm0.z(this.r, this.q, ", isThirdPlace=", ", mainConstId=", sbQ);
        cs0.A(sbQ, this.s, ", kind=", this.t, ", hasHeadToHead=");
        defpackage.c.j(sbQ, this.u, ", subscriptionAvailable=", this.v, ", isFinished=");
        defpackage.c.j(sbQ, this.w, ", nonStarted=", this.x, ", zonePlay=");
        sbQ.append(this.y);
        sbQ.append(", sport=");
        sbQ.append(this.z);
        sbQ.append(", subSport=");
        sbQ.append(this.A);
        sbQ.append(", liga=");
        sbQ.append(this.B);
        sbQ.append(", opponent1=");
        sbQ.append(this.C);
        sbQ.append(", opponent2=");
        sbQ.append(this.D);
        sbQ.append(", opponents=");
        sbQ.append(this.E);
        sbQ.append(", eventGroups=");
        sbQ.append(this.F);
        sbQ.append(", statisticInfo=");
        sbQ.append(this.G);
        sbQ.append(", matchInfoObj=");
        sbQ.append(this.H);
        sbQ.append(", homeAwayFlag=");
        sbQ.append(this.I);
        sbQ.append(", video=");
        sbQ.append(this.J);
        sbQ.append(", scores=");
        sbQ.append(this.K);
        sbQ.append(", alterVideos=");
        sbQ.append(this.L);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
