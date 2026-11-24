package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class j300 {
    public static final b300 Companion = new b300();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15807a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jtz((byte) 13)), maz.a(wezVar, new jtz((byte) 19))};
    }

    public /* synthetic */ j300(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f15807a = null;
        } else {
            this.f15807a = list;
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
        if (!(obj instanceof j300)) {
            return false;
        }
        j300 j300Var = (j300) obj;
        return Intrinsics.d(this.f15807a, j300Var.f15807a) && Intrinsics.d(this.b, j300Var.b);
    }

    public final int hashCode() {
        List list = this.f15807a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("LimitsResponse(moneyLimits=", ", timeLimits=", this.f15807a, Separators.RPAREN, this.b);
    }
}
