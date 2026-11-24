package org.xplatform.uikit.components.check_box.old;

import a.awl;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DsCheckBoxOld.DsCheckBoxSavedState(parcel.readParcelable(DsCheckBoxOld.DsCheckBoxSavedState.class.getClassLoader()), awl.valueOf(parcel.readString()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DsCheckBoxOld.DsCheckBoxSavedState[i];
    }
}
