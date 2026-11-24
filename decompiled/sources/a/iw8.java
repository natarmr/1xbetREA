package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class iw8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15476a;
    public final AggregatorSortingOptionModel b;

    public iw8(List list, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        list.getClass();
        aggregatorSortingOptionModel.getClass();
        this.f15476a = list;
        this.b = aggregatorSortingOptionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw8)) {
            return false;
        }
        iw8 iw8Var = (iw8) obj;
        return Intrinsics.d(this.f15476a, iw8Var.f15476a) && Intrinsics.d(this.b, iw8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15476a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSortOptionBottomSheet(sortingOptions=" + this.f15476a + ", selectedSortingOption=" + this.b + Separators.RPAREN;
    }
}
