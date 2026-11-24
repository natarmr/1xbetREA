package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class aqk0 {
    public static final zpk0 Companion = new zpk0();
    public static final a8z[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1300a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Long g;
    public final Integer h;
    public final Integer i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Boolean r;
    public final List s;
    public final List t;
    public final String u;

    static {
        wez wezVar = wez.f39042a;
        v = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new pdk0((byte) 18)), maz.a(wezVar, new pdk0((byte) 19)), maz.a(wezVar, new pdk0((byte) 20)), maz.a(wezVar, new pdk0((byte) 21)), null, null, null, null, null, maz.a(wezVar, new pdk0((byte) 22)), maz.a(wezVar, new pdk0((byte) 23)), null};
    }

    public /* synthetic */ aqk0(int i, Integer num, String str, Long l, Long l2, String str2, Long l3, Long l4, Integer num2, Integer num3, List list, List list2, List list3, List list4, Boolean bool, Boolean bool2, Boolean bool3, Integer num4, Boolean bool4, List list5, List list6, String str3) {
        if ((i & 1) == 0) {
            this.f1300a = null;
        } else {
            this.f1300a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num4;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = list5;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = list6;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqk0)) {
            return false;
        }
        aqk0 aqk0Var = (aqk0) obj;
        return Intrinsics.d(this.f1300a, aqk0Var.f1300a) && Intrinsics.d(this.b, aqk0Var.b) && Intrinsics.d(this.c, aqk0Var.c) && Intrinsics.d(this.d, aqk0Var.d) && Intrinsics.d(this.e, aqk0Var.e) && Intrinsics.d(this.f, aqk0Var.f) && Intrinsics.d(this.g, aqk0Var.g) && Intrinsics.d(this.h, aqk0Var.h) && Intrinsics.d(this.i, aqk0Var.i) && Intrinsics.d(this.j, aqk0Var.j) && Intrinsics.d(this.k, aqk0Var.k) && Intrinsics.d(this.l, aqk0Var.l) && Intrinsics.d(this.m, aqk0Var.m) && Intrinsics.d(this.n, aqk0Var.n) && Intrinsics.d(this.o, aqk0Var.o) && Intrinsics.d(this.p, aqk0Var.p) && Intrinsics.d(this.q, aqk0Var.q) && Intrinsics.d(this.r, aqk0Var.r) && Intrinsics.d(this.s, aqk0Var.s) && Intrinsics.d(this.t, aqk0Var.t) && Intrinsics.d(this.u, aqk0Var.u);
    }

    public final int hashCode() {
        Integer num = this.f1300a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.l;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.m;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.p;
        int iHashCode16 = (iHashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num4 = this.q;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool4 = this.r;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list5 = this.s;
        int iHashCode19 = (iHashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.t;
        int iHashCode20 = (iHashCode19 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str3 = this.u;
        return iHashCode20 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f1300a, "SpecialEventResponse(id=", ", title=", this.b, ", dateStart=");
        cs0.A(sbN, this.c, ", dateEnd=", this.d, ", eventStyle=");
        h97.w(this.f, this.e, ", sportId=", ", subSportId=", sbN);
        brm0.A(this.h, this.g, ", type=", ", hasFinals=", sbN);
        cs0.z(sbN, this.i, ", scheduleContentOrderIds=", this.j, ", myGamesContentOrderIds=");
        b1j.y(", statisticContentOrderIds=", ", tournamentContentOrderIds=", sbN, this.k, this.l);
        sbN.append(this.m);
        sbN.append(", customSportIcon=");
        sbN.append(this.n);
        sbN.append(", customChampIcon=");
        defpackage.c.j(sbN, this.o, ", topIcon=", this.p, ", bannerCategoryId=");
        brm0.z(this.r, this.q, ", timer=", ", socialNets=", sbN);
        b1j.y(", location=", ", overrideImagesId=", sbN, this.s, this.t);
        return axq.n(sbN, this.u, Separators.RPAREN);
    }
}
