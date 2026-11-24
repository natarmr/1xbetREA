package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class nlk0 implements rlk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23732a;
    public final AggregatorSortingOptionModel b;

    public nlk0(a4x a4xVar, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        a4xVar.getClass();
        aggregatorSortingOptionModel.getClass();
        this.f23732a = a4xVar;
        this.b = aggregatorSortingOptionModel;
    }

    public static nlk0 a(nlk0 nlk0Var, AggregatorSortingOptionModel aggregatorSortingOptionModel) {
        a4x a4xVar = nlk0Var.f23732a;
        a4xVar.getClass();
        aggregatorSortingOptionModel.getClass();
        return new nlk0(a4xVar, aggregatorSortingOptionModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlk0)) {
            return false;
        }
        nlk0 nlk0Var = (nlk0) obj;
        return Intrinsics.d(this.f23732a, nlk0Var.f23732a) && Intrinsics.d(this.b, nlk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23732a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(sortingOptions=" + this.f23732a + ", selectedSortingOption=" + this.b + Separators.RPAREN;
    }
}
