package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class tje0 {
    public static final sje0 Companion = new sje0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34044a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new o6e0((byte) 13)), maz.a(wezVar, new o6e0((byte) 14)), maz.a(wezVar, new o6e0((byte) 15))};
    }

    public /* synthetic */ tje0(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f34044a = null;
        } else {
            this.f34044a = list;
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
        if (!(obj instanceof tje0)) {
            return false;
        }
        tje0 tje0Var = (tje0) obj;
        return Intrinsics.d(this.f34044a, tje0Var.f34044a) && Intrinsics.d(this.b, tje0Var.b) && Intrinsics.d(this.c, tje0Var.c);
    }

    public final int hashCode() {
        List list = this.f34044a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("RefereeTeamResponse(teams=", ", players=", this.f34044a, ", response=", this.b), this.c, Separators.RPAREN);
    }
}
