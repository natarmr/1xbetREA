package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vle0 {
    public static final ule0 Companion = new ule0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37618a;
    public final Integer b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new o6e0((byte) 17)), null, maz.a(wezVar, new o6e0((byte) 18))};
    }

    public /* synthetic */ vle0(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f37618a = null;
        } else {
            this.f37618a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if (!(obj instanceof vle0)) {
            return false;
        }
        vle0 vle0Var = (vle0) obj;
        return Intrinsics.d(this.f37618a, vle0Var.f37618a) && Intrinsics.d(this.b, vle0Var.b) && Intrinsics.d(this.c, vle0Var.c);
    }

    public final int hashCode() {
        List list = this.f37618a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.r(this.b, "RefereeTourResponse(players=", ", sportId=", ", response=", this.f37618a), this.c, Separators.RPAREN);
    }
}
