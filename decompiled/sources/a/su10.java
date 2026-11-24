package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class su10 {
    public static final ru10 Companion = new ru10();
    public static final a8z[] Q;
    public final h06 A;
    public final h06 B;
    public final List C;
    public final Boolean D;
    public final Boolean E;
    public final dss F;
    public final gxs G;
    public final mbr H;
    public final Boolean I;
    public final d5h0 J;
    public final Boolean K;
    public final Boolean L;
    public final List M;
    public final Integer N;
    public final n480 O;
    public final Boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32800a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final String f;
    public final Long g;
    public final Integer h;
    public final String i;
    public final Integer j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;
    public final List o;
    public final Boolean p;
    public final Boolean q;
    public final Long r;
    public final Boolean s;
    public final Boolean t;
    public final Boolean u;
    public final Boolean v;
    public final Integer w;
    public final pkl0 x;
    public final l26 y;
    public final wz5 z;

    static {
        w3h0 w3h0Var = d5h0.Companion;
        g06 g06Var = h06.Companion;
        wez wezVar = wez.f39042a;
        Q = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new gf10((byte) 25)), null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new gf10((byte) 26)), null, null, null, null, null, null, null, null, null, maz.a(wezVar, new gf10((byte) 27)), null, null, null};
    }

    public /* synthetic */ su10(int i, int i2, Long l, Long l2, Long l3, Long l4, Long l5, String str, Long l6, Integer num, String str2, Integer num2, String str3, Integer num3, String str4, String str5, List list, Boolean bool, Boolean bool2, Long l7, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num4, pkl0 pkl0Var, l26 l26Var, wz5 wz5Var, h06 h06Var, h06 h06Var2, List list2, Boolean bool7, Boolean bool8, dss dssVar, gxs gxsVar, mbr mbrVar, Boolean bool9, d5h0 d5h0Var, Boolean bool10, Boolean bool11, List list3, Integer num5, n480 n480Var, Boolean bool12) {
        if ((i & 1) == 0) {
            this.f32800a = null;
        } else {
            this.f32800a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num3;
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
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l7;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool3;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool4;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool5;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool6;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = num4;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = pkl0Var;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = l26Var;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = wz5Var;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = h06Var;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = h06Var2;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = list2;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = bool7;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = bool8;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = dssVar;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = gxsVar;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = mbrVar;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = bool9;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = d5h0Var;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = bool10;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = bool11;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = list3;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = num5;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = n480Var;
        }
        if ((i2 & 512) == 0) {
            this.P = null;
        } else {
            this.P = bool12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su10)) {
            return false;
        }
        su10 su10Var = (su10) obj;
        return Intrinsics.d(this.f32800a, su10Var.f32800a) && Intrinsics.d(this.b, su10Var.b) && Intrinsics.d(this.c, su10Var.c) && Intrinsics.d(this.d, su10Var.d) && Intrinsics.d(this.e, su10Var.e) && Intrinsics.d(this.f, su10Var.f) && Intrinsics.d(this.g, su10Var.g) && Intrinsics.d(this.h, su10Var.h) && Intrinsics.d(this.i, su10Var.i) && Intrinsics.d(this.j, su10Var.j) && Intrinsics.d(this.k, su10Var.k) && Intrinsics.d(this.l, su10Var.l) && Intrinsics.d(this.m, su10Var.m) && Intrinsics.d(this.n, su10Var.n) && Intrinsics.d(this.o, su10Var.o) && Intrinsics.d(this.p, su10Var.p) && Intrinsics.d(this.q, su10Var.q) && Intrinsics.d(this.r, su10Var.r) && Intrinsics.d(this.s, su10Var.s) && Intrinsics.d(this.t, su10Var.t) && Intrinsics.d(this.u, su10Var.u) && Intrinsics.d(this.v, su10Var.v) && Intrinsics.d(this.w, su10Var.w) && Intrinsics.d(this.x, su10Var.x) && Intrinsics.d(this.y, su10Var.y) && Intrinsics.d(this.z, su10Var.z) && Intrinsics.d(this.A, su10Var.A) && Intrinsics.d(this.B, su10Var.B) && Intrinsics.d(this.C, su10Var.C) && Intrinsics.d(this.D, su10Var.D) && Intrinsics.d(this.E, su10Var.E) && Intrinsics.d(this.F, su10Var.F) && Intrinsics.d(this.G, su10Var.G) && Intrinsics.d(this.H, su10Var.H) && Intrinsics.d(this.I, su10Var.I) && Intrinsics.d(this.J, su10Var.J) && Intrinsics.d(this.K, su10Var.K) && Intrinsics.d(this.L, su10Var.L) && Intrinsics.d(this.M, su10Var.M) && Intrinsics.d(this.N, su10Var.N) && Intrinsics.d(this.O, su10Var.O) && Intrinsics.d(this.P, su10Var.P);
    }

    public final int hashCode() {
        Long l = this.f32800a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.e;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Long l6 = this.g;
        int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.l;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.o;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.p;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.q;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l7 = this.r;
        int iHashCode18 = (iHashCode17 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Boolean bool3 = this.s;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.t;
        int iHashCode20 = (iHashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.u;
        int iHashCode21 = (iHashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.v;
        int iHashCode22 = (iHashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num4 = this.w;
        int iHashCode23 = (iHashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
        pkl0 pkl0Var = this.x;
        int iHashCode24 = (iHashCode23 + (pkl0Var == null ? 0 : pkl0Var.hashCode())) * 31;
        l26 l26Var = this.y;
        int iHashCode25 = (iHashCode24 + (l26Var == null ? 0 : l26Var.hashCode())) * 31;
        wz5 wz5Var = this.z;
        int iHashCode26 = (iHashCode25 + (wz5Var == null ? 0 : wz5Var.hashCode())) * 31;
        h06 h06Var = this.A;
        int iHashCode27 = (iHashCode26 + (h06Var == null ? 0 : h06Var.hashCode())) * 31;
        h06 h06Var2 = this.B;
        int iHashCode28 = (iHashCode27 + (h06Var2 == null ? 0 : h06Var2.hashCode())) * 31;
        List list2 = this.C;
        int iHashCode29 = (iHashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool7 = this.D;
        int iHashCode30 = (iHashCode29 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.E;
        int iHashCode31 = (iHashCode30 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        dss dssVar = this.F;
        int iHashCode32 = (iHashCode31 + (dssVar == null ? 0 : dssVar.hashCode())) * 31;
        gxs gxsVar = this.G;
        int iHashCode33 = (iHashCode32 + (gxsVar == null ? 0 : gxsVar.hashCode())) * 31;
        mbr mbrVar = this.H;
        int iHashCode34 = (iHashCode33 + (mbrVar == null ? 0 : mbrVar.hashCode())) * 31;
        Boolean bool9 = this.I;
        int iHashCode35 = (iHashCode34 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        d5h0 d5h0Var = this.J;
        int iHashCode36 = (iHashCode35 + (d5h0Var == null ? 0 : d5h0Var.hashCode())) * 31;
        Boolean bool10 = this.K;
        int iHashCode37 = (iHashCode36 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.L;
        int iHashCode38 = (iHashCode37 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        List list3 = this.M;
        int iHashCode39 = (iHashCode38 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num5 = this.N;
        int iHashCode40 = (iHashCode39 + (num5 == null ? 0 : num5.hashCode())) * 31;
        n480 n480Var = this.O;
        int iHashCode41 = (iHashCode40 + (n480Var == null ? 0 : n480Var.hashCode())) * 31;
        Boolean bool12 = this.P;
        return iHashCode41 + (bool12 != null ? bool12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f32800a, this.b, "MainFeedGameResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbO, this.c, ", constId=", this.d, ", mainConstId=");
        rz4.v(this.e, ", fullName=", this.f, ", startTs=", sbO);
        brm0.A(this.h, this.g, ", countryId=", ", gameTypeName=", sbO);
        axq.x(this.j, this.i, ", gameTypeId=", ", dopInfo=", sbO);
        axq.x(this.l, this.k, ", period=", ", periodName=", sbO);
        f140.v(sbO, this.m, ", gameVidName=", this.n, ", menuSections=");
        sbO.append(this.o);
        sbO.append(", isNewChamp=");
        sbO.append(this.p);
        sbO.append(", isFinal=");
        sbO.append(this.q);
        sbO.append(", globalChampId=");
        sbO.append(this.r);
        sbO.append(", isThirdPlace=");
        defpackage.c.j(sbO, this.s, ", isFinished=", this.t, ", notStarted=");
        defpackage.c.j(sbO, this.u, ", subscriptionAvailable=", this.v, ", zonePlay=");
        sbO.append(this.w);
        sbO.append(", sport=");
        sbO.append(this.x);
        sbO.append(", subSport=");
        sbO.append(this.y);
        sbO.append(", liga=");
        sbO.append(this.z);
        sbO.append(", opponent1=");
        sbO.append(this.A);
        sbO.append(", opponent2=");
        sbO.append(this.B);
        sbO.append(", eventGroups=");
        sbO.append(this.C);
        sbO.append(", hasGraph=");
        sbO.append(this.D);
        sbO.append(", isBetBuilderAvailable=");
        sbO.append(this.E);
        sbO.append(", statisticInfo=");
        sbO.append(this.F);
        sbO.append(", video=");
        sbO.append(this.G);
        sbO.append(", matchInfoObj=");
        sbO.append(this.H);
        sbO.append(", homeAwayFlag=");
        sbO.append(this.I);
        sbO.append(", scores=");
        sbO.append(this.J);
        sbO.append(", isOurRegions=");
        defpackage.c.j(sbO, this.K, ", hasTabloStats=", this.L, ", subGamesForMainGame=");
        sbO.append(this.M);
        sbO.append(", kind=");
        sbO.append(this.N);
        sbO.append(", opponents=");
        sbO.append(this.O);
        sbO.append(", isHeadline=");
        sbO.append(this.P);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
