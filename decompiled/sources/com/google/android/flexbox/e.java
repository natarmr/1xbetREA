package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.SavedState savedState = new FlexboxLayoutManager.SavedState();
        savedState.f45461a = parcel.readInt();
        savedState.b = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FlexboxLayoutManager.SavedState[i];
    }
}
