package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class qx8 implements ux8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29469a;
    public final AggregatorSortingOptionModel b;

    public qx8(List list, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        list.getClass();
        aggregatorSortingOptionModel.getClass();
        this.f29469a = list;
        this.b = aggregatorSortingOptionModel;
    }

    public static qx8 a(qx8 qx8Var, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        List list = qx8Var.f29469a;
        list.getClass();
        aggregatorSortingOptionModel.getClass();
        return new qx8(list, aggregatorSortingOptionModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx8)) {
            return false;
        }
        qx8 qx8Var = (qx8) obj;
        return Intrinsics.d(this.f29469a, qx8Var.f29469a) && Intrinsics.d(this.b, qx8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29469a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(sortingOptions=" + this.f29469a + ", selectedSortingOption=" + this.b + Separators.RPAREN;
    }
}
