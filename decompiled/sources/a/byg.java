package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class byg {
    public static final ayg Companion = new ayg();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3415a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new xng((byte) 2)), maz.a(wezVar, new xng((byte) 3))};
    }

    public /* synthetic */ byg(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f3415a = null;
        } else {
            this.f3415a = list;
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
        if (!(obj instanceof byg)) {
            return false;
        }
        byg bygVar = (byg) obj;
        return Intrinsics.d(this.f3415a, bygVar.f3415a) && Intrinsics.d(this.b, bygVar.b);
    }

    public final int hashCode() {
        List list = this.f3415a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("CyberGamesAvailableYearsResponse(rankingsAvailableYears=", ", organizationsAvailableYears=", this.f3415a, Separators.RPAREN, this.b);
    }
}
