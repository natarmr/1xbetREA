package org.xplatform.aggregator.impl.category.data.models;

import a.b1j;
import a.cs0;
import a.ibw0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorSortingOptionModel implements Parcelable {
    public static final Parcelable.Creator<AggregatorSortingOptionModel> CREATOR = new ibw0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46274a;
    public final String b;
    public final String c;
    public final String d;

    public AggregatorSortingOptionModel(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f46274a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatorSortingOptionModel)) {
            return false;
        }
        AggregatorSortingOptionModel aggregatorSortingOptionModel = (AggregatorSortingOptionModel) obj;
        return Intrinsics.d(this.f46274a, aggregatorSortingOptionModel.f46274a) && Intrinsics.d(this.b, aggregatorSortingOptionModel.b) && Intrinsics.d(this.c, aggregatorSortingOptionModel.c) && Intrinsics.d(this.d, aggregatorSortingOptionModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f46274a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("AggregatorSortingOptionModel(name=", this.f46274a, ", code=", this.b, ", attribute="), this.c, ", direction=", this.d, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46274a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
