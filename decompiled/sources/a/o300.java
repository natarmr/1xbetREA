package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class o300 {
    public static final g300 Companion = new g300();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24557a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jtz((byte) 11)), maz.a(wezVar, new jtz((byte) 18))};
    }

    public /* synthetic */ o300(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f24557a = null;
        } else {
            this.f24557a = list;
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
        if (!(obj instanceof o300)) {
            return false;
        }
        o300 o300Var = (o300) obj;
        return Intrinsics.d(this.f24557a, o300Var.f24557a) && Intrinsics.d(this.b, o300Var.b);
    }

    public final int hashCode() {
        List list = this.f24557a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("LimitsResponse(moneyLimits=", ", timeLimits=", this.f24557a, Separators.RPAREN, this.b);
    }
}
