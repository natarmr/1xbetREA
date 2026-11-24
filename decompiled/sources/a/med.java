package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class med {
    public static final led Companion = new led();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21639a;
    public final Long b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Boolean l;

    public /* synthetic */ med(int i, Integer num, Long l, String str, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, Integer num5, Boolean bool) {
        if ((i & 1) == 0) {
            this.f21639a = null;
        } else {
            this.f21639a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof med)) {
            return false;
        }
        med medVar = (med) obj;
        return Intrinsics.d(this.f21639a, medVar.f21639a) && Intrinsics.d(this.b, medVar.b) && Intrinsics.d(this.c, medVar.c) && Intrinsics.d(this.d, medVar.d) && Intrinsics.d(this.e, medVar.e) && Intrinsics.d(this.f, medVar.f) && Intrinsics.d(this.g, medVar.g) && Intrinsics.d(this.h, medVar.h) && Intrinsics.d(this.i, medVar.i) && Intrinsics.d(this.j, medVar.j) && Intrinsics.d(this.k, medVar.k) && Intrinsics.d(this.l, medVar.l);
    }

    public final int hashCode() {
        Integer num = this.f21639a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.k;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.l;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f21639a, this.b, "CompletedMatchesGameStatisticResponse(dateStart=", ", feedGameId=", ", id=");
        axq.x(this.d, this.c, ", score1=", ", score2=", sbM);
        rz4.y(sbM, this.e, ", status=", this.f, ", team1=");
        f140.v(sbM, this.g, ", team2=", this.h, ", stringScore1=");
        f140.v(sbM, this.i, ", stringScore2=", this.j, ", winner=");
        sbM.append(this.k);
        sbM.append(", noScore=");
        sbM.append(this.l);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
