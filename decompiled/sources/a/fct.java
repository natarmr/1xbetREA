package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fct {
    public static final ect Companion = new ect();
    public static final a8z[] x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9327a;
    public final Long b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;
    public final Long p;
    public final Integer q;
    public final List r;
    public final Long s;
    public final HashMap t;
    public final String u;
    public final Boolean v;
    public final Integer w;

    static {
        wez wezVar = wez.f39042a;
        x = new a8z[]{null, null, null, null, null, null, null, maz.a(wezVar, new e6t((byte) 23)), maz.a(wezVar, new e6t((byte) 24)), maz.a(wezVar, new e6t((byte) 25)), maz.a(wezVar, new e6t((byte) 26)), null, null, null, maz.a(wezVar, new e6t((byte) 27)), null, null, maz.a(wezVar, new e6t((byte) 28)), null, maz.a(wezVar, new e6t((byte) 29)), null, null, null};
    }

    public /* synthetic */ fct(int i, Long l, Long l2, String str, Long l3, String str2, String str3, String str4, List list, List list2, List list3, List list4, String str5, String str6, String str7, List list5, Long l4, Integer num, List list6, Long l5, HashMap map, String str8, Boolean bool, Integer num2) {
        if ((i & 1) == 0) {
            this.f9327a = null;
        } else {
            this.f9327a = l;
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
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str6;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l4;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = list6;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l5;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = map;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str8;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fct)) {
            return false;
        }
        fct fctVar = (fct) obj;
        return Intrinsics.d(this.f9327a, fctVar.f9327a) && Intrinsics.d(this.b, fctVar.b) && Intrinsics.d(this.c, fctVar.c) && Intrinsics.d(this.d, fctVar.d) && Intrinsics.d(this.e, fctVar.e) && Intrinsics.d(this.f, fctVar.f) && Intrinsics.d(this.g, fctVar.g) && Intrinsics.d(this.h, fctVar.h) && Intrinsics.d(this.i, fctVar.i) && Intrinsics.d(this.j, fctVar.j) && Intrinsics.d(this.k, fctVar.k) && Intrinsics.d(this.l, fctVar.l) && Intrinsics.d(this.m, fctVar.m) && Intrinsics.d(this.n, fctVar.n) && Intrinsics.d(this.o, fctVar.o) && Intrinsics.d(this.p, fctVar.p) && Intrinsics.d(this.q, fctVar.q) && Intrinsics.d(this.r, fctVar.r) && Intrinsics.d(this.s, fctVar.s) && Intrinsics.d(this.t, fctVar.t) && Intrinsics.d(this.u, fctVar.u) && Intrinsics.d(this.v, fctVar.v) && Intrinsics.d(this.w, fctVar.w);
    }

    public final int hashCode() {
        Long l = this.f9327a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.k;
        int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list5 = this.o;
        int iHashCode15 = (iHashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l4 = this.p;
        int iHashCode16 = (iHashCode15 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.q;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        List list6 = this.r;
        int iHashCode18 = (iHashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Long l5 = this.s;
        int iHashCode19 = (iHashCode18 + (l5 == null ? 0 : l5.hashCode())) * 31;
        HashMap map = this.t;
        int iHashCode20 = (iHashCode19 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.u;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.v;
        int iHashCode22 = (iHashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.w;
        return iHashCode22 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f9327a, this.b, "Game(id=", ", sportId=", ", champName=");
        h97.w(this.d, this.c, ", subSportId=", ", statId=", sbO);
        f140.v(sbO, this.e, ", teamOne=", this.f, ", teamTwo=");
        cs0.y(this.g, ", teamOneImages=", ", teamTwoImages=", sbO, this.h);
        b1j.y(", opp1Ids=", ", opp2Ids=", sbO, this.i, this.j);
        h97.y(", scoreBase=", this.l, ", scoreAdd=", sbO, this.k);
        f140.v(sbO, this.m, ", extraInfo=", this.n, ", videoUrls=");
        sbO.append(this.o);
        sbO.append(", startDate=");
        sbO.append(this.p);
        sbO.append(", countSubGame=");
        cs0.z(sbO, this.q, ", subGame=", this.r, ", stadiumId=");
        sbO.append(this.s);
        sbO.append(", matchInfos=");
        sbO.append(this.t);
        sbO.append(", status=");
        h97.v(this.v, this.u, ", homeAwayFlag=", ", globalChampId=", sbO);
        return dw9.q(sbO, this.w, Separators.RPAREN);
    }
}
