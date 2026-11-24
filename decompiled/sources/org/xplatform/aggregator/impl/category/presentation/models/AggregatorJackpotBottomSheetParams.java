package org.xplatform.aggregator.impl.category.presentation.models;

import a.b1j;
import a.ibw0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorJackpotBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<AggregatorJackpotBottomSheetParams> CREATOR = new ibw0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46275a;
    public final String b;

    public AggregatorJackpotBottomSheetParams(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46275a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatorJackpotBottomSheetParams)) {
            return false;
        }
        AggregatorJackpotBottomSheetParams aggregatorJackpotBottomSheetParams = (AggregatorJackpotBottomSheetParams) obj;
        return Intrinsics.d(this.f46275a, aggregatorJackpotBottomSheetParams.f46275a) && Intrinsics.d(this.b, aggregatorJackpotBottomSheetParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46275a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AggregatorJackpotBottomSheetParams(amount=", this.f46275a, ", deeplink=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46275a);
        parcel.writeString(this.b);
    }
}
