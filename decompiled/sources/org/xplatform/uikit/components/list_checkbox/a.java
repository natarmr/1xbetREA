package org.xplatform.uikit.components.list_checkbox;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DsListCheckBox.DsListCheckBoxSavedState(parcel.readParcelable(DsListCheckBox.DsListCheckBoxSavedState.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DsListCheckBox.DsListCheckBoxSavedState[i];
    }
}
