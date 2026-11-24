package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pkh {
    public static final okh Companion = new okh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f27133a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Boolean e;

    public /* synthetic */ pkh(int i, Boolean bool, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f27133a = null;
        } else {
            this.f27133a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkh)) {
            return false;
        }
        pkh pkhVar = (pkh) obj;
        return Intrinsics.d(this.f27133a, pkhVar.f27133a) && Intrinsics.d(this.b, pkhVar.b) && Intrinsics.d(this.c, pkhVar.c) && Intrinsics.d(this.d, pkhVar.d) && Intrinsics.d(this.e, pkhVar.e);
    }

    public final int hashCode() {
        Long l = this.f27133a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f27133a, "CyberTournamentBracketMatchTeamResponse(feedId=", ", name=", this.b, ", imageS3=");
        axq.x(this.d, this.c, ", score=", ", isWinner=", sbS);
        return defpackage.c.e(sbS, this.e, Separators.RPAREN);
    }
}
