package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xag {
    public static final wag Companion = new wag();
    public static final a8z[] o = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new dpf((byte) 28)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40552a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Integer h;
    public final List i;
    public final String j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Boolean n;

    public /* synthetic */ xag(int i, Long l, Long l2, Long l3, String str, String str2, String str3, Long l4, Integer num, List list, String str4, Long l5, Long l6, Long l7, Boolean bool) {
        if ((i & 1) == 0) {
            this.f40552a = null;
        } else {
            this.f40552a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
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
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xag)) {
            return false;
        }
        xag xagVar = (xag) obj;
        return Intrinsics.d(this.f40552a, xagVar.f40552a) && Intrinsics.d(this.b, xagVar.b) && Intrinsics.d(this.c, xagVar.c) && Intrinsics.d(this.d, xagVar.d) && Intrinsics.d(this.e, xagVar.e) && Intrinsics.d(this.f, xagVar.f) && Intrinsics.d(this.g, xagVar.g) && Intrinsics.d(this.h, xagVar.h) && Intrinsics.d(this.i, xagVar.i) && Intrinsics.d(this.j, xagVar.j) && Intrinsics.d(this.k, xagVar.k) && Intrinsics.d(this.l, xagVar.l) && Intrinsics.d(this.m, xagVar.m) && Intrinsics.d(this.n, xagVar.n);
    }

    public final int hashCode() {
        Long l = this.f40552a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.k;
        int iHashCode11 = (iHashCode10 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.l;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.m;
        int iHashCode13 = (iHashCode12 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Boolean bool = this.n;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f40552a, this.b, "CyberCalendarTournamentResponse(id=", ", subSportId=", ", feedId=");
        rz4.v(this.c, ", name=", this.d, ", type=", sbO);
        f140.v(sbO, this.e, ", location=", this.f, ", prizePool=");
        brm0.A(this.h, this.g, ", tier=", ", teams=", sbO);
        h97.y(", imageS3=", this.j, ", startTimestamp=", sbO, this.i);
        cs0.A(sbO, this.k, ", endTimestamp=", this.l, ", globalId=");
        sbO.append(this.m);
        sbO.append(", lngSideLeft=");
        sbO.append(this.n);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
