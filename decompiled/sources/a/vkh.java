package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vkh {
    public static final ukh Companion = new ukh();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new gch(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37572a;
    public final Long b;
    public final List c;

    public /* synthetic */ vkh(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f37572a = null;
        } else {
            this.f37572a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkh)) {
            return false;
        }
        vkh vkhVar = (vkh) obj;
        return Intrinsics.d(this.f37572a, vkhVar.f37572a) && Intrinsics.d(this.b, vkhVar.b) && Intrinsics.d(this.c, vkhVar.c);
    }

    public final int hashCode() {
        String str = this.f37572a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(kng0.s(this.b, "CyberTournamentBracketPrizeDistributionResponse(place=", this.f37572a, ", prize=", ", teams="), this.c, Separators.RPAREN);
    }
}
