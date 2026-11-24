package org.xplatform.personal.impl.presentation.edit.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        string.getClass();
        return new ProfileEditUiModelItem.Payload.Error(string);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditUiModelItem.Payload.Error[i];
    }
}
