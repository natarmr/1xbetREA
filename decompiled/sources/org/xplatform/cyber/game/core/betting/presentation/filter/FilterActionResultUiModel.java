package org.xplatform.cyber.game.core.betting.presentation.filter;

import a.brm0;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/core/betting/presentation/filter/FilterActionResultUiModel;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FilterActionResultUiModel implements Parcelable {
    public static final Parcelable.Creator<FilterActionResultUiModel> CREATOR = new yoo((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46503a;
    public final int b;

    public FilterActionResultUiModel(long j, int i) {
        this.f46503a = j;
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
        return this.f46503a == filterActionResultUiModel.f46503a && this.b == filterActionResultUiModel.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f46503a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f46503a, "FilterActionResultUiModel(marketId=", ", actionId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46503a);
        parcel.writeInt(this.b);
    }
}
