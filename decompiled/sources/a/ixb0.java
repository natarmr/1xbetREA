package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ixb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15535a;
    public final boolean b;

    public ixb0(List list, boolean z) {
        list.getClass();
        this.f15535a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixb0)) {
            return false;
        }
        ixb0 ixb0Var = (ixb0) obj;
        return Intrinsics.d(this.f15535a, ixb0Var.f15535a) && this.b == ixb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15535a.hashCode() * 31);
    }

    public final String toString() {
        return "PrizeDistributionSectionModel(prizeDistribution=" + this.f15535a + ", isExpanded=" + this.b + Separators.RPAREN;
    }
}
