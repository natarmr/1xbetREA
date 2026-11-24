package a;

import android.gov.nist.core.Separators;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class s2b extends t2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AggregatorProvidersFiltersUiModel f31494a;

    static {
        Parcelable.Creator<AggregatorProvidersFiltersUiModel> creator = AggregatorProvidersFiltersUiModel.CREATOR;
    }

    public s2b(AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel) {
        aggregatorProvidersFiltersUiModel.getClass();
        this.f31494a = aggregatorProvidersFiltersUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2b) && Intrinsics.d(this.f31494a, ((s2b) obj).f31494a);
    }

    public final int hashCode() {
        return this.f31494a.hashCode();
    }

    public final String toString() {
        return "PromotedCategories(categories=" + this.f31494a + Separators.RPAREN;
    }
}
