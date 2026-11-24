package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sm6 {
    public static final rm6 Companion = new rm6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32429a;
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

    public /* synthetic */ sm6(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        if ((i & 1) == 0) {
            this.f32429a = null;
        } else {
            this.f32429a = str;
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
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = str17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm6)) {
            return false;
        }
        sm6 sm6Var = (sm6) obj;
        return Intrinsics.d(this.f32429a, sm6Var.f32429a) && Intrinsics.d(this.b, sm6Var.b) && Intrinsics.d(this.c, sm6Var.c) && Intrinsics.d(this.d, sm6Var.d) && Intrinsics.d(this.e, sm6Var.e) && Intrinsics.d(this.f, sm6Var.f) && Intrinsics.d(this.g, sm6Var.g) && Intrinsics.d(this.h, sm6Var.h) && Intrinsics.d(this.i, sm6Var.i) && Intrinsics.d(this.j, sm6Var.j) && Intrinsics.d(this.k, sm6Var.k) && Intrinsics.d(this.l, sm6Var.l) && Intrinsics.d(this.m, sm6Var.m) && Intrinsics.d(this.n, sm6Var.n) && Intrinsics.d(this.o, sm6Var.o) && Intrinsics.d(this.p, sm6Var.p) && Intrinsics.d(this.q, sm6Var.q);
    }

    public final int hashCode() {
        String str = this.f32429a;
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
        return iHashCode16 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetBuilderWeatherResponse(weather=", this.f32429a, ", temperature=", this.b, ", weatherCode=");
        f140.v(sbN, this.c, ", weatherDescription=", this.d, ", weatherWindCode=");
        f140.v(sbN, this.e, ", weatherWindParam=", this.f, ", weatherWindDescription=");
        f140.v(sbN, this.g, ", weatherPressure=", this.h, ", weatherPressureDescription=");
        f140.v(sbN, this.i, ", weatherHumidity=", this.j, ", weatherHumidityDescription=");
        f140.v(sbN, this.k, ", weatherWaveHeight=", this.l, ", weatherWaveHeightDescription=");
        f140.v(sbN, this.m, ", weatherWaterTemperature=", this.n, ", weatherWaterTemperatureDescription=");
        f140.v(sbN, this.o, ", weatherPrecipitationChance=", this.p, ", weatherPrecipitationChanceDescription=");
        return axq.n(sbN, this.q, Separators.RPAREN);
    }
}
