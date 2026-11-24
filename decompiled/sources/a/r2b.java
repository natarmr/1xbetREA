package a;

import android.gov.nist.core.Separators;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class r2b extends t2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AggregatorProvidersFiltersUiModel f29722a;

    static {
        Parcelable.Creator<AggregatorProvidersFiltersUiModel> creator = AggregatorProvidersFiltersUiModel.CREATOR;
    }

    public r2b(AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel) {
        aggregatorProvidersFiltersUiModel.getClass();
        this.f29722a = aggregatorProvidersFiltersUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2b) && Intrinsics.d(this.f29722a, ((r2b) obj).f29722a);
    }

    public final int hashCode() {
        return this.f29722a.hashCode();
    }

    public final String toString() {
        return "Filters(filters=" + this.f29722a + Separators.RPAREN;
    }
}
