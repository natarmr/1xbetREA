package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mcg {
    public static final lcg Companion = new lcg();
    public static final a8z[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21549a;
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
    public final String n;
    public final List o;
    public final Long p;
    public final Map q;
    public final String r;
    public final String s;
    public final eg30 t;
    public final Integer u;

    static {
        wez wezVar = wez.f39042a;
        v = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new dpf((byte) 29)), maz.a(wezVar, new jcg((byte) 0)), maz.a(wezVar, new jcg((byte) 1)), maz.a(wezVar, new jcg((byte) 2)), null, null, null, null, maz.a(wezVar, new jcg((byte) 3)), null, maz.a(wezVar, new jcg((byte) 4)), null, null, null, null};
    }

    public /* synthetic */ mcg(int i, Long l, Long l2, Long l3, String str, String str2, String str3, List list, List list2, List list3, List list4, String str4, String str5, String str6, String str7, List list5, Long l4, Map map, String str8, String str9, eg30 eg30Var, Integer num) {
        if ((i & 1) == 0) {
            this.f21549a = null;
        } else {
            this.f21549a = l;
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
            this.q = map;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str8;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str9;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = eg30Var;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcg)) {
            return false;
        }
        mcg mcgVar = (mcg) obj;
        return Intrinsics.d(this.f21549a, mcgVar.f21549a) && Intrinsics.d(this.b, mcgVar.b) && Intrinsics.d(this.c, mcgVar.c) && Intrinsics.d(this.d, mcgVar.d) && Intrinsics.d(this.e, mcgVar.e) && Intrinsics.d(this.f, mcgVar.f) && Intrinsics.d(this.g, mcgVar.g) && Intrinsics.d(this.h, mcgVar.h) && Intrinsics.d(this.i, mcgVar.i) && Intrinsics.d(this.j, mcgVar.j) && Intrinsics.d(this.k, mcgVar.k) && Intrinsics.d(this.l, mcgVar.l) && Intrinsics.d(this.m, mcgVar.m) && Intrinsics.d(this.n, mcgVar.n) && Intrinsics.d(this.o, mcgVar.o) && Intrinsics.d(this.p, mcgVar.p) && Intrinsics.d(this.q, mcgVar.q) && Intrinsics.d(this.r, mcgVar.r) && Intrinsics.d(this.s, mcgVar.s) && this.t == mcgVar.t && Intrinsics.d(this.u, mcgVar.u);
    }

    public final int hashCode() {
        Long l = this.f21549a;
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
        String str7 = this.n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list5 = this.o;
        int iHashCode15 = (iHashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l4 = this.p;
        int iHashCode16 = (iHashCode15 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Map map = this.q;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.r;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.s;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        eg30 eg30Var = this.t;
        int iHashCode20 = (iHashCode19 + (eg30Var == null ? 0 : eg30Var.hashCode())) * 31;
        Integer num = this.u;
        return iHashCode20 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f21549a, this.b, "CyberChampGameResultResponse(id=", ", sportId=", ", subSportId=");
        rz4.v(this.c, ", champName=", this.d, ", firstTeamName=", sbO);
        f140.v(sbO, this.e, ", secondTeamName=", this.f, ", firstTeamImageList=");
        b1j.y(", secondTeamImageList=", ", firstTeamIds=", sbO, this.g, this.h);
        b1j.y(", secondTeamIds=", ", score=", sbO, this.i, this.j);
        f140.v(sbO, this.k, ", scoreBase=", this.l, ", scoreAdd=");
        f140.v(sbO, this.m, ", dopInfo=", this.n, ", videosUrls=");
        sbO.append(this.o);
        sbO.append(", dateStart=");
        sbO.append(this.p);
        sbO.append(", matchInfo=");
        sbO.append(this.q);
        sbO.append(", status=");
        sbO.append(this.r);
        sbO.append(", statId=");
        sbO.append(this.s);
        sbO.append(", matchStatus=");
        sbO.append(this.t);
        sbO.append(", globalChampId=");
        return dw9.q(sbO, this.u, Separators.RPAREN);
    }
}
