package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f5h {
    public static final e5h Companion = new e5h();
    public static final a8z[] O;
    public final h2g A;
    public final h2g B;
    public final List C;
    public final Boolean D;
    public final Boolean E;
    public final gog F;
    public final zpg G;
    public final gxs H;
    public final jch I;
    public final List J;
    public final List K;
    public final Integer L;
    public final l0k0 M;
    public final Boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8961a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final String g;
    public final Long h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final String l;
    public final Integer m;
    public final String n;
    public final String o;
    public final List p;
    public final Boolean q;
    public final Boolean r;
    public final Long s;
    public final Boolean t;
    public final Boolean u;
    public final Boolean v;
    public final Integer w;
    public final gdh x;
    public final k2g y;
    public final e2g z;

    static {
        ich ichVar = jch.Companion;
        g2g g2gVar = h2g.Companion;
        wez wezVar = wez.f39042a;
        O = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new x3h((byte) 7)), null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new x3h((byte) 8)), null, null, null, null, null, null, maz.a(wezVar, new x3h((byte) 9)), maz.a(wezVar, new x3h((byte) 10)), null, null, null};
    }

    public /* synthetic */ f5h(int i, int i2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, Long l7, Integer num, String str2, Integer num2, String str3, Integer num3, String str4, String str5, List list, Boolean bool, Boolean bool2, Long l8, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, gdh gdhVar, k2g k2gVar, e2g e2gVar, h2g h2gVar, h2g h2gVar2, List list2, Boolean bool6, Boolean bool7, gog gogVar, zpg zpgVar, gxs gxsVar, jch jchVar, List list3, List list4, Integer num5, l0k0 l0k0Var, Boolean bool8) {
        if ((i & 1) == 0) {
            this.f8961a = null;
        } else {
            this.f8961a = l;
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
            this.f = l6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l8;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool3;
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
            this.w = num4;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = gdhVar;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = k2gVar;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = e2gVar;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = h2gVar;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = h2gVar2;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = list2;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = bool6;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = bool7;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = gogVar;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = zpgVar;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = gxsVar;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = jchVar;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = list3;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = list4;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = num5;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = l0k0Var;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = bool8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5h)) {
            return false;
        }
        f5h f5hVar = (f5h) obj;
        return Intrinsics.d(this.f8961a, f5hVar.f8961a) && Intrinsics.d(this.b, f5hVar.b) && Intrinsics.d(this.c, f5hVar.c) && Intrinsics.d(this.d, f5hVar.d) && Intrinsics.d(this.e, f5hVar.e) && Intrinsics.d(this.f, f5hVar.f) && Intrinsics.d(this.g, f5hVar.g) && Intrinsics.d(this.h, f5hVar.h) && Intrinsics.d(this.i, f5hVar.i) && Intrinsics.d(this.j, f5hVar.j) && Intrinsics.d(this.k, f5hVar.k) && Intrinsics.d(this.l, f5hVar.l) && Intrinsics.d(this.m, f5hVar.m) && Intrinsics.d(this.n, f5hVar.n) && Intrinsics.d(this.o, f5hVar.o) && Intrinsics.d(this.p, f5hVar.p) && Intrinsics.d(this.q, f5hVar.q) && Intrinsics.d(this.r, f5hVar.r) && Intrinsics.d(this.s, f5hVar.s) && Intrinsics.d(this.t, f5hVar.t) && Intrinsics.d(this.u, f5hVar.u) && Intrinsics.d(this.v, f5hVar.v) && Intrinsics.d(this.w, f5hVar.w) && Intrinsics.d(this.x, f5hVar.x) && Intrinsics.d(this.y, f5hVar.y) && Intrinsics.d(this.z, f5hVar.z) && Intrinsics.d(this.A, f5hVar.A) && Intrinsics.d(this.B, f5hVar.B) && Intrinsics.d(this.C, f5hVar.C) && Intrinsics.d(this.D, f5hVar.D) && Intrinsics.d(this.E, f5hVar.E) && Intrinsics.d(this.F, f5hVar.F) && Intrinsics.d(this.G, f5hVar.G) && Intrinsics.d(this.H, f5hVar.H) && Intrinsics.d(this.I, f5hVar.I) && Intrinsics.d(this.J, f5hVar.J) && Intrinsics.d(this.K, f5hVar.K) && Intrinsics.d(this.L, f5hVar.L) && Intrinsics.d(this.M, f5hVar.M) && Intrinsics.d(this.N, f5hVar.N);
    }

    public final int hashCode() {
        Long l = this.f8961a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.e;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.f;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.h;
        int iHashCode8 = (iHashCode7 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.p;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.q;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.r;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l8 = this.s;
        int iHashCode19 = (iHashCode18 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Boolean bool3 = this.t;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.u;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.v;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.w;
        int iHashCode23 = (iHashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
        gdh gdhVar = this.x;
        int iHashCode24 = (iHashCode23 + (gdhVar == null ? 0 : gdhVar.hashCode())) * 31;
        k2g k2gVar = this.y;
        int iHashCode25 = (iHashCode24 + (k2gVar == null ? 0 : k2gVar.hashCode())) * 31;
        e2g e2gVar = this.z;
        int iHashCode26 = (iHashCode25 + (e2gVar == null ? 0 : e2gVar.hashCode())) * 31;
        h2g h2gVar = this.A;
        int iHashCode27 = (iHashCode26 + (h2gVar == null ? 0 : h2gVar.hashCode())) * 31;
        h2g h2gVar2 = this.B;
        int iHashCode28 = (iHashCode27 + (h2gVar2 == null ? 0 : h2gVar2.hashCode())) * 31;
        List list2 = this.C;
        int iHashCode29 = (iHashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool6 = this.D;
        int iHashCode30 = (iHashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.E;
        int iHashCode31 = (iHashCode30 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        gog gogVar = this.F;
        int iHashCode32 = (iHashCode31 + (gogVar == null ? 0 : gogVar.hashCode())) * 31;
        zpg zpgVar = this.G;
        int iHashCode33 = (iHashCode32 + (zpgVar == null ? 0 : zpgVar.hashCode())) * 31;
        gxs gxsVar = this.H;
        int iHashCode34 = (iHashCode33 + (gxsVar == null ? 0 : gxsVar.hashCode())) * 31;
        jch jchVar = this.I;
        int iHashCode35 = (iHashCode34 + (jchVar == null ? 0 : jchVar.hashCode())) * 31;
        List list3 = this.J;
        int iHashCode36 = (iHashCode35 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.K;
        int iHashCode37 = (iHashCode36 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num5 = this.L;
        int iHashCode38 = (iHashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        l0k0 l0k0Var = this.M;
        int iHashCode39 = (iHashCode38 + (l0k0Var == null ? 0 : l0k0Var.hashCode())) * 31;
        Boolean bool8 = this.N;
        return iHashCode39 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f8961a, this.b, "CyberMainFeedGameResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbO, this.c, ", mainConstId=", this.d, ", constId=");
        cs0.A(sbO, this.e, ", nextGameId=", this.f, ", fullName=");
        h97.w(this.h, this.g, ", startTs=", ", countryId=", sbO);
        b1j.u(this.i, ", gameTypeName=", this.j, ", gameTypeId=", sbO);
        b1j.u(this.k, ", dopInfo=", this.l, ", period=", sbO);
        b1j.u(this.m, ", periodName=", this.n, ", gameVidName=", sbO);
        cs0.y(this.o, ", menuSections=", ", isNewChamp=", sbO, this.p);
        defpackage.c.j(sbO, this.q, ", isFinal=", this.r, ", globalChampId=");
        sbO.append(this.s);
        sbO.append(", isFinished=");
        sbO.append(this.t);
        sbO.append(", notStarted=");
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
        sbO.append(", matchInfoObj=");
        sbO.append(this.F);
        sbO.append(", statisticInfo=");
        sbO.append(this.G);
        sbO.append(", video=");
        sbO.append(this.H);
        sbO.append(", scores=");
        sbO.append(this.I);
        sbO.append(", subGamesForMainGame=");
        sbO.append(this.J);
        sbO.append(", marketCategories=");
        sbO.append(this.K);
        sbO.append(", kind=");
        sbO.append(this.L);
        sbO.append(", simulation=");
        sbO.append(this.M);
        sbO.append(", isHeadline=");
        sbO.append(this.N);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public f5h() {
        this.f8961a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
    }
}
