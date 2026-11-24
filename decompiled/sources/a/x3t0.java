package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class x3t0 {
    public static final w3t0 Companion = new w3t0();
    public static final a8z[] n = {null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new xns0(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40237a;
    public final Long b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;

    public /* synthetic */ x3t0(int i, Long l, Long l2, String str, String str2, Long l3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        if ((i & 1) == 0) {
            this.f40237a = null;
        } else {
            this.f40237a = l;
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
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3t0)) {
            return false;
        }
        x3t0 x3t0Var = (x3t0) obj;
        return Intrinsics.d(this.f40237a, x3t0Var.f40237a) && Intrinsics.d(this.b, x3t0Var.b) && Intrinsics.d(this.c, x3t0Var.c) && Intrinsics.d(this.d, x3t0Var.d) && Intrinsics.d(this.e, x3t0Var.e) && Intrinsics.d(this.f, x3t0Var.f) && Intrinsics.d(this.g, x3t0Var.g) && Intrinsics.d(this.h, x3t0Var.h) && Intrinsics.d(this.i, x3t0Var.i) && Intrinsics.d(this.j, x3t0Var.j) && Intrinsics.d(this.k, x3t0Var.k) && Intrinsics.d(this.l, x3t0Var.l) && Intrinsics.d(this.m, x3t0Var.m);
    }

    public final int hashCode() {
        Long l = this.f40237a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.l;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.m;
        return iHashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f40237a, this.b, "UfcCalendarTournamentResponse(eventID=", ", tournamentFeedId=", ", feedName=");
        f140.v(sbO, this.c, ", name=", this.d, ", startTime=");
        rz4.v(this.e, ", status=", this.f, ", city=", sbO);
        f140.v(sbO, this.g, ", state=", this.h, ", country=");
        f140.v(sbO, this.i, ", countryImageS3=", this.j, ", triCode=");
        f140.v(sbO, this.k, ", venue=", this.l, ", fighters=");
        return dw9.r(sbO, this.m, Separators.RPAREN);
    }
}
