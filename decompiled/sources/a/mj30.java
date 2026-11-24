package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mj30 {
    public static final lj30 Companion = new lj30();
    public static final a8z[] K;
    public final wz5 A;
    public final h2g B;
    public final h2g C;
    public final List D;
    public final dss E;
    public final gxs F;
    public final List G;
    public final mbr H;
    public final jch I;
    public final List J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21875a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final String h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final String l;
    public final String m;
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    public final Long q;
    public final Boolean r;
    public final Long s;
    public final Integer t;
    public final Boolean u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final Integer y;
    public final Long z;

    static {
        ich ichVar = jch.Companion;
        g2g g2gVar = h2g.Companion;
        wez wezVar = wez.f39042a;
        K = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new gj30((byte) 1)), null, null, maz.a(wezVar, new gj30((byte) 2)), null, null, maz.a(wezVar, new gj30((byte) 3))};
    }

    public /* synthetic */ mj30(int i, int i2, Long l, Long l2, Long l3, Long l4, String str, Long l5, Integer num, String str2, Integer num2, String str3, Integer num3, String str4, String str5, Integer num4, Boolean bool, Boolean bool2, Long l6, Boolean bool3, Long l7, Integer num5, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num6, Long l8, wz5 wz5Var, h2g h2gVar, h2g h2gVar2, List list, dss dssVar, gxs gxsVar, List list2, mbr mbrVar, jch jchVar, List list3) {
        if ((i & 1) == 0) {
            this.f21875a = null;
        } else {
            this.f21875a = l;
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
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
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
            this.q = l6;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l7;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num5;
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
            this.y = num6;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = l8;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = wz5Var;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = h2gVar;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = h2gVar2;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = list;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = dssVar;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = gxsVar;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = list2;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = mbrVar;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj30)) {
            return false;
        }
        mj30 mj30Var = (mj30) obj;
        return Intrinsics.d(this.f21875a, mj30Var.f21875a) && Intrinsics.d(this.b, mj30Var.b) && Intrinsics.d(this.c, mj30Var.c) && Intrinsics.d(this.d, mj30Var.d) && Intrinsics.d(this.e, mj30Var.e) && Intrinsics.d(this.f, mj30Var.f) && Intrinsics.d(this.g, mj30Var.g) && Intrinsics.d(this.h, mj30Var.h) && Intrinsics.d(this.i, mj30Var.i) && Intrinsics.d(this.j, mj30Var.j) && Intrinsics.d(this.k, mj30Var.k) && Intrinsics.d(this.l, mj30Var.l) && Intrinsics.d(this.m, mj30Var.m) && Intrinsics.d(this.n, mj30Var.n) && Intrinsics.d(this.o, mj30Var.o) && Intrinsics.d(this.p, mj30Var.p) && Intrinsics.d(this.q, mj30Var.q) && Intrinsics.d(this.r, mj30Var.r) && Intrinsics.d(this.s, mj30Var.s) && Intrinsics.d(this.t, mj30Var.t) && Intrinsics.d(this.u, mj30Var.u) && Intrinsics.d(this.v, mj30Var.v) && Intrinsics.d(this.w, mj30Var.w) && Intrinsics.d(this.x, mj30Var.x) && Intrinsics.d(this.y, mj30Var.y) && Intrinsics.d(this.z, mj30Var.z) && Intrinsics.d(this.A, mj30Var.A) && Intrinsics.d(this.B, mj30Var.B) && Intrinsics.d(this.C, mj30Var.C) && Intrinsics.d(this.D, mj30Var.D) && Intrinsics.d(this.E, mj30Var.E) && Intrinsics.d(this.F, mj30Var.F) && Intrinsics.d(this.G, mj30Var.G) && Intrinsics.d(this.H, mj30Var.H) && Intrinsics.d(this.I, mj30Var.I) && Intrinsics.d(this.J, mj30Var.J);
    }

    public final int hashCode() {
        Long l = this.f21875a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l5 = this.f;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
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
        Long l6 = this.q;
        int iHashCode17 = (iHashCode16 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool3 = this.r;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l7 = this.s;
        int iHashCode19 = (iHashCode18 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num5 = this.t;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool4 = this.u;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.v;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.w;
        int iHashCode23 = (iHashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.x;
        int iHashCode24 = (iHashCode23 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num6 = this.y;
        int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l8 = this.z;
        int iHashCode26 = (iHashCode25 + (l8 == null ? 0 : l8.hashCode())) * 31;
        wz5 wz5Var = this.A;
        int iHashCode27 = (iHashCode26 + (wz5Var == null ? 0 : wz5Var.hashCode())) * 31;
        h2g h2gVar = this.B;
        int iHashCode28 = (iHashCode27 + (h2gVar == null ? 0 : h2gVar.hashCode())) * 31;
        h2g h2gVar2 = this.C;
        int iHashCode29 = (iHashCode28 + (h2gVar2 == null ? 0 : h2gVar2.hashCode())) * 31;
        List list = this.D;
        int iHashCode30 = (iHashCode29 + (list == null ? 0 : list.hashCode())) * 31;
        dss dssVar = this.E;
        int iHashCode31 = (iHashCode30 + (dssVar == null ? 0 : dssVar.hashCode())) * 31;
        gxs gxsVar = this.F;
        int iHashCode32 = (iHashCode31 + (gxsVar == null ? 0 : gxsVar.hashCode())) * 31;
        List list2 = this.G;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        mbr mbrVar = this.H;
        int iHashCode34 = (iHashCode33 + (mbrVar == null ? 0 : mbrVar.hashCode())) * 31;
        jch jchVar = this.I;
        int iHashCode35 = (iHashCode34 + (jchVar == null ? 0 : jchVar.hashCode())) * 31;
        List list3 = this.J;
        return iHashCode35 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f21875a, this.b, "MbCyberWithSubGameResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbO, this.c, ", constId=", this.d, ", fullName=");
        h97.w(this.f, this.e, ", startTs=", ", countryId=", sbO);
        b1j.u(this.g, ", gameTypeName=", this.h, ", gameTypeId=", sbO);
        b1j.u(this.i, ", dopInfo=", this.j, ", period=", sbO);
        b1j.u(this.k, ", periodName=", this.l, ", gameVidName=", sbO);
        axq.x(this.n, this.m, ", menuSection=", ", isNewChamp=", sbO);
        defpackage.c.j(sbO, this.o, ", isFinal=", this.p, ", globalChampId=");
        sbO.append(this.q);
        sbO.append(", isThirdPlace=");
        sbO.append(this.r);
        sbO.append(", mainConstId=");
        brm0.A(this.t, this.s, ", kind=", ", hasHeadToHead=", sbO);
        defpackage.c.j(sbO, this.u, ", subscriptionAvailable=", this.v, ", isFinished=");
        defpackage.c.j(sbO, this.w, ", notStarted=", this.x, ", zonePlay=");
        cs0.w(this.y, this.z, ", updateTs=", ", liga=", sbO);
        sbO.append(this.A);
        sbO.append(", opponent1=");
        sbO.append(this.B);
        sbO.append(", opponent2=");
        sbO.append(this.C);
        sbO.append(", eventGroups=");
        sbO.append(this.D);
        sbO.append(", statisticInfo=");
        sbO.append(this.E);
        sbO.append(", video=");
        sbO.append(this.F);
        sbO.append(", subGamesForMainGame=");
        sbO.append(this.G);
        sbO.append(", matchInfoObj=");
        sbO.append(this.H);
        sbO.append(", scores=");
        sbO.append(this.I);
        sbO.append(", alterVideos=");
        sbO.append(this.J);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
