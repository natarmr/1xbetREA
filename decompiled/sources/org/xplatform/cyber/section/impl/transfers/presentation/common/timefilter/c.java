package org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new TransferTimeFilterUiModel.CustomTime((TransferFilterTimeCustomDateValue) parcel.readParcelable(TransferTimeFilterUiModel.CustomTime.class.getClassLoader()), (TransferFilterTimeCustomDateValue) parcel.readParcelable(TransferTimeFilterUiModel.CustomTime.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TransferTimeFilterUiModel.CustomTime[i];
    }
}
