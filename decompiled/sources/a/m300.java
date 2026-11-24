package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class m300 {
    public static final e300 Companion = new e300();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21090a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jtz((byte) 9)), maz.a(wezVar, new jtz((byte) 16))};
    }

    public /* synthetic */ m300(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f21090a = null;
        } else {
            this.f21090a = list;
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
        if (!(obj instanceof m300)) {
            return false;
        }
        m300 m300Var = (m300) obj;
        return Intrinsics.d(this.f21090a, m300Var.f21090a) && Intrinsics.d(this.b, m300Var.b);
    }

    public final int hashCode() {
        List list = this.f21090a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("LimitsResponse(moneyLimits=", ", timeLimits=", this.f21090a, Separators.RPAREN, this.b);
    }
}
