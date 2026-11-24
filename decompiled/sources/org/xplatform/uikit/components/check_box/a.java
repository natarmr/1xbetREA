package org.xplatform.uikit.components.check_box;

import a.awl;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DsCheckbox.DsCheckBoxSavedState(parcel.readParcelable(DsCheckbox.DsCheckBoxSavedState.class.getClassLoader()), awl.valueOf(parcel.readString()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DsCheckbox.DsCheckBoxSavedState[i];
    }
}
