package org.xplatform.personal.impl.presentation.edit;

import a.w2c0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (int i2 = 0; i2 != i; i2++) {
            linkedHashMap.put(w2c0.valueOf(parcel.readString()), parcel.readParcelable(ProfileEditViewModel$UiState.Loaded.class.getClassLoader()));
        }
        return new ProfileEditViewModel$UiState.Loaded(linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ProfileEditViewModel$UiState.Loaded[i];
    }
}
