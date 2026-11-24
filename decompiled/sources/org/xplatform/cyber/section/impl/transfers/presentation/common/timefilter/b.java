package org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return TransferFilterTimeCustomDateValue.Unselected.f46617a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TransferFilterTimeCustomDateValue.Unselected[i];
    }
}
