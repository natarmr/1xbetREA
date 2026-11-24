package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class f2y {
    public static final d2y Companion = new d2y();
    public static final a8z[] z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8837a;
    public final Long b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final Long i;
    public final Long j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final List o;
    public final List p;
    public final Integer q;
    public final Integer r;
    public final Long s;
    public final Long t;
    public final String u;
    public final String v;
    public final Long w;
    public final Long x;
    public final Long y;

    static {
        wez wezVar = wez.f39042a;
        z = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new qgx((byte) 12)), maz.a(wezVar, new qgx((byte) 14)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ f2y(int i, Long l, Long l2, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Long l3, Long l4, String str5, String str6, Integer num, String str7, List list, List list2, Integer num2, Integer num3, Long l5, Long l6, String str8, String str9, Long l7, Long l8, Long l9) {
        if ((i & 1) == 0) {
            this.f8837a = null;
        } else {
            this.f8837a = l;
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
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
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
            this.i = l3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
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
            this.q = num2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l5;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = l6;
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
            this.w = l7;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = l8;
        }
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = l9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2y)) {
            return false;
        }
        f2y f2yVar = (f2y) obj;
        return Intrinsics.d(this.f8837a, f2yVar.f8837a) && Intrinsics.d(this.b, f2yVar.b) && Intrinsics.d(this.c, f2yVar.c) && Intrinsics.d(this.d, f2yVar.d) && Intrinsics.d(this.e, f2yVar.e) && Intrinsics.d(this.f, f2yVar.f) && Intrinsics.d(this.g, f2yVar.g) && Intrinsics.d(this.h, f2yVar.h) && Intrinsics.d(this.i, f2yVar.i) && Intrinsics.d(this.j, f2yVar.j) && Intrinsics.d(this.k, f2yVar.k) && Intrinsics.d(this.l, f2yVar.l) && Intrinsics.d(this.m, f2yVar.m) && Intrinsics.d(this.n, f2yVar.n) && Intrinsics.d(this.o, f2yVar.o) && Intrinsics.d(this.p, f2yVar.p) && Intrinsics.d(this.q, f2yVar.q) && Intrinsics.d(this.r, f2yVar.r) && Intrinsics.d(this.s, f2yVar.s) && Intrinsics.d(this.t, f2yVar.t) && Intrinsics.d(this.u, f2yVar.u) && Intrinsics.d(this.v, f2yVar.v) && Intrinsics.d(this.w, f2yVar.w) && Intrinsics.d(this.x, f2yVar.x) && Intrinsics.d(this.y, f2yVar.y);
    }

    public final int hashCode() {
        Long l = this.f8837a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.j;
        int iHashCode10 = (iHashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.o;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.p;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.q;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.r;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l5 = this.s;
        int iHashCode19 = (iHashCode18 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.t;
        int iHashCode20 = (iHashCode19 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str8 = this.u;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.v;
        int iHashCode22 = (iHashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l7 = this.w;
        int iHashCode23 = (iHashCode22 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.x;
        int iHashCode24 = (iHashCode23 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.y;
        return iHashCode24 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f8837a, this.b, "JackpotGameResponse(gameNumber=", ", startDate=", ", gameName=");
        f140.v(sbO, this.c, ", gameNameEng=", this.d, ", finished=");
        defpackage.c.j(sbO, this.e, ", live=", this.f, ", statisticId=");
        f140.v(sbO, this.g, ", score=", this.h, ", sportId=");
        cs0.A(sbO, this.i, ", bukGameId=", this.j, ", opponent1Name=");
        f140.v(sbO, this.k, ", opponent2Name=", this.l, ", period=");
        b1j.u(this.m, ", periodString=", this.n, ", chosenOutcomeList=", sbO);
        b1j.y(", chosenOutcomeStringList=", ", eventResults=", sbO, this.o, this.p);
        rz4.y(sbO, this.q, ", userEventResult=", this.r, ", opponent1TranslateId=");
        cs0.A(sbO, this.s, ", opponent2TranslateId=", this.t, ", opponentImg1=");
        f140.v(sbO, this.u, ", opponentImg2=", this.v, ", opponentCountryId1=");
        cs0.A(sbO, this.w, ", opponentCountryId2=", this.x, ", webGameUrlPath=");
        return ohs0.r(sbO, this.y, Separators.RPAREN);
    }
}
