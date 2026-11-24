package org.xplatform.personal.impl.presentation.edit.models;

import a.w2c0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String str;
        boolean z;
        parcel.getClass();
        w2c0 w2c0VarValueOf = w2c0.valueOf(parcel.readString());
        int i = parcel.readInt();
        String string = parcel.readString();
        boolean z2 = false;
        boolean z3 = true;
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        if (parcel.readInt() == 0) {
            z3 = z2;
        }
        String str2 = ProfileEditUiModelItemClickable.Payload.Error.CREATOR.createFromParcel(parcel).f46792a;
        if (parcel.readInt() != 0) {
            z = true;
            str = str2;
        } else {
            str = str2;
            z = false;
        }
        return new ProfileEditUiModelItemClickable(w2c0VarValueOf, i, string, z2, z3, str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditUiModelItemClickable[i];
    }
}
