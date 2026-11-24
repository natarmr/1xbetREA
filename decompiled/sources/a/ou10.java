package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ou10 {
    public static final nu10 Companion = new nu10();
    public static final a8z[] n = {null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new gf10(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25855a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final Integer h;
    public final Boolean i;
    public final Boolean j;
    public final Long k;
    public final List l;
    public final Long m;

    public /* synthetic */ ou10(int i, Long l, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Boolean bool, Boolean bool2, Long l2, List list, Long l3) {
        if ((i & 1) == 0) {
            this.f25855a = null;
        } else {
            this.f25855a = l;
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
            this.j = bool2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou10)) {
            return false;
        }
        ou10 ou10Var = (ou10) obj;
        return Intrinsics.d(this.f25855a, ou10Var.f25855a) && Intrinsics.d(this.b, ou10Var.b) && Intrinsics.d(this.c, ou10Var.c) && Intrinsics.d(this.d, ou10Var.d) && Intrinsics.d(this.e, ou10Var.e) && Intrinsics.d(this.f, ou10Var.f) && Intrinsics.d(this.g, ou10Var.g) && Intrinsics.d(this.h, ou10Var.h) && Intrinsics.d(this.i, ou10Var.i) && Intrinsics.d(this.j, ou10Var.j) && Intrinsics.d(this.k, ou10Var.k) && Intrinsics.d(this.l, ou10Var.l) && Intrinsics.d(this.m, ou10Var.m);
    }

    public final int hashCode() {
        Long l = this.f25855a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
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
        Boolean bool2 = this.j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.l;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.m;
        return iHashCode12 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f25855a, "SubLigaResponse(id=", ", name=", this.b, ", image=");
        f140.v(sbS, this.c, ", altImage=", this.d, ", countryImage=");
        axq.x(this.f, this.e, ", countryId=", ", countryName=", sbS);
        axq.x(this.h, this.g, ", gamesCount=", ", isNew=", sbS);
        defpackage.c.j(sbS, this.i, ", isTop=", this.j, ", subSportId=");
        twn.z(sbS, this.k, ", games=", this.l, ", globalChampId=");
        return ohs0.r(sbS, this.m, Separators.RPAREN);
    }
}
