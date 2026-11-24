package org.xplatform.personal.impl.presentation.edit_tj.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ProfileEditTjUiModel.ProfileEditTitleTjUiModel(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditTjUiModel.ProfileEditTitleTjUiModel[i];
    }
}
