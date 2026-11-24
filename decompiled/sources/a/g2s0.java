package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class g2s0 {
    public static final f2s0 Companion = new f2s0();
    public static final a8z[] k = {null, null, null, null, null, maz.a(wez.f39042a, new yqr0(11)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10576a;
    public final String b;
    public final Integer c;
    public final Float d;
    public final Integer e;
    public final d2s0 f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Float j;

    public /* synthetic */ g2s0(int i, String str, String str2, Integer num, Float f, Integer num2, d2s0 d2s0Var, Integer num3, Integer num4, Integer num5, Float f2) {
        if ((i & 1) == 0) {
            this.f10576a = null;
        } else {
            this.f10576a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d2s0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2s0)) {
            return false;
        }
        g2s0 g2s0Var = (g2s0) obj;
        return Intrinsics.d(this.f10576a, g2s0Var.f10576a) && Intrinsics.d(this.b, g2s0Var.b) && Intrinsics.d(this.c, g2s0Var.c) && Intrinsics.d(this.d, g2s0Var.d) && Intrinsics.d(this.e, g2s0Var.e) && this.f == g2s0Var.f && Intrinsics.d(this.g, g2s0Var.g) && Intrinsics.d(this.h, g2s0Var.h) && Intrinsics.d(this.i, g2s0Var.i) && Intrinsics.d(this.j, g2s0Var.j);
    }

    public final int hashCode() {
        String str = this.f10576a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        d2s0 d2s0Var = this.f;
        int iHashCode6 = (iHashCode5 + (d2s0Var == null ? 0 : d2s0Var.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f2 = this.j;
        return iHashCode9 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentLolFeedStatisticHeroResponse(name=", this.f10576a, ", imageS3=", this.b, ", tier=");
        sbN.append(this.c);
        sbN.append(", presence=");
        sbN.append(this.d);
        sbN.append(", picks=");
        sbN.append(this.e);
        sbN.append(", position=");
        sbN.append(this.f);
        sbN.append(", bans=");
        rz4.y(sbN, this.g, ", wins=", this.h, ", loses=");
        sbN.append(this.i);
        sbN.append(", winrate=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
