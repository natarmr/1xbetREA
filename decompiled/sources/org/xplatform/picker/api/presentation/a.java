package org.xplatform.picker.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new PickerDialogParams((PickerDialogParams.PickerType) parcel.readParcelable(PickerDialogParams.class.getClassLoader()), AnalyticsEntryPoint.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PickerDialogParams[i];
    }
}
