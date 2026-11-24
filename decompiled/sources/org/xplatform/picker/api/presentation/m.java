package org.xplatform.picker.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new PickerParams.City(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PickerParams.City[i];
    }
}
