package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xrp implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41379a;

    public xrp(i4 i4Var) {
        i4Var.getClass();
        this.f41379a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrp) && Intrinsics.d(this.f41379a, ((xrp) obj).f41379a);
    }

    public final int hashCode() {
        return this.f41379a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f41379a, "FifaMatchStatisticsUiModel(halvesStatistics=", Separators.RPAREN);
    }
}
