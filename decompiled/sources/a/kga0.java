package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kga0 {
    public static final jga0 Companion = new jga0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18229a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new raa0((byte) 16)), maz.a(wezVar, new raa0((byte) 17))};
    }

    public /* synthetic */ kga0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f18229a = null;
        } else {
            this.f18229a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kga0)) {
            return false;
        }
        kga0 kga0Var = (kga0) obj;
        return Intrinsics.d(this.f18229a, kga0Var.f18229a) && Intrinsics.d(this.b, kga0Var.b);
    }

    public final int hashCode() {
        List list = this.f18229a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("PlayersDuelZipResponse(team1Ids=", ", team2Ids=", this.f18229a, Separators.RPAREN, this.b);
    }
}
