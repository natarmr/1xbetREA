package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class oq7 {
    public static final kq7 Companion = new kq7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25674a;
    public final double b;
    public final Long c;
    public final double d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final wh7 i;
    public final Integer j;
    public final Long k;
    public final Integer l;
    public final Integer m;
    public final Long n;
    public final Integer o;
    public final Long p;
    public final Boolean q;
    public final Long r;
    public final Boolean s;
    public final Boolean t;
    public final kga0 u;
    public final Integer v;
    public final Double w;
    public final String x;
    public final nq7 y;

    static {
        jga0 jga0Var = kga0.Companion;
    }

    public /* synthetic */ oq7(int i, long j, double d, Long l, double d2, String str, Boolean bool, String str2, String str3, wh7 wh7Var, Integer num, Long l2, Integer num2, Integer num3, Long l3, Integer num4, Long l4, Boolean bool2, Long l5, Boolean bool3, Boolean bool4, kga0 kga0Var, Integer num5, Double d3, String str4, nq7 nq7Var) {
        this.f25674a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = 0.0d;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = wh7Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l3;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l4;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l5;
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
            this.u = kga0Var;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = num5;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = d3;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str4;
        }
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = nq7Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq7)) {
            return false;
        }
        oq7 oq7Var = (oq7) obj;
        return this.f25674a == oq7Var.f25674a && Double.compare(this.b, oq7Var.b) == 0 && Intrinsics.d(this.c, oq7Var.c) && Double.compare(this.d, oq7Var.d) == 0 && Intrinsics.d(this.e, oq7Var.e) && Intrinsics.d(this.f, oq7Var.f) && Intrinsics.d(this.g, oq7Var.g) && Intrinsics.d(this.h, oq7Var.h) && Intrinsics.d(this.i, oq7Var.i) && Intrinsics.d(this.j, oq7Var.j) && Intrinsics.d(this.k, oq7Var.k) && Intrinsics.d(this.l, oq7Var.l) && Intrinsics.d(this.m, oq7Var.m) && Intrinsics.d(this.n, oq7Var.n) && Intrinsics.d(this.o, oq7Var.o) && Intrinsics.d(this.p, oq7Var.p) && Intrinsics.d(this.q, oq7Var.q) && Intrinsics.d(this.r, oq7Var.r) && Intrinsics.d(this.s, oq7Var.s) && Intrinsics.d(this.t, oq7Var.t) && Intrinsics.d(this.u, oq7Var.u) && Intrinsics.d(this.v, oq7Var.v) && Intrinsics.d(this.w, oq7Var.w) && Intrinsics.d(this.x, oq7Var.x) && Intrinsics.d(this.y, oq7Var.y);
    }

    public final int hashCode() {
        int iD = brm0.d(this.b, Long.hashCode(this.f25674a) * 31, 31);
        Long l = this.c;
        int iD2 = brm0.d(this.d, (iD + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str = this.e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        wh7 wh7Var = this.i;
        int iHashCode5 = (iHashCode4 + (wh7Var == null ? 0 : wh7Var.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.l;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l3 = this.n;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num4 = this.o;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l4 = this.p;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool2 = this.q;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l5 = this.r;
        int iHashCode14 = (iHashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool3 = this.s;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.t;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        kga0 kga0Var = this.u;
        int iHashCode17 = (iHashCode16 + (kga0Var == null ? 0 : kga0Var.hashCode())) * 31;
        Integer num5 = this.v;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d = this.w;
        int iHashCode19 = (iHashCode18 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.x;
        int iHashCode20 = (iHashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        nq7 nq7Var = this.y;
        return iHashCode20 + (nq7Var != null ? nq7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25674a, "BetZipResponse(typeId=", ", coef=");
        sbQ.append(this.b);
        sbQ.append(", groupId=");
        sbQ.append(this.c);
        ohs0.A(sbQ, this.d, ", param=", ", paramStr=");
        h97.v(this.f, this.e, ", blocked=", ", coefV=", sbQ);
        f140.v(sbQ, this.g, ", marketName=", this.h, ", player=");
        sbQ.append(this.i);
        sbQ.append(", eventId=");
        sbQ.append(this.j);
        sbQ.append(", marketId=");
        brm0.A(this.l, this.k, ", availableSum=", ", kind=", sbQ);
        cs0.w(this.m, this.n, ", gameId=", ", isRelation=", sbQ);
        cs0.w(this.o, this.p, ", playerId=", ", gameFinished=", sbQ);
        sbQ.append(this.q);
        sbQ.append(", subSportId=");
        sbQ.append(this.r);
        sbQ.append(", bannedExpress=");
        defpackage.c.j(sbQ, this.s, ", notValid=", this.t, ", playersDuelZip=");
        sbQ.append(this.u);
        sbQ.append(", center=");
        sbQ.append(this.v);
        sbQ.append(", optionLowerCf=");
        ua80.w(sbQ, this.w, ", optionLowerCfView=", this.x, ", eventParamsResponse=");
        sbQ.append(this.y);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
