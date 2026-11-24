package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class k300 {
    public static final c300 Companion = new c300();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17595a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jtz((byte) 7)), maz.a(wezVar, new jtz((byte) 14))};
    }

    public /* synthetic */ k300(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f17595a = null;
        } else {
            this.f17595a = list;
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
        if (!(obj instanceof k300)) {
            return false;
        }
        k300 k300Var = (k300) obj;
        return Intrinsics.d(this.f17595a, k300Var.f17595a) && Intrinsics.d(this.b, k300Var.b);
    }

    public final int hashCode() {
        List list = this.f17595a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("LimitsResponse(moneyLimits=", ", timeLimits=", this.f17595a, Separators.RPAREN, this.b);
    }
}
