package org.xplatform.app_start.impl.presentation.view.content.version;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new AppStartVersionView$SavedState(parcel.readParcelable(AppStartVersionView$SavedState.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppStartVersionView$SavedState[i];
    }
}
