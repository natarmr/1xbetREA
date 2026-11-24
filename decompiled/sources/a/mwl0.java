package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mwl0 {
    public static final gwl0 Companion = new gwl0();
    public static final a8z[] p = {null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new fzk0(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22510a;
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
    public final List n;
    public final Integer o;

    public /* synthetic */ mwl0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, Integer num) {
        if ((i & 1) == 0) {
            this.f22510a = null;
        } else {
            this.f22510a = str;
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
            this.n = list;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwl0)) {
            return false;
        }
        mwl0 mwl0Var = (mwl0) obj;
        return Intrinsics.d(this.f22510a, mwl0Var.f22510a) && Intrinsics.d(this.b, mwl0Var.b) && Intrinsics.d(this.c, mwl0Var.c) && Intrinsics.d(this.d, mwl0Var.d) && Intrinsics.d(this.e, mwl0Var.e) && Intrinsics.d(this.f, mwl0Var.f) && Intrinsics.d(this.g, mwl0Var.g) && Intrinsics.d(this.h, mwl0Var.h) && Intrinsics.d(this.i, mwl0Var.i) && Intrinsics.d(this.j, mwl0Var.j) && Intrinsics.d(this.k, mwl0Var.k) && Intrinsics.d(this.l, mwl0Var.l) && Intrinsics.d(this.m, mwl0Var.m) && Intrinsics.d(this.n, mwl0Var.n) && Intrinsics.d(this.o, mwl0Var.o);
    }

    public final int hashCode() {
        String str = this.f22510a;
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
        List list = this.n;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.o;
        return iHashCode14 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StadiumInfoResponse(address=", this.f22510a, ", name=", this.b, ", capacity=");
        f140.v(sbN, this.c, ", covering=", this.d, ", city=");
        f140.v(sbN, this.e, ", architect=", this.f, ", oldName=");
        f140.v(sbN, this.g, ", category=", this.h, ", history=");
        f140.v(sbN, this.i, ", opened=", this.j, ", zipCode=");
        f140.v(sbN, this.k, ", phone=", this.l, ", website=");
        cs0.y(this.m, ", imageList=", ", countryId=", sbN, this.n);
        return dw9.q(sbN, this.o, Separators.RPAREN);
    }
}
