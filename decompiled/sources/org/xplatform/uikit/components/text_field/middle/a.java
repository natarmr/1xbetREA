package org.xplatform.uikit.components.text_field.middle;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DSTextFieldMiddleEditDSText$SavedState(parcel.readParcelable(DSTextFieldMiddleEditDSText$SavedState.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DSTextFieldMiddleEditDSText$SavedState[i];
    }
}
