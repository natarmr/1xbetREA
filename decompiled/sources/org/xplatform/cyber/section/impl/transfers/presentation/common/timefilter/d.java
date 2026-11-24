package org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter;

import a.xhs0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new TransferTimeFilterUiModel.SimpleTime(xhs0.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TransferTimeFilterUiModel.SimpleTime[i];
    }
}
