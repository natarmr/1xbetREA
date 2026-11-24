package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class i0y {
    public static final g0y Companion = new g0y();
    public static final a8z[] j = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new qgx(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13969a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final List i;

    public /* synthetic */ i0y(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f13969a = null;
        } else {
            this.f13969a = l;
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
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0y)) {
            return false;
        }
        i0y i0yVar = (i0y) obj;
        return Intrinsics.d(this.f13969a, i0yVar.f13969a) && Intrinsics.d(this.b, i0yVar.b) && Intrinsics.d(this.c, i0yVar.c) && Intrinsics.d(this.d, i0yVar.d) && Intrinsics.d(this.e, i0yVar.e) && Intrinsics.d(this.f, i0yVar.f) && Intrinsics.d(this.g, i0yVar.g) && Intrinsics.d(this.h, i0yVar.h) && Intrinsics.d(this.i, i0yVar.i);
    }

    public final int hashCode() {
        Long l = this.f13969a;
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
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.i;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f13969a, "JackpotChampsWithGamesResponse(champId=", ", champName=", this.b, ", champNameEng=");
        f140.v(sbS, this.c, ", sportName=", this.d, ", sportNameEng=");
        f140.v(sbS, this.e, ", champImage=", this.f, ", champCountryImage=");
        axq.x(this.h, this.g, ", champCountryId=", ", gameListResponse=", sbS);
        return dw9.r(sbS, this.i, Separators.RPAREN);
    }
}
