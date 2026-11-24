package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class cja0 {
    public static final bja0 Companion = new bja0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4451a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new raa0((byte) 24)), maz.a(wezVar, new raa0((byte) 25))};
    }

    public /* synthetic */ cja0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f4451a = null;
        } else {
            this.f4451a = list;
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
        if (!(obj instanceof cja0)) {
            return false;
        }
        cja0 cja0Var = (cja0) obj;
        return Intrinsics.d(this.f4451a, cja0Var.f4451a) && Intrinsics.d(this.b, cja0Var.b);
    }

    public final int hashCode() {
        List list = this.f4451a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("PlayersStatisticInfoResponse(tabsList=", ", selectorTabsList=", this.f4451a, Separators.RPAREN, this.b);
    }
}
