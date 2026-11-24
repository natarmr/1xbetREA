package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class o2s0 {
    public static final n2s0 Companion = new n2s0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24548a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{null, maz.a(wezVar, new yqr0((byte) 13)), maz.a(wezVar, new yqr0((byte) 14))};
    }

    public /* synthetic */ o2s0(int i, Long l, List list, List list2) {
        if ((i & 1) == 0) {
            this.f24548a = null;
        } else {
            this.f24548a = l;
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
        if (!(obj instanceof o2s0)) {
            return false;
        }
        o2s0 o2s0Var = (o2s0) obj;
        return Intrinsics.d(this.f24548a, o2s0Var.f24548a) && Intrinsics.d(this.b, o2s0Var.b) && Intrinsics.d(this.c, o2s0Var.c);
    }

    public final int hashCode() {
        Long l = this.f24548a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentLolFeedStatisticResponse(id=");
        sb.append(this.f24548a);
        sb.append(", players=");
        sb.append(this.b);
        sb.append(", heroes=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
