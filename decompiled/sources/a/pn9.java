package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pn9 {
    public static final on9 Companion = new on9();
    public static final a8z[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f27276a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final List j;
    public final Integer k;
    public final List l;
    public final String m;
    public final String n;
    public final String o;
    public final Long p;
    public final Long q;
    public final List r;
    public final Boolean s;
    public final List t;
    public final String u;
    public final List v;

    static {
        wez wezVar = wez.f39042a;
        w = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new mn9((byte) 0)), null, maz.a(wezVar, new mn9((byte) 1)), null, null, null, null, null, maz.a(wezVar, new mn9((byte) 2)), null, maz.a(wezVar, new mn9((byte) 3)), null, maz.a(wezVar, new mn9((byte) 4))};
    }

    public /* synthetic */ pn9(int i, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, Long l5, List list, Integer num, List list2, String str5, String str6, String str7, Long l6, Long l7, List list3, Boolean bool, List list4, String str8, List list5) {
        if ((i & 1) == 0) {
            this.f27276a = null;
        } else {
            this.f27276a = l;
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
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str6;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str7;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l6;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l7;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = list3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = list4;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str8;
        }
        if ((i & 2097152) == 0) {
            this.v = null;
        } else {
            this.v = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn9)) {
            return false;
        }
        pn9 pn9Var = (pn9) obj;
        return Intrinsics.d(this.f27276a, pn9Var.f27276a) && Intrinsics.d(this.b, pn9Var.b) && Intrinsics.d(this.c, pn9Var.c) && Intrinsics.d(this.d, pn9Var.d) && Intrinsics.d(this.e, pn9Var.e) && Intrinsics.d(this.f, pn9Var.f) && Intrinsics.d(this.g, pn9Var.g) && Intrinsics.d(this.h, pn9Var.h) && Intrinsics.d(this.i, pn9Var.i) && Intrinsics.d(this.j, pn9Var.j) && Intrinsics.d(this.k, pn9Var.k) && Intrinsics.d(this.l, pn9Var.l) && Intrinsics.d(this.m, pn9Var.m) && Intrinsics.d(this.n, pn9Var.n) && Intrinsics.d(this.o, pn9Var.o) && Intrinsics.d(this.p, pn9Var.p) && Intrinsics.d(this.q, pn9Var.q) && Intrinsics.d(this.r, pn9Var.r) && Intrinsics.d(this.s, pn9Var.s) && Intrinsics.d(this.t, pn9Var.t) && Intrinsics.d(this.u, pn9Var.u) && Intrinsics.d(this.v, pn9Var.v);
    }

    public final int hashCode() {
        Long l = this.f27276a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.i;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l6 = this.p;
        int iHashCode16 = (iHashCode15 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.q;
        int iHashCode17 = (iHashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        List list3 = this.r;
        int iHashCode18 = (iHashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.s;
        int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list4 = this.t;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.u;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list5 = this.v;
        return iHashCode21 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f27276a, this.b, "CalendarTournamentResponse(id=", ", subSportId=", ", feedId=");
        cs0.A(sbO, this.c, ", globalId=", this.d, ", name=");
        f140.v(sbO, this.e, ", description=", this.f, ", type=");
        f140.v(sbO, this.g, ", location=", this.h, ", prizePool=");
        twn.z(sbO, this.i, ", prizeDistribution=", this.j, ", tier=");
        cs0.z(sbO, this.k, ", teams=", this.l, ", imageS3=");
        f140.v(sbO, this.m, ", beginAt=", this.n, ", endAt=");
        h97.w(this.p, this.o, ", beginAtStamp=", ", endAtStamp=", sbO);
        twn.z(sbO, this.q, ", stages=", this.r, ", lngSideLeft=");
        sbO.append(this.s);
        sbO.append(", swissGroupsDisplay=");
        sbO.append(this.t);
        sbO.append(", countryImageS3=");
        return rw2.m(this.u, ", dotaHeroes=", Separators.RPAREN, sbO, this.v);
    }
}
