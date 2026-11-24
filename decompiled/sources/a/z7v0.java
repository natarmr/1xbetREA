package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0g0 f43939a;
    public final boolean b;

    public z7v0(j0g0 j0g0Var, boolean z) {
        this.f43939a = j0g0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7v0)) {
            return false;
        }
        z7v0 z7v0Var = (z7v0) obj;
        return Intrinsics.d(this.f43939a, z7v0Var.f43939a) && this.b == z7v0Var.b;
    }

    public final int hashCode() {
        j0g0 j0g0Var = this.f43939a;
        return Boolean.hashCode(this.b) + ((j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a)) * 31);
    }

    public final String toString() {
        return "WeightClassRatingStateModel(leaderboardResult=" + this.f43939a + ", connected=" + this.b + Separators.RPAREN;
    }
}
