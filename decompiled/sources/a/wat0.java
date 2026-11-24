package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wat0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38847a;
    public final j0g0 b;

    public wat0(j0g0 j0g0Var, boolean z) {
        this.f38847a = z;
        this.b = j0g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wat0)) {
            return false;
        }
        wat0 wat0Var = (wat0) obj;
        return this.f38847a == wat0Var.f38847a && Intrinsics.d(this.b, wat0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f38847a) * 31;
        j0g0 j0g0Var = this.b;
        return iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a));
    }

    public final String toString() {
        return "UniversalChampPrizePoolStateModel(connected=" + this.f38847a + ", tournamentModel=" + this.b + Separators.RPAREN;
    }
}
