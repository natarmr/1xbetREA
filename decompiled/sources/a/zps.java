package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zps {
    public static final mps Companion = new mps();
    public static final a8z[] F = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new o9s(25))};
    public final f380 A;
    public final p480 B;
    public final Boolean C;
    public final kfu0 D;
    public final List E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44775a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final String e;
    public final Long f;
    public final f6h0 g;
    public final Integer h;
    public final String i;
    public final Integer j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;
    public final Integer o;
    public final Boolean p;
    public final Boolean q;
    public final Boolean r;
    public final Boolean s;
    public final Integer t;
    public final Boolean u;
    public final Integer v;
    public final Integer w;
    public final Boolean x;
    public final Boolean y;
    public final f380 z;

    public /* synthetic */ zps(int i, Long l, Integer num, Integer num2, Long l2, String str, Long l3, f6h0 f6h0Var, Integer num3, String str2, Integer num4, String str3, Integer num5, String str4, String str5, Integer num6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num7, Boolean bool5, Integer num8, Integer num9, Boolean bool6, Boolean bool7, f380 f380Var, f380 f380Var2, p480 p480Var, Boolean bool8, kfu0 kfu0Var, List list) {
        if ((i & 1) == 0) {
            this.f44775a = null;
        } else {
            this.f44775a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f6h0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
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
            this.n = str5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num6;
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
            this.r = bool3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool4;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num7;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool5;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = num8;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = num9;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = bool6;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = bool7;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = f380Var;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = f380Var2;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = p480Var;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = bool8;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = kfu0Var;
        }
        if ((i & 1073741824) == 0) {
            this.E = null;
        } else {
            this.E = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zps)) {
            return false;
        }
        zps zpsVar = (zps) obj;
        return Intrinsics.d(this.f44775a, zpsVar.f44775a) && Intrinsics.d(this.b, zpsVar.b) && Intrinsics.d(this.c, zpsVar.c) && Intrinsics.d(this.d, zpsVar.d) && Intrinsics.d(this.e, zpsVar.e) && Intrinsics.d(this.f, zpsVar.f) && Intrinsics.d(this.g, zpsVar.g) && Intrinsics.d(this.h, zpsVar.h) && Intrinsics.d(this.i, zpsVar.i) && Intrinsics.d(this.j, zpsVar.j) && Intrinsics.d(this.k, zpsVar.k) && Intrinsics.d(this.l, zpsVar.l) && Intrinsics.d(this.m, zpsVar.m) && Intrinsics.d(this.n, zpsVar.n) && Intrinsics.d(this.o, zpsVar.o) && Intrinsics.d(this.p, zpsVar.p) && Intrinsics.d(this.q, zpsVar.q) && Intrinsics.d(this.r, zpsVar.r) && Intrinsics.d(this.s, zpsVar.s) && Intrinsics.d(this.t, zpsVar.t) && Intrinsics.d(this.u, zpsVar.u) && Intrinsics.d(this.v, zpsVar.v) && Intrinsics.d(this.w, zpsVar.w) && Intrinsics.d(this.x, zpsVar.x) && Intrinsics.d(this.y, zpsVar.y) && Intrinsics.d(this.z, zpsVar.z) && Intrinsics.d(this.A, zpsVar.A) && Intrinsics.d(this.B, zpsVar.B) && Intrinsics.d(this.C, zpsVar.C) && Intrinsics.d(this.D, zpsVar.D) && Intrinsics.d(this.E, zpsVar.E);
    }

    public final int hashCode() {
        Long l = this.f44775a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        f6h0 f6h0Var = this.g;
        int iHashCode7 = (iHashCode6 + (f6h0Var == null ? 0 : f6h0Var.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.l;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num6 = this.o;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool = this.p;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.q;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.r;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.s;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.t;
        int iHashCode20 = (iHashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool5 = this.u;
        int iHashCode21 = (iHashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num8 = this.v;
        int iHashCode22 = (iHashCode21 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.w;
        int iHashCode23 = (iHashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool6 = this.x;
        int iHashCode24 = (iHashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.y;
        int iHashCode25 = (iHashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        f380 f380Var = this.z;
        int iHashCode26 = (iHashCode25 + (f380Var == null ? 0 : f380Var.hashCode())) * 31;
        f380 f380Var2 = this.A;
        int iHashCode27 = (iHashCode26 + (f380Var2 == null ? 0 : f380Var2.hashCode())) * 31;
        p480 p480Var = this.B;
        int iHashCode28 = (iHashCode27 + (p480Var == null ? 0 : p480Var.hashCode())) * 31;
        Boolean bool8 = this.C;
        int iHashCode29 = (iHashCode28 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        kfu0 kfu0Var = this.D;
        int iHashCode30 = (iHashCode29 + (kfu0Var == null ? 0 : kfu0Var.hashCode())) * 31;
        List list = this.E;
        return iHashCode30 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f44775a, "GameResponse(id=", ", num=", ", mainGameId=");
        cs0.w(this.c, this.d, ", constId=", ", fullName=", sbQ);
        h97.w(this.f, this.e, ", startTs=", ", scores=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", countryId=");
        sbQ.append(this.h);
        sbQ.append(", gameTypeName=");
        axq.x(this.j, this.i, ", gameTypeId=", ", dopInfo=", sbQ);
        axq.x(this.l, this.k, ", period=", ", periodName=", sbQ);
        f140.v(sbQ, this.m, ", gameVidName=", this.n, ", menuSection=");
        brm0.z(this.p, this.o, ", isNewChamp=", ", isFinal=", sbQ);
        defpackage.c.j(sbQ, this.q, ", isFinished=", this.r, ", nonStarted=");
        h97.u(this.s, this.t, ", globalChampId=", ", isThirdPlace=", sbQ);
        h97.u(this.u, this.v, ", mainConstId=", ", kind=", sbQ);
        brm0.z(this.x, this.w, ", hasHeadToHead=", ", subscriptionAvailable=", sbQ);
        sbQ.append(this.y);
        sbQ.append(", opponent1=");
        sbQ.append(this.z);
        sbQ.append(", opponent2=");
        sbQ.append(this.A);
        sbQ.append(", opponents=");
        sbQ.append(this.B);
        sbQ.append(", homeAwayFlag=");
        sbQ.append(this.C);
        sbQ.append(", video=");
        sbQ.append(this.D);
        sbQ.append(", eventGroups=");
        return dw9.r(sbQ, this.E, Separators.RPAREN);
    }
}
