package org.xplatform.app_start.impl.presentation.view.content.logo;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new AppStartLogoView$SavedState(parcel.readParcelable(AppStartLogoView$SavedState.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppStartLogoView$SavedState[i];
    }
}
