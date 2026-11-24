package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f27222a;
    public final hdm0 b;
    public final nc5 c;
    public final fja0 d;
    public final List e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    static {
        fja0 fja0Var = fja0.e;
    }

    public pma0(eme emeVar, hdm0 hdm0Var, nc5 nc5Var, fja0 fja0Var, List list, int i, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f27222a = emeVar;
        this.b = hdm0Var;
        this.c = nc5Var;
        this.d = fja0Var;
        this.e = list;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public static pma0 a(pma0 pma0Var, hdm0 hdm0Var, nc5 nc5Var, fja0 fja0Var, List list, int i, boolean z, boolean z2, boolean z3, int i2) {
        hdm0 hdm0Var2 = hdm0Var;
        eme emeVar = pma0Var.f27222a;
        if ((i2 & 2) != 0) {
            hdm0Var2 = pma0Var.b;
        }
        if ((i2 & 4) != 0) {
            nc5Var = pma0Var.c;
        }
        if ((i2 & 8) != 0) {
            fja0Var = pma0Var.d;
        }
        if ((i2 & 16) != 0) {
            list = pma0Var.e;
        }
        if ((i2 & 32) != 0) {
            i = pma0Var.f;
        }
        if ((i2 & 64) != 0) {
            z = pma0Var.g;
        }
        if ((i2 & 128) != 0) {
            z2 = pma0Var.h;
        }
        if ((i2 & 256) != 0) {
            z3 = pma0Var.i;
        }
        boolean z4 = z3;
        pma0Var.getClass();
        hdm0Var2.getClass();
        list.getClass();
        boolean z5 = z2;
        boolean z6 = z;
        int i3 = i;
        List list2 = list;
        fja0 fja0Var2 = fja0Var;
        return new pma0(emeVar, hdm0Var2, nc5Var, fja0Var2, list2, i3, z6, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pma0)) {
            return false;
        }
        pma0 pma0Var = (pma0) obj;
        return this.f27222a == pma0Var.f27222a && this.b.equals(pma0Var.b) && this.c.equals(pma0Var.c) && Intrinsics.d(this.d, pma0Var.d) && Intrinsics.d(this.e, pma0Var.e) && this.f == pma0Var.f && this.g == pma0Var.g && this.h == pma0Var.h && this.i == pma0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f27222a.hashCode() * 31)) * 31)) * 31;
        fja0 fja0Var = this.d;
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(twn.a(this.f, dw9.a((iHashCode + (fja0Var == null ? 0 : fja0Var.hashCode())) * 31, 31, this.e), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayersStatisticsState(coreHeaderModel=");
        sb.append(this.f27222a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", playersStatisticModel=");
        sb.append(this.d);
        sb.append(", selectedFiltersList=");
        brm0.v(this.f, ", selectedTabId=", ", isLive=", sb, this.e);
        ua80.u(", isLoading=", ", isError=", sb, this.g, this.h);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
