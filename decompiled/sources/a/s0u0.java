package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class s0u0 {
    public static final r0u0 Companion = new r0u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f31427a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final String k;
    public final String l;
    public final Integer m;
    public final Integer n;
    public final Integer o;

    public /* synthetic */ s0u0(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str, String str2, Integer num11, Integer num12, Integer num13) {
        if ((i & 1) == 0) {
            this.f31427a = null;
        } else {
            this.f31427a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num11;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num12;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0u0)) {
            return false;
        }
        s0u0 s0u0Var = (s0u0) obj;
        return Intrinsics.d(this.f31427a, s0u0Var.f31427a) && Intrinsics.d(this.b, s0u0Var.b) && Intrinsics.d(this.c, s0u0Var.c) && Intrinsics.d(this.d, s0u0Var.d) && Intrinsics.d(this.e, s0u0Var.e) && Intrinsics.d(this.f, s0u0Var.f) && Intrinsics.d(this.g, s0u0Var.g) && Intrinsics.d(this.h, s0u0Var.h) && Intrinsics.d(this.i, s0u0Var.i) && Intrinsics.d(this.j, s0u0Var.j) && Intrinsics.d(this.k, s0u0Var.k) && Intrinsics.d(this.l, s0u0Var.l) && Intrinsics.d(this.m, s0u0Var.m) && Intrinsics.d(this.n, s0u0Var.n) && Intrinsics.d(this.o, s0u0Var.o);
    }

    public final int hashCode() {
        Integer num = this.f31427a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.i;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.j;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str = this.k;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num11 = this.m;
        int iHashCode13 = (iHashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.n;
        int iHashCode14 = (iHashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.o;
        return iHashCode14 + (num13 != null ? num13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("ValorantStatisticMatchesMatchTeamPlayerResponse(id=", this.f31427a, ", kills=", this.b, ", deaths=");
        rz4.y(sbQ, this.c, ", assists=", this.d, ", multiKills=");
        rz4.y(sbQ, this.e, ", clutches=", this.f, ", firstKills=");
        rz4.y(sbQ, this.g, ", firstDeaths=", this.h, ", damageAvg=");
        rz4.y(sbQ, this.i, ", combatScoreAvg=", this.j, ", heroName=");
        f140.v(sbQ, this.k, ", heroImageS3=", this.l, ", numberOfHeadShots=");
        rz4.y(sbQ, this.m, ", numberOfBodyShots=", this.n, ", numberOfLegShots=");
        return dw9.q(sbQ, this.o, Separators.RPAREN);
    }
}
