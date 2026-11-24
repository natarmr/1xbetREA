package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ija0 {
    public static final hja0 Companion = new hja0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14865a;
    public final List b;
    public final Integer c;
    public final cja0 d;

    static {
        bja0 bja0Var = cja0.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new raa0((byte) 26)), maz.a(wezVar, new raa0((byte) 27)), null, null};
    }

    public /* synthetic */ ija0(int i, List list, List list2, Integer num, cja0 cja0Var) {
        if ((i & 1) == 0) {
            this.f14865a = null;
        } else {
            this.f14865a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cja0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ija0)) {
            return false;
        }
        ija0 ija0Var = (ija0) obj;
        return Intrinsics.d(this.f14865a, ija0Var.f14865a) && Intrinsics.d(this.b, ija0Var.b) && Intrinsics.d(this.c, ija0Var.c) && Intrinsics.d(this.d, ija0Var.d);
    }

    public final int hashCode() {
        List list = this.f14865a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        cja0 cja0Var = this.d;
        return iHashCode3 + (cja0Var != null ? cja0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("PlayersStatisticResponse(teams=", ", players=", this.f14865a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", responseInfo=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
