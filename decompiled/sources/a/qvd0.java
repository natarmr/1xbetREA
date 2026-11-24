package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qvd0 {
    public static final pvd0 Companion = new pvd0();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29381a;
    public final Integer b;
    public final Map c;
    public final Map d;
    public final tvd0 e;
    public final List f;

    static {
        wez wezVar = wez.f39042a;
        g = new a8z[]{maz.a(wezVar, new etd0((byte) 4)), null, maz.a(wezVar, new etd0((byte) 5)), maz.a(wezVar, new etd0((byte) 6)), null, maz.a(wezVar, new etd0((byte) 7))};
    }

    public /* synthetic */ qvd0(int i, List list, Integer num, Map map, Map map2, tvd0 tvd0Var, List list2) {
        if ((i & 1) == 0) {
            this.f29381a = null;
        } else {
            this.f29381a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = tvd0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvd0)) {
            return false;
        }
        qvd0 qvd0Var = (qvd0) obj;
        return Intrinsics.d(this.f29381a, qvd0Var.f29381a) && Intrinsics.d(this.b, qvd0Var.b) && Intrinsics.d(this.c, qvd0Var.c) && Intrinsics.d(this.d, qvd0Var.d) && this.e == qvd0Var.e && Intrinsics.d(this.f, qvd0Var.f);
    }

    public final int hashCode() {
        List list = this.f29381a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        tvd0 tvd0Var = this.e;
        int iHashCode5 = (iHashCode4 + (tvd0Var == null ? 0 : tvd0Var.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "RainbowGameStatisticMainStatResponse(playerStatistic=", ", teamScore=", ", firstRoundsHistory=", this.f29381a);
        sbR.append(this.c);
        sbR.append(", secondRoundsHistory=");
        sbR.append(this.d);
        sbR.append(", role=");
        sbR.append(this.e);
        sbR.append(", bans=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
