package org.xplatform.sportgame.markets.settings.impl.presentation.models;

import a.brm0;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionResultUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FilterActionResultUiModel implements Parcelable {
    public static final Parcelable.Creator<FilterActionResultUiModel> CREATOR = new yoo((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47012a;
    public final int b;

    public FilterActionResultUiModel(long j, int i) {
        this.f47012a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterActionResultUiModel)) {
            return false;
        }
        FilterActionResultUiModel filterActionResultUiModel = (FilterActionResultUiModel) obj;
        return this.f47012a == filterActionResultUiModel.f47012a && this.b == filterActionResultUiModel.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f47012a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f47012a, "FilterActionResultUiModel(marketId=", ", actionId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47012a);
        parcel.writeInt(this.b);
    }
}
