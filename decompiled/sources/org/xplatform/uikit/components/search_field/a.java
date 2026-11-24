package org.xplatform.uikit.components.search_field;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        DsSearchField.SavedState savedState = new DsSearchField.SavedState(parcel);
        savedState.f47259a = parcel.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        DsSearchField.SavedState[] savedStateArr = new DsSearchField.SavedState[i];
        for (int i2 = 0; i2 < i; i2++) {
            savedStateArr[i2] = null;
        }
        return savedStateArr;
    }
}
