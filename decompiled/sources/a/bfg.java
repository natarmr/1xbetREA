package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2500a;
    public final j0g0 b;
    public final j0g0 c;
    public final boolean d;

    public bfg(List list, j0g0 j0g0Var, j0g0 j0g0Var2, boolean z) {
        this.f2500a = list;
        this.b = j0g0Var;
        this.c = j0g0Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfg)) {
            return false;
        }
        bfg bfgVar = (bfg) obj;
        return Intrinsics.d(this.f2500a, bfgVar.f2500a) && Intrinsics.d(this.b, bfgVar.b) && Intrinsics.d(this.c, bfgVar.c) && this.d == bfgVar.d;
    }

    public final int hashCode() {
        List list = this.f2500a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        j0g0 j0g0Var = this.b;
        int iB = (iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31;
        j0g0 j0g0Var2 = this.c;
        return Boolean.hashCode(this.d) + ((iB + (j0g0Var2 != null ? j0g0.b(j0g0Var2.f15681a) : 0)) * 31);
    }

    public final String toString() {
        return "CyberChampionshipEventsScenarioModel(specialEventList=" + this.f2500a + ", liveChampEvent=" + this.b + ", lineChampEvent=" + this.c + ", marketExpand=" + this.d + Separators.RPAREN;
    }
}
