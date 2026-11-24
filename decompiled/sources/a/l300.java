package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class l300 {
    public static final d300 Companion = new d300();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19338a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jtz((byte) 8)), maz.a(wezVar, new jtz((byte) 15))};
    }

    public /* synthetic */ l300(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f19338a = null;
        } else {
            this.f19338a = list;
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
        if (!(obj instanceof l300)) {
            return false;
        }
        l300 l300Var = (l300) obj;
        return Intrinsics.d(this.f19338a, l300Var.f19338a) && Intrinsics.d(this.b, l300Var.b);
    }

    public final int hashCode() {
        List list = this.f19338a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("LimitsResponse(moneyLimits=", ", timeLimits=", this.f19338a, Separators.RPAREN, this.b);
    }
}
