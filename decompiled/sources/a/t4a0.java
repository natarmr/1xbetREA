package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class t4a0 {
    public static final s4a0 Companion = new s4a0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33310a;
    public final Integer b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new wm90((byte) 19)), null, maz.a(wezVar, new wm90((byte) 20))};
    }

    public /* synthetic */ t4a0(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f33310a = null;
        } else {
            this.f33310a = list;
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
        if (!(obj instanceof t4a0)) {
            return false;
        }
        t4a0 t4a0Var = (t4a0) obj;
        return Intrinsics.d(this.f33310a, t4a0Var.f33310a) && Intrinsics.d(this.b, t4a0Var.b) && Intrinsics.d(this.c, t4a0Var.c);
    }

    public final int hashCode() {
        List list = this.f33310a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.r(this.b, "PlayerLastGameResponse(playerLastGameValueResponse=", ", sportId=", ", teams=", this.f33310a), this.c, Separators.RPAREN);
    }
}
