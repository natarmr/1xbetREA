package org.xplatform.personal.impl.presentation.edit_tj.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        EditProfileTjItemEnum editProfileTjItemEnumCreateFromParcel = EditProfileTjItemEnum.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        boolean z = false;
        boolean z2 = true;
        if (parcel.readInt() != 0) {
            z = true;
        }
        if (parcel.readInt() == 0) {
            z2 = z;
        }
        if (parcel.readInt() == 0) {
            z2 = z;
        }
        return new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel(editProfileTjItemEnumCreateFromParcel, string, i, i2, z, z2, z2, parcel.readInt() != 0, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel[i];
    }
}
