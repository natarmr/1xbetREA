package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rhm0 {
    public static final qhm0 Companion = new qhm0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30497a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, maz.a(wezVar, new x9m0((byte) 5)), maz.a(wezVar, new x9m0((byte) 6)), maz.a(wezVar, new x9m0((byte) 7)), maz.a(wezVar, new x9m0((byte) 8))};
    }

    public /* synthetic */ rhm0(int i, Long l, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f30497a = null;
        } else {
            this.f30497a = l;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhm0)) {
            return false;
        }
        rhm0 rhm0Var = (rhm0) obj;
        return Intrinsics.d(this.f30497a, rhm0Var.f30497a) && Intrinsics.d(this.b, rhm0Var.b) && Intrinsics.d(this.c, rhm0Var.c) && Intrinsics.d(this.d, rhm0Var.d) && Intrinsics.d(this.e, rhm0Var.e);
    }

    public final int hashCode() {
        Long l = this.f30497a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.d;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.e;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticsDictionariesResponse(lastUpdate=");
        sb.append(this.f30497a);
        sb.append(", periodTypesUpdates=");
        sb.append(this.b);
        sb.append(", gameStatusUpdates=");
        b1j.y(", gameSubStatusUpdates=", ", lineUpTypeUpdates=", sb, this.c, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
