package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lwl0 {
    public static final fwl0 Companion = new fwl0();
    public static final a8z[] x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20770a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final List t;
    public final List u;
    public final Boolean v;
    public final Boolean w;

    static {
        wez wezVar = wez.f39042a;
        x = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new fzk0((byte) 16)), maz.a(wezVar, new fzk0((byte) 17)), null, null};
    }

    public /* synthetic */ lwl0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f20770a = null;
        } else {
            this.f20770a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str12;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str13;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str14;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str15;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str16;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str17;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str18;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str19;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = list;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = list2;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwl0)) {
            return false;
        }
        lwl0 lwl0Var = (lwl0) obj;
        return Intrinsics.d(this.f20770a, lwl0Var.f20770a) && Intrinsics.d(this.b, lwl0Var.b) && Intrinsics.d(this.c, lwl0Var.c) && Intrinsics.d(this.d, lwl0Var.d) && Intrinsics.d(this.e, lwl0Var.e) && Intrinsics.d(this.f, lwl0Var.f) && Intrinsics.d(this.g, lwl0Var.g) && Intrinsics.d(this.h, lwl0Var.h) && Intrinsics.d(this.i, lwl0Var.i) && Intrinsics.d(this.j, lwl0Var.j) && Intrinsics.d(this.k, lwl0Var.k) && Intrinsics.d(this.l, lwl0Var.l) && Intrinsics.d(this.m, lwl0Var.m) && Intrinsics.d(this.n, lwl0Var.n) && Intrinsics.d(this.o, lwl0Var.o) && Intrinsics.d(this.p, lwl0Var.p) && Intrinsics.d(this.q, lwl0Var.q) && Intrinsics.d(this.r, lwl0Var.r) && Intrinsics.d(this.s, lwl0Var.s) && Intrinsics.d(this.t, lwl0Var.t) && Intrinsics.d(this.u, lwl0Var.u) && Intrinsics.d(this.v, lwl0Var.v) && Intrinsics.d(this.w, lwl0Var.w);
    }

    public final int hashCode() {
        String str = this.f20770a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.n;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.o;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.p;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.q;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.r;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.s;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List list = this.t;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.u;
        int iHashCode21 = (iHashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.v;
        int iHashCode22 = (iHashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.w;
        return iHashCode22 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StadiumInfoResponse(name=", this.f20770a, ", architect=", this.b, ", covering=");
        f140.v(sbN, this.c, ", address=", this.d, ", zipCode=");
        f140.v(sbN, this.e, ", phone=", this.f, ", email=");
        f140.v(sbN, this.g, ", website=", this.h, ", opened=");
        f140.v(sbN, this.i, ", capacity=", this.j, ", owner=");
        f140.v(sbN, this.k, ", developer=", this.l, ", homeTeams=");
        f140.v(sbN, this.m, ", cost=", this.n, ", category=");
        f140.v(sbN, this.o, ", city=", this.p, ", history=");
        f140.v(sbN, this.q, ", oldName=", this.r, ", majorEvents=");
        cs0.y(this.s, ", circuits=", ", images=", sbN, this.t);
        sbN.append(this.u);
        sbN.append(", hasInfo=");
        sbN.append(this.v);
        sbN.append(", isHideImages=");
        return defpackage.c.e(sbN, this.w, Separators.RPAREN);
    }
}
