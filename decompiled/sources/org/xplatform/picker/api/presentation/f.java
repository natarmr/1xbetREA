package org.xplatform.picker.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new PickerDialogParams.PickerType.Document(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PickerDialogParams.PickerType.Document[i];
    }
}
