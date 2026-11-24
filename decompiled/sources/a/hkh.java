package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hkh {
    public static final gkh Companion = new gkh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13208a;
    public final Long b;
    public final Long c;
    public final pkh d;
    public final pkh e;
    public final String f;
    public final String g;
    public final Integer h;
    public final String i;
    public final Long j;

    public /* synthetic */ hkh(int i, String str, Long l, Long l2, pkh pkhVar, pkh pkhVar2, String str2, String str3, Integer num, String str4, Long l3) {
        if ((i & 1) == 0) {
            this.f13208a = null;
        } else {
            this.f13208a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = pkhVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = pkhVar2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkh)) {
            return false;
        }
        hkh hkhVar = (hkh) obj;
        return Intrinsics.d(this.f13208a, hkhVar.f13208a) && Intrinsics.d(this.b, hkhVar.b) && Intrinsics.d(this.c, hkhVar.c) && Intrinsics.d(this.d, hkhVar.d) && Intrinsics.d(this.e, hkhVar.e) && Intrinsics.d(this.f, hkhVar.f) && Intrinsics.d(this.g, hkhVar.g) && Intrinsics.d(this.h, hkhVar.h) && Intrinsics.d(this.i, hkhVar.i) && Intrinsics.d(this.j, hkhVar.j);
    }

    public final int hashCode() {
        String str = this.f13208a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        pkh pkhVar = this.d;
        int iHashCode4 = (iHashCode3 + (pkhVar == null ? 0 : pkhVar.hashCode())) * 31;
        pkh pkhVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (pkhVar2 == null ? 0 : pkhVar2.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.j;
        return iHashCode9 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "CyberTournamentBracketMatchResponse(id=", this.f13208a, ", feedConstId=", ", feedGameId=");
        sbS.append(this.c);
        sbS.append(", team1=");
        sbS.append(this.d);
        sbS.append(", team2=");
        sbS.append(this.e);
        sbS.append(", toTeam1MatchId=");
        sbS.append(this.f);
        sbS.append(", toTeam2MatchId=");
        axq.x(this.h, this.g, ", status=", ", startedAt=", sbS);
        sbS.append(this.i);
        sbS.append(", startedAtStamp=");
        sbS.append(this.j);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
