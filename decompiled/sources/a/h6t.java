package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class h6t {
    public static final g6t Companion = new g6t();
    public static final a8z[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f12544a;
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
    public final List n;
    public final Long o;
    public final Integer p;
    public final List q;
    public final Long r;
    public final HashMap s;
    public final String t;
    public final Boolean u;
    public final Integer v;

    static {
        wez wezVar = wez.f39042a;
        w = new a8z[]{null, null, null, null, null, null, null, maz.a(wezVar, new sqs((byte) 28)), maz.a(wezVar, new sqs((byte) 29)), maz.a(wezVar, new e6t((byte) 0)), maz.a(wezVar, new e6t((byte) 1)), null, null, maz.a(wezVar, new e6t((byte) 2)), null, null, maz.a(wezVar, new e6t((byte) 3)), null, maz.a(wezVar, new e6t((byte) 4)), null, null, null};
    }

    public /* synthetic */ h6t(int i, Long l, Long l2, String str, Long l3, String str2, String str3, String str4, List list, List list2, List list3, List list4, String str5, String str6, List list5, Long l4, Integer num, List list6, Long l5, HashMap map, String str7, Boolean bool, Integer num2) {
        if ((i & 1) == 0) {
            this.f12544a = null;
        } else {
            this.f12544a = l;
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
            this.n = list5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list6;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l5;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = map;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str7;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool;
        }
        if ((i & 2097152) == 0) {
            this.v = null;
        } else {
            this.v = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6t)) {
            return false;
        }
        h6t h6tVar = (h6t) obj;
        return Intrinsics.d(this.f12544a, h6tVar.f12544a) && Intrinsics.d(this.b, h6tVar.b) && Intrinsics.d(this.c, h6tVar.c) && Intrinsics.d(this.d, h6tVar.d) && Intrinsics.d(this.e, h6tVar.e) && Intrinsics.d(this.f, h6tVar.f) && Intrinsics.d(this.g, h6tVar.g) && Intrinsics.d(this.h, h6tVar.h) && Intrinsics.d(this.i, h6tVar.i) && Intrinsics.d(this.j, h6tVar.j) && Intrinsics.d(this.k, h6tVar.k) && Intrinsics.d(this.l, h6tVar.l) && Intrinsics.d(this.m, h6tVar.m) && Intrinsics.d(this.n, h6tVar.n) && Intrinsics.d(this.o, h6tVar.o) && Intrinsics.d(this.p, h6tVar.p) && Intrinsics.d(this.q, h6tVar.q) && Intrinsics.d(this.r, h6tVar.r) && Intrinsics.d(this.s, h6tVar.s) && Intrinsics.d(this.t, h6tVar.t) && Intrinsics.d(this.u, h6tVar.u) && Intrinsics.d(this.v, h6tVar.v);
    }

    public final int hashCode() {
        Long l = this.f12544a;
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
        List list5 = this.n;
        int iHashCode14 = (iHashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l4 = this.o;
        int iHashCode15 = (iHashCode14 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.p;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        List list6 = this.q;
        int iHashCode17 = (iHashCode16 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Long l5 = this.r;
        int iHashCode18 = (iHashCode17 + (l5 == null ? 0 : l5.hashCode())) * 31;
        HashMap map = this.s;
        int iHashCode19 = (iHashCode18 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.t;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.u;
        int iHashCode21 = (iHashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.v;
        return iHashCode21 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f12544a, this.b, "Game(id=", ", sportId=", ", champName=");
        h97.w(this.d, this.c, ", subSportId=", ", statId=", sbO);
        f140.v(sbO, this.e, ", teamOne=", this.f, ", teamTwo=");
        cs0.y(this.g, ", teamOneImages=", ", teamTwoImages=", sbO, this.h);
        b1j.y(", opp1Ids=", ", opp2Ids=", sbO, this.i, this.j);
        h97.y(", score=", this.l, ", extraInfo=", sbO, this.k);
        cs0.y(this.m, ", videoUrls=", ", startDate=", sbO, this.n);
        brm0.A(this.p, this.o, ", countSubGame=", ", subGame=", sbO);
        sbO.append(this.q);
        sbO.append(", stadiumId=");
        sbO.append(this.r);
        sbO.append(", matchInfos=");
        sbO.append(this.s);
        sbO.append(", status=");
        sbO.append(this.t);
        sbO.append(", homeAwayFlag=");
        sbO.append(this.u);
        sbO.append(", globalChampId=");
        sbO.append(this.v);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
