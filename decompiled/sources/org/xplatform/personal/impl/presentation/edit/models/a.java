package org.xplatform.personal.impl.presentation.edit.models;

import a.w2c0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String str;
        boolean z;
        parcel.getClass();
        w2c0 w2c0VarValueOf = w2c0.valueOf(parcel.readString());
        String str2 = ProfileEditUiModelItem.Payload.Text.CREATOR.createFromParcel(parcel).f46790a;
        boolean z2 = false;
        boolean z3 = true;
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        if (parcel.readInt() == 0) {
            z3 = z2;
        }
        String str3 = ProfileEditUiModelItem.Payload.Error.CREATOR.createFromParcel(parcel).f46789a;
        if (parcel.readInt() != 0) {
            z = true;
            str = str3;
        } else {
            str = str3;
            z = false;
        }
        return new ProfileEditUiModelItem(w2c0VarValueOf, str2, z2, z3, str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditUiModelItem[i];
    }
}
