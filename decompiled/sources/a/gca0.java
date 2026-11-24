package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gca0 {
    public static final fca0 Companion = new fca0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11050a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new raa0((byte) 3)), maz.a(wezVar, new raa0((byte) 4)), maz.a(wezVar, new raa0((byte) 5))};
    }

    public /* synthetic */ gca0(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f11050a = null;
        } else {
            this.f11050a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gca0)) {
            return false;
        }
        gca0 gca0Var = (gca0) obj;
        return Intrinsics.d(this.f11050a, gca0Var.f11050a) && Intrinsics.d(this.b, gca0Var.b) && Intrinsics.d(this.c, gca0Var.c);
    }

    public final int hashCode() {
        List list = this.f11050a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("PlayerTennisMenuResponse(playerTennisMenuItemResponse=", ", teams=", this.f11050a, ", players=", this.b), this.c, Separators.RPAREN);
    }
}
