package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pje0 {
    public static final oje0 Companion = new oje0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27087a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final Double h;
    public final Double i;
    public final Double j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;

    public /* synthetic */ pje0(int i, String str, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Integer num, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f27087a = null;
        } else {
            this.f27087a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d8;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d9;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pje0)) {
            return false;
        }
        pje0 pje0Var = (pje0) obj;
        return Intrinsics.d(this.f27087a, pje0Var.f27087a) && Intrinsics.d(this.b, pje0Var.b) && Intrinsics.d(this.c, pje0Var.c) && Intrinsics.d(this.d, pje0Var.d) && Intrinsics.d(this.e, pje0Var.e) && Intrinsics.d(this.f, pje0Var.f) && Intrinsics.d(this.g, pje0Var.g) && Intrinsics.d(this.h, pje0Var.h) && Intrinsics.d(this.i, pje0Var.i) && Intrinsics.d(this.j, pje0Var.j) && Intrinsics.d(this.k, pje0Var.k) && Intrinsics.d(this.l, pje0Var.l) && Intrinsics.d(this.m, pje0Var.m) && Intrinsics.d(this.n, pje0Var.n);
    }

    public final int hashCode() {
        String str = this.f27087a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.d;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.e;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f;
        int iHashCode6 = (iHashCode5 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.g;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.h;
        int iHashCode8 = (iHashCode7 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.i;
        int iHashCode9 = (iHashCode8 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.j;
        int iHashCode10 = (iHashCode9 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.n;
        return iHashCode13 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefereeTeamInfoResponse(tournament=");
        sb.append(this.f27087a);
        sb.append(", winRatio=");
        sb.append(this.b);
        sb.append(", loseRatio=");
        vqd.w(sb, this.c, ", drawRatio=", this.d, ", pointsPerGame=");
        vqd.w(sb, this.e, ", penaltiesAwardedAgainstPerGame=", this.f, ", foulsAwardedAgainstPerGame=");
        vqd.w(sb, this.g, ", foulsPerTackle=", this.h, ", yellowCdsPerGame=");
        vqd.w(sb, this.i, ", redCdsPerGame=", this.j, ", numParticipation=");
        rz4.y(sb, this.k, ", yellowCds=", this.l, ", redCds=");
        return ua80.l(sb, this.m, ", penalties=", this.n, Separators.RPAREN);
    }
}
