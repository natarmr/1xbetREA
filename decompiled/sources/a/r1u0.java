package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r1u0 {
    public static final q1u0 Companion = new q1u0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29701a;
    public final Map b;
    public final Integer c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, maz.a(wezVar, new tht0((byte) 29)), null, maz.a(wezVar, new o1u0((byte) 0))};
    }

    public /* synthetic */ r1u0(int i, Integer num, Map map, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f29701a = null;
        } else {
            this.f29701a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1u0)) {
            return false;
        }
        r1u0 r1u0Var = (r1u0) obj;
        return Intrinsics.d(this.f29701a, r1u0Var.f29701a) && Intrinsics.d(this.b, r1u0Var.b) && Intrinsics.d(this.c, r1u0Var.c) && Intrinsics.d(this.d, r1u0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f29701a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ValorantStatisticTeamResponse(scoreTeam=" + this.f29701a + ", roundHistory=" + this.b + ", currentSide=" + this.c + ", playersStatistic=" + this.d + Separators.RPAREN;
    }
}
