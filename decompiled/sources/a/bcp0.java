package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bcp0 {
    public static final acp0 Companion = new acp0();
    public static final a8z[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2364a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final String m;
    public final String n;
    public final Long o;
    public final String p;
    public final Map q;
    public final Integer r;
    public final String s;
    public final Integer t;

    static {
        wez wezVar = wez.f39042a;
        u = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new fno0((byte) 25)), maz.a(wezVar, new fno0((byte) 26)), maz.a(wezVar, new fno0((byte) 27)), maz.a(wezVar, new fno0((byte) 28)), null, null, null, null, maz.a(wezVar, new fno0((byte) 29)), null, null, null};
    }

    public /* synthetic */ bcp0(int i, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, String str5, String str6, Long l5, String str7, Map map, Integer num, String str8, Integer num2) {
        if ((i & 1) == 0) {
            this.f2364a = null;
        } else {
            this.f2364a = l;
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
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list4;
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
            this.o = l5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str7;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = map;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str8;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcp0)) {
            return false;
        }
        bcp0 bcp0Var = (bcp0) obj;
        return Intrinsics.d(this.f2364a, bcp0Var.f2364a) && Intrinsics.d(this.b, bcp0Var.b) && Intrinsics.d(this.c, bcp0Var.c) && Intrinsics.d(this.d, bcp0Var.d) && Intrinsics.d(this.e, bcp0Var.e) && Intrinsics.d(this.f, bcp0Var.f) && Intrinsics.d(this.g, bcp0Var.g) && Intrinsics.d(this.h, bcp0Var.h) && Intrinsics.d(this.i, bcp0Var.i) && Intrinsics.d(this.j, bcp0Var.j) && Intrinsics.d(this.k, bcp0Var.k) && Intrinsics.d(this.l, bcp0Var.l) && Intrinsics.d(this.m, bcp0Var.m) && Intrinsics.d(this.n, bcp0Var.n) && Intrinsics.d(this.o, bcp0Var.o) && Intrinsics.d(this.p, bcp0Var.p) && Intrinsics.d(this.q, bcp0Var.q) && Intrinsics.d(this.r, bcp0Var.r) && Intrinsics.d(this.s, bcp0Var.s) && Intrinsics.d(this.t, bcp0Var.t);
    }

    public final int hashCode() {
        Long l = this.f2364a;
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
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.j;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.k;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.l;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l5 = this.o;
        int iHashCode15 = (iHashCode14 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str7 = this.p;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.q;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.r;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.s;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.t;
        return iHashCode19 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f2364a, this.b, "TeamEventItemResultsResponse(id=", ", sportId=", ", subSportId=");
        cs0.A(sbO, this.c, ", champId=", this.d, ", champName=");
        f140.v(sbO, this.e, ", champImage=", this.f, ", firstTeamName=");
        f140.v(sbO, this.g, ", secondTeamName=", this.h, ", firstTeamImageList=");
        b1j.y(", secondTeamImageList=", ", firstTeamIds=", sbO, this.i, this.j);
        b1j.y(", secondTeamIds=", ", score=", sbO, this.k, this.l);
        f140.v(sbO, this.m, ", dopInfo=", this.n, ", dateStart=");
        rz4.v(this.o, ", status=", this.p, ", matchInfos=", sbO);
        sbO.append(this.q);
        sbO.append(", stadiumId=");
        sbO.append(this.r);
        sbO.append(", statId=");
        return vqd.l(this.t, this.s, ", globalChampId=", Separators.RPAREN, sbO);
    }
}
