package org.xplatform.aggregator.impl.category.presentation.models;

import a.b1j;
import a.cs0;
import a.ua80;
import a.w3q;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/presentation/models/FilterCategoryUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FilterCategoryUiModel implements Parcelable {
    public static final Parcelable.Creator<FilterCategoryUiModel> CREATOR = new yoo((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46277a;
    public final String b;
    public final w3q c;
    public final List d;

    public FilterCategoryUiModel(String str, String str2, w3q w3qVar, List list) {
        str.getClass();
        str2.getClass();
        w3qVar.getClass();
        list.getClass();
        this.f46277a = str;
        this.b = str2;
        this.c = w3qVar;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterCategoryUiModel)) {
            return false;
        }
        FilterCategoryUiModel filterCategoryUiModel = (FilterCategoryUiModel) obj;
        return Intrinsics.d(this.f46277a, filterCategoryUiModel.f46277a) && Intrinsics.d(this.b, filterCategoryUiModel.b) && this.c == filterCategoryUiModel.c && Intrinsics.d(this.d, filterCategoryUiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f46277a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FilterCategoryUiModel(id=", this.f46277a, ", categoryName=", this.b, ", type=");
        sbN.append(this.c);
        sbN.append(", filtersList=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46277a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        Iterator itT = cs0.t(this.d, parcel);
        while (itT.hasNext()) {
            parcel.writeParcelable((Parcelable) itT.next(), i);
        }
    }
}
