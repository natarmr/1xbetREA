package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class w4a0 {
    public static final v4a0 Companion = new v4a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f38534a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Integer h;
    public final String i;
    public final Integer j;
    public final String k;

    public /* synthetic */ w4a0(int i, Long l, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5, String str3, Integer num6, String str4) {
        if ((i & 1) == 0) {
            this.f38534a = null;
        } else {
            this.f38534a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4a0)) {
            return false;
        }
        w4a0 w4a0Var = (w4a0) obj;
        return Intrinsics.d(this.f38534a, w4a0Var.f38534a) && Intrinsics.d(this.b, w4a0Var.b) && Intrinsics.d(this.c, w4a0Var.c) && Intrinsics.d(this.d, w4a0Var.d) && Intrinsics.d(this.e, w4a0Var.e) && Intrinsics.d(this.f, w4a0Var.f) && Intrinsics.d(this.g, w4a0Var.g) && Intrinsics.d(this.h, w4a0Var.h) && Intrinsics.d(this.i, w4a0Var.i) && Intrinsics.d(this.j, w4a0Var.j) && Intrinsics.d(this.k, w4a0Var.k);
    }

    public final int hashCode() {
        Long l = this.f38534a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.h;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num6 = this.j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f38534a, "PlayerLastGameValueResponse(dateStartInSecondsUnixTime=", ", goals=", ", redCards=");
        rz4.y(sbQ, this.c, ", scoreTeamOne=", this.d, ", scoreTeamTwo=");
        b1j.u(this.e, ", teamOneId=", this.f, ", teamTwoId=", sbQ);
        axq.x(this.h, this.g, ", time=", ", tournamentTitle=", sbQ);
        axq.x(this.j, this.i, ", yellowCards=", ", gameId=", sbQ);
        return axq.n(sbQ, this.k, Separators.RPAREN);
    }
}
