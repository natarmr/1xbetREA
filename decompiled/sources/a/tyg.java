package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tyg {
    public static final syg Companion = new syg();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34753a;
    public final List b;
    public final byg c;
    public final Boolean d;

    static {
        ayg aygVar = byg.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new xng((byte) 6)), maz.a(wezVar, new xng((byte) 7)), null, null};
    }

    public /* synthetic */ tyg(int i, List list, List list2, byg bygVar, Boolean bool) {
        if ((i & 1) == 0) {
            this.f34753a = null;
        } else {
            this.f34753a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bygVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyg)) {
            return false;
        }
        tyg tygVar = (tyg) obj;
        return Intrinsics.d(this.f34753a, tygVar.f34753a) && Intrinsics.d(this.b, tygVar.b) && Intrinsics.d(this.c, tygVar.c) && Intrinsics.d(this.d, tygVar.d);
    }

    public final int hashCode() {
        List list = this.f34753a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        byg bygVar = this.c;
        int iHashCode3 = (iHashCode2 + (bygVar == null ? 0 : bygVar.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CyberGamesDisciplineLeaderBoardResponse(ranking=", ", organizations=", this.f34753a, ", availableYears=", this.b);
        sbT.append(this.c);
        sbT.append(", lngSideLeft=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
