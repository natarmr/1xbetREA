package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class i0s0 {
    public static final h0s0 Companion = new h0s0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13962a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{null, maz.a(wezVar, new yqr0((byte) 8)), maz.a(wezVar, new yqr0((byte) 9))};
    }

    public /* synthetic */ i0s0(int i, Long l, List list, List list2) {
        if ((i & 1) == 0) {
            this.f13962a = null;
        } else {
            this.f13962a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0s0)) {
            return false;
        }
        i0s0 i0s0Var = (i0s0) obj;
        return Intrinsics.d(this.f13962a, i0s0Var.f13962a) && Intrinsics.d(this.b, i0s0Var.b) && Intrinsics.d(this.c, i0s0Var.c);
    }

    public final int hashCode() {
        Long l = this.f13962a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentCsFeedStatisticResponse(id=");
        sb.append(this.f13962a);
        sb.append(", topPlayers=");
        sb.append(this.b);
        sb.append(", mapStatistic=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
