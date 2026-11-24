package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2689a;
    public final boolean b;
    public final boolean c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Double k;
    public final Long l;
    public final String m;
    public final String n;

    public bj50(long j, boolean z, boolean z2, Long l, Long l2, String str, String str2, Long l3, Long l4, Long l5, Double d, Long l6, String str3, String str4) {
        this.f2689a = j;
        this.b = z;
        this.c = z2;
        this.d = l;
        this.e = l2;
        this.f = str;
        this.g = str2;
        this.h = l3;
        this.i = l4;
        this.j = l5;
        this.k = d;
        this.l = l6;
        this.m = str3;
        this.n = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj50)) {
            return false;
        }
        bj50 bj50Var = (bj50) obj;
        return this.f2689a == bj50Var.f2689a && this.b == bj50Var.b && this.c == bj50Var.c && Intrinsics.d(this.d, bj50Var.d) && Intrinsics.d(this.e, bj50Var.e) && Intrinsics.d(this.f, bj50Var.f) && Intrinsics.d(this.g, bj50Var.g) && Intrinsics.d(this.h, bj50Var.h) && Intrinsics.d(this.i, bj50Var.i) && Intrinsics.d(this.j, bj50Var.j) && Intrinsics.d(this.k, bj50Var.k) && Intrinsics.d(this.l, bj50Var.l) && Intrinsics.d(this.m, bj50Var.m) && Intrinsics.d(this.n, bj50Var.n);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Long.hashCode(this.f2689a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.j;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Double d = this.k;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Long l6 = this.l;
        int iHashCode9 = (iHashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f2689a, "NearestGameScoreSnapshotModel(gameId=", ", isLive=", this.b);
        sbR.append(", isCricket=");
        sbR.append(this.c);
        sbR.append(", fullScoreOpp1=");
        sbR.append(this.d);
        sbR.append(", fullScoreOpp2=");
        sbR.append(this.e);
        sbR.append(", subScoreTeamOne=");
        sbR.append(this.f);
        sbR.append(", subScoreTeamTwo=");
        sbR.append(this.g);
        sbR.append(", lastPeriodOpp1=");
        sbR.append(this.h);
        sbR.append(", lastPeriodOpp2=");
        sbR.append(this.i);
        sbR.append(", cricketTeam=");
        sbR.append(this.j);
        sbR.append(", cricketOver=");
        sbR.append(this.k);
        sbR.append(", cricketWickets=");
        sbR.append(this.l);
        f140.v(sbR, ", cricketWicketScoreTeamOne=", this.m, ", cricketWicketScoreTeamTwo=", this.n);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
