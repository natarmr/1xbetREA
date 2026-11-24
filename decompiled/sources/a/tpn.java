package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class tpn implements xpn {
    public static final spn Companion = new spn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34342a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final Boolean s;
    public final String t;
    public final Integer u;
    public final Integer v;

    public /* synthetic */ tpn(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, Integer num5, Integer num6) {
        if ((i & 1) == 0) {
            this.f34342a = null;
        } else {
            this.f34342a = str;
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
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str9;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str11;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str13;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str14;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str15;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = num5;
        }
        if ((i & 2097152) == 0) {
            this.v = null;
        } else {
            this.v = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpn)) {
            return false;
        }
        tpn tpnVar = (tpn) obj;
        return Intrinsics.d(this.f34342a, tpnVar.f34342a) && Intrinsics.d(this.b, tpnVar.b) && Intrinsics.d(this.c, tpnVar.c) && Intrinsics.d(this.d, tpnVar.d) && Intrinsics.d(this.e, tpnVar.e) && Intrinsics.d(this.f, tpnVar.f) && Intrinsics.d(this.g, tpnVar.g) && Intrinsics.d(this.h, tpnVar.h) && Intrinsics.d(this.i, tpnVar.i) && Intrinsics.d(this.j, tpnVar.j) && Intrinsics.d(this.k, tpnVar.k) && Intrinsics.d(this.l, tpnVar.l) && Intrinsics.d(this.m, tpnVar.m) && Intrinsics.d(this.n, tpnVar.n) && Intrinsics.d(this.o, tpnVar.o) && Intrinsics.d(this.p, tpnVar.p) && Intrinsics.d(this.q, tpnVar.q) && Intrinsics.d(this.r, tpnVar.r) && Intrinsics.d(this.s, tpnVar.s) && Intrinsics.d(this.t, tpnVar.t) && Intrinsics.d(this.u, tpnVar.u) && Intrinsics.d(this.v, tpnVar.v);
    }

    public final int hashCode() {
        String str = this.f34342a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.m;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.n;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.o;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.p;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.q;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.r;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.s;
        int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.t;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num5 = this.u;
        int iHashCode21 = (iHashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.v;
        return iHashCode21 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("EditFullProfileRequest(name=", this.f34342a, ", surname=", this.b, ", middleName=");
        f140.v(sbN, this.c, ", birthday=", this.d, ", birthPlace=");
        axq.x(this.f, this.e, ", regionId=", ", countryId=", sbN);
        rz4.y(sbN, this.g, ", cityId=", this.h, ", vidDoc=");
        b1j.u(this.i, ", passportSeries=", this.j, ", passportNumber=", sbN);
        f140.v(sbN, this.k, ", passportDt=", this.l, ", passportWho=");
        f140.v(sbN, this.m, ", passportSubCode=", this.n, ", address=");
        f140.v(sbN, this.o, ", inn=", this.p, ", snils=");
        f140.v(sbN, this.q, ", bankAccountNumber=", this.r, ", sendToVerification=");
        defpackage.c.h(this.s, ", email=", this.t, ", nationality=", sbN);
        return ua80.l(sbN, this.u, ", sex=", this.v, Separators.RPAREN);
    }

    public tpn(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num5) {
        Boolean bool = Boolean.FALSE;
        this.f34342a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = num2;
        this.h = num3;
        this.i = num4;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = "";
        this.o = str10;
        this.p = str11;
        this.q = "";
        this.r = str12;
        this.s = bool;
        this.t = "";
        this.u = 0;
        this.v = num5;
    }
}
