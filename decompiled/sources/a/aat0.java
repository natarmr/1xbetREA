package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aat0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f547a;
    public final j0g0 b;

    public aat0(j0g0 j0g0Var, boolean z) {
        this.f547a = z;
        this.b = j0g0Var;
    }

    public static aat0 a(aat0 aat0Var, boolean z, j0g0 j0g0Var, int i) {
        if ((i & 1) != 0) {
            z = aat0Var.f547a;
        }
        if ((i & 2) != 0) {
            j0g0Var = aat0Var.b;
        }
        aat0Var.getClass();
        return new aat0(j0g0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aat0)) {
            return false;
        }
        aat0 aat0Var = (aat0) obj;
        return this.f547a == aat0Var.f547a && Intrinsics.d(this.b, aat0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f547a) * 31;
        j0g0 j0g0Var = this.b;
        return iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a));
    }

    public final String toString() {
        return "UniversalChampInfoStateModel(connected=" + this.f547a + ", tournamentModel=" + this.b + Separators.RPAREN;
    }
}
