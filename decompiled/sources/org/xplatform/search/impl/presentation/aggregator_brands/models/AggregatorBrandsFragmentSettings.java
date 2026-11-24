package org.xplatform.search.impl.presentation.aggregator_brands.models;

import a.ibw0;
import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/impl/presentation/aggregator_brands/models/AggregatorBrandsFragmentSettings;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorBrandsFragmentSettings implements Parcelable {
    public static final Parcelable.Creator<AggregatorBrandsFragmentSettings> CREATOR = new ibw0((byte) 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46917a;

    public AggregatorBrandsFragmentSettings(String str) {
        str.getClass();
        this.f46917a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AggregatorBrandsFragmentSettings) && Intrinsics.d(this.f46917a, ((AggregatorBrandsFragmentSettings) obj).f46917a);
    }

    public final int hashCode() {
        return this.f46917a.hashCode();
    }

    public final String toString() {
        return kng0.l("AggregatorBrandsFragmentSettings(componentKey=", this.f46917a, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46917a);
    }
}
