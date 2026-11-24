package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wrf {
    public static final vrf Companion = new vrf();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39639a;
    public final Integer b;
    public final gsf c;
    public final Map d;
    public final Map e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new dpf((byte) 5)), null, null, maz.a(wezVar, new dpf((byte) 6)), maz.a(wezVar, new dpf((byte) 7))};
    }

    public /* synthetic */ wrf(int i, List list, Integer num, gsf gsfVar, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.f39639a = null;
        } else {
            this.f39639a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gsfVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrf)) {
            return false;
        }
        wrf wrfVar = (wrf) obj;
        return Intrinsics.d(this.f39639a, wrfVar.f39639a) && Intrinsics.d(this.b, wrfVar.b) && this.c == wrfVar.c && Intrinsics.d(this.d, wrfVar.d) && Intrinsics.d(this.e, wrfVar.e);
    }

    public final int hashCode() {
        List list = this.f39639a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        gsf gsfVar = this.c;
        int iHashCode3 = (iHashCode2 + (gsfVar == null ? 0 : gsfVar.hashCode())) * 31;
        Map map = this.d;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.e;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "Cs2StatisticTeamResponse(playersStatistic=", ", scoreTeam=", ", teamRole=", this.f39639a);
        sbR.append(this.c);
        sbR.append(", roundHistoryFirstHalf=");
        sbR.append(this.d);
        sbR.append(", roundHistorySecondHalf=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
