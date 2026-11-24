package org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter;

import android.os.Parcel;
import android.os.Parcelable;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new TransferFilterTimeCustomDateValue.Selected((SimpleDate) parcel.readParcelable(TransferFilterTimeCustomDateValue.Selected.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TransferFilterTimeCustomDateValue.Selected[i];
    }
}
