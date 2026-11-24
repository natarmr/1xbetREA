package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nas {
    public final boolean A;
    public final List B;
    public final ufs C;
    public final Boolean D;
    public final Boolean E;
    public final Long F;
    public final Boolean G;
    public final Integer H;
    public final String I;
    public final String J;
    public final boh K;
    public final Integer L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23205a;
    public final long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final Boolean l;
    public final String m;
    public final List n;
    public final List o;
    public final List p;
    public final Long q;
    public final sip r;
    public final String s;
    public final tas t;
    public final Long u;
    public final Long v;
    public final Long w;
    public final long x;
    public final oas y;
    public final oas z;

    public nas(long j, long j2, Long l, String str, String str2, String str3, String str4, Boolean bool, Integer num, String str5, Integer num2, Boolean bool2, String str6, ArrayList arrayList, List list, ArrayList arrayList2, Long l2, sip sipVar, String str7, tas tasVar, Long l3, Long l4, Long l5, long j3, oas oasVar, oas oasVar2, boolean z, ArrayList arrayList3, ufs ufsVar, Boolean bool3, Boolean bool4, Long l6, Boolean bool5, Integer num3, String str8, String str9, boh bohVar, Integer num4) {
        sipVar.getClass();
        this.f23205a = j;
        this.b = j2;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = bool;
        this.i = num;
        this.j = str5;
        this.k = num2;
        this.l = bool2;
        this.m = str6;
        this.n = arrayList;
        this.o = list;
        this.p = arrayList2;
        this.q = l2;
        this.r = sipVar;
        this.s = str7;
        this.t = tasVar;
        this.u = l3;
        this.v = l4;
        this.w = l5;
        this.x = j3;
        this.y = oasVar;
        this.z = oasVar2;
        this.A = z;
        this.B = arrayList3;
        this.C = ufsVar;
        this.D = bool3;
        this.E = bool4;
        this.F = l6;
        this.G = bool5;
        this.H = num3;
        this.I = str8;
        this.J = str9;
        this.K = bohVar;
        this.L = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nas)) {
            return false;
        }
        nas nasVar = (nas) obj;
        return bds.a(this.f23205a, nasVar.f23205a) && this.b == nasVar.b && Intrinsics.d(this.c, nasVar.c) && Intrinsics.d(this.d, nasVar.d) && Intrinsics.d(this.e, nasVar.e) && Intrinsics.d(this.f, nasVar.f) && Intrinsics.d(this.g, nasVar.g) && Intrinsics.d(this.h, nasVar.h) && Intrinsics.d(this.i, nasVar.i) && Intrinsics.d(this.j, nasVar.j) && Intrinsics.d(this.k, nasVar.k) && Intrinsics.d(this.l, nasVar.l) && Intrinsics.d(this.m, nasVar.m) && Intrinsics.d(this.n, nasVar.n) && Intrinsics.d(this.o, nasVar.o) && Intrinsics.d(this.p, nasVar.p) && Intrinsics.d(this.q, nasVar.q) && this.r == nasVar.r && Intrinsics.d(this.s, nasVar.s) && Intrinsics.d(this.t, nasVar.t) && Intrinsics.d(this.u, nasVar.u) && Intrinsics.d(this.v, nasVar.v) && Intrinsics.d(this.w, nasVar.w) && this.x == nasVar.x && this.y.equals(nasVar.y) && this.z.equals(nasVar.z) && this.A == nasVar.A && Intrinsics.d(this.B, nasVar.B) && Intrinsics.d(this.C, nasVar.C) && Intrinsics.d(this.D, nasVar.D) && Intrinsics.d(this.E, nasVar.E) && Intrinsics.d(this.F, nasVar.F) && Intrinsics.d(this.G, nasVar.G) && Intrinsics.d(this.H, nasVar.H) && Intrinsics.d(this.I, nasVar.I) && Intrinsics.d(this.J, nasVar.J) && this.K == nasVar.K && Intrinsics.d(this.L, nasVar.L);
    }

    public final int hashCode() {
        int iB = rw2.b(Long.hashCode(this.f23205a) * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iB + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.l;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.n;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.o;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.p;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l2 = this.q;
        int iHashCode15 = (this.r.hashCode() + ((iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        String str7 = this.s;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        tas tasVar = this.t;
        int iHashCode17 = (iHashCode16 + (tasVar == null ? 0 : tasVar.hashCode())) * 31;
        Long l3 = this.u;
        int iHashCode18 = (iHashCode17 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.v;
        int iHashCode19 = (iHashCode18 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.w;
        int iE = brm0.e((this.z.hashCode() + ((this.y.hashCode() + rw2.b((iHashCode19 + (l5 == null ? 0 : l5.hashCode())) * 31, 31, this.x)) * 31)) * 31, 31, this.A);
        List list4 = this.B;
        int iHashCode20 = (iE + (list4 == null ? 0 : list4.hashCode())) * 31;
        ufs ufsVar = this.C;
        int iHashCode21 = (iHashCode20 + (ufsVar == null ? 0 : ufsVar.hashCode())) * 31;
        Boolean bool3 = this.D;
        int iHashCode22 = (iHashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.E;
        int iHashCode23 = (iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l6 = this.F;
        int iHashCode24 = (iHashCode23 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool5 = this.G;
        int iHashCode25 = (iHashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.H;
        int iHashCode26 = (iHashCode25 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.I;
        int iHashCode27 = (iHashCode26 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.J;
        int iHashCode28 = (this.K.hashCode() + ((iHashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31;
        Integer num4 = this.L;
        return iHashCode28 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "GameEventModel(id=", bds.b(this.f23205a), ", mainId=");
        sbO.append(", constId=");
        sbO.append(this.c);
        sbO.append(", anyInfo=");
        sbO.append(this.d);
        f140.v(sbO, ", vid=", this.e, ", type=", this.f);
        sbO.append(", videoId=");
        sbO.append(this.g);
        sbO.append(", videoEnabled=");
        sbO.append(this.h);
        sbO.append(", zoneId=");
        sbO.append(this.i);
        sbO.append(", period=");
        sbO.append(this.j);
        sbO.append(", gameNumber=");
        sbO.append(this.k);
        sbO.append(", isFinish=");
        sbO.append(this.l);
        ua80.t(", fullName=", this.m, ", events=", sbO, this.n);
        hne.v(", subGames=", ", betGroups=", sbO, this.o, this.p);
        sbO.append(", champId=");
        sbO.append(this.q);
        sbO.append(", feedKind=");
        sbO.append(this.r);
        sbO.append(", champName=");
        sbO.append(this.s);
        sbO.append(", score=");
        sbO.append(this.t);
        sbO.append(", timeStart=");
        sbO.append(this.u);
        sbO.append(", timeBefore=");
        sbO.append(this.v);
        sbO.append(", subSportId=");
        sbO.append(this.w);
        sbO.append(", sportId=");
        sbO.append(this.x);
        sbO.append(", firstOpponent=");
        sbO.append(this.y);
        sbO.append(", secondOpponent=");
        sbO.append(this.z);
        sbO.append(", canSubscribe=");
        sbO.append(this.A);
        sbO.append(", infoStatList=");
        sbO.append(this.B);
        sbO.append(", gameInfo=");
        sbO.append(this.C);
        sbO.append(", showPreMatch=");
        sbO.append(this.D);
        sbO.append(", isHostGuest=");
        sbO.append(this.E);
        sbO.append(", stadiumId=");
        sbO.append(this.F);
        sbO.append(", final=");
        sbO.append(this.G);
        sbO.append(", globalChampId=");
        sbO.append(this.H);
        sbO.append(", statGameId=");
        sbO.append(this.I);
        sbO.append(", opponents=");
        sbO.append(this.J);
        sbO.append(", cyberType=");
        sbO.append(this.K);
        sbO.append(", countryId=");
        sbO.append(this.L);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
