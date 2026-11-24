package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class n300 {
    public static final f300 Companion = new f300();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22825a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jtz((byte) 10)), maz.a(wezVar, new jtz((byte) 17))};
    }

    public /* synthetic */ n300(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f22825a = null;
        } else {
            this.f22825a = list;
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
        if (!(obj instanceof n300)) {
            return false;
        }
        n300 n300Var = (n300) obj;
        return Intrinsics.d(this.f22825a, n300Var.f22825a) && Intrinsics.d(this.b, n300Var.b);
    }

    public final int hashCode() {
        List list = this.f22825a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("LimitsResponse(moneyLimits=", ", timeLimits=", this.f22825a, Separators.RPAREN, this.b);
    }
}
