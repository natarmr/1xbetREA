package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tc0 {
    public static final sc0 Companion = new sc0();
    public static final a8z[] p = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new q8(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33695a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Integer k;
    public final String l;
    public final iz8 m;
    public final String n;
    public final List o;

    public /* synthetic */ tc0(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, iz8 iz8Var, String str11, List list) {
        if ((i & 1) == 0) {
            this.f33695a = null;
        } else {
            this.f33695a = l;
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
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = iz8Var;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str11;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc0)) {
            return false;
        }
        tc0 tc0Var = (tc0) obj;
        return Intrinsics.d(this.f33695a, tc0Var.f33695a) && Intrinsics.d(this.b, tc0Var.b) && Intrinsics.d(this.c, tc0Var.c) && Intrinsics.d(this.d, tc0Var.d) && Intrinsics.d(this.e, tc0Var.e) && Intrinsics.d(this.f, tc0Var.f) && Intrinsics.d(this.g, tc0Var.g) && Intrinsics.d(this.h, tc0Var.h) && Intrinsics.d(this.i, tc0Var.i) && Intrinsics.d(this.j, tc0Var.j) && Intrinsics.d(this.k, tc0Var.k) && Intrinsics.d(this.l, tc0Var.l) && this.m == tc0Var.m && Intrinsics.d(this.n, tc0Var.n) && Intrinsics.d(this.o, tc0Var.o);
    }

    public final int hashCode() {
        Long l = this.f33695a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.l;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        iz8 iz8Var = this.m;
        int iHashCode13 = (iHashCode12 + (iz8Var == null ? 0 : iz8Var.hashCode())) * 31;
        String str11 = this.n;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List list = this.o;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f33695a, "AggregatorBrandDataResponse(id=", ", name=", this.b, ", imgSidebar=");
        f140.v(sbS, this.c, ", imgLanding=", this.d, ", imgFooter=");
        f140.v(sbS, this.e, ", imgDropdown=", this.f, ", imgLight=");
        f140.v(sbS, this.g, ", imgDark=", this.h, ", imgBanner=");
        f140.v(sbS, this.i, ", imgPictogram=", this.j, ", gamesCount=");
        b1j.u(this.k, ", description=", this.l, ", viewType=", sbS);
        sbS.append(this.m);
        sbS.append(", nameForUrl=");
        sbS.append(this.n);
        sbS.append(", partitions=");
        return dw9.r(sbS, this.o, Separators.RPAREN);
    }
}
