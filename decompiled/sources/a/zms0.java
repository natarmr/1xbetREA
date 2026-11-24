package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zms0 {
    public static final xms0 Companion = new xms0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44642a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final String k;
    public final String l;
    public final Integer m;
    public final Long n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Integer r;
    public final Integer s;
    public final String t;

    public /* synthetic */ zms0(int i, Long l, Long l2, String str, String str2, String str3, Long l3, Long l4, Long l5, Long l6, Long l7, String str4, String str5, Integer num, Long l8, Integer num2, Integer num3, Boolean bool, Integer num4, Integer num5, String str6) {
        if ((i & 1) == 0) {
            this.f44642a = null;
        } else {
            this.f44642a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l7;
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
            this.m = num;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = num5;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zms0)) {
            return false;
        }
        zms0 zms0Var = (zms0) obj;
        return Intrinsics.d(this.f44642a, zms0Var.f44642a) && Intrinsics.d(this.b, zms0Var.b) && Intrinsics.d(this.c, zms0Var.c) && Intrinsics.d(this.d, zms0Var.d) && Intrinsics.d(this.e, zms0Var.e) && Intrinsics.d(this.f, zms0Var.f) && Intrinsics.d(this.g, zms0Var.g) && Intrinsics.d(this.h, zms0Var.h) && Intrinsics.d(this.i, zms0Var.i) && Intrinsics.d(this.j, zms0Var.j) && Intrinsics.d(this.k, zms0Var.k) && Intrinsics.d(this.l, zms0Var.l) && Intrinsics.d(this.m, zms0Var.m) && Intrinsics.d(this.n, zms0Var.n) && Intrinsics.d(this.o, zms0Var.o) && Intrinsics.d(this.p, zms0Var.p) && Intrinsics.d(this.q, zms0Var.q) && Intrinsics.d(this.r, zms0Var.r) && Intrinsics.d(this.s, zms0Var.s) && Intrinsics.d(this.t, zms0Var.t);
    }

    public final int hashCode() {
        Long l = this.f44642a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.h;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.i;
        int iHashCode9 = (iHashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.j;
        int iHashCode10 = (iHashCode9 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Long l8 = this.n;
        int iHashCode14 = (iHashCode13 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num2 = this.o;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.p;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.q;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.r;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.s;
        int iHashCode19 = (iHashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.t;
        return iHashCode19 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f44642a, this.b, "TransitionResponse(champId=", ", constId=", ", champName=");
        f140.v(sbO, this.c, ", dopInfo=", this.d, ", gameStart=");
        h97.w(this.f, this.e, ", mainConstId=", ", subMainConstId=", sbO);
        cs0.A(sbO, this.g, ", gameId=", this.h, ", mainGameId=");
        cs0.A(sbO, this.i, ", subMainGameId=", this.j, ", oppOne=");
        f140.v(sbO, this.k, ", oppTwo=", this.l, ", period=");
        cs0.w(this.m, this.n, ", sport=", ", gameType=", sbO);
        rz4.y(sbO, this.o, ", gameVid=", this.p, ", finish=");
        h97.u(this.q, this.r, ", isInverOpp=", ", gameKind=", sbO);
        sbO.append(this.s);
        sbO.append(", statId=");
        sbO.append(this.t);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
