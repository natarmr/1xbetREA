package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class z0p0 {
    public static final y0p0 Companion = new y0p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43580a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final String g;
    public final Long h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;

    public /* synthetic */ z0p0(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Long l, Integer num3, Integer num4, Boolean bool) {
        if ((i & 1) == 0) {
            this.f43580a = null;
        } else {
            this.f43580a = str;
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
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0p0)) {
            return false;
        }
        z0p0 z0p0Var = (z0p0) obj;
        return Intrinsics.d(this.f43580a, z0p0Var.f43580a) && Intrinsics.d(this.b, z0p0Var.b) && Intrinsics.d(this.c, z0p0Var.c) && Intrinsics.d(this.d, z0p0Var.d) && Intrinsics.d(this.e, z0p0Var.e) && Intrinsics.d(this.f, z0p0Var.f) && Intrinsics.d(this.g, z0p0Var.g) && Intrinsics.d(this.h, z0p0Var.h) && Intrinsics.d(this.i, z0p0Var.i) && Intrinsics.d(this.j, z0p0Var.j) && Intrinsics.d(this.k, z0p0Var.k);
    }

    public final int hashCode() {
        String str = this.f43580a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.k;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamBetLastGameResponse(id=", this.f43580a, ", team1=", this.b, ", team2=");
        axq.x(this.d, this.c, ", score1=", ", stringScore1=", sbN);
        axq.x(this.f, this.e, ", score2=", ", stringScore2=", sbN);
        h97.w(this.h, this.g, ", dateStart=", ", status=", sbN);
        rz4.y(sbN, this.i, ", winner=", this.j, ", noScore=");
        return defpackage.c.e(sbN, this.k, Separators.RPAREN);
    }
}
