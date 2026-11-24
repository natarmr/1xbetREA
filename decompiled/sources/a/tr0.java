package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class tr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34400a;
    public final AggregatorSortingOptionModel b;

    public tr0(a4x a4xVar, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        a4xVar.getClass();
        aggregatorSortingOptionModel.getClass();
        this.f34400a = a4xVar;
        this.b = aggregatorSortingOptionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return Intrinsics.d(this.f34400a, tr0Var.f34400a) && Intrinsics.d(this.b, tr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34400a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSortOptionBottomSheet(sortingOptions=" + this.f34400a + ", selectedSortingOption=" + this.b + Separators.RPAREN;
    }
}
