package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class mwe {
    public static final lwe Companion = new lwe();
    public static final a8z[] z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22499a;
    public final Double b;
    public final Long c;
    public final Long d;
    public final Double e;
    public final Boolean f;
    public final Long g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final Long l;
    public final String m;
    public final String n;
    public final List o;
    public final List p;
    public final Long q;
    public final Integer r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final kga0 w;
    public final List x;
    public final List y;

    static {
        jga0 jga0Var = kga0.Companion;
        wez wezVar = wez.f39042a;
        z = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new yld((byte) 20)), maz.a(wezVar, new yld((byte) 21)), null, null, null, null, null, null, null, maz.a(wezVar, new yld((byte) 22)), maz.a(wezVar, new yld((byte) 23))};
    }

    public /* synthetic */ mwe(int i, Long l, Double d, Long l2, Long l3, Double d2, Boolean bool, Long l4, String str, String str2, String str3, Long l5, Long l6, String str4, String str5, List list, List list2, Long l7, Integer num, String str6, String str7, String str8, String str9, kga0 kga0Var, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f22499a = null;
        } else {
            this.f22499a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
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
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l6;
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
            this.p = list2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l7;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str6;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str7;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str8;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str9;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = kga0Var;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = list3;
        }
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwe)) {
            return false;
        }
        mwe mweVar = (mwe) obj;
        return Intrinsics.d(this.f22499a, mweVar.f22499a) && Intrinsics.d(this.b, mweVar.b) && Intrinsics.d(this.c, mweVar.c) && Intrinsics.d(this.d, mweVar.d) && Intrinsics.d(this.e, mweVar.e) && Intrinsics.d(this.f, mweVar.f) && Intrinsics.d(this.g, mweVar.g) && Intrinsics.d(this.h, mweVar.h) && Intrinsics.d(this.i, mweVar.i) && Intrinsics.d(this.j, mweVar.j) && Intrinsics.d(this.k, mweVar.k) && Intrinsics.d(this.l, mweVar.l) && Intrinsics.d(this.m, mweVar.m) && Intrinsics.d(this.n, mweVar.n) && Intrinsics.d(this.o, mweVar.o) && Intrinsics.d(this.p, mweVar.p) && Intrinsics.d(this.q, mweVar.q) && Intrinsics.d(this.r, mweVar.r) && Intrinsics.d(this.s, mweVar.s) && Intrinsics.d(this.t, mweVar.t) && Intrinsics.d(this.u, mweVar.u) && Intrinsics.d(this.v, mweVar.v) && Intrinsics.d(this.w, mweVar.w) && Intrinsics.d(this.x, mweVar.x) && Intrinsics.d(this.y, mweVar.y);
    }

    public final int hashCode() {
        Long l = this.f22499a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.k;
        int iHashCode11 = (iHashCode10 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.l;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.o;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.p;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l7 = this.q;
        int iHashCode17 = (iHashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num = this.r;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.t;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.u;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.v;
        int iHashCode22 = (iHashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        kga0 kga0Var = this.w;
        int iHashCode23 = (iHashCode22 + (kga0Var == null ? 0 : kga0Var.hashCode())) * 31;
        List list3 = this.x;
        int iHashCode24 = (iHashCode23 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.y;
        return iHashCode24 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponEventResponse(sportId=");
        sb.append(this.f22499a);
        sb.append(", coef=");
        sb.append(this.b);
        sb.append(", type=");
        cs0.A(sb, this.c, ", groupId=", this.d, ", param=");
        sb.append(this.e);
        sb.append(", block=");
        sb.append(this.f);
        sb.append(", playerId=");
        rz4.v(this.g, ", playerName=", this.h, ", periodName=", sb);
        f140.v(sb, this.i, ", sportName=", this.j, ", gameId=");
        cs0.A(sb, this.k, ", mainGameId=", this.l, ", opp1=");
        f140.v(sb, this.m, ", opp2=", this.n, ", opp1Images=");
        b1j.y(", opp2Images=", ", start=", sb, this.o, this.p);
        brm0.A(this.r, this.q, ", kind=", ", gameType=", sb);
        f140.v(sb, this.s, ", marketName=", this.t, ", champName=");
        f140.v(sb, this.u, ", fullName=", this.v, ", playersDuelResponse=");
        sb.append(this.w);
        sb.append(", params=");
        sb.append(this.x);
        sb.append(", playerNames=");
        return dw9.r(sb, this.y, Separators.RPAREN);
    }
}
