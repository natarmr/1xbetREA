package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class i0t {
    public static final h0t Companion = new h0t();
    public static final a8z[] P;
    public final List A;
    public final String B;
    public final List C;
    public final Long D;
    public final ufs E;
    public final Boolean F;
    public final Boolean G;
    public final Boolean H;
    public final Boolean I;
    public final List J;
    public final List K;
    public final Long L;
    public final Boolean M;
    public final Integer N;
    public final String O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bds f13963a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final Integer h;
    public final Boolean i;
    public final String j;
    public final List k;
    public final List l;
    public final List m;
    public final Long n;
    public final Long o;
    public final uip p;
    public final String q;
    public final vqs r;
    public final Long s;
    public final List t;
    public final Long u;
    public final Long v;
    public final Long w;
    public final Long x;
    public final String y;
    public final Long z;

    static {
        uqs uqsVar = vqs.Companion;
        wez wezVar = wez.f39042a;
        P = new a8z[]{null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new sqs((byte) 12)), maz.a(wezVar, new sqs((byte) 13)), maz.a(wezVar, new sqs((byte) 14)), null, null, null, null, null, null, maz.a(wezVar, new sqs((byte) 15)), null, null, null, null, null, null, maz.a(wezVar, new sqs((byte) 16)), null, maz.a(wezVar, new sqs((byte) 17)), null, null, null, null, null, null, maz.a(wezVar, new sqs((byte) 18)), maz.a(wezVar, new sqs((byte) 19)), null, null, null, null};
    }

    public /* synthetic */ i0t(int i, int i2, bds bdsVar, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, String str6, List list, List list2, List list3, Long l, Long l2, uip uipVar, String str7, vqs vqsVar, Long l3, List list4, Long l4, Long l5, Long l6, Long l7, String str8, Long l8, List list5, String str9, List list6, Long l9, ufs ufsVar, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list7, List list8, Long l10, Boolean bool6, Integer num3, String str10) {
        if ((i & 1) == 0) {
            this.f13963a = null;
        } else {
            this.f13963a = bdsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = uipVar;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str7;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = vqsVar;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l3;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = list4;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = l4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = l5;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = l6;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = l7;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = str8;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = l8;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = list5;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = str9;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = list6;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = l9;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = ufsVar;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = bool2;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = bool3;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = bool4;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = bool5;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = list7;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = list8;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = l10;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = bool6;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = num3;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0t)) {
            return false;
        }
        i0t i0tVar = (i0t) obj;
        return Intrinsics.d(this.f13963a, i0tVar.f13963a) && Intrinsics.d(this.b, i0tVar.b) && Intrinsics.d(this.c, i0tVar.c) && Intrinsics.d(this.d, i0tVar.d) && Intrinsics.d(this.e, i0tVar.e) && Intrinsics.d(this.f, i0tVar.f) && Intrinsics.d(this.g, i0tVar.g) && Intrinsics.d(this.h, i0tVar.h) && Intrinsics.d(this.i, i0tVar.i) && Intrinsics.d(this.j, i0tVar.j) && Intrinsics.d(this.k, i0tVar.k) && Intrinsics.d(this.l, i0tVar.l) && Intrinsics.d(this.m, i0tVar.m) && Intrinsics.d(this.n, i0tVar.n) && Intrinsics.d(this.o, i0tVar.o) && this.p == i0tVar.p && Intrinsics.d(this.q, i0tVar.q) && Intrinsics.d(this.r, i0tVar.r) && Intrinsics.d(this.s, i0tVar.s) && Intrinsics.d(this.t, i0tVar.t) && Intrinsics.d(this.u, i0tVar.u) && Intrinsics.d(this.v, i0tVar.v) && Intrinsics.d(this.w, i0tVar.w) && Intrinsics.d(this.x, i0tVar.x) && Intrinsics.d(this.y, i0tVar.y) && Intrinsics.d(this.z, i0tVar.z) && Intrinsics.d(this.A, i0tVar.A) && Intrinsics.d(this.B, i0tVar.B) && Intrinsics.d(this.C, i0tVar.C) && Intrinsics.d(this.D, i0tVar.D) && Intrinsics.d(this.E, i0tVar.E) && Intrinsics.d(this.F, i0tVar.F) && Intrinsics.d(this.G, i0tVar.G) && Intrinsics.d(this.H, i0tVar.H) && Intrinsics.d(this.I, i0tVar.I) && Intrinsics.d(this.J, i0tVar.J) && Intrinsics.d(this.K, i0tVar.K) && Intrinsics.d(this.L, i0tVar.L) && Intrinsics.d(this.M, i0tVar.M) && Intrinsics.d(this.N, i0tVar.N) && Intrinsics.d(this.O, i0tVar.O);
    }

    public final int hashCode() {
        bds bdsVar = this.f13963a;
        int iHashCode = (bdsVar == null ? 0 : Long.hashCode(bdsVar.f2414a)) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.k;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.m;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l = this.n;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.o;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        uip uipVar = this.p;
        int iHashCode16 = (iHashCode15 + (uipVar == null ? 0 : uipVar.hashCode())) * 31;
        String str7 = this.q;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        vqs vqsVar = this.r;
        int iHashCode18 = (iHashCode17 + (vqsVar == null ? 0 : vqsVar.hashCode())) * 31;
        Long l3 = this.s;
        int iHashCode19 = (iHashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list4 = this.t;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Long l4 = this.u;
        int iHashCode21 = (iHashCode20 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.v;
        int iHashCode22 = (iHashCode21 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.w;
        int iHashCode23 = (iHashCode22 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.x;
        int iHashCode24 = (iHashCode23 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.y;
        int iHashCode25 = (iHashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l8 = this.z;
        int iHashCode26 = (iHashCode25 + (l8 == null ? 0 : l8.hashCode())) * 31;
        List list5 = this.A;
        int iHashCode27 = (iHashCode26 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str9 = this.B;
        int iHashCode28 = (iHashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list6 = this.C;
        int iHashCode29 = (iHashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Long l9 = this.D;
        int iHashCode30 = (iHashCode29 + (l9 == null ? 0 : l9.hashCode())) * 31;
        ufs ufsVar = this.E;
        int iHashCode31 = (iHashCode30 + (ufsVar == null ? 0 : ufsVar.hashCode())) * 31;
        Boolean bool2 = this.F;
        int iHashCode32 = (iHashCode31 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.G;
        int iHashCode33 = (iHashCode32 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.H;
        int iHashCode34 = (iHashCode33 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.I;
        int iHashCode35 = (iHashCode34 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List list7 = this.J;
        int iHashCode36 = (iHashCode35 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List list8 = this.K;
        int iHashCode37 = (iHashCode36 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Long l10 = this.L;
        int iHashCode38 = (iHashCode37 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool6 = this.M;
        int iHashCode39 = (iHashCode38 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num3 = this.N;
        int iHashCode40 = (iHashCode39 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.O;
        return iHashCode40 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameZipResponse(id=");
        sb.append(this.f13963a);
        sb.append(", anyInfo=");
        sb.append(this.b);
        sb.append(", vid=");
        f140.v(sb, this.c, ", type=", this.d, ", videoId=");
        axq.x(this.f, this.e, ", zoneId=", ", period=", sb);
        axq.x(this.h, this.g, ", gameNumber=", ", isFinish=", sb);
        defpackage.c.h(this.i, ", fullName=", this.j, ", events=", sb);
        b1j.y(", subGames=", ", groups=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", idMain=");
        sb.append(this.n);
        sb.append(", champId=");
        sb.append(this.o);
        sb.append(", feedKindResponse=");
        sb.append(this.p);
        sb.append(", champName=");
        sb.append(this.q);
        sb.append(", score=");
        sb.append(this.r);
        sb.append(", teamTwoId=");
        twn.z(sb, this.s, ", teamTwoIdsList=", this.t, ", timeStart=");
        cs0.A(sb, this.u, ", timeBefore=", this.v, ", subSportId=");
        cs0.A(sb, this.w, ", sportId=", this.x, ", teamTwoName=");
        h97.w(this.z, this.y, ", teamOneId=", ", teamOneIdsList=", sb);
        h97.y(", teamOneName=", this.B, ", infoStatList=", sb, this.A);
        sb.append(this.C);
        sb.append(", constId=");
        sb.append(this.D);
        sb.append(", gameInfo=");
        sb.append(this.E);
        sb.append(", showPreMatch=");
        sb.append(this.F);
        sb.append(", isCyberEvent=");
        defpackage.c.j(sb, this.G, ", isHostGuest=", this.H, ", canSubscribe=");
        sb.append(this.I);
        sb.append(", teamOneImageList=");
        sb.append(this.J);
        sb.append(", teamTwoImageList=");
        sb.append(this.K);
        sb.append(", stadiumId=");
        sb.append(this.L);
        sb.append(", final=");
        h97.u(this.M, this.N, ", globalChampId=", ", statGameId=", sb);
        return axq.n(sb, this.O, Separators.RPAREN);
    }
}
