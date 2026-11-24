package org.xplatform.aggregator.impl.category.presentation.models;

import a.cs0;
import a.dw9;
import a.ibw0;
import a.iun;
import a.nw80;
import a.ohs0;
import a.w3q;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorProvidersFiltersUiModel implements Parcelable {
    public static final Parcelable.Creator<AggregatorProvidersFiltersUiModel> CREATOR = new ibw0((byte) 9);
    public static final AggregatorProvidersFiltersUiModel d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46276a;
    public final List b;
    public final List c;

    static {
        nw80 nw80Var = nw80.t;
        long id = nw80Var.getId();
        iun iunVar = iun.f15405a;
        d = new AggregatorProvidersFiltersUiModel(id, iunVar, iunVar);
        new AggregatorProvidersFiltersUiModel(nw80Var.getId(), a.c(new FilterCategoryUiModel("", "", w3q.c, iunVar)), iunVar);
    }

    public AggregatorProvidersFiltersUiModel(long j, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f46276a = j;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatorProvidersFiltersUiModel)) {
            return false;
        }
        AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel = (AggregatorProvidersFiltersUiModel) obj;
        return this.f46276a == aggregatorProvidersFiltersUiModel.f46276a && Intrinsics.d(this.b, aggregatorProvidersFiltersUiModel.b) && Intrinsics.d(this.c, aggregatorProvidersFiltersUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(Long.hashCode(this.f46276a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(cs0.p(this.f46276a, "AggregatorProvidersFiltersUiModel(partitionId=", ", filtersList=", this.b), ", categoriesList=", this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46276a);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            ((FilterCategoryUiModel) itT.next()).writeToParcel(parcel, i);
        }
        Iterator itT2 = cs0.t(this.c, parcel);
        while (itT2.hasNext()) {
            ((PromotedCategoryUiModel) itT2.next()).writeToParcel(parcel, i);
        }
    }
}
