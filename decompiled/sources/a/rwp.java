package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rwp {
    public static final qwp Companion = new qwp();
    public static final a8z[] y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31226a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final Long o;
    public final String p;
    public final Map q;
    public final Integer r;
    public final Integer s;
    public final String t;
    public final Boolean u;
    public final Integer v;
    public final List w;
    public final Integer x;

    static {
        wez wezVar = wez.f39042a;
        y = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new dfp((byte) 18)), maz.a(wezVar, new dfp((byte) 19)), maz.a(wezVar, new dfp((byte) 20)), maz.a(wezVar, new dfp((byte) 21)), null, null, null, maz.a(wezVar, new dfp((byte) 22)), null, null, maz.a(wezVar, new dfp((byte) 23)), null, null, null, null, null, maz.a(wezVar, new dfp((byte) 24)), null};
    }

    public /* synthetic */ rwp(int i, Long l, Long l2, Long l3, String str, String str2, String str3, List list, List list2, List list3, List list4, String str4, String str5, String str6, List list5, Long l4, String str7, Map map, Integer num, Integer num2, String str8, Boolean bool, Integer num3, List list6, Integer num4) {
        if ((i & 1) == 0) {
            this.f31226a = null;
        } else {
            this.f31226a = l;
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
            this.d = str;
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
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list4;
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
            this.s = num2;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str8;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = num3;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = list6;
        }
        if ((i & 8388608) == 0) {
            this.x = null;
        } else {
            this.x = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwp)) {
            return false;
        }
        rwp rwpVar = (rwp) obj;
        return Intrinsics.d(this.f31226a, rwpVar.f31226a) && Intrinsics.d(this.b, rwpVar.b) && Intrinsics.d(this.c, rwpVar.c) && Intrinsics.d(this.d, rwpVar.d) && Intrinsics.d(this.e, rwpVar.e) && Intrinsics.d(this.f, rwpVar.f) && Intrinsics.d(this.g, rwpVar.g) && Intrinsics.d(this.h, rwpVar.h) && Intrinsics.d(this.i, rwpVar.i) && Intrinsics.d(this.j, rwpVar.j) && Intrinsics.d(this.k, rwpVar.k) && Intrinsics.d(this.l, rwpVar.l) && Intrinsics.d(this.m, rwpVar.m) && Intrinsics.d(this.n, rwpVar.n) && Intrinsics.d(this.o, rwpVar.o) && Intrinsics.d(this.p, rwpVar.p) && Intrinsics.d(this.q, rwpVar.q) && Intrinsics.d(this.r, rwpVar.r) && Intrinsics.d(this.s, rwpVar.s) && Intrinsics.d(this.t, rwpVar.t) && Intrinsics.d(this.u, rwpVar.u) && Intrinsics.d(this.v, rwpVar.v) && Intrinsics.d(this.w, rwpVar.w) && Intrinsics.d(this.x, rwpVar.x);
    }

    public final int hashCode() {
        Long l = this.f31226a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.j;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list5 = this.n;
        int iHashCode14 = (iHashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l4 = this.o;
        int iHashCode15 = (iHashCode14 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str7 = this.p;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.q;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.r;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.s;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.t;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.u;
        int iHashCode21 = (iHashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.v;
        int iHashCode22 = (iHashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list6 = this.w;
        int iHashCode23 = (iHashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num4 = this.x;
        return iHashCode23 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f31226a, this.b, "FighterResultsItemResponse(id=", ", sportId=", ", subSportId=");
        rz4.v(this.c, ", champName=", this.d, ", firstOpponentName=", sbO);
        f140.v(sbO, this.e, ", secondOpponentName=", this.f, ", firstOpponentImageList=");
        b1j.y(", secondOpponentImageList=", ", firstOpponentIds=", sbO, this.g, this.h);
        b1j.y(", secondOpponentIds=", ", scoreBase=", sbO, this.i, this.j);
        f140.v(sbO, this.k, ", scoreAdd=", this.l, ", dopInfo=");
        cs0.y(this.m, ", videos=", ", dateStart=", sbO, this.n);
        rz4.v(this.o, ", status=", this.p, ", matchInfos=", sbO);
        sbO.append(this.q);
        sbO.append(", stadiumId=");
        sbO.append(this.r);
        sbO.append(", globalChampId=");
        b1j.u(this.s, ", statId=", this.t, ", homeAwayFlag=", sbO);
        h97.u(this.u, this.v, ", matchStatus=", ", subGame=", sbO);
        sbO.append(this.w);
        sbO.append(", countSubGame=");
        sbO.append(this.x);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
