package org.xplatform.personal.impl.presentation.edit;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return ProfileEditViewModel$UiState.Error.f46785a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditViewModel$UiState.Error[i];
    }
}
